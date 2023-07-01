CREATE TABLE role
(

    id          int          not null,
    name        varchar(50)  not null,
    description varchar(255) not null ,
    primary key (id)
);

CREATE TABLE "user"
(

    id         bigint       not null,
    login      varchar(100) not null unique,
    password   varchar(100) not null,
    role_id    int          not null,
    name       varchar(100) not null,
    patronymic varchar(100),
    surname    varchar(100) not null,
    primary key (id),
    foreign key (role_id) references role(id)
);
