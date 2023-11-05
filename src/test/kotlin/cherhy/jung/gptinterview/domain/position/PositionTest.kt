package cherhy.jung.gptinterview.domain.position

import cherhy.jung.gptinterview.domain.position.PositionType.*
import cherhy.jung.gptinterview.domain.question.constant.FrameworkType.*
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType.*
import cherhy.jung.gptinterview.domain.question.constant.QuestionType.*
import io.kotest.core.spec.style.FeatureSpec
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.collections.shouldContainAll
import io.kotest.matchers.shouldBe

class PositionTest: FeatureSpec({
    feature("개발자의 타입을 인자로 받으면 스펙에 맞는 하위 클래스로 반환한다.") {

        scenario("GAME을 받으면 Gamer 타입의 스펙과 같아진다.") {
            val gamer = Position.of(GAME) as Gamer
            gamer.questionTypes shouldContainAll listOf(DATABASE, NETWORK)
            gamer.programingTypes shouldContain `C#`
            gamer.frameworkTypes shouldContain UNITY
        }

        scenario("DATA_ANALYSIS를 받으면 DataAnalysis 타입의 스펙과 같아진다.") {
            val dataAnalysis = Position.of(DATA_ANALYSIS) as DataAnalysis
            dataAnalysis.questionTypes shouldContainAll listOf(DATABASE, OS)
            dataAnalysis.programingTypes shouldContain PYTHON
            dataAnalysis.frameworkTypes shouldBe emptyList()
        }

        scenario("DATA_ENGINEER를 받으면 DataEngineer 타입의 스펙과 같아진다.") {
            val dataEngineer = Position.of(DATA_ENGINEER) as DataEngineer
            dataEngineer.questionTypes shouldContainAll listOf(DATABASE, STRUCTURE)
            dataEngineer.programingTypes shouldContain PYTHON
            dataEngineer.frameworkTypes shouldBe emptyList()
        }

        scenario("BACKEND를 받으면 BackendDeveloper 타입의 스펙과 같아진다.") {
            val backendDeveloper = Position.of(BACKEND) as BackendDeveloper
            backendDeveloper.questionTypes shouldContainAll listOf(TEST, NETWORK)
            backendDeveloper.programingTypes shouldContainAll listOf(PYTHON, JAVA, JAVASCRIPT)
            backendDeveloper.frameworkTypes shouldContainAll listOf(FAST_API, SPRING)
        }

        scenario("FRONTEND 받으면 FrontendDeveloper 타입의 스펙과 같아진다.") {
            val frontendDeveloper = Position.of(FRONTEND) as FrontendDeveloper
            frontendDeveloper.questionTypes shouldContainAll listOf(DESIGN_PATTERN, VCS, PROGRAMING)
            frontendDeveloper.programingTypes shouldContainAll listOf(JAVASCRIPT, CSS)
            frontendDeveloper.frameworkTypes shouldContainAll listOf(REACT, NEST)
        }

        scenario("SECURITY을 받으면 InformationSecurity 타입의 스펙과 같아진다.") {
            val informationSecurity = Position.of(SECURITY) as InformationSecurity
            informationSecurity.questionTypes shouldContainAll listOf(NETWORK, OS)
            informationSecurity.programingTypes shouldContainAll listOf(C, `C++`, GO)
            informationSecurity.frameworkTypes shouldBe emptyList()
        }

        scenario("ANDROID을 받으면 AndroidDeveloper 타입의 스펙과 같아진다.") {
            val androidDeveloper = Position.of(ANDROID) as AndroidDeveloper
            androidDeveloper.questionTypes shouldContainAll listOf(DATABASE, NETWORK)
            androidDeveloper.programingTypes shouldContain KOTLIN
            androidDeveloper.frameworkTypes shouldContain SPRING
        }

        scenario("IOS를 받으면 IosDeveloper 타입의 스펙과 같아진다.") {
            val iosDeveloper = Position.of(IOS) as IosDeveloper
            iosDeveloper.questionTypes shouldContainAll listOf(DESIGN_PATTERN, TEST)
            iosDeveloper.programingTypes shouldContain SWIFT
            iosDeveloper.frameworkTypes shouldBe emptyList()
        }

        scenario("AI을 받으면 AiDeveloper 타입의 스펙과 같아진다.") {
            val aiDeveloper = Position.of(AI) as AiDeveloper
            aiDeveloper.questionTypes shouldContainAll listOf(DATABASE, NETWORK)
            aiDeveloper.programingTypes shouldContain PYTHON
            aiDeveloper.frameworkTypes shouldBe emptyList()
        }

        scenario("BLOCKCHAIN을 받으면 BlockchainDeveloper 타입의 스펙과 같아진다.") {
            val blockchainDeveloper = Position.of(BLOCKCHAIN) as BlockchainDeveloper
            blockchainDeveloper.questionTypes shouldContainAll listOf(STRUCTURE, VCS)
            blockchainDeveloper.programingTypes shouldContainAll listOf(RUST, GO)
            blockchainDeveloper.frameworkTypes shouldBe emptyList()
        }

        scenario("DBA를 받으면 DatabaseAdministrator 타입의 스펙과 같아진다.") {
            val databaseAdministrator = Position.of(DBA) as DatabaseAdministrator
            databaseAdministrator.questionTypes shouldContain DATABASE
            databaseAdministrator.programingTypes shouldBe emptyList()
            databaseAdministrator.frameworkTypes shouldBe emptyList()
        }

    }
})