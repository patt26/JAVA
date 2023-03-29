create table users(
username varchar(50) not null,
password varchar(50) not null,
enabled tinyint not null,

primary key (username))
engine=InnoDB Default charset=latin1;



select * from users;

insert into users values
("jhon","{noop}test123",1),
("mary","{noop}test123",1),
("scott","{noop}test123",1);


CREATE table authorities(
username varchar(50) not null,
authority varchar(50) not null,

unique key authorities_idx_1 (username,authority),
Constraint authorities_ibfk_1
foreign key (username)
references users (username))
Engine=InnoDB default charset=latin1;



insert into authorities values
("jhon","ROLE_EMPLOYEE"),
("mary","ROLE_EMPLOYEE"),
("mary","ROLE_MANAGER"),
("scott","ROLE_EMPLOYEE"),
("scott","ROLE_MANAGER"),
("scott","ROLE_ADMIN");


select * from authorities;



