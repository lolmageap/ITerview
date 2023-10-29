INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'PHP 언어의 특징은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 12, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'PHP에서 배열(array)의 종류와 각각의 특징을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 12, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'PHP에서 PDO란 무엇이고, 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 12, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'PHP에서 네임스페이스(namespace)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 12, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'PHP에서 트레이트(trait)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 12, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'PHP에서 익명 함수(anonymous function)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 12, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'PHP에서 가비지 컬렉션(garbage collection)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 12, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'PHP에서 매직 메소드(magic method)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 12, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'PHP에서 정적 메소드(static method)와 정적 속성(static property)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 12, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'PHP에서 예외 처리(exception handling)를 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 12, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'PHP에서 네임스페이스(namespace)와 오토로딩(autoloading)의 관계를 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 12, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'PHP에서 클로저(closure)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 12, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'PHP에서 인터페이스(interface)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 12, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'PHP에서 생성자(constructor)와 소멸자(destructor)의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 12, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'PHP에서 배열과 객체의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 12, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'PHP에서 디펜던시 인젝션(dependency injection)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 12, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'PHP에서 추상 클래스(abstract class)와 인터페이스(interface)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 12, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'PHP에서 오버로딩(overloading)과 오버라이딩(overriding)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 12, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'PHP에서 Composer란 무엇이고, 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 12, NOW(), NOW());