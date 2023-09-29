-- Retrieve the names of all customers and the titles of the films they have rented.
use sakila
select first_name ,title from customer join rental 
on customer.customer_id=rental.customer_id join inventory
 on inventory.inventory_id=customer.inventory_id join film 
 on film.film_id=inventory.film_id
