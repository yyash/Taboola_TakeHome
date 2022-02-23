CREATE TABLE Product (
    Product_Name varchar(255) PRIMARY KEY,  
    Category varchar(255)
);

CREATE TABLE Product_Price_History (
    PName varchar(255),  
    Price Float,
	Price_Start_Date Date,
	Price_End_Date Date,
    FOREIGN KEY (PName) REFERENCES Product(Product_Name)
);

--Query to select all products with current price
select pph.PName, p.Category, pph.Price
from Product p join Product_Price_History pph on p.Product_Name = pph.PName
where pph.Price_End_Date is null;

--Query to group categories of products and find counts of products in each category
select Category, count(Product_Name) Count_Products
from Product
group by Category;

--Query to find highest current priced product in a category
with category_max_price as (
	select p.Category, max(pph.Price) max_price
	from Product p join Product_Price_History pph on p.Product_Name = pph.PName
	where pph.Price_End_Date is null
	group by p.Category
)
select p.Product_Name, p.Category
from Product p join Product_Price_History pph on p.Product_Name = pph.PName
where p.Category, pph.Price in (select Category, max_price from category_max_price) ;