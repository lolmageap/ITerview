package cherhy.jung.gptinterview.domain.position

object PositionFactory {

    fun generatePosition(positionType: PositionType): Position =
        when (positionType) {
            PositionType.GAME -> GameDeveloper()
            PositionType.DATA_ANALYSIS -> DataAnalysis()
            PositionType.DATA_ENGINEER -> DataEngineer()
            PositionType.BACKEND -> BackendDeveloper()
            PositionType.FRONTEND -> FrontendDeveloper()
            PositionType.SECURITY -> InformationSecurity()
            PositionType.ANDROID -> AndroidDeveloper()
            PositionType.IOS -> IosDeveloper()
            PositionType.AI -> AiDeveloper()
            PositionType.BLOCKCHAIN -> BlockchainDeveloper()
            PositionType.DBA -> DatabaseAdministrator()
        }

}