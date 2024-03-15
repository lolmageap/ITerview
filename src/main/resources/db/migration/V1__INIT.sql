create table customer
(
    id          bigint auto_increment
        primary key,
    created_at  datetime(6)  null,
    updated_at datetime(6)  null,
    email       varchar(255) null,
    name        varchar(255) null,
    password    varchar(255) null,
    salt        varchar(255) null,
    token       varchar(255) null,
    constraint UK_i1p08swb0onyuxes5tjx73rqg
        unique (token)
);

create table customer_authority
(
    id          bigint auto_increment
        primary key,
    role        enum ('ADMIN', 'MEMBER') null,
    customer_id bigint                   null
);

create table framework
(
    id             bigint auto_increment
        primary key,
    created_at     datetime(6)                                                                                                      null,
    updated_at    datetime(6)                                                                                                      null,
    framework_type enum ('DJANGO', 'DOTNET', 'EXPRESS', 'FAST_API', 'FLASK', 'LARAVEL', 'NEST', 'NEXT', 'REACT', 'SPRING', 'UNITY') null,
    question_id    bigint                                                                                                           null,
    constraint UK_osontrk9ytdfoctyjtq4y3kv4
        unique (question_id)
);

create table programing
(
    id              bigint auto_increment
        primary key,
    created_at      datetime(6)                                                                                            null,
    updated_at     datetime(6)                                                                                            null,
    programing_type enum ('C', 'C#', 'C++', 'CSS', 'GO', 'JAVA', 'JAVASCRIPT', 'KOTLIN', 'PHP', 'PYTHON', 'RUST', 'SWIFT') null,
    question_id     bigint                                                                                                 null,
    constraint UK_dug2xh72llr4tnfrcg8u89ln5
        unique (question_id)
);

create table question
(
    id            bigint auto_increment
        primary key,
    created_at    datetime(6)                                                                                                 null,
    updated_at   datetime(6)                                                                                                 null,
    level         enum ('LEVEL1', 'LEVEL2', 'LEVEL3')                                                                         null,
    question_type enum ('DATABASE', 'DESIGN_PATTERN', 'FRAMEWORK', 'NETWORK', 'OS', 'PROGRAMING', 'STRUCTURE', 'TEST', 'VCS') null,
    title         varchar(255)                                                                                                null,
    token         varchar(255)                                                                                                null,
    constraint IDX_QUESTION_TOKEN
        unique (token)
);

create table question_history
(
    id          bigint auto_increment
        primary key,
    created_at  datetime(6)  null,
    updated_at datetime(6)  null,
    answer      text         null,
    customer_id bigint       not null,
    feedback    text         null,
    question_id bigint       not null,
    token       varchar(255) null
);