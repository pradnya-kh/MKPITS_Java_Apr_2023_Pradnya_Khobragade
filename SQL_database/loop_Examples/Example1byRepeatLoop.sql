--Repetedloop--

DELIMITER //
CREATE PROCEDURE SumOfRandomNumber_in_repeat(N INT)
BEGIN
DECLARE counter int;
declare SUM int;
set counter = 1;
set SUM=1;
repeat
  set SUM =SUM+counter;
set counter = counter+1;
until counter > n
end repeat;
select sum;
    End;
    //
    DELIMITER ;
   
call SumOfRandomNumber_in_repeat(5);