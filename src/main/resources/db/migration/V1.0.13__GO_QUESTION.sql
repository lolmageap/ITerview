INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 고루틴(goroutine)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 채널(channel)의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 인터페이스(interface)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 슬라이스(slice)와 배열(array)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 맵(map)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 defer 문의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 구조체(struct)의 개념을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 메소드(method)와 함수(function)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 패닉(panic)과 리커버(recover)의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 인터페이스(interface)와 타입(type)의 관계를 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 네트워크 프로그래밍을 위한 패키지는 어떤 것이 있나요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 문자열(string)과 바이트 슬라이스([]byte)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 초기화(init) 함수의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 컨커런시(concurrency)와 병렬성(parallelism)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 채널(channel)을 사용한 동기화(synchronization) 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 임베딩(embedding)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 패키지의 접근 제어(access control)를 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go에서의 포인터(Pointers) 사용 방법과 주의점에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go에서의 인터페이스 합성(Interface Composition)에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go에서의 벤치마킹(Benchmarking)과 프로파일링(Profiling) 기술에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go의 타입 어설션(Type Assertion)과 타입 스위치(Type Switch)에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go에서의 타입 임베딩(Type Embedding)과 익명 필드에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go에서의 채널 패턴(Channel Patterns)과 동시성 패턴에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go의 Cgo를 사용하여 C 라이브러리를 통합하는 방법에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go의 커스텀 타입(Custom Types) 및 타입 변환(Type Conversion)에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go의 뮤텍스(Mutexes)와 동기화 기법에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());
