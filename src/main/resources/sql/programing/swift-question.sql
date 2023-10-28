INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Swift 언어의 특징은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 8, 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Swift에서 옵셔널(Optional)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 8, 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Swift에서 가드(guard) 문의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 8, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Swift에서 클로저(Closure)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 8, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Swift에서 프로토콜(Protocol)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 8, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Swift에서 제네릭(Generic)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 8, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Swift에서 에러 처리(Error Handling)를 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 8, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Swift에서 타입 추론(Type Inference)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 8, 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Swift에서 클래스(Class)와 구조체(Struct)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 8, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Swift에서 익스텐션(Extension)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 8, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Swift에서 프로퍼티 옵저버(Property Observer)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 8, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Swift에서 ARC(Automatic Reference Counting)란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 8, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Swift에서 튜플(Tuple)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 8, 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Swift에서 옵셔널 체이닝(Optional Chaining)과 옵셔널 강제 추출(Forced Unwrapping)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 8, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Swift에서 키-값 코딩(Key-Value Coding)과 키-값 관찰(Key-Value Observing)의 개념을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 8, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Swift에서 데코더(Decoder)와 인코더(Encoder)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 8, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Swift에서 메모리 관리에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 8, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Swift에서 값 타입(Value Type)과 참조 타입(Reference Type)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 8, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Swift에서 동기(Synchronous)와 비동기(Asynchronous)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 8, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Swift에서 GCD(Grand Central Dispatch)란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 8, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());