create database Normalization_database;
use Normalization_database;
create Table BookStore(Book_id varchar(50) primary key, Book_Title varchar(50), Author_Name varchar(50),  Price int,
					   customer_id varchar(50), Customer_Name varchar(80), Order_id varchar(50),
                       Order_date date, Total_order int, Sale_id varchar(50), Sale_date date, Total_Sale int);

select * from BookStore;

-- // 3NF Normalization of BookStore Table 
create table Book(Book_id varchar(50), title varchar(90), Author_name varchar(90), price int);
select * from Book;

create table Customer_orders(customer_id varchar(50) primary key, Customer_Name varchar(50), 
							 Ordre_ID varchar(50), Order_date date, Total_order int);
select * from Customer_orders;

create table Sale(Sale_ID varchar(50) primary key, Sale_date date, Total_sale int);
select * from Sale;