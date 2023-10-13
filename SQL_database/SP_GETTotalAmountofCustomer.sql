create procedure SP_GETTotalAmountofCustomer(IN cust_id int)
 begin
 select sum(amount) as"total Amount"from payment where customer_id=cust_id;
 end
 //
 DELIMITER ;
 call SP_GETTotalAmountofCustomer(2)