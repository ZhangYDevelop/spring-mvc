create  table sys_user (
    id  int (10) not null,
    username varchar (64) default  null,
    realName varchar (64) default  null,
    password varchar (64) default null ,
    accountNonExpired int(5) default  null,
    accountNonLocked int(5) default  null,
    enabled int(5) default null,
    credentialsNonExpired int(5) default null,
    createTime date  default null,
    createUserId varchar(36)  default null,
    primary key (`id`)
) DEFAULT CHARSET 'utf8';;


create  table sys_role (
  id  int (10) not null,
  role_name varchar (64) default null,
  role_desc varchar(64) default null,
  primary key (`id`)
) DEFAULT CHARSET 'utf8';

create table sys_permission (
   id  int (10) not null,
   perm_name varchar (64) default null,
   perm_tag varchar (64) default null,
   primary key (`id`)
) DEFAULT CHARSET 'utf8';

create table sys_role_permission (
   id  int (10) not null,
   role_id int(10) default  null,
   perm_id int(10) default null,
   primary key (`id`)
)DEFAULT CHARSET 'utf8';

create table sys_user_role (
  id  int (10) not null,
  user_id int(10) default  null,
  role_id int(10) default null,
  primary key (`id`)
)DEFAULT CHARSET 'utf8';