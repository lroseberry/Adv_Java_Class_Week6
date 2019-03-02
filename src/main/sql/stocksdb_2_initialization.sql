/* delete tables if they exist already - ensuring a clean db*/
DROP TABLE IF EXISTS person_stocks CASCADE;
DROP TABLE IF EXISTS person CASCADE;
DROP TABLE IF EXISTS stocks CASCADE;
DROP TABLE IF EXISTS quotes CASCADE;

/** creates a table to store persons */
CREATE TABLE person
(
  ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(256) NOT NULL,
  last_name VARCHAR(256) NOT NULL,
  birth_date DATETIME NOT NULL
);

/** creates a table to store stocks */
CREATE TABLE stocks
(
  ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  company_name VARCHAR(256) NOT NULL,
  symbol VARCHAR(256) NOT NULL
);

/** A list of people and their stocks */
CREATE TABLE person_stocks
(
  ID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  person_id INT NOT NULL,
  stock_id INT NOT NULL,
  FOREIGN KEY (person_id) REFERENCES person (ID),
  FOREIGN KEY (stock_id) REFERENCES stocks (ID)
);

/** create a table to store stock quotes */
CREATE TABLE quotes(
  id INT NOT NULL AUTO_INCREMENT,
  symbol VARCHAR(4) NOT NULL,
  time DATETIME NOT NULL,
  price DECIMAL NOT NULL,
  PRIMARY KEY ( id )
);

INSERT INTO stocks (company_name,symbol) VALUES ('Apple','AAPL');
INSERT INTO stocks (company_name,symbol) VALUES ('Google','GOOG');
INSERT INTO stocks (company_name,symbol) VALUES ('The Hanover Insurance Group','THG ');
INSERT INTO stocks (company_name,symbol) VALUES ('Planet Fitness','PLNT');

INSERT INTO person (first_name,last_name,birth_date) VALUES ('Linda','Roseberry','1970/10/08');
INSERT INTO person (first_name,last_name,birth_date) VALUES ('John','Roseberry','1967/03/23');
INSERT INTO person (first_name,last_name,birth_date) VALUES ('William','Roseberry','1998/12/21');
INSERT INTO person (first_name,last_name,birth_date) VALUES ('Katelyn','Roseberry','2000/09/16');

INSERT INTO person_stocks (person_id, stock_id) VALUES (1,1);
INSERT INTO person_stocks (person_id, stock_id) VALUES (1,2);
INSERT INTO person_stocks (person_id, stock_id) VALUES (1,3);
INSERT INTO person_stocks (person_id, stock_id) VALUES (2,2);
INSERT INTO person_stocks (person_id, stock_id) VALUES (3,2);
INSERT INTO person_stocks (person_id, stock_id) VALUES (3,3);
INSERT INTO person_stocks (person_id, stock_id) VALUES (4,1);
INSERT INTO person_stocks (person_id, stock_id) VALUES (4,4);

INSERT INTO quotes (symbol,time,price) VALUES ('AAPL','2019-02-26 12:00:01','112.43');
INSERT INTO quotes (symbol,time,price) VALUES ('AAPL','2019-02-01 14:12:01','198.32');
INSERT INTO quotes (symbol,time,price) VALUES ('AAPL','2018-01-01 05:00:01','97.89');
INSERT INTO quotes (symbol,time,price) VALUES ('GOOG','2019-02-26 16:00:01','450.00');
INSERT INTO quotes (symbol,time,price) VALUES ('GOOG','2019-02-12 11:15:01','435.87');
INSERT INTO quotes (symbol,time,price) VALUES ('GOOG','2018-12-03 12:00:01','427.39');
INSERT INTO quotes (symbol,time,price) VALUES ('THG ','2019-02-26 15:30:01','58.25');
INSERT INTO quotes (symbol,time,price) VALUES ('THG ','2019-02-01 10:45:01','89.25');
INSERT INTO quotes (symbol,time,price) VALUES ('THG ','2018-02-26 12:30:01','54.00');
INSERT INTO quotes (symbol,time,price) VALUES ('PLNT','2019-02-26 16:00:01','36.58');
INSERT INTO quotes (symbol,time,price) VALUES ('PLNT','2019-02-01 14:15:01','35.00');
INSERT INTO quotes (symbol,time,price) VALUES ('PLNT','2018-01-01 12:00:01','45.63');


