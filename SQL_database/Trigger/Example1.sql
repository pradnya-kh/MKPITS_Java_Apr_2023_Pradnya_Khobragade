use sakila
show tables
create table sale (sale_id int,product_id int,prod_quant int)
select * from sale
drop table sale
insert into sale  values(1,1,5)
insert into sale value(2,2,10)

use sakila
show tables
create table product (prod_id int,prod_name varchar(255),prod_price int ,prod_quantity int)
select * from product
insert  into product values (1,"shoes",202,30),
                            (2,"Blanket",303,40),
                            (3,"Earring",400,50),
							(4,"laptops",5000,60);                                  
drop table product      

use sakila
show tables
select * from product
select * from sale

delimiter //
create trigger insert_data
after
insert on sale
for each row
begin
update product
set prod_quantity=prod_quantity-new.prod_quant
where prod_id=new.product_id;
end //
delimiter ;
drop trigger insert_data

