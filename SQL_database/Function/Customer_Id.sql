/*Problem Statement 5: Generate a Unique Customer ID
Design a user-defined function that generates a unique customer ID based on a predefined pattern and the customer's personal details.*/
drop function Customer_ID
delimiter \\
create function Customer_ID(birthdate date,mail_id varchar(50))

returns varchar(50) deterministic
begin
declare Customer_Id varchar(50);
set Customer_Id=concat(birthdate,mail_id);
return Customer_Id;
end \\
delimiter ;

select Customer_ID('1999-08-21','pradnyakhobragade21@gmail.com');