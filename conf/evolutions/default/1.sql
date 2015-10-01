# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table phone (
  id                        varchar(255) not null,
  name                      varchar(255),
  main_number               varchar(255),
  constraint pk_phone primary key (id))
;

create sequence phone_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists phone;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists phone_seq;

