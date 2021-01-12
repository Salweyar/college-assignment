--NAME: SALWEYAR PATEL
--STUDENT #: 0320109
--COURSE AND SECTION: DBMS-1000 (190592) Database Management Systems 1 AND 1
--DATE AND ASSIGNMENT#: 31-10-2019 AND 6

--Question 1
SELECT COUNT(DISTINCT(Mfr)) AS "TotalUniqueMfr", MAX(Price) AS "MostExpensivePrice", MIN(Price) AS "LeastExpensivePrice"
FROM Products;

--Question 2
SELECT AVG(sales) AS "AvgSales"
FROM SalesReps
Where REPOFFICE IS NULL;

--Question 3
SELECT Cust, SUM(Amount) As "TotAmt"
FROM Orders
GROUP BY Cust;
 

--Question 4
SELECT Name, Count(*) As "Customers"
FROM Customers, SalesReps
WHERE SalesRep = CustRep
GROUP BY Name;

--correct
SELECT Name, Count(custnum) As "Customers"
FROM Customers right outer join SalesReps
on  SalesRep = CustRep
GROUP BY Name;

--Question 5
SELECT P.Mfr, P.Product, SUM(Amount) AS "TotAmt"
FROM Orders O, Products P
WHERE P.Mfr = O.Mfr AND P.Product = O.Product
GROUP BY P.Mfr, P.Product
Order by "TotAmt" DESC;

--correct
SELECT P.Mfr, P.Product, SUM(Amount) AS "TotAmt"
FROM Orders O left outer join Products P
on P.Mfr = O.Mfr AND P.Product = O.Product
GROUP BY P.Mfr, P.Product
Order by "TotAmt" DESC;

     

--Question 6
SELECT Mfr, Count(Product) AS "NumOfProduct"
FROM Products
WHERE Price >= 0.50
GROUP BY Mfr
HAVING  Count(Product) >= 4;

--Question 7
SELECT MAX(CreditLimit) AS "HighestCreditLimit"
FROM Customers
WHERE CustRep IN (SELECT salesrep
FROM SalesReps
WHERE name = 'Sue Smith' 
  OR Name = 'Paul Cruz' );

 

--Question 8
SELECT Mfr, Product, Description
FROM Products
WHERE Price * 20 < (SELECT SUM(Amount)
                    FROM Orders
                    WHERE Products.Mfr = Orders.Mfr
                    AND   Products.Product = Orders.product);

--Question 9

SELECT Company
FROM Customers
WHERE EXISTS (SELECT 1
              FROM Orders
              WHERE OrderDate BETWEEN '2000-01-01' AND '2001-01-01');

--correct
SELECT Company
FROM Customers
WHERE EXISTS (SELECT 1
              FROM Orders
              WHERE custnum = cust
              and OrderDate BETWEEN '2000-01-01' AND '2001-01-01');
