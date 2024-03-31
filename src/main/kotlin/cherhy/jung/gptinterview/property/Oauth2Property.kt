package cherhy.jung.gptinterview.property

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("oauth2.default")
data class DefaultPasswordProperty(
    val password: String,
    val salt: String,
)

@ConfigurationProperties("oauth2.client.kakao")
data class KakaoClientProperty(
    val clientId: String,
    val redirectUri: String,
    val clientSecret: String,
    val clientAuthenticationMethod: String,
    val authorizationGrantType: String,
    val scope: String,
    val clientName: String,
)

@ConfigurationProperties("oauth2.provider.kakao")
data class KakaoProviderProperty(
    val authorizationUri: String,
    val tokenUri: String,
    val userInfoUri: String,
    val userNameAttribute: String,
)

// TODO : google property 는 yaml에 제대로된 설정이 안되어 있어 google 개발자 도구에서 값을 받아야한다.
@ConfigurationProperties("oauth2.client.google")
data class GoogleProperty(
    val tokenUri: String,
    val clientId: String,
    val redirectUri: String,
    val clientSecret: String,
    val clientAuthenticationMethod: String,
    val authorizationGrantType: String,
    val scope: String,
    val clientName: String,
) {
    val userInfoUri = "https://www.googleapis.com/oauth2/v1/userinfo?client_id=$clientId"
}