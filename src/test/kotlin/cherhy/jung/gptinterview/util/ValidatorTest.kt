package cherhy.jung.gptinterview.util

import cherhy.jung.gptinterview.exception.GptNotGeneratedException
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FeatureSpec
import io.kotest.matchers.shouldNotBe

class ValidatorTest : FeatureSpec({
    feature("GPT 에서 받아온 데이터가 JSON FORMAT 인지 확인한다.") {

        scenario("직렬화된 Json 문자열이 Json Format 형식을 만족하면 성공한다.") {
            val normal = """ { "score" : 60, "answer" : "정답입니다" } """.trimIndent()
            val result = Validator.jsonFormat(normal)

            result shouldNotBe null
            result shouldNotBe result.endsWith("}")
        }

        scenario("직렬화 된 Json 문자열 이 { 로 시작 하지 않는 다면 실패 한다.") {
            val normal = """ "answer" : "정답 입니다" } """.trimIndent()
            shouldThrow<GptNotGeneratedException> { Validator.jsonFormat(normal) }
        }

        scenario("직렬화 된 Json 문자열 이 score 단어를 포함 하지 않으면 실패 한다.") {
            val normal = """ { "answer" : "정답 입니다" } """.trimIndent()
            shouldThrow<GptNotGeneratedException> { Validator.jsonFormat(normal) }
        }

        scenario("""직렬화 된 Json 문자열 이 } 로 끝나지 않고 " 로 끝난 다면 문자열 을 Json 형식 으로 변환 해준다.""") {
            val problem = """{ "score" : 60, "answer" : "정답 입니다" """.trimIndent()

            val result = Validator.jsonFormat(problem)

            result shouldNotBe null
            result shouldNotBe result.endsWith(""" "} """.trimIndent())
        }

        scenario("""직렬화 된 Json 문자열 이 } 로 끝나지 않고 " 로도 끝나지 않는 다면 문자열 을 Json 형식 으로 변환 해준다.""") {
            val problem = """{ "score" : 60, "answer" : 정답 입니다"""
            val result = Validator.jsonFormat(problem)

            result shouldNotBe null
            result shouldNotBe result.endsWith(""" "} """.trimIndent())
        }
    }
})