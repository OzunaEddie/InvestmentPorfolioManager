DROP DATABASE IF EXISTS investment;
CREATE DATABASE investment;
use investment;

CREATE TABLE account(
                        accountId INT NOT NULL AUTO_INCREMENT,
                        firstName VARCHAR(200) NOT NULL,
                        lastName VARCHAR(200) NOT NULL,
                        income DOUBLE NOT NULL,
                        PRIMARY KEY (accountId)

);

CREATE TABLE bankaccount (
                             bankId INT NOT NULL AUTO_INCREMENT,
                             bankName VARCHAR(200) NOT NULL,
                             cashValue DOUBLE NOT NULL,
                             accountType VARCHAR(200) NOT NULL,
                             accountId INT NOT NULL,
                             PRIMARY KEY (bankId),
                             FOREIGN KEY (accountId) REFERENCES account(accountId)
);

CREATE TABLE instrument (
                            instrumentId INT NOT NULL AUTO_INCREMENT,
                            quote DOUBLE NOT NULL,
                            PRIMARY KEY (instrumentId)
);

CREATE TABLE stock (
                       stockId INT NOT NULL AUTO_INCREMENT,
                       value DOUBLE NOT NULL,
                       symbol VARCHAR(200) NOT NULL,
                       company VARCHAR(200) NOT NULL,
                       PRIMARY KEY (stockId),
                       FOREIGN KEY (stockId) REFERENCES instrument(instrumentId)

);

CREATE TABLE bond (
                      bondId INT NOT NULL AUTO_INCREMENT,
                      value DOUBLE NOT NULL,
                      symbol VARCHAR(200) NOT NULL,
                      company VARCHAR(200) NOT NULL,
                      PRIMARY KEY (bondId),
                      FOREIGN KEY (bondId) REFERENCES instrument(instrumentId)

);

CREATE TABLE etf (
                     etfId INT NOT NULL AUTO_INCREMENT,
                     value DOUBLE NOT NULL,
                     symbol VARCHAR(200) NOT NULL,
                     company VARCHAR(200) NOT NULL,
                     PRIMARY KEY (etfId),
                     FOREIGN KEY (etfId) REFERENCES instrument(instrumentId)
);

CREATE TABLE portfolio (
                           portfolioId INT NOT NULL AUTO_INCREMENT,
                           accountId INT NOT NULL,
                           instrumentId INT NOT NULL,
                           shareCount INT,
                           date DATE NOT NULL,
                           typeOfInstrument VARCHAR(200) NOT NULL,
                           value INT NOT NULL,
                           PRIMARY KEY (portfolioId),
                           FOREIGN KEY (accountId) REFERENCES account(accountId),
                           FOREIGN KEY (instrumentId) REFERENCES instrument(instrumentId)
);

INSERT INTO account (firstName, lastName, income) VALUES ('Eddie','Ozuna', 300000);
INSERT INTO account (firstName, lastName, income) VALUES ('Jonathan','Erquingo', 700000);
INSERT INTO account (firstName, lastName, income) VALUES ('TKeya','Stevens', 800000);



INSERT INTO instrument (quote) VALUES (200);
INSERT INTO instrument (quote) VALUES (400);
INSERT INTO instrument (quote) VALUES (600);
INSERT INTO instrument (quote) VALUES (700);
INSERT INTO instrument (quote) VALUES (800);
INSERT INTO instrument (quote) VALUES (120.83);
INSERT INTO instrument (quote) VALUES (540.17);
INSERT INTO instrument (quote) VALUES (169.91);
INSERT INTO instrument (quote) VALUES (193.80);
INSERT INTO instrument (quote) VALUES (124.86);
INSERT INTO instrument (quote) VALUES (120.83);
INSERT INTO instrument (quote) VALUES (540.17);
INSERT INTO instrument (quote) VALUES (169.91);

