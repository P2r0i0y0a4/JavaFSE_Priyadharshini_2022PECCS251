DECLARE
    v_customer_name VARCHAR2(100);
BEGIN
    FOR ln IN (
        SELECT LoanID, CustomerID, EndDate
        FROM Loan
        WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        SELECT Name INTO v_customer_name
        FROM Customer
        WHERE CustomerID = ln.CustomerID;

        DBMS_OUTPUT.PUT_LINE('Reminder: Dear ' || v_customer_name ||
                             ', your loan (ID: ' || ln.LoanID || ') is due on ' ||
                             TO_CHAR(ln.EndDate, 'DD-MON-YYYY') || '.');
    END LOOP;
END;
