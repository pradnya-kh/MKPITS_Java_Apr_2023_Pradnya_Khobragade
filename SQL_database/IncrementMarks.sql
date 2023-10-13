use sakila;
CREATE TABLE Student_marks(RollNo int, physic int, Maths int, Science int);
select * from Student_marks;
truncate table Student_marks;

INSERT INTO Student_marks VALUES(1,78,87,76),
								(2,34,54,43),
                                (3,76,65,67),
                                (4,56,59,78);

DELIMITER //
CREATE PROCEDURE IncrementMarks(roll_no int, increment int)
BEGIN
	update student_marks set physic=physic+increment, Maths=Maths+increment, Science=Science+increment where RollNo = roll_no;
END
//
DELIMITER ;
select * from student_marks;
call IncrementMarks(2,2);
drop procedure IncrementMarks;
desc Student_marks