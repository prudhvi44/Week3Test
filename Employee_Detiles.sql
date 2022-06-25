show databases;
use sys;
create table Week3Test(
id int,
name varchar(30),
age int,
salary int,
designation varchar(20)
);

insert into Week3test(id,name,age,salary,designation) values(7994,'Pavan',22,400000,'Network Backup'),(4443,'Hemanth',22,600000,'Frint End Develooer'),(7875,'pruthvi',22,6500000,'Back End Developer');
alter table Week3Test add primary key (id);
select * from Week3Test;

