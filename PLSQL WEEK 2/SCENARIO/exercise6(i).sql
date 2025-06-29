DECLARE
  CURSOR cur_transactions IS
    SELECT a.CustomerID, t.TransactionID, t.TransactionDate, t.Amount, t.TransactionType
    FROM Transactions t
    JOIN Accounts a ON t.AccountID = a.AccountID
    WHERE TRUNC(t.TransactionDate, 'MM') = TRUNC(SYSDATE, 'MM')
    ORDER BY a.CustomerID, t.TransactionDate;

  -- Define a record variable matching the cursor
  rec_transaction cur_transactions%ROWTYPE;

BEGIN
  OPEN cur_transactions;
  LOOP
    FETCH cur_transactions INTO rec_transaction;
    EXIT WHEN cur_transactions%NOTFOUND;

    -- Print statement info for the customer and transaction
    DBMS_OUTPUT.PUT_LINE('Customer ID: ' || rec_transaction.CustomerID
      || ' | Transaction ID: ' || rec_transaction.TransactionID
      || ' | Date: ' || TO_CHAR(rec_transaction.TransactionDate, 'DD-MON-YYYY')
      || ' | Amount: ' || rec_transaction.Amount
      || ' | Type: ' || rec_transaction.TransactionType);
  END LOOP;
  CLOSE cur_transactions;
END;
/
