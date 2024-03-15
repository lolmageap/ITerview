INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C++에서 클래스와 구조체의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'C++', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C++에서 가상 함수(virtual function)의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'C++', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C++에서 다중 상속(multiple inheritance)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'C++', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C++에서 포인터와 참조(reference)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'C++', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C++에서 const 키워드의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'C++', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C++에서 스마트 포인터(smart pointer)란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'C++', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C++에서 오버로딩과 오버라이딩의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'C++', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C++에서 예외 처리(exception handling)란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'C++', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C++에서 템플릿(template)의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'C++', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C++에서 스레드(thread)와 멀티스레딩(multithreading)의 개념은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'C++', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C++에서 람다 표현식(lambda expression)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'C++', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C++에서 네임스페이스(namespace)의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'C++', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C++에서 소멸자(destructor)의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'C++', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C++에서 표준 라이브러리(STL)란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'C++', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C++에서 연산자 오버로딩(operator overloading)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'C++', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C++에서 move semantics란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'C++', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C++에서 RAII(Resource Acquisition Is Initialization)란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'C++', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C++에서 정적(static) 멤버와 인스턴스 멤버의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'C++', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C++에서 스트림(stream)과 입출력 라이브러리의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'C++', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C++에서 컴파일러 최적화(Compiler optimization)란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'C++', NOW(), NOW());