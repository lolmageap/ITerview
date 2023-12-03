package cherhy.jung.gptinterview.util

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.comparables.shouldBeGreaterThan
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.string.shouldContain
import io.kotest.matchers.string.shouldHaveLength
import java.time.LocalDate

internal class GeneratorTest: StringSpec() {
    init {
        "회원의 비밀번호에 추가 될 salt 값을 생성한다." {
            val salt = Generator.generateSalt()
            salt shouldNotBe null
        }
        "생성된 날짜와 랜덤한 값을 이어서 회원의 유니크한 키 값을 생성한다." {
            val token = Generator.generateToken()
            token shouldContain LocalDate.now().toString().replace("-", "")
            token shouldHaveLength 21
        }
        "개발 관련 문제와 답안을 받고 GPT에게 질문할 양식으로 메시지를 생성한다." {
            val question = "ACID에 대해 설명해주세요."
            val answer = "원자성, 격리성, 독립성, 지속성"

            val questionToGpt = Generator.generateQuestionToGpt(question, answer)
            questionToGpt shouldContain question
            questionToGpt shouldContain answer
            questionToGpt shouldContain "score"
            questionToGpt shouldContain "feedback"
        }
        "개발 관련 문제를 받고 답안은 받지 못했을 때 GPT에게 질문할 양식으로 메시지를 생성한다." {
            val question = "ACID에 대해 설명해주세요."

            val questionToGpt = Generator.generateAnswerKeyToGpt(question)
            questionToGpt shouldContain question
            questionToGpt shouldContain "answer"
        }
        "10자리의 대문자로 이루어진 비밀번호를 생성한다." {
            val password = Generator.generateRandomPassword()
            password shouldHaveLength 10
            password.all { it.isUpperCase() || it.isDigit() } shouldBe true
        }
        "0부터 9까지 이루어진 6자리의 인증번호를 생성한다." {
            val certificate = Generator.generateCertificate()
            certificate shouldHaveLength 6
            certificate.toInt() shouldBeGreaterThan 0
        }
    }
}
