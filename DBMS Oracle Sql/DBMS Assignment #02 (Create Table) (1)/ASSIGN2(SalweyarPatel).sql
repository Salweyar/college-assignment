--NAME: SALWEYAR PATEL
--STUDENT #: 0320109
--COURSE AND SECTION: DBMS-1000 (190592) Database Management Systems 1 AND 1
--DATE AND ASSIGNMENT#: 13-09-2019 AND 2

DROP TABLE OtherCharges;
DROP TABLE Payments;
DROP TABLE Bookings;
DROP TABLE Clients;
DROP TABLE Rooms;

CREATE TABLE Bookings
(
  BookingID      NUMBER(15) NOT NULL,
  ClientID       NUMBER(3),
  RoomID         NUMBER(5), 
  BookingDate    DATE, 
  Arrive         DATE NOT NULL, 
  Depart         DATE,
  PaymentDueDate DATE, 
  Comments       VARCHAR2(200),
  CONSTRAINT BookingsPK
      PRIMARY KEY (BookingID)
);

CREATE TABLE Clients
(
  ClientID      NUMBER(10) NOT NULL,
  FirstName     VARCHAR2(20) NOT NULL, 
  LastName      VARCHAR2(50) NOT NULL, 
  Street        VARCHAR2(40), 
  City          VARCHAR2(20), 
  Province      VARCHAR2(2), 
  PostalCode    VARCHAR2(7), 
  Phone         VARCHAR2(12),
  Email         VARCHAR2(200), 
  CreditCard    VARCHAR2(25) NOT NULL,
  CONSTRAINT ClientsPK
      PRIMARY KEY (ClientID),
  CONSTRAINT ContectCheckCK 
   CHECK (Phone IS NOT NULL OR Email IS NOT NULL),
  CONSTRAINT CreditCardUnique 
      UNIQUE (CreditCard)
);

CREATE TABLE OtherCharges
(
  BookingID    NUMBER(15) NOT NULL, 
  ChargeID     NUMBER(3) NOT NULL, 
  ChargeType   VARCHAR2(11) NOT NULL, 
  Amount       NUMBER(5,2),
  CONSTRAINT OtherChargesPK
      PRIMARY KEY (BookingID,ChargeID),
  CONSTRAINT ChargeTypeCK
    CHECK (ChargeType = 'Phone' OR ChargeType = 'RoomService' OR ChargeType = 'Other')
);

CREATE TABLE Payments
(
  PaymentID   NUMBER(10) NOT NULL, 
  BookingID   NUMBER(15), 
  AmountPaid  NUMBER(9,2), 
  Comments    VARCHAR2(200),
  CONSTRAINT PaymentsPK
      PRIMARY KEY (PaymentID)
);

CREATE TABLE Rooms
(
  RoomID     NUMBER(5) NOT NULL, 
  Rate       NUMBER(7,2) NOT NULL,
  CONSTRAINT RoomsPK
      PRIMARY KEY (RoomID),
  CONSTRAINT RateCK
    CHECK (Rate <= 25 AND Rate >= 99),
   CONSTRAINT RoomCK
    CHECK (RoomID <= 2000 AND RoomID >= 29000)
);

ALTER TABLE Bookings ADD
    CONSTRAINT PlacesFK
      FOREIGN KEY(ClientID)
        REFERENCES Clients
        ON DELETE CASCADE;
ALTER TABLE Bookings ADD
    CONSTRAINT ReservesFK
      FOREIGN KEY(RoomID)
        REFERENCES Rooms
        ON DELETE CASCADE;
ALTER TABLE OtherCharges ADD
    CONSTRAINT ChargesFK
      FOREIGN KEY(BookingID)
      REFERENCES Bookings;
ALTER TABLE Payments ADD
  CONSTRAINT PaysFK
    FOREIGN KEY(BookingID)
    REFERENCES Bookings;

