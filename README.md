# interview-gpt

## 소개

### 소개글
배포까지 진행할 프로젝트이며 제 3자도 자유롭게 코드를 복제하여 사용할 수 있도록 공개합니다!

### 과정
프로젝트 세팅을 마쳤으며 로그인, 회원가입까지만 구현이 된 상태입니다.

### 정책
사이트에 들어오면 개발 관련 면접 문제를 내주고 답안을 작성하면 GPT가 채점 및 피드백을 해준다.

## 프로젝트 실행 방식
1. https://platform.openai.com/docs/guides/gpt 에 들어가서 우측 상단 Personal 메뉴에 들어간다.
2. View API keys를 누른 후 open-api key 를 발급받는다.
3. [application.yml](src%2Fmain%2Fresources%2Fapplication.yml) 에 들어가서 발급 받은 api key 를 'api-key' 의 value에 입력한다.
4. docker desktop 을 실행시킨다.
5. terminal에서 ' docker-compose up ' 명령어를 실행한다.
6. application을 실행시킨다.

## 질문 메뉴 설계 예시
![image](https://github.com/lolmageap/interview-gpt/assets/96738163/60d27cd6-bfd9-4d8d-b961-10674550f709)
