use student
show table
create table marksdetails(Rollno char(4),phy int,chem int,
constraint ckc- foreign key(Rollno) references student_info(Rollno)
)

select * from student

delimiter //
create table marksIncrement(roll_number int);
create procedure updatetable(RN char, counter int)
begin
update MD set phy=phy+counter,
              chem=chem+counter,
              maths=maths+counter where 
              
              
              