BEGIN
    FOR cust IN (SELECT CustomerID, Balance FROM Customer) LOOP
        IF cust.Balance > 10000 THEN
            UPDATE Customer
            SET IsVIP = 'TRUE'
            WHERE CustomerID = cust.CustomerID;
        ELSE
            UPDATE Customer
            SET IsVIP = 'FALSE'
            WHERE CustomerID = cust.CustomerID;
        END IF;
    END LOOP;
    COMMIT;
END;
