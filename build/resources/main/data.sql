drop table if exists employee;

create table employee_info(
	id int primary key,
	name varchar(50)
);

create table user_info(
    userId int primary key,
    username varchar(50),
    password varchar(50)
)