INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 9, 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask의 주요 특징은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 9, 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask는 Django와 Pyramid에 비해 어떻게 다른가요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask에서 요청은 어떻게 처리되나요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask에서 양식 데이터는 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask Blueprints란 무엇이며, 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask에서 쿠키는 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask 애플리케이션 컨텍스트란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask에서 예외는 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask의 컨텍스트 로컬, 예를 들어 요청과 세션의 목적은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask에서 세션은 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask에서 SQLAlchemy와 같은 ORM을 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask에서 사용자 인증을 어떻게 구현하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-SQLAlchemy는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), '대형 Flask 애플리케이션은 어떻게 구조화하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-Migrate는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask에서 환경 변수는 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask 애플리케이션은 어떻게 테스트하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-WTForms는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-Login은 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-Script는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-RESTful은 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-Mail은 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-Admin은 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-Security는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-Cache는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-Babel은 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-OAuthlib는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-SocketIO는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-Bootstrap는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-CORS는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-GraphQL은 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask의 요청 디스패칭 프로세스는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-JWT를 사용하여 인증을 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-HTTPAuth는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-Session은 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-Uploads를 사용하여 파일 업로드는 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-User를 사용하여 사용자 관리는 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-Moment를 사용하여 날짜와 시간 처리는 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-Alembic를 사용하여 데이터베이스 마이그레이션은 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-Marshmallow를 사용하여 객체 직렬화/역직렬화는 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-PyMongo를 사용하여 MongoDB와 어떻게 상호작용하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-Principal를 사용하여 권한 및 신원 관리는 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-SeaSurf를 사용하여 CSRF 보호는 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-WTF를 사용하여 양식 유효성 검사와 렌더링은 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-DebugToolbar를 사용하여 디버깅은 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-Themes를 사용하여 테마 지원은 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-Assets를 사용하여 자산 관리는 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-Testing를 사용하여 단위 테스트는 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Flask-Sijax를 사용하여 AJAX 지원은 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 7, NOW(), NOW());

