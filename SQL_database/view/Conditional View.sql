/*Assignment 4: Conditional View
Create a view named new_release_films that displays the film_id, title, and release_year for films released after the year 2005.*/

create view new_release_filmss
as
select film_id,title,release_year from film where release_year > 2005

select * from new_release_filmss