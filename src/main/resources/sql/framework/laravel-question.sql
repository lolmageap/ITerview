INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel의 주요 특징은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel은 Symfony와 CodeIgniter와 같은 다른 PHP 프레임워크와 어떻게 비교되나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel에서 라우팅은 어떻게 처리되나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel에서 양식 데이터를 어떻게 검증하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Service Providers란 무엇이며, 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel에서 쿠키는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Eloquent ORM이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel에서 예외는 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel의 미들웨어의 목적은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel에서 세션은 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel에서 Eloquent와 같은 ORM을 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel에서 사용자 인증을 어떻게 구현하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel migrations는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '대형 Laravel 애플리케이션은 어떻게 구조화하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Artisan은 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel에서 환경 변수는 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel 애플리케이션은 어떻게 테스트하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Blade 템플릿은 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Passport는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Dusk는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Horizon은 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Nova는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Sanctum은 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Tinker는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Mix는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Socialite는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Vapor는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Echo는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Scout는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Cashier는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Fortify는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel의 요청 수명 주기는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Jetstream를 사용하여 인증을 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Broadcasting은 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Queue는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Storage를 사용하여 파일 업로드는 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Policies를 사용하여 권한을 어떻게 관리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Localization를 사용하여 다국어 지원은 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Seeder를 사용하여 데이터베이스 시딩은 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Events를 사용하여 이벤트 처리는 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Notifications를 사용하여 사용자와 어떻게 상호작용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Gates를 사용하여 권한을 어떻게 관리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Task Scheduling을 사용하여 백그라운드 작업은 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Contracts를 사용하여 느슨한 결합은 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Facades를 사용하여 정적인 인터페이스는 어떻게 제공하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Resource Controllers를 사용하여 RESTful API는 어떻게 제공하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Dependency Injection을 사용하여 객체 관리는 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Mail을 사용하여 이메일을 어떻게 보내나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Laravel Validation을 사용하여 데이터 검증은 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_menu (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'LARAVEL', NOW(), NOW());

