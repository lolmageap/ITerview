package cherhy.jung.gptinterview.domain.position

import cherhy.jung.gptinterview.domain.position.PositionType.*
import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType
import cherhy.jung.gptinterview.domain.question.constant.QuestionType

sealed class Position {

    abstract val questionTypes: List<QuestionType>
    abstract val frameworkTypes: List<FrameworkType>
    abstract val programingTypes: List<ProgramingType>

    companion object {
        fun of(positionType: PositionType): Position =
            when (positionType) {
                GAME -> Gamer()
                DATA_ANALYSIS -> DataAnalysis()
                DATA_ENGINEER -> DataEngineer()
                BACKEND -> BackendDeveloper()
                FRONTEND -> FrontendDeveloper()
                SECURITY -> InformationSecurity()
                ANDROID -> AndroidDeveloper()
                IOS -> IosDeveloper()
                AI -> AiDeveloper()
                BLOCKCHAIN -> BlockchainDeveloper()
                DBA -> DatabaseAdministrator()
            }
    }
}