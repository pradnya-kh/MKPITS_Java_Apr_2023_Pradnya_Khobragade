USE STUDENT
create table DETAILS(NAME CHAR(30), CITY VARCHAR(30));
insert into details value('mru', 'Gondia');
show tables
select * from details

Delimiter //
create procedure My_Cursors()
begin
declare done int ;
declare name char(30);
declare s_city varchar(30);
declare mycursors CURSOR for select Name,city from Student_info;
declare continue handler for not found set done=1;
open mycursors;
label:Loop 
fetch mycursors into name,s_city;
insert into details value(name,s_city);
if done = 1 then
leave label;
end if;
end loop;
close mycursors;
end
//
Delimiter ;
CALL My_Cursors();
select NAME,CITY from DETAILS
drop procedure My_Cursors


