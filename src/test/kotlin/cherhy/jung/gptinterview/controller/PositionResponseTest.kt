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

    given("subclass가 다른 Position의 집합을 생성한다.") {
        val developers= listOf(
            FrontendDeveloper(
                questionTypes = listOf(PROGRAMING),
                programingTypes = listOf(JAVASCRIPT),
            ),
            BackendDeveloper(
                questionTypes = listOf(PROGRAMING),
                programingTypes = listOf(JAVA),
                frameworkTypes = listOf(SPRING),
            ),
            AndroidDeveloper(
                questionTypes = listOf(PROGRAMING),
                programingTypes = listOf(KOTLIN),
            ),
        )
        `when`("Position의 집합을 PositionResponse 객체로 반환한다.") {
            val positionResponse = PositionResponse.of(developers)

            then("필드에 중복이 제거된 상태로 최종 값을 반환한다.") {
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