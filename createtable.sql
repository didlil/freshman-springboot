-- auto-generated definition
create table memberregistration
(
    member_id         int auto_increment
        primary key,
    username          varchar(50)                         not null,
    last_name         varchar(50)                         not null,
    first_name        varchar(50)                         not null,
    sei               varchar(50)                         not null,
    mei               varchar(50)                         not null,
    birthdate         date                                not null,
    gender            varchar(10)                         not null,
    email             varchar(255)                        not null,
    password          varchar(20)                         not null,
    postal_code       varchar(20)                         null,
    phone_number      varchar(20)                         null,
    prefecture        varchar(50)                         not null,
    address           varchar(255)                        not null,
    building_name     varchar(255)                        null,
    registration_date timestamp default CURRENT_TIMESTAMP null
);