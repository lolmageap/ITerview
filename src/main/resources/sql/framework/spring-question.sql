INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Framework란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Framework의 주요 특징은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서 Dependency Injection(의존성 주입)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring은 어떻게 Dependency Injection을 구현하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서는 어떤 종류의 Dependency Injection이 있나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서의 Inversion of Control(제어의 역전)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring IoC 컨테이너란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서 BeanFactory와 ApplicationContext의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서 어떻게 빈(Bean)을 정의하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서 빈의 스코프(scope)는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서 빈의 다양한 스코프는 어떤 것들이 있나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서 예외(Exception)를 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서 AOP(Aspect-Oriented Programming)란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring AOP에서 다양한 종류의 어드바이스(Advice)는 어떤 것들이 있나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서 트랜잭션(Transaction)을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring은 JDBC를 어떻게 지원하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring MVC란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring MVC는 어떻게 요청을 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring MVC에서 DispatcherServlet은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring MVC에서 다양한 종류의 컨트롤러(Controller)는 어떤 것들이 있나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring MVC에서 양식 데이터를 어떻게 유효성 검사하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Boot란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Boot를 사용하는 장점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Boot Starter란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Boot에서 RESTful한 웹 서비스를 어떻게 생성하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Boot에서 보안을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Data란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Data는 데이터베이스 작업을 어떻게 간소화하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Data JPA란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Data REST는 RESTful 서비스 구축을 어떻게 간소화하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Security란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Security는 인증과 권한 부여를 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'OAuth란 무엇이며, Spring Security OAuth는 어떻게 작동하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Cloud란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Cloud는 분산 시스템 구축을 어떻게 간소화하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Batch란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Batch는 배치 처리를 어떻게 간소화하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Integration이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Integration은 다른 시스템과의 통합을 어떻게 간소화하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring WebFlux란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring WebFlux는 반응형 프로그래밍을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Session이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Session은 세션 관리를 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring WebSocket이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring WebSocket은 실시간 통신을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Framework의 장단점에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring webclient에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서 필터와 인터셉터에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서 Jackson 라이브러리가 직렬화와 역직렬화 하는 과정에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring에서 @Bean과 @Component에 대해서 설명해주시고, 둘의 차이점에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Data JPA에서 Propagation 전파 단계를 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Data JPA에서 영속성 컨텍스트에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Data JPA를 쓴다면 그 이유에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Data JPA 영속성 컨텍스트의 이점을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Data JPA에서 N + 1 문제는 무엇이고 이것이 발생하는 이유와 이를 해결하는 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Spring Data JPA 즉시로딩과 지연로딩의 차이를 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'SPRING Data JPA에서 Dirty Checking이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'SPRING Data JPA에서 @Embedded를 사용하는 이유를 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'SPRING Data JPA에서 Inheritance 전략에는 어떤 것이 있나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'SPRING Data JPA에서 orphanRemoval 옵션은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'SPRING Data JPA에서 @Transactional 어노테이션을 사용하는 이유는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'SPRING Data JPA에서 EntityManager란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'SPRING Data JPA에서 Flush() 메서드는 무엇을 하는 메서드인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'SPRING', NOW(), NOW());