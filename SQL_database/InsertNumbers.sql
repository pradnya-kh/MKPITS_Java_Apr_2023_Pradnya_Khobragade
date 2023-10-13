create table Rollnumber(roll_number int(12))
select *from Rollnumber
drop procedure InsertNumbers
DELIMITER //
CREATE PROCEDURE InsertNumbers()
BEGIN
    DECLARE counter INT DEFAULT 0;
    
    WHILE counter <= 100 DO
        INSERT INTO Rollnumber (roll_number) VALUES (counter);
        SET counter = counter + 1;
    END WHILE;
END;
//
DELIMITER ;
call InsertNumbers()
