/*Calculate BMI (Body Mass Index)
Create a user-defined function that takes a person's weight (in kilograms) and height (in meters) as input and calculates their BMI.*/
drop function BMI
delimiter \\
create function BMI(weight float,height float)
returns integer deterministic
begin
declare Calculate_BMI int;
set Calculate_BMI=weight*height;
return Calculate_BMI;
end
\\
delimiter ;
 
 select BMI(35.20,1.5748)
