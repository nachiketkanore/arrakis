-- Sample data for dogs table
INSERT INTO dogs (id, name, age) VALUES (1, 'Einstein', 3);
INSERT INTO dogs (id, name, age) VALUES (2, 'Kaya', 5);
INSERT INTO dogs (id, name, age) VALUES (3, 'Max', 9);
INSERT INTO dogs (id, name, age) VALUES (4, 'Harry', 2);
INSERT INTO dogs (id, name, age) VALUES (5, 'Steph', 5);
INSERT INTO dogs (id, name, age) VALUES (6, 'Ben', 1);

-- Sample data for security table
INSERT INTO SECURITY (id, isin, cusip, issuer, maturity_date, coupon, type, face_value, status) VALUES
                     (1, 'XYZ', 'ABC', 'Google', '2022-01-01', 'DB100', 'PRIVATE', 1000.20, 'INACTIVE');
INSERT INTO SECURITY (id, isin, cusip, issuer, maturity_date, coupon, type, face_value, status) VALUES
                     (2, 'LMN', 'ABC', 'Amazon', '2022-01-01', 'DB100', 'PRIVATE', 23424.20, 'ACTIVE');
INSERT INTO SECURITY (id, isin, cusip, issuer, maturity_date, coupon, type, face_value, status) VALUES
                     (3, 'PQR', 'ABC', 'Microsoft', '2022-01-01', 'DB100', 'PRIVATE', 500.20, 'INACTIVE');
INSERT INTO SECURITY (id, isin, cusip, issuer, maturity_date, coupon, type, face_value, status) VALUES
                     (4, 'ASD', 'ABC', 'DB', '2022-01-01', 'DB100', 'PRIVATE', 1000.20, 'ACTIVE');
INSERT INTO SECURITY (id, isin, cusip, issuer, maturity_date, coupon, type, face_value, status) VALUES
                     (5, 'TYU', 'ABC', 'EY', '2022-01-01', 'DB100', 'PRIVATE', 2000.20, 'ACTIVE');

-- Sample data for trade table
INSERT INTO TRADE (id, quantity, status, price, buysell, tradedate, settlementdate, bookid, counterpartyid, securityid) VALUES
                    (1, 100, 'OK', 1000, 'YES', '2022-09-09', '2022-09-10', 22, 12, 5);
INSERT INTO TRADE (id, quantity, status, price, buysell, tradedate, settlementdate, bookid, counterpartyid, securityid) VALUES
                    (2, 200, 'OK', 234, 'NO', '2022-09-09', '2029-09-10', 22, 21, 2);
INSERT INTO TRADE (id, quantity, status, price, buysell, tradedate, settlementdate, bookid, counterpartyid, securityid) VALUES
                    (3, 333, 'BAD', 235, 'NO', '2022-09-09', '2023-02-10', 22, 12, 3);
INSERT INTO TRADE (id, quantity, status, price, buysell, tradedate, settlementdate, bookid, counterpartyid, securityid) VALUES
                    (4, 500, 'BAD', 3459, 'YES', '2022-09-09', '2022-09-10', 22, 12, 1);
INSERT INTO TRADE (id, quantity, status, price, buysell, tradedate, settlementdate, bookid, counterpartyid, securityid) VALUES
                    (5, 100, 'OK', 3452, 'NO', '2023-09-09', '2025-05-10', 22, 12, 1);
INSERT INTO TRADE (id, quantity, status, price, buysell, tradedate, settlementdate, bookid, counterpartyid, securityid) VALUES
                    (6, 10, 'OK', 10000, 'YES', '2022-09-09', '2022-09-10', 22, 12, 2);

-- Sample data for counterparty table
INSERT INTO COUNTERPARTY (id, name) VALUES (12, 'Ayush');
INSERT INTO COUNTERPARTY (id, name) VALUES (13, 'Kunal');
INSERT INTO COUNTERPARTY (id, name) VALUES (14, 'Nachiket');
INSERT INTO COUNTERPARTY (id, name) VALUES (15, 'Mihir');
INSERT INTO COUNTERPARTY (id, name) VALUES (16, 'Onkar');
