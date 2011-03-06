CREATE TABLE ansatte (
  Id int NOT NULL,
  FirstName varchar(2500),
  LastName varchar(2500),
  Seniority varchar(2500),
  Email varchar(2500),
  MobilePhone varchar(2500),
  Department varchar(2500),
  InterestGroup varchar(2500),
  Status varchar(2500),
  StreetAddress varchar(2500),
  PostalAddress varchar(2500),
  PostalNr varchar(2500),
  Gender varchar(2500),
  StartDate varchar(2500),
  EndDate varchar(2500),
  ImageUrl varchar(2500),
  ImageData varchar(2500),
  PRIMARY KEY (Id)
);

INSERT INTO ansatte (Id, Email, EndDate, FirstName, Gender, Department, InterestGroup, LastName, MobilePhone, postalAddress, PostalNr, Seniority, StartDate, Status, StreetAddress, ImageUrl, ImageData ) VALUES ('95','snorre.brandstadmoen@bekk.no','nul-l-','Snorre','Mann','Technology','Webarkitektur','Brandstadmoen','98219362','OSLO','0957','Manager','200-10-30','null','Alunsj¿veien 45 A','https://nanna.bekk.no/BekkEmployees/ViewEmployeeImage.ashx?thumbnail=true&employee=95&thumbsize=100','');
