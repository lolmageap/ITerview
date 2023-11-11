package cherhy.jung.gptinterview.domain.position

import cherhy.jung.gptinterview.domain.position.PositionType.*
import cherhy.jung.gptinterview.domain.question.constant.FrameworkType.*
import cherhy.jung.gptinterview.domain.question.constant.ProgramingType.*
import cherhy.jung.gptinterview.domain.question.constant.QuestionType.*
import io.kotest.core.spec.style.FeatureSpec
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.collections.shouldContainAll
import io.kotest.matchers.shouldBe

internal class PositionFactoryTest: FeatureSpec({
    feature("개발자 타입을 인자로 받으면 스펙에 맞는 하위 클래스 로 반환 한다.") {

        scenario("GAME 을 받으면 Gamer 타입의 스펙과 같아 진다.") {
            val gameDeveloper = PositionFactory.generatePosition(GAME) as GameDeveloper
            gameDeveloper.questionTypes shouldContainAll listOf(DATABASE, NETWORK)
            gameDeveloper.programingTypes shouldContain `C#`
            gameDeveloper.frameworkTypes shouldContain UNITY
        }

        scenario("DATA_ANALYSIS 를 받으면 DataAnalysis 타입의 스펙과 같아 진다.") {
            val dataAnalysis = PositionFactory.generatePosition(DATA_ANALYSIS) as DataAnalysis
            dataAnalysis.questionTypes shouldContainAll listOf(DATABASE, OS)
            dataAnalysis.programingTypes shouldContain PYTHON
            dataAnalysis.frameworkTypes shouldBe emptyList()
        }

        scenario("DATA_ENGINEER 를 받으면 DataEngineer 타입의 스펙과 같아 진다.") {
            val dataEngineer = PositionFactory.generatePosition(DATA_ENGINEER) as DataEngineer
            dataEngineer.questionTypes shouldContainAll listOf(DATABASE, STRUCTURE)
            dataEngineer.programingTypes shouldContain PYTHON
            dataEngineer.frameworkTypes shouldBe emptyList()
        }

        scenario("BACKEND 를 받으면 BackendDeveloper 타입의 스펙과 같아 진다.") {
            val backendDeveloper = PositionFactory.generatePosition(BACKEND) as BackendDeveloper
            backendDeveloper.questionTypes shouldContainAll listOf(TEST, NETWORK)
            backendDeveloper.programingTypes shouldContainAll listOf(PYTHON, JAVA, JAVASCRIPT)
            backendDeveloper.frameworkTypes shouldContainAll listOf(FAST_API, SPRING)
        }

        scenario("FRONTEND 를 받으면 FrontendDeveloper 타입의 스펙과 같아 진다.") {
            val frontendDeveloper = PositionFactory.generatePosition(FRONTEND) as FrontendDeveloper
            frontendDeveloper.questionTypes shouldContainAll listOf(DESIGN_PATTERN, VCS, PROGRAMING)
            frontendDeveloper.programingTypes shouldContainAll listOf(JAVASCRIPT, CSS)
            frontendDeveloper.frameworkTypes shouldContainAll listOf(REACT, NEST)
        }

        scenario("SECURITY 을 받으면 InformationSecurity 타입의 스펙과 같아 진다.") {
            val informationSecurity = PositionFactory.generatePosition(SECURITY) as InformationSecurity
            informationSecurity.questionTypes shouldContainAll listOf(NETWORK, OS)
            informationSecurity.programingTypes shouldContainAll listOf(C, `C++`, GO)
            informationSecurity.frameworkTypes shouldBe emptyList()
        }

        scenario("ANDROID 을 받으면 AndroidDeveloper 타입의 스펙과 같아 진다.") {
            val androidDeveloper = PositionFactory.generatePosition(ANDROID) as AndroidDeveloper
            androidDeveloper.questionTypes shouldContainAll listOf(DATABASE, NETWORK)
            androidDeveloper.programingTypes shouldContain KOTLIN
            androidDeveloper.frameworkTypes shouldContain SPRING
        }

        scenario("IOS 를 받으면 IosDeveloper 타입의 스펙과 같아 진다.") {
            val iosDeveloper = PositionFactory.generatePosition(IOS) as IosDeveloper
            iosDeveloper.questionTypes shouldContainAll listOf(DESIGN_PATTERN, TEST)
            iosDeveloper.programingTypes shouldContain SWIFT
            iosDeveloper.frameworkTypes shouldBe emptyList()
        }

        scenario("AI 을 받으면 AiDeveloper 타입의 스펙과 같아 진다.") {
            val aiDeveloper = PositionFactory.generatePosition(AI) as AiDeveloper
            aiDeveloper.questionTypes shouldContainAll listOf(DATABASE, NETWORK)
            aiDeveloper.programingTypes shouldContain PYTHON
            aiDeveloper.frameworkTypes shouldBe emptyList()
        }

        scenario("BLOCKCHAIN 을 받으면 BlockchainDeveloper 타입의 스펙과 같아 진다.") {
            val blockchainDeveloper = PositionFactory.generatePosition(BLOCKCHAIN) as BlockchainDeveloper
            blockchainDeveloper.questionTypes shouldContainAll listOf(STRUCTURE, VCS)
            blockchainDeveloper.programingTypes shouldContainAll listOf(RUST, GO)
            blockchainDeveloper.frameworkTypes shouldBe emptyList()
        }

        scenario("DBA 를 받으면 DatabaseAdministrator 타입의 스펙과 같아 진다.") {
            val databaseAdministrator = PositionFactory.generatePosition(DBA) as DatabaseAdministrator
            databaseAdministrator.questionTypes shouldContain DATABASE
            databaseAdministrator.programingTypes shouldBe emptyList()
            databaseAdministrator.frameworkTypes shouldBe emptyList()
        }

    }
})