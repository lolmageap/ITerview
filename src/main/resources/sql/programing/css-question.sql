INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CSS는 무엇을 의미하나요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 10, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CSS의 주요 특징은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 10, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CSS 선택자(selector)와 그 우선순위에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 10, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CSS 박스 모델(box model)에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 10, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CSS에서 display 속성과 position 속성의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 10, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CSS에서 float 속성과 clear 속성의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 10, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CSS에서 flexbox와 grid의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 10, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CSS에서 가상 클래스와 가상 요소의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 10, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CSS에서 @media 쿼리의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 10, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CSS에서 z-index 속성의 역할과 동작 방식을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 10, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CSS에서 애니메이션(animation)과 트랜지션(transition)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 10, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CSS에서 BEM(Block Element Modifier) 방법론이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 10, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CSS에서 절대 경로와 상대 경로의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 10, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CSS에서 가상 클래스 선택자(:nth-child, :first-child 등)의 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 10, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CSS에서 박스 그림자(box-shadow)의 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 10, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CSS에서 그리드 레이아웃(grid layout)의 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 10, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CSS에서 전환(transition)과 변환(transform)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 10, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CSS에서 미디어 쿼리(media query)를 사용하여 반응형 웹 디자인을 구현하는 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 10, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CSS에서 가상 요소 선택자(::before, ::after 등)의 사용 방법을 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 10, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CSS에서 미디어 타입(media type)과 미디어 특징(media feature)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_mapping (id, question_id, programing_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 10, NOW(), NOW());