package cherhy.jung.gptinterview.controller

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

class PositionResponseTest : BehaviorSpec({

    given("Position 클래스를 상속받은 클래스를 생성한다.") {
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
        When("상속받은 클래스들을 PositionResponse 객체로 변환한다.") {
            val positionResponse = PositionResponse.of(developers)

            then("중복을 제거한 필드 값으로 최종 값을 반환한다.") {
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
