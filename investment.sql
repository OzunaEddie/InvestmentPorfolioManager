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
	symbol VARCHAR(200) NOT NULL,
	askPrice DOUBLE NOT NULL,
    PRIMARY KEY (instrumentId)
    
);

CREATE TABLE stock (

	stockId INT NOT NULL AUTO_INCREMENT,
    value DOUBLE NOT NULL,
    symbol VARCHAR(200) NOT NULL,
    instrumentId INT NOT NULL,
    company VARCHAR(200) NOT NULL,
    PRIMARY KEY (stockId),
    FOREIGN KEY (instrumentId) REFERENCES instrument(instrumentId)

);

CREATE TABLE bond (

	bondId INT NOT NULL AUTO_INCREMENT,
    value DOUBLE NOT NULL,
    symbol VARCHAR(200) NOT NULL,
    instrumentId INT NOT NULL,
    company VARCHAR(200) NOT NULL,
    PRIMARY KEY (bondId),
    FOREIGN KEY (instrumentId) REFERENCES instrument(instrumentId)

);

CREATE TABLE etf (

	etfId INT NOT NULL AUTO_INCREMENT,
    value DOUBLE NOT NULL,
    symbol VARCHAR(200) NOT NULL,
    instrumentId INT NOT NULL,
    company VARCHAR(200) NOT NULL,
    PRIMARY KEY (etfId),
    FOREIGN KEY (instrumentId) REFERENCES instrument(instrumentId)

);



CREATE TABLE portfolio (

	portfolioId INT NOT NULL AUTO_INCREMENT,
    accountId INT NOT NULL,
    instrumentId INT NOT NULL,
    currentValue DOUBLE NOT NULL,
    date DATE NOT NULL,
    PRIMARY KEY (portfolioId),
    FOREIGN KEY (accountId) REFERENCES account(accountId),
    FOREIGN KEY (instrumentId) REFERENCES instrument(instrumentId)
);