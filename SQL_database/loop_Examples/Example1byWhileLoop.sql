--WhileLoop--

--  Write a program to calculate the sum of first 10 natural number
drop procedure INCREASE
DELIMITER //

CREATE PROCEDURE INCREASE(N INT)
BEGIN
DECLARE counter int;
declare SUM int;
set counter = 0;
set SUM=0;
while counter<= N do
set SUM =SUM+counter;
    set counter = counter+1;
    end while;
    select sum;
    End;
    //
    DELIMITER ;
    CALL INCREASE(6);