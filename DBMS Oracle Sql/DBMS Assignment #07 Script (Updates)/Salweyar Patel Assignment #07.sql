--NAME: SALWEYAR PATEL
--STUDENT #: 0320109
--COURSE AND SECTION: DBMS-1000 (190592) Database Management Systems 1 AND 1
--DATE AND ASSIGNMENT#: 07-11-2019 AND 7

--Question 1
INSERT INTO Offices (Office, City, Region, Sales)
VALUES (35, 'Winnipeg', 'Central', 0);

--Question 2
INSERT INTO Salesreps (SalesRep, Name, Age, RepOffice, Title, HireDate, Manager, Quota, Sales)
VALUES (122, 'Salweyar Patel' , NULL, 1, 'Sales Rep' , CURRENT_DATE , NULL, NULL , 0 );



--Question 3
DELETE FROM SalesReps
WHERE  Title = 'Sales Rep'
      AND HireDate < '1987-01-01'
      AND SalesRep IN ( SELECT Rep
                      FROM Orders
                      WHERE Cust IS NULL);
--correct
DELETE FROM SalesReps
WHERE  Title = 'Sales Rep'
      AND HireDate < '1987-01-01'
      AND EXISTS (SELECT 1
                  FROM Orders
                 WHERE Rep = Salesrep
                  and Cust IS NULL);   

 

--Question 4
UPDATE 	SalesReps
SET   	Age = 41,
	RepOffice = 11,
      	Title = 'Senior VP',
      	Manager = 106,
      	Quota = 1000.00
WHERE  	SalesRep = 37;

--Question 5
UPDATE 	Customers
SET   CreditLimit = CreditLimit * 0.25 + CreditLimit
WHERE  (SELECT COUNT(*)
        FROM Orders
        WHERE CustNum = Cust
        AND Amount > 250) >= 2;
       

     

--Question 6


UPDATE 	Customers
SET   CreditLimit = (SELECT Max(Amount)
                    FROM Orders) + 1000
WHERE  EXISTS (select 1 
              from Orders
              where Custnum = Cust
              AND Amount > CreditLimit);

--correct 
UPDATE 	Customers
SET   CreditLimit = (SELECT Max(Amount)
                    FROM Orders where custnum=cust) + 1000
WHERE  EXISTS (select 1 
              from Orders
              where Custnum = Cust
              AND Amount > CreditLimit);


 

