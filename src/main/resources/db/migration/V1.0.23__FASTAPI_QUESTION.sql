INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI란 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI의 주요 특징은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI는 Flask와 Django에 비해 어떻게 다른가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI는 데이터 유효성 검사와 직렬화를 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '경로 매개변수란 무엇이며, FastAPI에서는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI에서 쿼리 매개변수는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL1');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI는 의존성을 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI에서 데이터베이스는 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI에서 본문과 경로 매개변수를 동시에 어떻게 선언하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI에서 요청 파일은 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI에서 오류는 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI에서 자동 API 문서화는 어떻게 설정하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI에서 Pydantic 모델의 역할은 무엇인가요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI에서 백그라운드 작업은 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI에서 SQLAlchemy는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI에서 보안과 권한은 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI에서 요청 제한은 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI에서 템플릿 엔진은 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI에서 스트리밍, 청크 응답은 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI에서 페이징은 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI에서 자동 모델 직렬화는 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI에서 환경 변수는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI에서 중첩 모델은 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI에서 async와 await는 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI에서 지역화는 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI에서 로깅은 어떻게 사용하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL2');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI에서 버전 관리는 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());

INSERT INTO question (id, created_at, updated_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), 'FastAPI에서 이메일 발송은 어떻게 처리하나요?', SUBSTRING(UUID(), 1, 8), 'FRAMEWORK', 'LEVEL3');

SET @last_id_in_question = LAST_INSERT_ID();

INSERT INTO framework (id, question_id, framework_type, created_at, updated_at)
VALUES (0, @last_id_in_question, 'FAST_API', NOW(), NOW());
