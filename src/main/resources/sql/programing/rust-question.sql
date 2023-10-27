INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Rust 언어의 특징은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 9, 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 6, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Rust에서 소유권(ownership)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 6, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Rust에서 빌림(borrowing)과 라이프타임(lifetime)의 개념을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 6, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Rust에서 슬라이스(slice)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 6, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Rust에서 패턴 매칭(pattern matching)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 6, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Rust에서 제네릭(generics)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 6, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Rust에서 트레이트(trait)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 6, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Rust에서 클로저(closure)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 6, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Rust에서 스마트 포인터(smart pointer)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 6, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Rust에서 에러 처리(error handling)를 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 6, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Rust에서 라이프타임(lifetime)을 어떻게 관리하나요?', SUBSTRING(UUID(), 1, 8), 9, 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 6, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Rust에서 메모리 안전성(memory safety)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 6, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Rust에서 크레이트(crate)와 모듈(module)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 6, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Rust에서 동시성(concurrency)과 병렬성(parallelism)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 6, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Rust에서 패닉(panic)과 에러(error)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 6, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Rust에서 타입 추론(type inference)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 6, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Rust에서 mut 키워드의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 9, 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 6, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Rust에서 Rc, RefCell, Box 등의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 6, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Rust에서 이터레이터(iterator)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 6, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_menu_id, level) 
VALUES (0, NOW(), NOW(), 'Rust에서 enum과 match의 관계를 설명해주세요.', SUBSTRING(UUID(), 1, 8), 9, 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 6, NOW(), NOW());