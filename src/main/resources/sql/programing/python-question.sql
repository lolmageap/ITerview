INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python 언어의 특징은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 리스트와 튜플의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 가변 인자(mutable argument)와 불변 인자(immutable argument)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 제너레이터(generator)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 데코레이터(decorator)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 리스트 컴프리헨션(list comprehension)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 GIL(Global Interpreter Lock)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 멀티스레딩(multithreading)과 멀티프로세싱(multiprocessing)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 동적 타이핑(dynamic typing)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 클래스(class)와 인스턴스(instance)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 오버로딩(overloading)과 오버라이딩(overriding)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 딕셔너리(dictionary)의 특징과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 예외 처리(exception handling)를 어떻게 하나요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 name == "main"의 의미는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 가비지 컬렉션(garbage collection)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 네임스페이스(namespace)의 개념을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 딥 카피(deep copy)와 쉘로우 카피(shallow copy)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 반복자(iterator)와 제너레이터(generator)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 메타클래스(metaclass)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 클로저(closure)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 @staticmethod와 @classmethod의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 덕 타이핑(duck typing)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 추상 클래스(abstract class)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 with 문을 사용하는 이유는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 매직 메소드(magic method)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 *args와 **kwargs의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 함수의 재귀 호출(recursive call)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 함수형 프로그래밍(functional programming)의 특징은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 람다 함수(lambda function)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 스코프(scope)의 개념을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 데코레이터를 사용하는 이유는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 가상 환경(virtual environment)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 배열과 리스트의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 연산자 오버로딩(operator overloading)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 파이썬 인터프리터를 종료하는 방법은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 pickling이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 싱글턴 패턴(singleton pattern)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 정규 표현식(regular expression)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 스트링 포매팅(string formatting)의 종류와 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 이터러블(iterable)과 이터레이터(iterator)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 context manager의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 객체 지향 프로그래밍과 함수형 프로그래밍의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 동적 타이핑(dynamic typing)과 정적 타이핑(static typing)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 스코프(scope)와 네임스페이스(namespace)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 리스트 컴프리헨션과 제너레이터 컴프리헨션의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 튜플을 사용하는 이유는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 쓰레드(thread)와 프로세스(process)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 데드락(deadlock)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 레이스 컨디션(race condition)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Python에서 이벤트 드리븐 프로그래밍(event-driven programming)의 개념을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'PYTHON', NOW(), NOW());