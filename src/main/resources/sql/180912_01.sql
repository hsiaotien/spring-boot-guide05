-- create database
create database leyou;
use leyou;

-- create database
create table t_user
(
  id bigint not null auto_increment comment '用户id',
  userName varchar(50) comment '用户名',
  age bigint comment '年龄',
  primary key(id)
);

-- insert data
insert into `t_user` (userName,age) values ('张三',18);
insert into `t_user` (userName,age) values ('李四',26);
