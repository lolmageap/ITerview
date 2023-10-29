INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Framework란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Framework의 주요 특징은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서 Dependency Injection(의존성 주입)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring은 어떻게 Dependency Injection을 구현하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서는 어떤 종류의 Dependency Injection이 있나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서의 Inversion of Control(제어의 역전)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring IoC 컨테이너란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서 BeanFactory와 ApplicationContext의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서 어떻게 빈(Bean)을 정의하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서 빈의 스코프(scope)는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서 빈의 다양한 스코프는 어떤 것들이 있나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서 예외(Exception)를 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서 AOP(Aspect-Oriented Programming)란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring AOP에서 다양한 종류의 어드바이스(Advice)는 어떤 것들이 있나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서 트랜잭션(Transaction)을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring은 JDBC를 어떻게 지원하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring MVC란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring MVC는 어떻게 요청을 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring MVC에서 DispatcherServlet은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring MVC에서 다양한 종류의 컨트롤러(Controller)는 어떤 것들이 있나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring MVC에서 양식 데이터를 어떻게 유효성 검사하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Boot란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Boot를 사용하는 장점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Boot Starter란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Boot 구성을 어떻게 사용자 정의하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Boot에서 RESTful한 웹 서비스를 어떻게 생성하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Boot에서 보안을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Data란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Data는 데이터베이스 작업을 어떻게 간소화하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Data JPA란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Data REST는 RESTful 서비스 구축을 어떻게 간소화하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Security란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Security는 인증과 권한 부여를 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'OAuth란 무엇이며, Spring Security OAuth는 어떻게 작동하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Cloud란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Cloud는 분산 시스템 구축을 어떻게 간소화하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Batch란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Batch는 배치 처리를 어떻게 간소화하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Integration이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Integration은 다른 시스템과의 통합을 어떻게 간소화하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Social이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Social은 소셜 네트워크와의 통합을 어떻게 간소화하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring WebFlux란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring WebFlux는 반응형 프로그래밍을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Session이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Session은 세션 관리를 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring WebSocket이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring WebSocket은 실시간 통신을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring HATEOAS란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring HATEOAS는 REST 표현을 어떻게 간소화하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Mobile이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Mobile은 모바일 웹 개발을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring for Android이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring for Android은 안드로이드 앱 개발을 어떻게 간소화하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring AMQP란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring AMQP는 AMQP 브로커와의 메시징을 어떻게 간소화하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring LDAP이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring LDAP은 LDAP 프로그래밍을 어떻게 간소화하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 1, NOW(), NOW());
