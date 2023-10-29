INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C#이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C#', NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C#의 주요 특징은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C#', NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C#에서 값 타입과 참조 타입의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C#', NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C#에서 Common Language Runtime (CLR)의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C#', NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C#에서 다양한 접근 제한자(access modifier)는 무엇이 있나요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C#', NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C#에서 "readonly"와 "const" 키워드의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C#', NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C#에서 "using" 문의 목적은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C#', NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C#에서 "StringBuilder"와 "String"의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C#', NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C#에서 "boxing"과 "unboxing"의 목적은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C#', NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C#에서 대리자(delegate)와 이벤트(event)는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C#', NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C#에서 "abstract class"와 "interface"의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C#', NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C#에서 "async"와 "await" 키워드의 목적은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C#', NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C#에서 "IEnumerable"와 "IQueryable"의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C#', NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C#에서 확장 메서드(extension methods)는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C#', NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C#에서 "yield" 키워드의 목적은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C#', NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C#에서 "override"와 "new" 키워드의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C#', NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C#에서 "sealed" 키워드의 목적은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C#', NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C#에서 "struct"와 "class"의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C#', NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C#에서 속성(attributes)은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C#', NOW(), NOW());


INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'C#에서 "using" 지시문의 목적은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'PROGRAMING', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO programing_menu (id, question_id, programing_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'C#', NOW(), NOW());

