-- Problem Statement 3: String Reversal
-- Design a user-defined function that takes a string as input and returns the reversed string.
drop function Reverse_String
delimiter //
create function Reverse_String(user_string varchar(50))
returns varchar(50) deterministic
begin
declare reverse_String varchar(50);
set reverse_String=reverse(user_string);
return reverse_String;
end
//
delimiter ;
select Reverse_String('welcome to mkpits');


