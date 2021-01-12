--NAME: SALWEYAR PATEL
--STUDENT #: 0320109
--COURSE AND SECTION: DBMS-1000 (190592) Database Management Systems 1 AND 1
--DATE AND ASSIGNMENT#: 19-11-2019 AND 8

--Part A
--Question 1
CREATE VIEW RepCity
  (Name, City) AS
SELECT Name, City
FROM Offices, SalesReps
WHERE Office = RepOffice;


--Question 2
CREATE VIEW CustOrders
  (CustName, Product, Description, Qty, Value ) AS
SELECT Company, O.Product, Description, Qty, Amount
FROM Customers, Products P, Orders O
WHERE P.Mfr = O.Mfr
 AND  O.Product = O.Product
 AND  CustNum = Cust;




--Part B
--Question 3
---------------------------------------------------------
--Tables my account has access to:          Privileges given: SELECT AND INSERT
--1)DOCTOR
---------------------------------------------------------
--Tables PUBLIC has access to:              Privileges given: SELECT
--1)MASTERTB

SELECT SUBSTR(Owner,1,10) AS "Owner", 
       SUBSTR(Table_Name,1,10) AS "Table_Name", 
       SUBSTR(Grantor,1,10) AS "Grantor", 
       SUBSTR(Grantee,1,10) AS "Grantee",
       SUBSTR(Privilege,1,10) AS "Privilege"
FROM   All_Tab_Privs_Recd
WHERE GRANTOR = 'BOB';
    

 

--Question 4
--TO create table DOCTOR same as BOB table
CREATE TABLE DOCTOR
(
  DPID      NUMBER(17),
  DOCFN     CHAR(20),
  DOCLN     CHAR(20), 
  FOPER     DATE, 
  FEEC      NUMBER(10,2), 
  DID       NUMBER(14) NOT NULL, 
  CONSTRAINT FeeCCK 
   CHECK (FeeC < 123000),
  CONSTRAINT DOC
      PRIMARY KEY (DID),
  CONSTRAINT DOC1
      FOREIGN KEY(DPID)
      	REFERENCES MASTERTB
        ON DELETE CASCADE
);



CREATE TABLE MASTERTB
(
  ID      NUMBER(17) NOT NULL,
  STUDENT       CHAR(50),
  CONSTRAINT MASTERPK
      PRIMARY KEY (ID)
);

--TO get Table Name
SELECT Table_Name
FROM All_Tables
WHERE OWNER = 'BOB';

--to get column name and its datatype in order to column name
SELECT SUBSTR(Column_Name,1,10) AS "Column", SUBSTR(Data_Type, 1, 20) AS "Data_Type",Data_Precision, Data_Scale, Char_Length
FROM   All_Tab_Columns
WHERE  Owner = 'BOB'
AND    Table_Name = 'DOCTOR'
ORDER BY Column_ID;


SELECT SUBSTR(Column_Name,1,10) AS "Column", SUBSTR(Data_Type, 1, 20) AS "Data_Type",Data_Precision, Data_Scale, Char_Length
FROM   All_Tab_Columns
WHERE  Owner = 'BOB'
AND    Table_Name = 'MASTERTB'
ORDER BY Column_ID;


--To find constrainst name and its type and other information related to constraints
SELECT SUBSTR(Constraint_Name,1,12) AS Name,
 Constraint_Type ,
 Delete_Rule,
 SUBSTR(R_Owner,1,10) AS Owner, 
 SUBSTR(R_Constraint_Name,1,12) AS R_Constraint,
 Search_Condition AS Cond
FROM All_Constraints
WHERE Owner = 'BOB'
 AND Table_Name = 'DOCTOR'
ORDER BY Constraint_Type, Constraint_Name;

SELECT SUBSTR(Constraint_Name,1,12) AS Name,
 Constraint_Type ,
 Delete_Rule,
 SUBSTR(R_Owner,1,10) AS Owner, 
 SUBSTR(R_Constraint_Name,1,12) AS R_Constraint,
 Search_Condition AS Cond
FROM All_Constraints
WHERE Owner = 'BOB'
 AND Table_Name = 'MASTERTB'
ORDER BY Constraint_Type, Constraint_Name;





--TO Find DOCTOR Columns name using constraints
  SELECT Column_Name
 FROM All_Cons_Columns
 WHERE Owner = 'BOB'
		AND   Constraint_Name = 'FEEAMT';
    
SELECT Column_Name
 FROM All_Cons_Columns
 WHERE Owner = 'BOB'
		AND   Constraint_Name = 'DOC';
    
SELECT Column_Name
 FROM All_Cons_Columns
 WHERE Owner = 'BOB'
		AND   Constraint_Name = 'DOC1';

--TO Find MASTERTB Columns name using constraints
SELECT Column_Name
 FROM All_Cons_Columns
 WHERE Owner = 'BOB'
		AND   Constraint_Name = 'MASTERPK';
