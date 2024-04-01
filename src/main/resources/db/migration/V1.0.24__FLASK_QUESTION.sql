INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask는 Django와 Pyramid에 비해 어떻게 다른가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask Blueprints란 무엇이며, 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask 애플리케이션 컨텍스트란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask-Migrate는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask-WTForms는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask-Babel은 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask-OAuthlib는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask의 요청 디스패칭 프로세스는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask-HTTPAuth는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask-User를 사용하여 사용자 관리는 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask-Alembic를 사용하여 데이터베이스 마이그레이션은 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask-Marshmallow를 사용하여 객체 직렬화/역직렬화는 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask-PyMongo를 사용하여 MongoDB와 어떻게 상호작용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask-Principal를 사용하여 권한 및 신원 관리는 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask-SeaSurf를 사용하여 CSRF 보호는 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask-DebugToolbar를 사용하여 디버깅은 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask-Themes를 사용하여 테마 지원은 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask-Assets를 사용하여 자산 관리는 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask-Sijax를 사용하여 AJAX 지원은 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask에서 뷰 함수(View Function)란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask에서 폼 처리를 위해 WTForms를 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask에서 Celery를 사용하여 비동기 작업을 처리하는 방법은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask의 Jinja2 템플릿 엔진의 고급 사용 방법은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Flask에서 Gunicorn과 같은 WSGI 서버를 사용하는 방법은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FLASK', NOW(), NOW());