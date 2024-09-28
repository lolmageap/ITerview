package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.controller.dto.PositionResponse
import cherhy.jung.gptinterview.controller.dto.of
import cherhy.jung.gptinterview.domain.position.AndroidDeveloper
import cherhy.jung.gptinterview.domain.position.BackendDeveloper
import cherhy.jung.gptinterview.domain.position.FrontendDeveloper
import cherhy.jung.gptinterview.domain.question.constant.FrameworkType.SPRING
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType.*
import cherhy.jung.gptinterview.domain.question.constant.QuestionType.PROGRAMING
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.collections.shouldContainAll
import io.kotest.matchers.shouldBe

internal class PositionResponseTest : BehaviorSpec({

    Given("Position class 를 상속 받은 클래스 를 생성한 뒤 ") {
        val developers= listOf(
            FrontendDeveloper(
                questionTypes = listOf(PROGRAMING),
                programingTypes = listOf(JAVASCRIPT),
                frameworkTypes = emptyList(),
            ),
            BackendDeveloper(
                questionTypes = listOf(PROGRAMING),
                programingTypes = listOf(JAVA),
                frameworkTypes = listOf(SPRING),
            ),
            AndroidDeveloper(
                questionTypes = listOf(PROGRAMING),
                programingTypes = listOf(KOTLIN),
                frameworkTypes = emptyList(),
            ),
        )
        When("PositionResponse 객체로 변환 하고 ") {
            val positionResponse = PositionResponse.of(developers)

            Then("중복을 제거한 필드 값으로 최종 값을 반환 한다.") {
                positionResponse.questionTypes.size shouldBe 1
                positionResponse.questionTypes shouldContain PROGRAMING

                positionResponse.programingTypes.size shouldBe 3
                positionResponse.programingTypes shouldContainAll listOf(JAVASCRIPT, JAVA, KOTLIN)

                positionResponse.frameworkTypes.size shouldBe 1
                positionResponse.frameworkTypes shouldContain SPRING
            }
        }
    }
})
