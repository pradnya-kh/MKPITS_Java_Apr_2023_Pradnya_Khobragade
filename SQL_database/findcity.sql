use sakila
drop procedure findcity
DELIMITER //

CREATE PROCEDURE findcity(in V_City char(12))
BEGIN
select customer.first_name,customer.last_name,city.city,city.city_id from customer
join address
on customer.address_id=address.address_id
join city
on city.city_id=address.city_id where city.city=v_city;

END
 //
 DELIMITER ;
 CALL findcity('kabul');
 
 