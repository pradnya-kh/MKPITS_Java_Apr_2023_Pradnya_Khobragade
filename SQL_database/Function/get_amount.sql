delimiter \\
CREATE function myFun(cust_id int)
returns integer deterministic
BEGIN
declare amt int;
select sum(amount) into amt from payment where customer_id=cust_id;
return amt;
End
\\
delimiter ;
select myFun(10)