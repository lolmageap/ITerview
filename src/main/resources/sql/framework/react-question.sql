INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React의 주요 특징은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React는 Angular와 Vue와 같은 다른 프레임워크와 어떻게 비교되나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 컴포넌트란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '클래스 컴포넌트와 함수형 컴포넌트의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React의 라이프사이클 메소드는 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 컴포넌트 간에 데이터를 어떻게 전달하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 상태(state)란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 속성(props)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 이벤트를 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 가상 DOM이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React는 가상 DOM을 어떻게 사용하여 성능을 향상시키나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 JSX란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 1);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 CSS를 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 컨텍스트(context)란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '컨텍스트를 사용하여 컴포넌트 간에 데이터를 어떻게 공유하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 훅(hooks)이란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 useState 훅을 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 useEffect 훅을 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 useContext 훅을 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'Redux란 무엇이며, 이것을 React와 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 상태(state)와 속성(props)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 라우팅을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React 라우터란 무엇이며, 이것은 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 API 호출을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 사용자 인증을 어떻게 구현하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 useRef 훅을 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 useReducer 훅을 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 useMemo 훅을 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 useCallback 훅을 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'prop 드릴링(prop drilling)이란 무엇이며, 이것을 어떻게 피하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 고차 컴포넌트(higher-order component)란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React 애플리케이션을 어떻게 최적화하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React 애플리케이션은 어떻게 테스트하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 애니메이션을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React를 Contentful이나 Sanity와 같은 CMS와 어떻게 함께 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 서버 사이드 렌더링(server-side rendering)이란 무엇이며, 언제 사용해야 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 클라이언트 사이드 렌더링(client-side rendering)이란 무엇이며, 언제 사용해야 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 제어 컴포넌트(controlled component)와 비제어 컴포넌트(uncontrolled component)의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 프래그먼트(fragments)란 무엇이며, 언제 사용해야 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 2);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 포털(portals)이란 무엇이며, 언제 사용해야 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React와 웹 워커(Web Workers)를 어떻게 함께 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React와 웹 어셈블리(Web Assembly)를 어떻게 함께 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 서스펜스(Suspense)란 무엇이며, 언제 사용해야 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React에서 동시 모드(concurrent mode)란 무엇이며, 언제 사용해야 하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React와 IndexedDB를 이용하여 클라이언트 사이드 저장을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React와 서비스 워커(service workers)를 이용하여 오프라인 기능을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React와 AWS Amplify를 어떻게 함께 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React와 Electron을 이용하여 데스크톱 애플리케이션을 어떻게 만드나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React와 React Native을 이용하여 모바일 애플리케이션을 어떻게 만드나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React와 Next.js를 이용하여 서버 사이드 렌더링을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React와 Gatsby를 이용하여 정적 사이트 생성을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React와 three.js를 이용하여 3D 그래픽을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'React와 D3.js를 이용하여 데이터 시각화를 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 3);

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, modified_at)
VALUES (0, @last_id_in_question, 'REACT', NOW(), NOW());
