# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table users (
  userid                        integer auto_increment not null,
  username                      varchar(255),
  password                      varchar(255),
  email                         varchar(255),
  points                        integer not null,
  constraint pk_users primary key (userid)
);


# --- !Downs

drop table if exists users;

