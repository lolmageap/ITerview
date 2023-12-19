package cherhy.jung.gptinterview.util

import cherhy.jung.gptinterview.exception.GptNotGeneratedException
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FeatureSpec
import io.kotest.matchers.shouldNotBe

class ValidatorTest : FeatureSpec({
    feature("GPT 에서 받아온 데이터가 JSON FORMAT 인지 확인한다.") {

        scenario("직렬화된 Json 문자열이 Json Format 형식을 만족하면 성공한다.") {
            val normal = """ { "score" : 60, "answer" : "정답입니다" } """.trimIndent()
            val result = Validator.validateJsonFormat(normal)

            result shouldNotBe null
            result shouldNotBe result.endsWith("}")
        }

        scenario("직렬화된 Json 문자열이 { 로 시작하지 않는다면 실패한다.") {
            val normal = """ "answer" : "정답입니다" } """.trimIndent()
            shouldThrow<GptNotGeneratedException> { Validator.validateJsonFormat(normal) }
        }

        scenario("직렬화된 Json 문자열이 score 단어를 포함하지 않으면 실패한다.") {
            val normal = """ { "answer" : "정답입니다" } """.trimIndent()
            shouldThrow<GptNotGeneratedException> { Validator.validateJsonFormat(normal) }
        }

        scenario("""직렬화된 Json 문자열이 } 로 끝나지 않고 " 로 끝난다면 문자열을 Json 형식으로 변환해준다.""") {
            val problem = """{ "score" : 60, "answer" : "정답입니다" """.trimIndent()

            val result = Validator.validateJsonFormat(problem)

            result shouldNotBe null
            result shouldNotBe result.endsWith(""" "} """.trimIndent())
        }

        scenario("""직렬화된 Json 문자열이 } 로 끝나지 않고 " 로도 끝나지 않는다면 문자열을 Json 형식으로 변환해준다.""") {
            val problem = """{ "score" : 60, "answer" : 정답입니다"""
            val result = Validator.validateJsonFormat(problem)

            result shouldNotBe null
            result shouldNotBe result.endsWith(""" "} """.trimIndent())
        }
    }
})