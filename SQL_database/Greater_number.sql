DELIMITER //

CREATE PROCEDURE Greater_number(IN num1 int,IN num2 int,IN num3 int)
BEGIN
If num1>=num2 and num2<=num3 then
select num1;
else
If num2>=num3 and num3<=num1 then
select num2;
else
select num3;
end if;
end if;
end
//
DELIMITER ;

call Greater_number(55,6,8)
