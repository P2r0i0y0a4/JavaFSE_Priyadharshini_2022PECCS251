CREATE OR REPLACE PROCEDURE SafeTransferFunds (
    p_FromAccountID   NUMBER,
    p_ToAccountID     NUMBER,
    p_Amount          NUMBER
)
IS
    v_FromBalance NUMBER;
BEGIN
    -- Check current balance
    SELECT Balance INTO v_FromBalance FROM Accounts WHERE AccountID = p_FromAccountID;

    IF v_FromBalance < p_Amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds.');
    END IF;

    -- Deduct from source
    UPDATE Accounts
    SET Balance = Balance - p_Amount,
        LastModified = SYSDATE
    WHERE AccountID = p_FromAccountID;

    -- Add to destination
    UPDATE Accounts
    SET Balance = Balance + p_Amount,
        LastModified = SYSDATE
    WHERE AccountID = p_ToAccountID;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Transfer successful.');
    
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error during fund transfer: ' || SQLERRM);
END;
/
