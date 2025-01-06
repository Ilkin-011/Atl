insert into student(fname, age,subject)values  ('Ilkin',24,'Backend Developer');
insert into student(fname,age,subject) values ('John Doe',22,'Data Scene');
insert into student(fname,age,subject) values('Michael Johnson ', 23, 'Information Technology');
insert into student(fname,age,subject) values('Olivia Wilson ', 22, 'Cybersecurity');
insert into student(fname,age,subject) values('William Brown', 24, 'Software Engineering');

delete from student where id =1;

update student set age = 23 where id = 3;

delete from student where age=23;

select *from student;
select subject from  student where id=5 ;
select * from student where age<24;
select * from student order by age desc ;
select avg(age) from student ;
select distinct student.fname from student
