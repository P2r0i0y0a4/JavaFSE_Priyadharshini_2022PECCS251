CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions
FOR EACH ROW
DECLARE
    currentBalance NUMBER;
BEGIN
    BEGIN
        SELECT Balance INTO currentBalance
        FROM Accounts
        WHERE AccountID = :NEW.AccountID;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RAISE_APPLICATION_ERROR(-20003, 'Account does not exist.');
    END;

    IF UPPER(:NEW.TransactionType) = 'WITHDRAWAL' THEN
        IF :NEW.Amount > currentBalance THEN
            RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance for withdrawal.');
        END IF;

    ELSIF UPPER(:NEW.TransactionType) = 'DEPOSIT' THEN
        IF :NEW.Amount <= 0 THEN
            RAISE_APPLICATION_ERROR(-20002, 'Deposit amount must be greater than zero.');
        END IF;
    END IF;
END;
/

INSERT INTO Accounts (AccountID, AccountType, Balance, LastModified)
VALUES (1, 'SAVINGS', 10000, SYSDATE);

INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (3, 1, SYSDATE, 500, 'Withdrawal');  -- valid withdrawal

INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (4, 1, SYSDATE, 1000, 'Deposit');    -- valid deposit

INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (5, 1, SYSDATE, 20000, 'Withdrawal'); -- should error: insufficient balance

INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (6, 1, SYSDATE, 0, 'Deposit');        -- should error: deposit amount <= 0
