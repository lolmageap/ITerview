INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java 가상 머신(JVM)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java의 가비지 컬렉션(garbage collection)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 클래스(class)와 객체(object)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 인터페이스(interface)의 개념을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 추상 클래스(abstract class)와 인터페이스(interface)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 다형성(polymorphism)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 제네릭(generic)의 개념을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 스레드(thread)의 개념을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 동기화(synchronization)의 개념을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 컬렉션(collection) 프레임워크란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 ArrayList와 LinkedList의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 해시맵(HashMap)과 트리맵(TreeMap)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 스트림(stream)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 파일 입출력(file I/O)을 할 때 주의해야할 점을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 직렬화(serialization)란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 애너테이션(annotation)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 람다 표현식(lambda expression)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 열거형(enum)에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 스트림(Stream) API를 사용하는 이유를 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 제네릭 메소드(generic method)란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 공변성(Covariance)과 반공변성(Contravariance)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java의 멀티스레딩(multithreading)에 개념과 장단점에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 equals()와 hashCode()를 override 하여 사용하는 이유는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 static 키워드의 역할과 개념을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 접근 제어자(access modifier)의 종류와 역할을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 상속(inheritance)에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 인터페이스 상속과 클래스 상속의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 super 키워드와 this 키워드의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 final, finally, finalize 키워드의 용도와 차이는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 추상 클래스(abstract class)의 특징과 개념을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 내부 클래스(inner class)의 개념을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 업캐스팅(upcasting)과 다운캐스팅(downcasting)의 개념을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 오버로딩(overloading)과 오버라이딩(overriding)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 인터페이스의 다중 상속(multiple inheritance)을 지원하는 이유는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 static 블록(static block)의 역할과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 try-with-resources 문의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서의 객체 클로닝(Object Cloning) 방법과 주의사항은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 애너테이션 프로세서(annotation processor)의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 제네릭스(generics)와 와일드카드(wildcard)의 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 암시적 형변환(implicit type casting)과 명시적 형변환(explicit type casting)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 비트 연산자(bitwise operator)의 종류와 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 열거형(enum)의 내부 동작 원리를 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 클래스 로딩(class loading)과 클래스 초기화(class initialization)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 역직렬화(deserialization)의 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 jdk와 jre차이점에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 컴파일 과정에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 인터프리터와 JIT 컴파일러에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 call by value , call by reference에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 원시타입과 참조타입의 차이에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 String, StringBuilder, StringBuffer 각각의 차이에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 new String()과 리터럴의 차이에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 Optional에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 바이트 코드란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서의 빌더 패턴(Builder Pattern)을 사용하는 이유와 장단점에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서의 동시성 프로그래밍(Concurrency Programming)과 관련된 문제들은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서의 인터페이스 디폴트 메소드(Interface Default Methods)는 어떤 목적으로 도입되었나요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java의 네이티브 메소드(Native Methods)에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서의 컴파일 타임 폴리모피즘(Compile-time Polymorphism)과 런타임 폴리모피즘(Runtime Polymorphism)의 차이는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java의 메모리 관리에서 스택(Stack)과 힙(Heap)의 차이는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java8에서 추가된 기능들에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 ThreadPoolExecutor는 어떻게 동작하나요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 깊은 복사와 얕은 복사가 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 CompletableFuture가 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 자바에서 병렬 스트림이란 무엇이며 어떻게 작동하나요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java의 메모리 모델과 멀티스레딩에서의 visibility와 ordering에 대해 설명하세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java의 non-blocking 알고리즘과 그 예제에 대해 설명하세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java의 volatile 키워드와 happen-before 관계에 대해 설명하세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서 reflection을 사용할 때의 고려 사항과 성능에 대해 설명하세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서의 Generics의 타입 소거(Type Erasure)에 대해 설명하세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java NIO의 주요 특징과 non-blocking I/O 처리 방법에 대해 설명하세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java의 finalize 메소드의 단점과 대안에 대해 설명하세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java의 String pool의 원리와 장단점에 대해 설명하세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서의 약한 참조(Weak References), 부드러운 참조(Soft References)와 강한 참조(Strong References)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java의 애너테이션(Annotations) 처리 방법과 APT(Annotation Processing Tool)에 대해 설명하세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서의 프록시(Proxy) 클래스와 그 사용 사례에 대해 설명하세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java의 클래스 로더(Class Loader) 위반(ClassLoader Leak) 문제와 해결 방법은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java의 메모리 모델에서 발생할 수 있는 false sharing 문제와 그 해결 방법은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java에서의 스택 오버플로우(Stack Overflow)와 힙 오버플로우(Heap Overflow) 문제는 어떤 상황에 발생하고 어떻게 해결 해야 하는지 대해 설명하세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Java의 커스텀 메모리 관리 전략과 객체 풀(Object Pool) 패턴에 대해 설명하세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'JAVA', NOW(), NOW());