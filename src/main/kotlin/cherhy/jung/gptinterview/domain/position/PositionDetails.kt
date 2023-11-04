package cherhy.jung.gptinterview.domain.position

import cherhy.jung.gptinterview.domain.question.constant.FrameworkType
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType
import cherhy.jung.gptinterview.domain.question.constant.QuestionType

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

