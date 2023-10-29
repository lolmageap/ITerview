INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js의 주요 특징은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js는 Create React App과 Gatsby와 같은 다른 React 프레임워크와 어떻게 비교되나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서 서버 사이드 렌더링은 어떻게 처리되나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서 데이터를 어떻게 검증하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js의 getInitialProps는 무엇이며, 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서 CSS는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서 사용자 인증을 어떻게 구현하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js는 정적 파일을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '대형 Next.js 애플리케이션은 어떻게 구조화하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서 환경 변수는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js 애플리케이션은 어떻게 테스트하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js API 라우트는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js 동적 라우트는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js와 Redux를 어떻게 함께 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js 이미지 컴포넌트는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js 링크 컴포넌트는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js 헤드 컴포넌트는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서 사용자 정의 문서 또는 사용자 정의 앱을 어떻게 생성하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서 국제화는 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서 점진적 정적 재생성은 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js를 Contentful이나 Sanity와 같은 CMS와 어떻게 함께 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());


