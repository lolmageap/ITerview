package cherhy.jung.gptinterview.domain.position

import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType
import cherhy.jung.gptinterview.domain.question.constant.QuestionType

class Gamer(
    override val questionTypes: List<QuestionType> = listOf(
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
    override val programingTypes: List<ProgramingType> = listOf(
        ProgramingType.`C#`,
    ),
    override val frameworkTypes: List<FrameworkType> = listOf(
        FrameworkType.UNITY,
    ),
) : Position()

class DataAnalysis(
    override val questionTypes: List<QuestionType> = listOf(
        QuestionType.DATABASE,
        QuestionType.OS,
        QuestionType.STRUCTURE,
        QuestionType.VCS,
        QuestionType.PROGRAMING,
    ),
    override val programingTypes: List<ProgramingType> = listOf(
        ProgramingType.PYTHON,
    ),
    override val frameworkTypes: List<FrameworkType> = emptyList(),
) : Position()

class DataEngineer(
    override val questionTypes: List<QuestionType> = listOf(
        QuestionType.DATABASE,
        QuestionType.STRUCTURE,
        QuestionType.PROGRAMING,
    ),
    override val programingTypes: List<ProgramingType> = listOf(
        ProgramingType.PYTHON,
    ),
    override val frameworkTypes: List<FrameworkType> = emptyList(),
) : Position()

class BackendDeveloper(
    override val questionTypes: List<QuestionType> = listOf(
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
    override val programingTypes: List<ProgramingType> = listOf(
        ProgramingType.PYTHON,
        ProgramingType.JAVA,
        ProgramingType.JAVASCRIPT,
        ProgramingType.KOTLIN,
        ProgramingType.PHP,
        ProgramingType.`C#`,
    ),
    override val frameworkTypes: List<FrameworkType> = listOf(
        FrameworkType.DJANGO,
        FrameworkType.FAST_API,
        FrameworkType.SPRING,
        FrameworkType.NEXT,
        FrameworkType.LARAVEL,
        FrameworkType.DOTNET,
    ),
) : Position()

class FrontendDeveloper(
    override val questionTypes: List<QuestionType> = listOf(
        QuestionType.NETWORK,
        QuestionType.DESIGN_PATTERN,
        QuestionType.VCS,
        QuestionType.PROGRAMING,
        QuestionType.FRAMEWORK,
    ),
    override val programingTypes: List<ProgramingType> = listOf(
        ProgramingType.JAVASCRIPT,
        ProgramingType.CSS,
    ),
    override val frameworkTypes: List<FrameworkType> = listOf(
        FrameworkType.REACT,
        FrameworkType.NEST,
    ),
) : Position()

class InformationSecurity(
    override val questionTypes: List<QuestionType> = listOf(
        QuestionType.NETWORK,
        QuestionType.OS,
        QuestionType.PROGRAMING,
    ),
    override val programingTypes: List<ProgramingType> = listOf(
        ProgramingType.C,
        ProgramingType.`C++`,
        ProgramingType.GO,
    ),
    override val frameworkTypes: List<FrameworkType> = emptyList(),
) : Position()

class AndroidDeveloper(
    override val questionTypes: List<QuestionType> = listOf(
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
    override val programingTypes: List<ProgramingType> = listOf(
        ProgramingType.JAVA,
        ProgramingType.KOTLIN,
    ),
    override val frameworkTypes: List<FrameworkType> = listOf(
        FrameworkType.SPRING,
    ),
) : Position()

class IosDeveloper(
    override val questionTypes: List<QuestionType> = listOf(
        QuestionType.DATABASE,
        QuestionType.NETWORK,
        QuestionType.DESIGN_PATTERN,
        QuestionType.TEST,
        QuestionType.OS,
        QuestionType.STRUCTURE,
        QuestionType.VCS,
        QuestionType.PROGRAMING,
    ),
    override val programingTypes: List<ProgramingType> = listOf(
        ProgramingType.SWIFT,
    ),
    override val frameworkTypes: List<FrameworkType> = emptyList(),
) : Position()

class AiDeveloper(
    override val questionTypes: List<QuestionType> = listOf(
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
    override val programingTypes: List<ProgramingType> = listOf(
        ProgramingType.PYTHON,
        ProgramingType.JAVA,
    ),
    override val frameworkTypes: List<FrameworkType> = emptyList(),
) : Position()

class BlockchainDeveloper(
    override val questionTypes: List<QuestionType> = listOf(
        QuestionType.DATABASE,
        QuestionType.NETWORK,
        QuestionType.TEST,
        QuestionType.OS,
        QuestionType.STRUCTURE,
        QuestionType.VCS,
        QuestionType.PROGRAMING,
    ),
    override val programingTypes: List<ProgramingType> = listOf(
        ProgramingType.JAVASCRIPT,
        ProgramingType.RUST,
        ProgramingType.GO,
    ),
    override val frameworkTypes: List<FrameworkType> = emptyList(),
) : Position()

class DatabaseAdministrator(
    override val questionTypes: List<QuestionType> = listOf(
        QuestionType.DATABASE,
        QuestionType.NETWORK,
        QuestionType.STRUCTURE,
    ),
    override val programingTypes: List<ProgramingType> = emptyList(),
    override val frameworkTypes: List<FrameworkType> = emptyList(),
) : Position()