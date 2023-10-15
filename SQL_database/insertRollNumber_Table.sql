CREATE TABLE Add_RollNo(RollNo varchar(255));
select * from Add_RollNo;

DELIMITER //
CREATE PROCEDURE insertRollNumber_Table(roll_no int, num int)
BEGIN
while roll_no <= num do
	insert into Add_RollNo values(roll_no);
	set roll_no = roll_no+1;
end while;
END
//
DELIMITER ;

drop procedure insertRollNumber_Table;
call insertRollNumber_Table(51,100)