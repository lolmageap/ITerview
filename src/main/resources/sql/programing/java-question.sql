INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java 언어의 특징은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java 가상 머신(JVM)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java의 가비지 컬렉션(garbage collection)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 클래스(class)와 객체(object)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 인터페이스(interface)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 추상 클래스(abstract class)와 인터페이스(interface)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 예외 처리(exception handling)를 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 다형성(polymorphism)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 제네릭(generic)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 스레드(thread)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 동기화(synchronization)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 컬렉션(collection) 프레임워크란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 ArrayList와 LinkedList의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 해시맵(HashMap)과 트리맵(TreeMap)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 스트림(stream)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 파일 입출력(file I/O)을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 직렬화(serialization)란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 애너테이션(annotation)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 리플렉션(reflection)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 람다 표현식(lambda expression)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 열거형(enum)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 스트림(Stream) API의 장점과 사용법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 제네릭 메소드(generic method)란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 멀티스레딩(multithreading)을 구현하는 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 equals()와 hashCode() 메소드의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 String 클래스와 StringBuilder 클래스의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 static 키워드의 역할과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 접근 제어자(access modifier)의 종류와 역할을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 상속(inheritance)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 인터페이스 상속과 클래스 상속의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 super 키워드와 this 키워드의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 final 키워드의 역할과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 추상 클래스(abstract class)의 특징과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 내부 클래스(inner class)의 종류와 특징을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 업캐스팅(upcasting)과 다운캐스팅(downcasting)의 개념을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 오버로딩(overloading)과 오버라이딩(overriding)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 인터페이스의 다중 상속(multiple inheritance)을 지원하는 이유는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 static 블록(static block)의 역할과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 예외 클래스의 계층 구조(hierarchy)와 예외 처리의 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 try-with-resources 문의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 클론(clone) 메소드의 역할과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 애너테이션 프로세서(annotation processor)의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 열거형(enum)의 메소드와 속성을 사용하는 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 제네릭스(generics)와 와일드카드(wildcard)의 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 암시적 형변환(implicit type casting)과 명시적 형변환(explicit type casting)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 비트 연산자(bitwise operator)의 종류와 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 열거형(enum)의 내부 동작 원리를 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 클래스 로딩(class loading)과 클래스 초기화(class initialization)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 데드락(deadlock)이란 무엇인가요? 그리고 어떻게 발생하는지 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 직렬화(serialization)와 역직렬화(deserialization)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 4, NOW(), NOW());
