INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '실제 프로젝트에서 Django를 사용하여 개발한 경험에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서의 미들웨어(Middleware) 사용 경험은 어떠한가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django ORM을 사용하여 복잡한 쿼리를 작성한 경험에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django의 클래스 기반 뷰(Class Based View)와 함수 기반 뷰(Function Based View) 중 어떤 것을 선호하나요? 그 이유는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 비동기 작업을 처리한 경험이 있나요? 어떤 방법을 사용하였나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 캐싱을 통해 성능을 개선한 경험이 있나요? 어떤 방법을 사용하였나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 RESTful API를 설계하였을 때의 경험에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django 프로젝트에서 테스트 코드를 작성하였나요? 어떤 테스트를 진행하였나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 CSRF 공격을 방지하기 위한 방법은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 사용자 인증과 권한 부여에 대한 경험을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 다국어 지원을 위해 어떤 접근 방식을 사용하였나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django 프로젝트를 배포할 때 사용한 방법은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 AJAX를 사용하여 비동기 통신을 구현한 경험이 있나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django와 다른 프론트엔드 프레임워크 혹은 라이브러리(React, Vue 등)와의 연동 경험은 어떠한가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 DB 트랜잭션을 다룬 경험이 있나요? 어떻게 처리하였나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 메모리 누수 문제를 해결한 경험이 있나요? 어떻게 해결하였나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 로깅을 설정하여 문제를 진단하고 해결한 경험이 있나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 웹소켓을 사용하여 실시간 통신 기능을 구현한 경험이 있나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 큰 데이터를 처리할 때 어떤 전략을 사용하였나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 세션과 쿠키를 어떻게 다뤘나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 보안 취약점을 찾고 해결한 경험이 있나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 사용한 배치 작업 처리 방법은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 파일 업로드 기능을 구현한 경험이 있나요? 어떤 방법을 사용하였나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 특정 작업에 대해 성능을 측정하고 개선한 경험이 있나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 레디스(Redis)나 메모리 데이터베이스를 사용한 경험이 있나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 크롤링 작업을 수행한 경험이 있나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 여러 데이터베이스를 동시에 사용한 경험이 있나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 서드파티 앱을 사용하여 기능을 추가한 경험이 있나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 모바일 앱과의 통신을 위해 어떤 접근 방식을 사용하였나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서 마이크로서비스 아키텍처를 구현한 경험이 있나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서의 ORM에서 Raw 쿼리 작성 방법에 대해 설명해주세요', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서의 폼(Form) 처리 방법에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서의 URL 패턴 매칭과 뷰(View) 연결 방법에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서의 템플릿(Template) 사용 방법에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서의 정적 파일(Static Files) 사용 방법에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서의 인증과 권한 관리 방법에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Django에서의 다국어 지원 방법에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'DJANGO', NOW(), NOW());
