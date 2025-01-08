create  table Products(Product_İD int primary key
    ,Product_name varchar(255)
    ,Product_price int
    ,Product_quantity int
    ,Description varchar(255));

create table Categories(
                           Category_Id int primary key ,
                           category_name varchar(255)
);

create table Customers(
                          Customer_Id int primary key ,
                          Customer_fname varchar(50),
                          Customer_lname varchar(50),
                          Adress varchar(100),
                          email varchar(100),
                          Phone_Number int
);

create table Orders(
                       order_id int primary key ,
                       Customer_id int,
                       order_date date default current_date
);
create table OrderDetails(
                             OrderDetails_Id int primary key ,
                             order_id int,
                             product_id int,
                             quantity int
);
insert into products ("productİd", product_name, product_price, product_quantity, description)
values (1,'iphone 14 pro',2500,5,'3 kameralidir'),
       (2,'Laptop',2700,3,'charging zamani qizir '),
       (3,'Televizor',3500,2,'en son modeldir');
insert into categories (category_id, category_name)
values (1,'Phone')
     ,(2,'Computer')
     ,(3,'TV');
alter table products add category_id int;

select * from Products;
select Product_name,category_name from categories left join products on Products.category_id = Categories.Category_Id ;
select * from customers;

select Customer_fname,product_name,c.category_name from products left join customers on public.customers.Customer_Id= products."productİd"
                                                                 left join public.categories c on products.category_id = c.category_id


;

;select * from orderdetails;