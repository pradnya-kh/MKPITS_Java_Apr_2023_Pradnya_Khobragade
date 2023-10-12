
DROP PROCEDURE LoopExample
DELIMITER //
CREATE PROCEDURE LoopExample()
BEGIN
declare i int;
set i=0;
XYZ: loop

set i=i+1;
select i;
if i>=10 then
leave Xyz;
end if;
end loop;
end 
//
DELIMITER ;
CALL LoopExample()