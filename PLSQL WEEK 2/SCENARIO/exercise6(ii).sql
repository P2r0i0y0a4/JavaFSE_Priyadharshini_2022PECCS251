DECLARE
  CURSOR cur_accounts IS
    SELECT AccountID, Balance FROM Accounts;

  v_account_id Accounts.AccountID%TYPE;
  v_balance Accounts.Balance%TYPE;
  v_fee CONSTANT NUMBER := 100;  -- Annual fee amount
BEGIN
  OPEN cur_accounts;
  LOOP
    FETCH cur_accounts INTO v_account_id, v_balance;
    EXIT WHEN cur_accounts%NOTFOUND;

    UPDATE Accounts
    SET Balance = Balance - v_fee,
        LastModified = SYSDATE
    WHERE AccountID = v_account_id;

    DBMS_OUTPUT.PUT_LINE('Applied annual fee to Account ' || v_account_id || ', New Balance: ' || (v_balance - v_fee));
  END LOOP;
  CLOSE cur_accounts;

  COMMIT;
END;
/
