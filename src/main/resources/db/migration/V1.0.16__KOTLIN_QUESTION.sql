INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin 언어의 특징은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 널 안정성(null safety)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 확장 함수(extension function)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 코루틴(coroutines)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 람다 함수(lambda function)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 Data 클래스의 특징과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 Companion Object의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 인터페이스(interface)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 프로퍼티(property)의 특징과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 스코프 함수(scope functions)의 종류와 각각의 특징을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 Enum 클래스의 특징과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 Sealed 클래스의 특징과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 제네릭(generics)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 연산자 오버로딩(operator overloading)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 델리게이션(delegation)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 프라이머리 생성자와 세컨더리 생성자의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 lateinit과 lazy의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 인라인 함수(inline function)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 코루틴(Coroutine)과 스레드(Thread)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 씰드 클래스(Sealed Class)와 열거형(Enum)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 리시버 타입(receiver type)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 스트림 연산자(Stream Operators)의 종류와 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 플랫맵(FlatMap)과 맵(Map)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 자료형 추론(type inference)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 콜렉션(collection)의 종류와 특징을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 익스텐션 프로퍼티(extension property)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 조건 연산자(conditional operator)의 종류와 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 lateinit과 by lazy의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 let, also, apply, run, with 함수의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Kotlin에서 함수형 프로그래밍의 특징과 장점을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'KOTLIN', NOW(), NOW());