create  table sys_user (
    id  int (10) not null,
    user_name varchar (64) default  null,
    real_name varchar (64) default  null,
    pass_word varchar (64) default null ,
    last_login_time date  null default  null,
    account_non_expired int(5) default  null,
    account_non_locked int(5) default null,
    credentials_non_expired int(5) default null,
    create_time date  default null,
    create_user_id varchar(36)  default null,
    primary key (`id`)
)


create  table sys_role (
  id  int (10) not null,
  role_name varchar (64) default null,
  role_desc varchar(64) default null,
  primary key (`id`)
)

create table sys_user_role (

)

create table sys_permission (
   id  int (10) not null,
   perm_name varchar (64) default null,
   perm_tag varchar (64) default null,
   primary key (`id`)
)

create table sys_role_permission (

)