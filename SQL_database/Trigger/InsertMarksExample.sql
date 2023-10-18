use sakila
drop table Marksdetails
create table Marksdetails(ROLL_no int,physic int,chemistry int,maths int)
select * from Marksdetails

 
create table Total_details(Roll_no int,Total int)
select * from Total_details
 drop table Total_details

delimiter //
create trigger insert_marks
after
insert on Marksdetails
for each row
begin
insert into Total_details   values (New.Roll_no, New.Physic+New.Chemistry+New.Maths);
end //
delimiter ;

select * from  Marksdetails
insert into  Marksdetails value(102,35,35,35);
insert into  marksdetails value(103,45,45,45);
insert into  marksdetails value(104,50,50,50);


select * from Total_details

drop trigger insert_marks