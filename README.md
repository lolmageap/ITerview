# interview-gpt

## 소개

### 소개글
배포까지 진행할 프로젝트이며 제 3자도 자유롭게 코드를 복제하여 사용할 수 있도록 공개합니다!

### 과정
프로젝트 세팅을 마쳤으며 로그인, 회원가입까지만 구현이 된 상태입니다.
회원의 비밀번호를 저장할 때, Rainbow Table 공격을 방지하기 위해 비밀번호는 솔팅(salting)된 상태로 저장됩니다.
질문을 넣는 배치 서버를 따로 띄울 생각입니다.


### 정책
1. 사용자는 자신의 개발 포지션을 선택합니다.
2. 개발 관련 면접 문제를 내주고 답안을 작성하면 GPT가 채점 및 피드백을 해줍니다.
3. 상세 검색을 원한다면 카테고리를 선택하여 특정 분야의 질문을 받을 수 있습니다. 
4. 면접 문제의 난이도는 조정할 수 있습니다.
5. 문제가 마음에 들지 않는다면 문제를 풀지 않고 다음 문제로 넘길 수 있습니다.
6. 로그인을 한 상태라면 이전에 풀었던 문제를 확인 할 수 있습니다.

## 프로젝트 실행 방식
1. https://platform.openai.com/docs/guides/gpt 에 들어가서 우측 상단 Personal 메뉴에 들어간다.
2. View API keys를 누른 후 open-api key 를 발급받는다.
3. [application.yml](src%2Fmain%2Fresources%2Fapplication.yml) 에 들어가서 발급 받은 api key 를 'api-key' 의 value에 입력한다.
4. docker desktop 을 실행시킨다.
5. terminal에서 ' docker-compose up ' 명령어를 실행한다.
6. application을 실행시킨다.

## 질문 메뉴 설계 예시
![image](https://github.com/lolmageap/interview-gpt/assets/96738163/60d27cd6-bfd9-4d8d-b961-10674550f709)
