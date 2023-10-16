/*Problem Statement 2: Calculate Age from Birthdate
Develop a user-defined function that takes a person's birthdate as input and calculates their current age in years.*/
drop function Age_from_Birthdate
delimiter \\
create function Age_from_Birthdate(person_birthdate date)
returns integer deterministic
begin
declare age_in_year int ;
set age_in_year= timestampdiff(year,person_birthdate,current_date());
return age_in_year;
end \\
delimiter ;
select Age_from_Birthdate('1999-08-03');
