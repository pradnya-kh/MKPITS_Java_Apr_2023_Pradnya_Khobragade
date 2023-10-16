/*Calculate Total Order Value
Design a user-defined function that takes order quantity and unit price as input and calculates the total order value for each order.*/

delimiter \\
create function Total_order_value(quantity int,price int )
returns integer deterministic
begin
declare total_order int;
set total_order=quantity*price;
return total_order;
end \\
delimiter ;
select Total_order_value(5,70)