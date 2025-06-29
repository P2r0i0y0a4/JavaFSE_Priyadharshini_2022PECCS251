CREATE OR REPLACE PROCEDURE TransferFunds (
    p_FromAccID   NUMBER,
    p_ToAccID     NUMBER,
    p_Amount      NUMBER
)
IS
    v_FromBalance NUMBER;
BEGIN
    -- Check source balance
    SELECT Balance INTO v_FromBalance
    FROM Accounts
    WHERE AccountID = p_FromAccID;

    IF v_FromBalance < p_Amount THEN
        DBMS_OUTPUT.PUT_LINE('Insufficient funds in source account.');
        RETURN;
    END IF;

    -- Perform transfer
    UPDATE Accounts
    SET Balance = Balance - p_Amount
    WHERE AccountID = p_FromAccID;

    UPDATE Accounts
    SET Balance = Balance + p_Amount
    WHERE AccountID = p_ToAccID;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Transfer completed successfully.');
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('One or both account IDs not found.');
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error during transfer: ' || SQLERRM);
END;
/
