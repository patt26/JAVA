use employee_directory;

drop table if exists roles;
drop table if exists members;


create table members(
user_id varchar(50) not null,
pw varchar(70) not null,
active tinyint not null,
primary key(user_id))
Engine=InnoDB default charset=latin1;

insert into members values
("bolt","{bcrypt}$2a$10$OPwmwnCkBgQSnv1EZkYVzu38K1IVzjsM8iU4ur0pHTuEGRaQBm.ZC",1),   --run123
("james","{bcrypt}$2a$10$TAUzSLD5I/FauiWg41VO1O.93447OMaTYt32E6/uu6jhCLiI5qEma",1),  --gun123
("mick","{bcrypt}$2a$10$1JZ1i9QO1z1s/1Q9quFsmOmJpx.rFh7Dd9wtmCrIhQXOYyCXkFMJy",1);   --eat123


create table roles(
user_id varchar(50) not null,
role varchar(50) not null,
unique key authorities5_idx_1(user_id,role),
constraint authorities5_ibfk_1 foreign key(user_id) references members(user_id))
engine =InnoDB default charset=latin1;


insert into roles values
("bolt","ROLE_EMPLOYEE"),
("james","ROLE_EMPLOYEE"),
("james","ROLE_MANAGER"),
("mick","ROLE_EMPLOYEE"),
("mick","ROLE_MANAGER"),
("mick","ROLE_ADMIN");

select * from roles;
select * from members;