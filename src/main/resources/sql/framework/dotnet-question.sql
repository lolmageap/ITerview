INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '.Net 프레임 워크 란 무엇입니까?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '.Net의 중요한 구성 요소는 무엇입니까?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CTS 란 무엇입니까?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CLR이란 무엇입니까?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CLS 란 무엇입니까?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'JIT 란?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'MSIL이란 무엇입니까?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '관리 코드와 비 관리 코드는 무엇을 의미합니까?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '매니지드 코드는 어떻게 실행 되나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'ASP .Net이란 무엇입니까?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'ASP .Net의 상태 관리를 설명하십시오.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '어셈블리 란 무엇입니까? 어셈블리에는 어떤 유형이 있습니까?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '어셈블리의 다른 부분을 설명하십시오.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'EXE와 DLL은 무엇입니까?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '캐싱이란 무엇입니까?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'MVC 란 무엇입니까?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '함수와 저장 프로 시저의 차이점은 무엇입니까?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'CAS (코드 액세스 보안)를 설명하십시오.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'GAC 란?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '세계화와 현지화는 무엇을 의미합니까?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '가비지 콜렉터 란 무엇입니까?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'using 이라는 키워드는 네임스페이스를 링크하기 위해서 사용하기도 하지만 객체를 생성할 때 또한 사용되기도 합니다. 이때 using을 이용하는 목적에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '3-Tier 기반의 프로젝트는 무엇인지 그리고 3-Tier기반의 시스템이 가지는 장점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '메모리 단편화를 해결할수있는 기법은 무엇이 있나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '소멸자에 virtual을 쓰는이유는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '포함과 상속의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'STL에서 erase와 remove의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'DOTNET', NOW(), NOW());
