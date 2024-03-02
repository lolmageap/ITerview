package cherhy.jung.gptinterview.external.mail

import cherhy.jung.gptinterview.property.MailProperty
import jakarta.mail.internet.InternetAddress
import jakarta.mail.internet.MimeMessage
import kotlinx.html.*
import kotlinx.html.stream.appendHTML
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Component
import java.io.StringWriter

@Component
@EnableConfigurationProperties(MailProperty::class)
class MailComponent(
    private val javaMailSender: JavaMailSender,
    private val mailProperty: MailProperty,
) {

    fun sendMessage(email: String, certificate: String) {
        val writer = StringWriter()
        val msg = writer.appendHTML().html {
            head {
                style {
                    +"""
                        .content {
                            font-size: 17px;
                            padding-right: 30px;
                            padding-left: 30px;
                        }
                    """.trimIndent()
                }
            }

            body {
                h1("title") {
                    style = "font-size: 30px; padding-right: 30px; padding-left: 30px;"
                    +"이메일 주소 확인"
                }
                p("content") {
                    +"아래 확인 코드를 회원가입 화면에서 입력해주세요."
                }
                div {
                    style = "padding-right: 30px; padding-left: 30px; margin: 32px 0 40px;"

                    table {
                        style = "border-collapse: collapse; border: 0; background-color: #F4F4F4; height: 70px; table-layout: fixed; word-wrap: break-word; border-radius: 6px;"

                        tbody {
                            tr {
                                td {
                                    style = "text-align: center; vertical-align: middle; font-size: 30px;"
                                    +certificate
                                }
                            }
                        }
                    }
                }
            }
        }.toString()

        val internetAddress = InternetAddress(mailProperty.username, "admin")
        val message = javaMailSender.createMimeMessage()
            .apply {
                addRecipients(MimeMessage.RecipientType.TO, email)
                subject = "ITerview 회원가입 인증 코드"
                setText(msg, "utf-8", "html")
                setFrom(internetAddress)
            }
        javaMailSender.send(message)
    }

    fun sendPasswordMessage(email: String, password: String) {
        val writer = StringWriter()
        val msg = writer.appendHTML().html {
            head {
                style {
                    +"""
                        .content {
                            font-size: 17px;
                            padding-right: 30px;
                            padding-left: 30px;
                        }
                    """.trimIndent()
                }
            }

            body {
                h1("title") {
                    style = "font-size: 30px; padding-right: 30px; padding-left: 30px;"
                    +"임시 비밀번호 발급 완료"
                }
                p("content") {
                    +"아래 임시 비밀번호로 로그인을 진행해주세요."
                }
                p("content") {
                    +"임시 비밀번호 발급을 요청하지 않았을 경우, 고객센터로 문의 부탁드립니다."
                }
                div {
                    style = "padding-right: 30px; padding-left: 30px; margin: 32px 0 40px;"

                    table {
                        style = "border-collapse: collapse; border: 0; background-color: #F4F4F4; height: 70px; table-layout: fixed; word-wrap: break-word; border-radius: 6px;"

                        tbody {
                            tr {
                                td {
                                    style = "text-align: center; vertical-align: middle; font-size: 30px;"
                                    +password
                                }
                            }
                        }
                    }
                }
            }
        }.toString()

        val internetAddress = InternetAddress(mailProperty.username, "admin")
        val message = javaMailSender.createMimeMessage()
            .apply {
                addRecipients(MimeMessage.RecipientType.TO, email)
                subject = "ITerview 임시 비밀번호 발급 메일"
                setText(msg, "utf-8", "html")
                setFrom(internetAddress)
            }
        javaMailSender.send(message)
    }

}