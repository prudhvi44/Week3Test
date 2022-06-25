show databases;
use world;
create table employee(
Id int,
Name text,
Dept text,
Salary int
);
insert into employee VALUES (1,'Prudhvi','SW',50000), (2,'Krishna','Manager',70000), (3,'Pavan','SW',52000), (4,'Hemanth','Manager',80000);
select * from employee;