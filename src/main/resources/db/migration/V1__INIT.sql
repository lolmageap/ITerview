create table customer
(
    id         bigint auto_increment primary key,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    username   varchar(255) not null,
    name       varchar(255) not null,
    password   varchar(255) not null,
    salt       varchar(255) not null,
    provider   varchar(255) not null,
    token      varchar(255) not null,
    constraint IDX_CUSTOMER_TOKEN unique (token)
);

create table customer_authority
(
    id          bigint auto_increment primary key,
    customer_id bigint       null,
    role        varchar(255) not null
);

create table framework
(
    id             bigint auto_increment primary key,
    created_at     TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at     TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    framework_type varchar(255) not null,
    question_id    bigint       not null,
    constraint IDX_FRAMEWORK_QUESTION_ID unique (question_id)
);

create table programing
(
    id              bigint auto_increment primary key,
    created_at      TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at      TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    programing_type varchar(255) not null,
    question_id     bigint       not null,
    constraint IDX_PROGRAMING_QUESTION_ID unique (question_id)
);

create table question
(
    id            bigint auto_increment primary key,
    created_at    TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at    TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    level         varchar(255) not null,
    question_type varchar(255) not null,
    title         varchar(255) not null,
    token         varchar(255) not null,
    constraint IDX_QUESTION_TOKEN unique (token)
);

create table question_history
(
    id          bigint auto_increment primary key,
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    customer_id bigint       not null,
    question_id bigint       not null,
    text        varchar(255) not null,
    token       varchar(255) not null,
    constraint IDX_QUESTION_HISTORY_TOKEN unique (token)
);

create table answer
(
    id                  bigint auto_increment primary key,
    created_at          TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at          TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    customer_id         bigint       not null,
    question_history_id bigint       not null,
    text                text         not null,
    token               varchar(255) not null,
    constraint IDX_ANSWER_TOKEN unique (token)
);

create table feedback
(
    id                  bigint auto_increment primary key,
    created_at          TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at          TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    customer_id         bigint       not null,
    answer_id           bigint       not null,
    question_history_id bigint       not null,
    text                text         not null,
    token               varchar(255) not null,
    constraint IDX_FEEDBACK_TOKEN unique (token)
);

create table re_question
(
    id          bigint auto_increment primary key,
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    answer_id   bigint       not null,
    customer_id bigint       not null,
    question_id bigint       not null,
    text        text         not null,
    token       varchar(255) not null,
    constraint IDX_RE_QUESTION_TOKEN unique (token)
);

create table customer_history
(
    id                 bigint auto_increment primary key,
    created_at         TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at         TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    customer_id        bigint       not null,
    target_customer_id bigint       not null,
    type               varchar(255) not null,
    entity_name        varchar(255) not null,
    entity_description varchar(255) null,
    field_name         varchar(255) not null,
    field_description  varchar(255) null,
    before_value       varchar(255) null,
    after_value        varchar(255) null,
    token              varchar(255) not null,
    constraint IDX_CUSTOMER_HISTORY_TOKEN unique (token)
);

create table notice
(
    id          bigint auto_increment primary key,
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    customer_id bigint       not null,
    title       varchar(255) not null,
    content     text         not null,
    category    varchar(255) not null,
    view_count  bigint       not null,
    like_count  bigint       not null,
    token       varchar(255) not null,
    constraint IDX_NOTICE_TOKEN unique (token)
);