INSERT INTO bond (bondId, value, symbol, company) VALUES (1,150000, 'FXNAX', 'Fidelity');
INSERT INTO bond (bondId, value, symbol, company) VALUES (2,200000, 'MWTRX', 'Metropolitan West');
INSERT INTO bond (bondId, value, symbol, company) VALUES (3,300000, 'DODGX', 'Dodge & Cox');
INSERT INTO bond (bondId, value, symbol, company) VALUES (4,400000, 'Great-West Multi-Sector', 'MXLMX');
INSERT INTO bond (bondId, value, symbol, company) VALUES (5,500000, 'VWEHX', 'Vanguard High-Yield');

INSERT INTO stock (stockId, value, symbol, company) VALUES (6, 100.83, 'DLTR', 'Dollar Tree Inc');
INSERT INTO stock (stockId, value, symbol, company) VALUES (7, 520.17, 'DPZ', "Domino's Pizza Inc");
INSERT INTO stock (stockId, value, symbol, company) VALUES (8, 149.91, 'WMT', 'Walmart');
INSERT INTO stock (stockId, value, symbol, company) VALUES (9, 173.80, 'DIS', 'Walt Disney');
INSERT INTO stock (stockId, value, symbol, company) VALUES (10, 104.86, 'AMD', 'AMD (Advanced Micro Devices) Inc.');

INSERT INTO etf (etfid, value, symbol, company) VALUES (11, 600, 'VTI', 'Vanguard Total ETF');
INSERT INTO etf (etfid, value, symbol, company) VALUES (12, 250, 'SPY', 'SPDR S&P 500 ETF');
INSERT INTO etf (etfid, value, symbol, company) VALUES (13, 450, 'VTWO', 'Vanguard Russel ETF');

INSERT INTO portfolio (accountId, instrumentId, shareCount, typeOfInstrument, value, date) VALUES(1, 1, 1, "bond", 150000, CURDATE());
INSERT INTO portfolio (accountId, instrumentId, shareCount, typeOfInstrument, value, date) VALUES(2, 2, 1, "bond", 200000, CURDATE());
INSERT INTO portfolio (accountId, instrumentId, shareCount, typeOfInstrument, value, date) VALUES(1, 3, 1, "bond", 300000, CURDATE());
INSERT INTO portfolio (accountId, instrumentId, shareCount, typeOfInstrument, value, date) VALUES(3, 4, 1, "bond", 400000, CURDATE());
INSERT INTO portfolio (accountId, instrumentId, shareCount, typeOfInstrument, value, date) VALUES(1, 5, 1, "bond", 500000, CURDATE());
INSERT INTO portfolio (accountId, instrumentId, shareCount, typeOfInstrument, value, date) VALUES(2, 6, 10, "stock", 100.83, CURDATE());
INSERT INTO portfolio (accountId, instrumentId, shareCount, typeOfInstrument, value, date) VALUES(3, 7, 20, "stock", 520.17, CURDATE());
INSERT INTO portfolio (accountId, instrumentId, shareCount, typeOfInstrument, value, date) VALUES(2, 8, 10, "stock", 149.91, CURDATE());
INSERT INTO portfolio (accountId, instrumentId, shareCount, typeOfInstrument, value, date) VALUES(1, 9, 20, "stock", 173.80, CURDATE());
INSERT INTO portfolio (accountId, instrumentId, shareCount, typeOfInstrument, value, date) VALUES(2, 10, 10, "stock", 104.86, CURDATE());
INSERT INTO portfolio (accountId, instrumentId, shareCount, typeOfInstrument, value, date) VALUES(1, 11, 10, "etf", 600, CURDATE());
INSERT INTO portfolio (accountId, instrumentId, shareCount, typeOfInstrument, value, date) VALUES(2, 12, 17, "etf", 250,  CURDATE());
INSERT INTO portfolio (accountId, instrumentId, shareCount, typeOfInstrument, value, date) VALUES(3, 13, 14, "etf", 450, CURDATE());