 -- (43) Get the film titles and rental dates for all rentals made on June 18, 2005.
    select* from customer
	select* from rental 
	select*from inventory 
    select* from film
    
 select title,rental_date from film join inventory on
 inventory.film_id=film.film_id join rental on
rental.inventory_id=inventory.inventory_id where date(rental_date)="2005-06-18"
 