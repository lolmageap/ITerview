package cherhy.jung.gptinterview.util

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.string.shouldContain
import java.time.LocalDate

class GeneratorTest: StringSpec() {
    init {
        "회원의 비밀번호에 추가 될 salt 값을 추출한다." {
            val salt = Generator.generateSalt()
            salt shouldNotBe null
        }
        "생성된 날짜와 랜덤한 값을 이어서 회원의 유니크한 키 값을 생성한다." {
            val token = Generator.generateToken()
            token shouldContain LocalDate.now().toString().replace("-", "")
            token.length shouldBe 21
        }
        "개발 관련 문제와 답안을 받고 GPT에게 질문할 양식으로 만들어준다." {
            val question = "ACID에 대해 설명해주세요."
            val answer = "원자성, 격리성, 독립성, 지속성"

            val questionToGpt = Generator.generateQuestionToGpt(question, answer)
            questionToGpt shouldContain question
            questionToGpt shouldContain answer
            questionToGpt shouldContain "점수"
            questionToGpt shouldContain "피드백"

        }
    }
}
