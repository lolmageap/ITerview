INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js의 getInitialProps는 무엇이며, 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서 서버 사이드 렌더링(Server-Side Rendering, SSR)의 장점에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js의 정적 사이트 생성(Static Site Generation, SSG) 기능에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서 API 라우트(API Routes)를 구현하는 방법에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서 동적 라우팅(Dynamic Routing)을 구현하는 방법에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js의 자동 코드 분할(Automatic Code Splitting)에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서 내장 CSS 지원의 이점에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js의 프리렌더링(Pre-rendering) 기능과 그 종류에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서 ISR(Incremental Static Regeneration)의 작동 방식과 장점에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서의 빠른 새로고침(Fast Refresh) 기능에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서의 라우트 프리페칭(Route Prefetching) 기능에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서의 헤드리스 CMS(Headless CMS) 통합 방법에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서 AMP(Accelerated Mobile Pages)를 구현하는 방법에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서의 성능 분석(Performance Analysis) 도구 사용 방법에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js의 SEO 최적화 전략에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서의 데이터 가져오기(Data Fetching) 전략에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서의 라우트 가드(Route Guards) 구현 방법에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서의 클라이언트 사이드 네비게이션(Client-Side Navigation) 최적화 방법에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서의 정적 파일 서빙(Static File Serving) 방법에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서의 비동기 데이터 로딩(Asynchronous Data Loading) 방식에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서 커스텀 로딩 컴포넌트(Custom Loading Components)를 구현하는 방법에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서 라우트 기반 코드 스플리팅(Route-based Code Splitting)의 작동 방식에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서 동적 임포트(Dynamic Imports)를 활용하는 방법에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js의 서버 측 로깅(Server-side Logging) 기능에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서의 애니메이션 및 트랜지션 최적화 전략에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서의 웹팩(Webpack) 커스터마이징 방법에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Next.js에서의 Babel 설정 커스터마이징 방법에 대해서 설명해주세요.', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'NEXT', NOW(), NOW());