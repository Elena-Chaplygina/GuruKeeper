create table account
(
    id    serial
        constraint account_pk
            primary key,
    name  varchar,
    value integer
);

alter table account
    owner to root;

create table spend
(
    id             serial,
    account_id     serial
        constraint spend_account_id_fk
            references account,
    spend_category varchar,
    description    varchar,
    spend          integer
);

alter table spend
    owner to root;

