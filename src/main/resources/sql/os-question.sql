INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '운영체제(Operating System)가 무엇인가요?', SUBSTRING(UUID(), 1, 12), 'OS', 1);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '프로세스와 스레드의 차이점은 무엇인가요?', SUBSTRING(UUID(), 1, 12), 'OS', 2);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '멀티스레딩과 멀티프로세싱의 차이를 설명해주세요.', SUBSTRING(UUID(), 1, 12), 'OS', 2);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '데드락(Deadlock)이란 무엇인가요? 어떤 상황에서 발생하나요?', SUBSTRING(UUID(), 1, 12), 'OS', 3);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '프로세스 스케줄링이 무엇인가요? 다양한 스케줄링 알고리즘에 대해 아나요?', SUBSTRING(UUID(), 1, 12), 'OS', 4);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), 'CPU 스케줄러란 무엇이며 어떤 역할을 하나요?', SUBSTRING(UUID(), 1, 12), 'OS', 3);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '프로세스의 상태를 설명해주세요.', SUBSTRING(UUID(), 1, 12), 'OS', 2);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '메모리 관리에서 메모리 할당과 해제의 과정을 설명해주세요.', SUBSTRING(UUID(), 1, 12), 'OS', 3);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '가상 메모리(Virtual Memory)가 무엇인가요?', SUBSTRING(UUID(), 1, 12), 'OS', 3);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '페이지 교체 알고리즘에 대해 설명해주세요 (예: LRU, FIFO)', SUBSTRING(UUID(), 1, 12), 'OS', 5);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '파일 시스템이 무엇이며 어떤 역할을 하나요?', SUBSTRING(UUID(), 1, 12), 'OS', 2);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '파일 액세스 방법에는 어떤 것들이 있나요?', SUBSTRING(UUID(), 1, 12), 'OS', 2);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '디스크 스케줄링이 무엇이며 다양한 스케줄링 알고리즘에 대해 아나요?', SUBSTRING(UUID(), 1, 12), 'OS', 4);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '프로세스 간 통신(IPC) 방법에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 12), 'OS', 5);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '운영체제의 커널(Kernel)이란 무엇인가요?', SUBSTRING(UUID(), 1, 12), 'OS', 2);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '커널 모드와 사용자 모드의 차이를 설명해주세요.', SUBSTRING(UUID(), 1, 12), 'OS', 2);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '인터럽트(Interrupt)가 무엇이며 어떤 역할을 하나요?', SUBSTRING(UUID(), 1, 12), 'OS', 3);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '시스템 호출(System Call)이란 무엇인가요?', SUBSTRING(UUID(), 1, 12), 'OS', 2);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '컨텍스트 스위칭(Context Switching)이 무엇이며 어떤 상황에서 발생하나요?', SUBSTRING(UUID(), 1, 12), 'OS', 4);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '프로세스 동기화가 왜 필요한가요?', SUBSTRING(UUID(), 1, 12), 'OS', 4);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '세마포어(Semaphore)와 뮤텍스(Mutex)의 차이를 설명해주세요.', SUBSTRING(UUID(), 1, 12), 'OS', 5);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '스핀락(Spinlock)이란 무엇이며 어떤 상황에서 사용하나요?', SUBSTRING(UUID(), 1, 12), 'OS', 5);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '교착 상태(Deadlock)를 방지하기 위한 방법에 대해 아나요?', SUBSTRING(UUID(), 1, 12), 'OS', 3);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '스레드 동기화가 왜 필요한가요?', SUBSTRING(UUID(), 1, 12), 'OS', 4);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '모니터(Monitor)가 무엇이며 어떤 역할을 하나요?', SUBSTRING(UUID(), 1, 12), 'OS', 4);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '가상 머신(Virtual Machine)이란 무엇인가요?', SUBSTRING(UUID(), 1, 12), 'OS', 3);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '컨테이너(Container)와 가상 머신(Virtual Machine)의 차이를 설명해주세요.', SUBSTRING(UUID(), 1, 12), 'OS', 3);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '프로세스 간 통신(IPC)에서 파이프(Pipe)와 메시지 큐(Message Queue)의 차이는 무엇인가요?', SUBSTRING(UUID(), 1, 12), 'OS', 3);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '스레드 풀(Thread Pool)이 무엇이며 어떤 장점이 있나요?', SUBSTRING(UUID(), 1, 12), 'OS', 2);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '메모리 단편화(Fragmentation)에 대해 설명해주세요.', SUBSTRING(UUID(), 1, 12), 'OS', 2);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '멀티태스킹과 멀티프로세싱의 차이를 설명해주세요.', SUBSTRING(UUID(), 1, 12), 'OS', 2);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '동적로딩(Dynamic Loading)과 동적연결(Dynamic Linking)이 무엇인가요?', SUBSTRING(UUID(), 1, 12), 'OS', 2);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '시스템 로그와 애플리케이션 로그의 차이를 설명해주세요.', SUBSTRING(UUID(), 1, 12), 'OS', 2);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '프로세스 간 통신(IPC)에서 공유 메모리(Shared Memory)의 역할을 설명해주세요.', SUBSTRING(UUID(), 1, 12), 'OS', 3);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '페이징(Paging)과 세그멘테이션(Segmentation)의 차이를 설명해주세요.', SUBSTRING(UUID(), 1, 12), 'OS', 5);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '프로세스 간 통신(IPC)에서 소켓(Socket)의 역할을 설명해주세요.', SUBSTRING(UUID(), 1, 12), 'OS', 4);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '역순어셈블러(Disassembler)와 디버거(Debugger)의 차이를 설명해주세요.', SUBSTRING(UUID(), 1, 12), 'OS', 5);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '커널 패닉(Kernel Panic)이란 무엇인가요?', SUBSTRING(UUID(), 1, 12), 'OS', 4);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '쓰레싱(Thrashing)이란 무엇이며 어떤 상황에서 발생하나요?', SUBSTRING(UUID(), 1, 12), 'OS', 4);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '인터럽트(Interrupt)란 무엇인가요?', SUBSTRING(UUID(), 1, 12), 'OS', 2);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '파일 디스크립터(File Descriptor)가 무엇인가요?', SUBSTRING(UUID(), 1, 12), 'OS', 2);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level)
VALUES (0, NOW(), NOW(), '스레드의 상호 배제(Mutual Exclusion)가 무엇이며 왜 필요한가요?', SUBSTRING(UUID(), 1, 12), 'OS', 4);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '스택 오버플로우(Stack Overflow)가 무엇이며 어떻게 발생하나요?', SUBSTRING(UUID(), 1, 12), 'OS', 2);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '스와핑(Swapping)이 무엇이며 어떤 상황에서 발생하나요?', SUBSTRING(UUID(), 1, 12), 'OS', 2);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), 'IPC 메커니즘 중에는 어떤 것들이 있나요? (예: 파이프, 메시지 큐)', SUBSTRING(UUID(), 1, 12), 'OS', 4);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '프로세스의 우선순위를 어떻게 정할 수 있나요?', SUBSTRING(UUID(), 1, 12), 'OS', 3);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '소프트웨어 인터럽트(Software Interrupt)와 하드웨어 인터럽트(Hardware Interrupt)의 차이를 설명해주세요.', SUBSTRING(UUID(), 1, 12), 'OS', 5);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '프로세스의 우선순위를 어떻게 조절할 수 있나요?', SUBSTRING(UUID(), 1, 12), 'OS', 4);

INSERT INTO question (id, created_at, modified_at, title, token, question_type, level) 
VALUES (0, NOW(), NOW(), '멀티코어 프로세서에서 멀티스레드의 효과적인 활용 방법은 무엇인가요?', SUBSTRING(UUID(), 1, 12), 'OS', 5);
