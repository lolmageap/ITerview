INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트(Javascript)란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트의 특징은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 변수의 유효 범위(scope)에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 호이스팅(hoisting)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 클로저(closure)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 콜백(callback) 함수의 역할과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 프로토타입(prototype)의 개념과 상속을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 비동기(asynchronous) 처리를 위한 방법에는 어떤 것들이 있나요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 동기(synchronous)와 비동기(asynchronous)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 Promise의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 async/await 키워드의 역할과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 이벤트 위임(event delegation)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 클라이언트 사이드 스토리지(client-side storage)에는 어떤 것들이 있나요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 AJAX의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 RESTful API와 fetch API의 관계를 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 모듈(module)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 ES6(ES2015)의 주요 기능들을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 화살표 함수(arrow function)의 특징과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 객체(object)와 배열(array)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 객체의 속성(property)과 메소드(method)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 동적 타이핑(dynamic typing)의 개념을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 스코프 체인(scope chain)의 역할과 동작 방식을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 클로저의 활용 예시를 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 생성자 함수(constructor function)와 클래스(class)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 프로미스 체이닝(promise chaining)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 디바운스(debounce)와 쓰로틀(throttle)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 이터레이터(iterator)와 제너레이터(generator)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 프록시(proxy)의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 모듈 번들러(module bundler)의 역할과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 자료구조 중 Set과 Map의 개념과 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 비동기 처리를 위한 콜백 헬(callback hell)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 이벤트 버블링(event bubbling)과 이벤트 캡처링(event capturing)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 프로토타입 체인(prototype chain)의 동작 방식을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 프로토타입 상속(prototype inheritance)의 개념을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 실행 컨텍스트(execution context)의 개념과 동작 방식을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 스코프(scope)와 클로저(closure)의 관계를 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 비동기 처리를 위한 Promise와 콜백(callback)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 이벤트 핸들러(event handler)와 이벤트 리스너(event listener)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 객체의 프로퍼티(property)와 메소드(method)의 추가와 삭제 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 객체의 프로퍼티(property)의 속성(attribute)에는 어떤 것들이 있나요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 프로토타입(prototype)을 직접 수정하는 것이 권장되지 않는 이유는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 클로저(closure)를 사용하여 private 변수를 구현하는 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 자료형의 종류와 typeof 연산자의 동작 방식을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 NaN과 null, undefined의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 동등 비교(==)와 일치 비교(===)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 클로저(closure)를 사용하여 외부 변수를 변경하는 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 프로퍼티 어트리뷰트(property attribute)의 종류와 역할을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '자바스크립트에서 스코프(scope)와 실행 컨텍스트(execution context)의 관계를 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'JAVASCRIPT', NOW(), NOW());