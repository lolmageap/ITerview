INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity의 주요 특징은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity는 다른 게임 엔진과 비교했을 때 어떻게 되나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 GameObject란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 Component란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 Prefab과 Instance의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 Transform 컴포넌트의 목적은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 Renderer 컴포넌트의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 씬(Scene)을 어떻게 생성하고 관리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity Asset Store의 목적은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 에셋(Asset)을 어떻게 가져오고 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 다양한 종류의 콜라이더(Collider)는 무엇이 있나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 입력(Input)을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 Animator 컴포넌트의 목적은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 애니메이션을 어떻게 생성하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 물리(Physics) 시스템의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 물리 기반의 움직임을 어떻게 구현하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity 이벤트(Unity Events)는 무엇이며, 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 UI 요소를 어떻게 생성하고 관리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 GameManager의 목적은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 게임 상태를 어떻게 구현하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 코루틴(Coroutine) 시스템의 목적은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 오디오를 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 NavMesh 시스템의 목적은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 길찾기(pathfinding)를 어떻게 구현하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 ScriptableObject 클래스의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 데이터 지속성을 어떻게 구현하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity Remote 앱의 목적은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 성능을 최적화하는 방법은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Scripting Define Symbols는 무엇이며, Unity에서 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 멀티플레이어 기능을 어떻게 구현하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity Profiler의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 로컬라이제이션(localization)을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 셰이더(shader)의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 사용자 정의 셰이더를 어떻게 생성하고 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity Test Runner의 목적은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 테스트를 어떻게 작성하고 실행하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity Remote Config 시스템의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity에서 원격 구성을 어떻게 구현하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Unity Collaborate 기능의 목적은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework_mapping (id, question_id, framework_menu_id, created_at, modified_at)
VALUES (0, @last_id_in_question, 9, NOW(), NOW());
