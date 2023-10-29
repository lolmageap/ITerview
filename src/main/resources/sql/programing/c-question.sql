INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C 언어란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C 언어의 특징은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C 언어에서 변수와 상수의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C 언어에서 포인터(pointer)의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C 언어에서 배열(array)과 포인터의 관계는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C 언어에서 구조체(structure)와 공용체(union)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C 언어에서 함수(function)와 프로시저(procedure)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C 언어에서 재귀 함수(recursive function)의 개념은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C 언어에서 전역 변수와 지역 변수의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C 언어에서 메모리 할당과 해제의 방법은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C 언어에서 포인터와 배열의 관계를 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C 언어에서 문자열(string)과 문자(character)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C 언어에서 파일 입출력(file I/O)을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C 언어에서 구조체(structure)와 포인터의 관계를 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C 언어에서 동적 할당(dynamic allocation)의 개념은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C 언어에서 enum과 define의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C 언어에서 비트 연산자(bitwise operator)를 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C 언어에서 함수 포인터(function pointer)의 개념은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C 언어에서 메모리 누수(memory leak)가 발생하는 경우는 어떤 경우인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C 언어에서 포인터와 메모리 주소의 관계를 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C', NOW(), NOW());