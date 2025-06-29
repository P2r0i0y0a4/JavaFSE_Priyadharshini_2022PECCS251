CREATE OR REPLACE TRIGGER UpdateCustomerLastModified
BEFORE UPDATE ON Customer
FOR EACH ROW
BEGIN
    :NEW.LastModified := SYSDATE;
END;
/

-- Example: Update a customer record
UPDATE Customer
SET Balance = Balance + 1000
WHERE CustomerID = 1;

-- Now check if LastModified updated
SELECT CustomerID, Balance, TO_CHAR(LastModified, 'DD-MON-YYYY HH24:MI:SS') AS LastModified
FROM Customer
WHERE CustomerID = 1;
