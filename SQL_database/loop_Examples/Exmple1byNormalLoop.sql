-
---Normal---
-  Write a program to calculate the sum of first 10 natural number
drop procedure INCREASE
DELIMITER //
CREATE PROCEDURE INCREASE(N INT)
BEGIN
DECLARE counter int;
declare SUM int;
set counter = 0;
set SUM=0;

 incrimint: loop
set SUM =SUM+counter;
    set counter = counter+1;
    if counter>=N THEN
    leave incrimint;
    END IF;
    END loop;
    SELECT sum;
 
    END;
    //
    DELIMITER ;
    CALL INCREASE(6);