package cherhy.jung.gptinterview.external.oauth2

import cherhy.jung.gptinterview.domain.authority.Oauth2WriteService
import cherhy.jung.gptinterview.domain.authority.OauthRequest
import cherhy.jung.gptinterview.domain.authority.of
import cherhy.jung.gptinterview.domain.customer.constant.Provider
import cherhy.jung.gptinterview.extension.getAccessToken
import cherhy.jung.gptinterview.extension.id
import cherhy.jung.gptinterview.external.jwt.TokenResponse
import cherhy.jung.gptinterview.external.oauth2.OauthKey.CLIENT_ID
import cherhy.jung.gptinterview.external.oauth2.OauthKey.CLIENT_SECRET
import cherhy.jung.gptinterview.external.oauth2.OauthKey.CODE
import cherhy.jung.gptinterview.external.oauth2.OauthKey.GRANT_TYPE
import cherhy.jung.gptinterview.external.oauth2.OauthKey.REDIRECT_URI
import cherhy.jung.gptinterview.property.GoogleProperty
import cherhy.jung.gptinterview.property.KakaoClientProperty
import cherhy.jung.gptinterview.property.KakaoProviderProperty
import cherhy.jung.gptinterview.util.JwtKey.BEARER
import com.fasterxml.jackson.databind.ObjectMapper
import org.apache.http.HttpHeaders.AUTHORIZATION
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.util.LinkedMultiValueMap
import org.springframework.util.MultiValueMap
import org.springframework.web.client.RestTemplate

@Component
class OAuth2Client(
    private val kakaoClientProperty: KakaoClientProperty,
    private val kakaoProviderProperty: KakaoProviderProperty,
    private val oauth2WriteService: Oauth2WriteService,
    private val googleProperty: GoogleProperty,
    private val objectMapper: ObjectMapper,
    private val restTemplate: RestTemplate,
) {
    fun signInByKakao(
        code: String,
    ): TokenResponse {
        val parameters = LinkedMultiValueMap<String, String>().apply {
            add(GRANT_TYPE, kakaoClientProperty.authorizationGrantType)
            add(CLIENT_ID, kakaoClientProperty.clientId)
            add(REDIRECT_URI, kakaoClientProperty.redirectUri)
            add(CLIENT_SECRET, kakaoClientProperty.clientSecret)
            add(CODE, code)
        }

        val headers = HttpHeaders().apply {
            contentType = MediaType.APPLICATION_FORM_URLENCODED
        }

        val request: HttpEntity<MultiValueMap<String, String>> = HttpEntity(parameters, headers)

        val response = restTemplate.postForEntity(
            kakaoProviderProperty.tokenUri,
            request,
            String::class.java,
        )

        val accessToken = objectMapper.getAccessToken(response.body)

        val userInfoHeaders = HttpHeaders().apply {
            add(AUTHORIZATION, BEARER + accessToken)
        }

        val userInfoRequest = HttpEntity(null, userInfoHeaders)

        val userResponse = restTemplate.exchange(
            kakaoProviderProperty.userInfoUri,
            HttpMethod.GET,
            userInfoRequest,
            String::class.java,
        )

        val token = objectMapper.readTree(userResponse.body)
        val oauthRequest = OauthRequest.of(
            providerId = token.id,
            provider = Provider.KAKAO,
        )

        return oauth2WriteService.execute(oauthRequest)
    }

    fun signInByGoogle(
        code: String,
    ): TokenResponse {
        val headers = HttpHeaders().apply {
            contentType = MediaType.APPLICATION_FORM_URLENCODED
            charset(Charsets.UTF_8.name())
        }

        val parameters = LinkedMultiValueMap<String, String>().apply {
            add(GRANT_TYPE, googleProperty.authorizationGrantType)
            add(CLIENT_ID, googleProperty.clientId)
            add(REDIRECT_URI, googleProperty.redirectUri)
            add(CLIENT_SECRET, googleProperty.clientSecret)
            add(CODE, code)
        }

        val request = HttpEntity(parameters, headers)

        val response = restTemplate.postForEntity(
            googleProperty.tokenUri,
            request,
            String::class.java,
        )

        val accessToken = objectMapper.getAccessToken(response.body)

        val userInfoHeaders = HttpHeaders().apply {
            add(AUTHORIZATION, BEARER + accessToken)
        }

        val userInfoRequest = HttpEntity(null, userInfoHeaders)

        val userResponse = restTemplate.exchange(
            googleProperty.userInfoUri,
            HttpMethod.GET,
            userInfoRequest,
            String::class.java,
        )

        val token = objectMapper.readTree(userResponse.body)

        val oauthRequest = OauthRequest.of(
            providerId = token.id,
            provider = Provider.GOOGLE,
        )

        return oauth2WriteService.execute(oauthRequest)
    }

    fun signInByGithub(code: String): TokenResponse {
        TODO("Not yet implemented")
    }

    fun signInByNaver(code: String): TokenResponse {
        TODO("Not yet implemented")
    }
}