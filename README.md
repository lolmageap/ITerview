﻿# interview-gpt

## Stack
- Kotlin, Redis, MySQL, JPA, QueryDSL, Docker Compose, Spring Security, JAVA VERSION 17

## 프로젝트 실행 방식
1. 프로젝트를 clone/fork 한다.
2. https://platform.openai.com/docs/guides/gpt 에 들어가서 우측 상단 Personal 메뉴에 들어간다.
3. View API keys를 누른 후 open-api key 를 발급받는다.
4. [application.yml](src%2Fmain%2Fresources%2Fapplication.yml) 에 들어가서 발급 받은 api key 를 'api-key' 의 value에 입력한다.
5. Docker Desktop 을 실행시킨다.
6. Spring Boot Application 을 실행시킨다.

## 소개
- 배포까지 진행할 프로젝트이며 제 3자도 자유롭게 코드를 복제하여 사용할 수 있도록 공개합니다!

- application을 실행하면 [InitPosition.kt](src%2Fmain%2Fkotlin%2Fcherhy%2Fjung%2Fgptinterview%2FInitPosition.kt)가 메뉴 테이블을 생성해줍니다.

- 메뉴 테이블이 생성된 다음 src/main/resources/sql 경로의 질문 데이터를 생성합니다.

- 회원가입시 회원의 비밀번호를 저장할 때, Rainbow Table 공격을 방지하기 위해 비밀번호는 솔팅(Salting)된 상태로 저장됩니다.

- 상위 계층은 하위 계층을 알지만 하위 계층은 상위 계층을 알 수 없는 단방향 아키텍처를 목표로 설계했습니다.

- 로그인은 JWT 로 구현이 되어있으며 OAuth2 로그인은 구현 예정입니다.

### 정책
1. 사용자는 자신의 개발 포지션을 선택할 수 있습니다. (예정)
1. 질문의 타입을 설정하여 요청을 보내면 요구사항에 맞는 면접 문제가 한개 출제됩니다.
1. 면접 문제의 난이도는 조정할 수 있습니다.
1. 개발 관련 면접 문제를 풀고 답안을 작성한 뒤 제출 요청을 보내면 GPT 가 채점 및 피드백을 해줍니다. (예정)
1. 문제가 마음에 들지 않는다면 문제를 풀지 않고 다음 문제로 넘길 수 있습니다.
1. 회원이 다음 문제를 넘기거나 풀게 되면 1시간 후까지 자신이 동일한 문제는 나오지 않습니다.
1. 회원은 자신이 이전에 풀었던 문제를 다시 확인 할 수 있습니다.

## 질문 메뉴 설계 예시
![image](https://github.com/lolmageap/interview-gpt/assets/96738163/60d27cd6-bfd9-4d8d-b961-10674550f709)
