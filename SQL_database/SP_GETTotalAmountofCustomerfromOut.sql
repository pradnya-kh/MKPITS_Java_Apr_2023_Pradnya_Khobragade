drop procedure SP_GETTotalAmountofCustomerfromOut
DELIMITER //
create procedure SP_GETTotalAmountofCustomerfromOut(IN cust_id int,out tot_amt int)
 begin
 select sum(amount) into tot_amt from payment where customer_id
 =cust_id;
 end
 //
 DELIMITER ;
 call SP_GETTotalAmountofCustomerfromOut(2,@tot_amt);
 select @tot_amt