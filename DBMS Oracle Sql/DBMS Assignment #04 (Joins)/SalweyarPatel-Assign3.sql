--Salweyar Patel (0320109)
--DBMS-1000 Section:1
--Date: 25-09-2019
--Assignment 4

--Question 1
SELECT OrderNum, OrderDate, O.Mfr, O.Product, Description, Amount
FROM  Orders O, Products P
WHERE P.Mfr = O.Mfr
  AND P.Product = O.Product
  AND Cust = 2118
  ORDER BY OrderNum;
  

--Question 2
SELECT OrderNum, OrderDate, Mfr, Product, Description, Amount
FROM  Orders  NATURAL JOIN  Products 
WHERE  Cust = 2118
ORDER BY OrderNum;

--Question 3
SELECT P.Mfr, P.Product, CustNum, Company, Price
FROM Orders O JOIN Products P
      ON P.Mfr = O.Mfr AND P.Product = O.Product
    JOIN Customers 
      ON CustNum = Cust
WHERE CustNum IN (2107, 2110, 2111, 2124)
    AND Price >= 5 AND Price <= 25
ORDER BY Company, Price;


--Question 4
SELECT S.SalesRep, S.Name, O.OrderNum, O.Orderdate
FROM Customers C, Orders O, Salesreps S
WHERE S.SalesRep = C.CustRep
    AND C.CustNum = O.Cust
    AND S.Salesrep <> O.Rep;
    
 
--Question 5
SELECT Employees.Name AS "Employees Name", Managers.Name As "Managers Name"
FROM Salesreps Employees, Salesreps Managers
WHERE Managers.Salesrep = Employees.Manager
      AND Managers.Age < Employees.Age;
  


--Question 6
SELECT O.OrderNum, P.Mfr, P.Product, C.CustNum, C.Company, S.Name AS "Customer's Representative", OC.Office
FROM Orders O JOIN Products P
      ON P.Mfr = O.Mfr AND P.Product = O.Product
    JOIN Customers C
      ON CustNum = Cust
    JOIN SalesReps S
      ON S.SalesRep = C.CustRep
    JOIN Offices OC
      ON OC.Office = S.RepOffice
WHERE ( P.Product = '41003' AND P.Mfr = 'BIC') 
    OR( P.Product = 'L12' AND P.Mfr = 'FEA') 
    OR( P.Product = 'XK48' AND P.Mfr = 'QSA');
     

--Question 7             
SELECT P.Product, P.Description, C.Custnum, C.Company, O.Ordernum, O.Orderdate
FROM Orders O JOIN Products P
        ON P.Mfr = O.Mfr AND P.Product = O.Product
    JOIN Customers C
        ON C.Custnum = O.Cust
WHERE O.Amount < 10                         
    AND O.OrderDate Between '1989-06-01' AND '1990-05-31'
ORDER BY Orderdate;



--Question 8
SELECT Custnum, Company, Ordernum, Amount
FROM Customers RIGHT OUTER JOIN Orders
ON Custnum = Cust
ORDER BY Custnum, Amount;


--Question 9
SELECT P.Mfr, P.Product
FROM Orders O, Offices OC, Products P, SalesReps S
WHERE P.Mfr = O.Mfr AND P.Product = O.Product
     AND S.SalesRep = O.Rep 
     AND OC.Office = S.RepOffice
     AND Amount <=35
     AND Region <> 'Eastern';
     

 