package cherhy.jung.gptinterview.domain.position

import cherhy.jung.gptinterview.domain.position.PositionType.*
import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType
import cherhy.jung.gptinterview.domain.question.constant.QuestionType

sealed class Position {

    abstract val questionTypes: List<QuestionType>
    abstract val frameworkTypes: List<FrameworkType>
    abstract val programingTypes: List<ProgramingType>

    companion object{
        fun from(positionType: PositionType): Position =
            when (positionType) {
                GAME -> Gamer(
                    questionTypes = listOf(
                        QuestionType.DATABASE,
                        QuestionType.NETWORK,
                        QuestionType.DESIGN_PATTERN,
                        QuestionType.TEST,
                        QuestionType.OS,
                        QuestionType.STRUCTURE,
                        QuestionType.VCS,
                        QuestionType.PROGRAMING,
                        QuestionType.FRAMEWORK,
                    ),
                    frameworkTypes = listOf(
                        FrameworkType.UNITY,
                    ),
                    programingTypes = listOf(
                        ProgramingType.`C#`,
                    ),
                )

                DATA_ANALYSIS -> DataAnalysis(
                    questionTypes = listOf(
                        QuestionType.DATABASE,
                        QuestionType.OS,
                        QuestionType.STRUCTURE,
                        QuestionType.VCS,
                        QuestionType.PROGRAMING,
                    ),
                    programingTypes = listOf(
                        ProgramingType.PYTHON,
                    ),
                )

                DATA_ENGINEER -> DataEngineer(
                    questionTypes = listOf(
                        QuestionType.DATABASE,
                        QuestionType.STRUCTURE,
                        QuestionType.PROGRAMING,
                    ),
                    programingTypes = listOf(
                        ProgramingType.PYTHON,
                    ),
                )

                BACKEND -> BackendDeveloper(
                    questionTypes = listOf(
                        QuestionType.DATABASE,
                        QuestionType.NETWORK,
                        QuestionType.DESIGN_PATTERN,
                        QuestionType.TEST,
                        QuestionType.OS,
                        QuestionType.STRUCTURE,
                        QuestionType.VCS,
                        QuestionType.PROGRAMING,
                        QuestionType.FRAMEWORK,
                    ),
                    frameworkTypes = listOf(
                        FrameworkType.DJANGO,
                        FrameworkType.FAST_API,
                        FrameworkType.SPRING,
                        FrameworkType.NEXT,
                        FrameworkType.LARAVEL,
                        FrameworkType.DOTNET,
                    ),
                    programingTypes = listOf(
                        ProgramingType.PYTHON,
                        ProgramingType.JAVA,
                        ProgramingType.JAVASCRIPT,
                        ProgramingType.KOTLIN,
                        ProgramingType.PHP,
                        ProgramingType.`C#`,
                    ),
                )
                FRONTEND -> FrontendDeveloper(
                    questionTypes = listOf(
                        QuestionType.NETWORK,
                        QuestionType.DESIGN_PATTERN,
                        QuestionType.VCS,
                        QuestionType.PROGRAMING,
                        QuestionType.FRAMEWORK,
                    ),
                    frameworkTypes = listOf(
                        FrameworkType.REACT,
                        FrameworkType.NEST,
                    ),
                    programingTypes = listOf(
                        ProgramingType.JAVASCRIPT,
                        ProgramingType.CSS,
                    ),
                )
                SECURITY -> InformationSecurity(
                    questionTypes = listOf(
                        QuestionType.NETWORK,
                        QuestionType.OS,
                        QuestionType.PROGRAMING,
                    ),
                    programingTypes = listOf(
                        ProgramingType.C,
                        ProgramingType.`C++`,
                        ProgramingType.GO,
                    ),
                )
                ANDROID -> AndroidDeveloper(
                    questionTypes = listOf(
                        QuestionType.DATABASE,
                        QuestionType.NETWORK,
                        QuestionType.DESIGN_PATTERN,
                        QuestionType.TEST,
                        QuestionType.OS,
                        QuestionType.STRUCTURE,
                        QuestionType.VCS,
                        QuestionType.PROGRAMING,
                        QuestionType.FRAMEWORK,
                    ),
                    frameworkTypes = listOf(
                        FrameworkType.SPRING,
                    ),
                    programingTypes = listOf(
                        ProgramingType.JAVA,
                        ProgramingType.KOTLIN,
                    ),
                )
                IOS -> IosDeveloper(
                    questionTypes = listOf(
                        QuestionType.DATABASE,
                        QuestionType.NETWORK,
                        QuestionType.DESIGN_PATTERN,
                        QuestionType.TEST,
                        QuestionType.OS,
                        QuestionType.STRUCTURE,
                        QuestionType.VCS,
                        QuestionType.PROGRAMING,
                    ),
                    programingTypes = listOf(
                        ProgramingType.SWIFT,
                    ),
                )
                AI -> AiDeveloper(
                    questionTypes = listOf(
                        QuestionType.DATABASE,
                        QuestionType.NETWORK,
                        QuestionType.DESIGN_PATTERN,
                        QuestionType.TEST,
                        QuestionType.OS,
                        QuestionType.STRUCTURE,
                        QuestionType.VCS,
                        QuestionType.PROGRAMING,
                        QuestionType.FRAMEWORK,
                    ),
                    programingTypes = listOf(
                        ProgramingType.PYTHON,
                        ProgramingType.JAVA,
                    ),
                )
                BLOCKCHAIN -> BlockchainDeveloper(
                    questionTypes = listOf(
                        QuestionType.DATABASE,
                        QuestionType.NETWORK,
                        QuestionType.TEST,
                        QuestionType.OS,
                        QuestionType.STRUCTURE,
                        QuestionType.VCS,
                        QuestionType.PROGRAMING,
                    ),
                    programingTypes = listOf(
                        ProgramingType.JAVASCRIPT,
                        ProgramingType.RUST,
                        ProgramingType.GO,
                    ),
                )
                DBA -> DatabaseAdministrator(
                    questionTypes = listOf(
                        QuestionType.DATABASE,
                        QuestionType.NETWORK,
                        QuestionType.STRUCTURE,
                    ),
                )
            }
    }
}

