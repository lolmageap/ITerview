INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어의 특징은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 고루틴(goroutine)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 채널(channel)의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 인터페이스(interface)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 패키지(package)와 임포트(import)의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 슬라이스(slice)와 배열(array)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 맵(map)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 defer 문의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 에러 처리(error handling)를 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 JSON 데이터를 다루는 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 구조체(struct)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 메소드(method)와 함수(function)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 패닉(panic)과 리커버(recover)의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 인터페이스(interface)와 타입(type)의 관계를 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 고루틴(goroutine)과 스레드(thread)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 네트워크 프로그래밍을 위한 패키지는 어떤 것이 있나요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 테스트 작성을 위한 테스팅 패키지는 어떤 것이 있나요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 문자열(string)과 바이트 슬라이스([]byte)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 메모리 관리를 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 초기화(init) 함수의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 패키지 버전 관리를 위한 모듈(module)의 개념을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 컨커런시(concurrency)와 병렬성(parallelism)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 채널(channel)을 사용한 동기화(synchronization) 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 임베딩(embedding)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 패키지의 접근 제어(access control)를 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 테스트 코드 작성을 위한 테스트 커버리지(coverage)의 개념을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 컨텍스트(context) 패키지의 역할과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 변수의 생존 범위(scope)와 라이프타임(lifetime)의 개념을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Go 언어에서 인터페이스(interface)를 구현하는 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'GO', NOW(), NOW());
