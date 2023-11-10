package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.domain.question.constant.FrameworkType.SPRING
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType.JAVA
import cherhy.jung.gptinterview.domain.question.constant.QuestionType.*
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.collections.shouldNotContain

class QuestionRequestTest : BehaviorSpec({

    Given("사용자가 카테고리를 선택하고 ") {
        val questionRequest = QuestionRequest(
            questionTypes = listOf(PROGRAMING, FRAMEWORK, DATABASE),
            programingTypes = listOf(JAVA),
            frameworkTypes = listOf(SPRING),
            levels = emptyList(),
        )

        When("PROGRAMING 또는 FRAMEWORK 가 포함이 되어있다면 ") {
            val question = questionRequest.toQuestionRequestS()

            Then("제외시킨다.") {
                question.questionTypes shouldNotContain PROGRAMING
                question.questionTypes shouldNotContain FRAMEWORK

                question.questionTypes shouldContain DATABASE
                question.programingTypes shouldContain JAVA
                question.frameworkTypes shouldContain SPRING
            }
        }
    }

})
