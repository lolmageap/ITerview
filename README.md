# ITerview

## Stack
- Kotlin, Redis, MySQL, JPA, QueryDSL, Docker Compose, Spring Security, JAVA VERSION 17

## 프로젝트 실행 방식
1. 프로젝트를 clone/fork 한다.
2. https://platform.openai.com/docs/guides/gpt 에 들어 가서 우측 상단 Personal 메뉴에 들어 간다.
3. View API keys 누른 후 open-api key 를 발급 받는다.
4. [application.yml](src%2Fmain%2Fresources%2Fapplication.yml) 에 들어 가서 발급 받은 api key 를 'api-key' 의 value 에 입력 한다.
5. Docker Desktop 을 실행 시킨다.
6. Spring Boot Application 을 실행 시킨다.
7. application 을 실행할 때 JASYPT_ALGORITHM, JASYPT_PASSWORD 을 입력 해야 한다.

## 소개
- 배포까지 진행할 프로젝트 이며 제 3자도 자유롭게 코드를 복제 하여 사용할 수 있도록 공개 합니다!

- 배포는 Elastic Beanstalk 으로 진행중 입니다.

- 현재 질문 조회 및 개발 포지션 선택 기능, Chat GPT 에게 질문을 넘기고 채점 및 피드백을 받는 기능 까지 모두 개발 되었습니다.

- 메뉴 테이블 이 생성된 다음 [src/main/resources/sql](src%2Fmain%2Fresources%2Fsql) 경로의 질문 데이터 가 Database 에 Insert 됩니다.

- 회원가입 시 회원의 비밀번호 를 저장할 때, Rainbow Table 공격을 방지 하기 위해 비밀번호 는 솔팅(Salting)된 상태로 저장 됩니다.

- 상위 계층은 하위 계층을 알지만 하위 계층은 상위 계층을 알 수 없는 단방향 아키텍처를 목표로 설계 했습니다.

- 로그인 은 JWT 로 구현이 되어 있으며 OAuth2 로그인 은 구현 예정 입니다.

- 뷰 페이지 는 구현 중이며 API 스펙은 application 실행 후 Swagger UI : http://localhost:8901/swagger-ui/index.html 를 통해 확인 하실 수 있습니다.

### 정책
1. 사용자 는 자신의 개발 포지션 을 선택할 수 있습니다.
2. 질문의 타입을 설정 하여 요청을 보내면 요구사항에 맞는 면접 문제가 한개 출제 됩니다. 
3. 면접 문제의 난이도 는 조정할 수 있습니다. 
4. 개발 관련 면접 문제를 풀고 답안을 작성한 뒤 제출 요청을 보내면 GPT 가 채점 및 피드백을 해줍니다. 
5. 문제가 마음에 들지 않는다면 문제를 풀지 않고 다음 문제로 넘길 수 있습니다. 
6. 회원이 다음 문제로 넘기거나 풀게 되면 동일한 문제는 재출제 되지 않습니다. 
7. 회원은 자신이 이전에 풀었던 문제를 다시 확인 할 수 있습니다.

### 회원의 변경, 삭제 이벤트 처리
- 회원의 변경, 삭제 이벤트는 항상 customer history table 에 저장 됩니다.
- 이 이벤트들은 아래 경로에서 확인 할 수 있습니다.
  - [ThreadLocalConfig.kt](src%2Fmain%2Fkotlin%2Fcherhy%2Fjung%2Fgptinterview%2Fconfig%2FThreadLocalConfig.kt)
  - [PrincipalInterceptor.kt](src%2Fmain%2Fkotlin%2Fcherhy%2Fjung%2Fgptinterview%2Fconfig%2FPrincipalInterceptor.kt)
  - [JpaUpdateEventListener.kt](src%2Fmain%2Fkotlin%2Fcherhy%2Fjung%2Fgptinterview%2Flistener%2FJpaUpdateEventListener.kt)
  - [JpaDeleteEventListener.kt](src%2Fmain%2Fkotlin%2Fcherhy%2Fjung%2Fgptinterview%2Flistener%2FJpaDeleteEventListener.kt)
  - [AnyExtension.kt](src%2Fmain%2Fkotlin%2Fcherhy%2Fjung%2Fgptinterview%2Fextension%2FAnyExtension.kt)
  
## TODO
- [ ] refactoring 및 분해로 인해 깨지는 test case 를 수정
- [ ] xss 를 방지하기 위한 시큐리티 필터를 구현
- [ ] OAuth2 로그인 구현
- [x] https://source.unsplash.com/random -> username, 이미지 랜덤 으로 넣어두기
- [x] 마지막 에 세팅 했던 기술 스택, 포지션 저장
- [x] 기술 질문들 변경하자 ex) 특히 framework 쪽 - nest, fastapi 등등...
- [ ] pagination response 객체를 만들자!
- [x] 답변 받았던 대답에 이어서 대답하기 기능 추가 ( 답글 - 대댓글 구조의 테이블 생성 )
- [ ] 질문의 타입을 바꿨을 때 어디까지 바뀐 것인지 알 수 있게 라인 추가
- [ ] 카테고리 늘리기 ( 아키텍쳐, 데브옵스, 인프라 등등... )

- history 같은 경우 답변과 질문을 같이 저장하고 상수로 구분해서 가져오자
  - 상수는 질문, 답변, 피드백 3개를 만들어서 사용하자
  - depth를 추가하여 정렬을 할 수 있게 하자
  - 질문 -> 답변 -> 피드백 -> 답변 -> 피드백 -> 답변 -> 피드백 -> 답변... 이 되게 하자