DROP DATABASE IF EXISTS investment;
CREATE DATABASE investment;
use investment;

CREATE TABLE account(

	accountId INT NOT NULL AUTO_INCREMENT,
    firstName VARCHAR(200) NOT NULL,
	lastName VARCHAR(200) NOT NULL,
    cashValue DOUBLE NOT NULL,
    investmentValue DOUBLE NOT NULL,
    netWorth DOUBLE NOT NULL,
    income DOUBLE NOT NULL,
    PRIMARY KEY (accountId)
    
);


CREATE TABLE instrument (

	instrumentId INT NOT NULL AUTO_INCREMENT,
	askPrice DOUBLE NOT NULL,
    PRIMARY KEY (instrumentId)
    
);

CREATE TABLE stock (

	stockId INT NOT NULL AUTO_INCREMENT REFERENCES instrument(instrumentId),
    value DOUBLE NOT NULL,
    symbol VARCHAR(200) NOT NULL,
    company VARCHAR(200) NOT NULL,
    PRIMARY KEY (stockId)

);

CREATE TABLE bond (

	bondId INT NOT NULL AUTO_INCREMENT REFERENCES instrument(instrumentId),
    value DOUBLE NOT NULL,
    symbol VARCHAR(200) NOT NULL,
    company VARCHAR(200) NOT NULL,
    PRIMARY KEY (bondId)

);

CREATE TABLE etf (

	etfId INT NOT NULL AUTO_INCREMENT REFERENCES instrument(instrumentId),
    value DOUBLE NOT NULL,
    symbol VARCHAR(200) NOT NULL,
    company VARCHAR(200) NOT NULL,
    PRIMARY KEY (etfId)

);



CREATE TABLE portfolio (

	portfolioId INT NOT NULL AUTO_INCREMENT,
    accountId INT NOT NULL,
    instrumentId INT NOT NULL,
    currentValue DOUBLE NOT NULL,
    shareCount INT,
    date DATE NOT NULL,
    PRIMARY KEY (portfolioId),
    FOREIGN KEY (accountId) REFERENCES account(accountId),
    FOREIGN KEY (instrumentId) REFERENCES instrument(instrumentId)
);

INSERT INTO account (firstName, lastName, cashValue, investmentValue, netWorth, income) VALUES ('Eddie','Ozuna',20000,30000,50000,30000);
INSERT INTO account (firstName, lastName, cashValue, investmentValue, netWorth, income) VALUES ('Jonathan','Erquingo',40000,50000,60000,70000);
INSERT INTO account (firstName, lastName, cashValue, investmentValue, netWorth, income) VALUES ('TKeya','Stevens',50000,60000,70000,80000);

INSERT INTO instrument (askPrice) VALUES (200);
INSERT INTO instrument (askPrice) VALUES (400);
INSERT INTO instrument (askPrice) VALUES (500);

INSERT INTO bond (value, symbol, company) VALUES (39200000000, 'FXNAX', 'Fidelity');
INSERT INTO bond (value, symbol, company) VALUES (91000000000, 'MWTRX', 'Metropolitan West');
INSERT INTO bond (value, symbol, company) VALUES (325000000000, 'DODGX', 'Dodge & Cox');
INSERT INTO bond (value, symbol, company) VALUES (167000000, 'Great-West Multi-Sector', 'MXLMX');
INSERT INTO bond (value, symbol, company) VALUES (29650000000, 'VWEHX', 'Vanguard High-Yield');