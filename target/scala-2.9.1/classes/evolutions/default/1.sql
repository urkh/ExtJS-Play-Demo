# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table dato (
  id                        bigint auto_increment not null,
  nombre                    varchar(255),
  apellido                  varchar(255),
  fecha_nac                 varchar(255),
  correo                    varchar(255),
  constraint pk_dato primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table dato;

SET FOREIGN_KEY_CHECKS=1;

