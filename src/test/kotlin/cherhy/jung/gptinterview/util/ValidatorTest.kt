package cherhy.jung.gptinterview.util

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldNotBe

class ValidatorTest : StringSpec() {
    init {
        "직렬화된 Json 문자열이 } 로 끝난다면 아무것도 하지 않는다." {
            val normal = "{ \"answer\" : \"정답입니다\" }"
            val result = Validator.validateJsonFormat(normal)

            result shouldNotBe null
            result shouldNotBe result.endsWith("}")
        }

        "직렬화된 Json 문자열이 } 로 끝나지 않고 \" 로 끝난다면 문자열을 Json 형식으로 변환해준다." {
            val problem = "{ \"answer\" : \"정답입니다\""

            val result = Validator.validateJsonFormat(problem)

            result shouldNotBe null
            result shouldNotBe result.endsWith("\"}")
        }


        "직렬화된 Json 문자열이 } 로 끝나지 않고 \" 로도 끝나지 않는다면 문자열을 Json 형식으로 변환해준다." {
            val problem = "{ \"answer\" : \"정답입니다"
            val result = Validator.validateJsonFormat(problem)

            result shouldNotBe null
            result shouldNotBe result.endsWith("\"}")
        }
    }
}
