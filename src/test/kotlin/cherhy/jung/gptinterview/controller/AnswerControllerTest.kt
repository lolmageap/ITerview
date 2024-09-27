package cherhy.jung.gptinterview.controller

import cherhy.jung.gptinterview.domain.question.QuestionHistoryReadService
import com.ninjasquad.springmockk.MockkBean
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.restdocs.RestDocumentationExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@WebMvcTest(QuestionHistoryController::class)
@ExtendWith(RestDocumentationExtension::class)
class AnswerControllerTest(
    @Autowired private val mockMvc: MockMvc,

    @MockkBean private val questionHistoryController: QuestionHistoryController,
    @MockkBean private val questionHistoryReadService: QuestionHistoryReadService,
) : StringSpec({

    "test" {
        val mock = mockMvc.get("/questions/histories")
            .andExpect {
                status { isOk() }
                content { contentType("application/json") }
                content { json("[]") }
            }

        val result = mock.andReturn().response.contentAsString
        result shouldBe "[]"
    }

})
