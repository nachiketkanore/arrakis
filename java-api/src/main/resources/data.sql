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