class Gamer(
    override val questionTypes: List<QuestionType>,
    override val frameworkTypes: List<FrameworkType> = listOf(),
    override val programingTypes: List<ProgramingType> = listOf(),
) : Position()

class DataAnalysis(
    override val questionTypes: List<QuestionType>,
    override val frameworkTypes: List<FrameworkType> = listOf(),
    override val programingTypes: List<ProgramingType> = listOf(),
) : Position()

class DataEngineer(
    override val questionTypes: List<QuestionType>,
    override val frameworkTypes: List<FrameworkType> = listOf(),
    override val programingTypes: List<ProgramingType> = listOf(),
) : Position()

class BackendDeveloper(
    override val questionTypes: List<QuestionType>,
    override val frameworkTypes: List<FrameworkType> = listOf(),
    override val programingTypes: List<ProgramingType> = listOf(),
) : Position()

class FrontendDeveloper(
    override val questionTypes: List<QuestionType>,
    override val frameworkTypes: List<FrameworkType> = listOf(),
    override val programingTypes: List<ProgramingType> = listOf(),
) : Position()

class InformationSecurity(
    override val questionTypes: List<QuestionType>,
    override val frameworkTypes: List<FrameworkType> = listOf(),
    override val programingTypes: List<ProgramingType> = listOf(),
) : Position()

class AndroidDeveloper(
    override val questionTypes: List<QuestionType>,
    override val frameworkTypes: List<FrameworkType> = listOf(),
    override val programingTypes: List<ProgramingType> = listOf(),
) : Position()

class IosDeveloper(
    override val questionTypes: List<QuestionType>,
    override val frameworkTypes: List<FrameworkType> = listOf(),
    override val programingTypes: List<ProgramingType> = listOf(),
) : Position()

class AiDeveloper(
    override val questionTypes: List<QuestionType>,
    override val frameworkTypes: List<FrameworkType> = listOf(),
    override val programingTypes: List<ProgramingType> = listOf(),
) : Position()

class BlockchainDeveloper(
    override val questionTypes: List<QuestionType>,
    override val frameworkTypes: List<FrameworkType> = listOf(),
    override val programingTypes: List<ProgramingType> = listOf(),
) : Position()

class DatabaseAdministrator(
    override val questionTypes: List<QuestionType>,
    override val frameworkTypes: List<FrameworkType> = listOf(),
    override val programingTypes: List<ProgramingType> = listOf(),
) : Position()

