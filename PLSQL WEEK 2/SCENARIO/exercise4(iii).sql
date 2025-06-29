CREATE OR REPLACE FUNCTION HasSufficientBalance(accountId NUMBER, amount NUMBER)
RETURN VARCHAR2 IS
    currentBalance NUMBER;
BEGIN
    SELECT Balance INTO currentBalance 
    FROM (
        SELECT Balance FROM Accounts 
        WHERE AccountID = accountId
    ) WHERE ROWNUM = 1;

    IF currentBalance >= amount THEN
        RETURN 'TRUE';
    ELSE
        RETURN 'FALSE';
    END IF;

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN 'ACCOUNT NOT FOUND';
END;
/

SELECT HasSufficientBalance(101, 10000) AS Result FROM dual;
SELECT HasSufficientBalance(102, 6000) AS Result FROM dual;
SELECT HasSufficientBalance(999, 100) AS Result FROM dual; 
