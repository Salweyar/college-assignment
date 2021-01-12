--Salweyar patel (0320109)
--Course: DBMS-1000 Section: 1
--Date: 2019-09-18 
--Assignment#: 3


--Ouestion 1
SELECT Description, Price*QtyOnHand
FROM Products
Order BY Description DESC;

--Ouestion 2
SELECT OrderNum, OrderDate, Cust,Amount
FROM Orders
WHERE Product = 'L12' OR Product = 'L14'
Order BY OrderDate;

--Ouestion 3
SELECT Name, Age, HireDate
FROM Salesreps
WHERE RepOffice IN (30,21,13);

--Question 4
SELECT SalesRep, Name
FROM Salesreps
WHERE Manager IS NULL;

--Question 5
SELECT Name
FROM Salesreps
WHERE Name LIKE '%Clark';

--Question 6
SELECT DISTINCT Title  
FROM Salesreps
WHERE Title IS NOT NULL;


