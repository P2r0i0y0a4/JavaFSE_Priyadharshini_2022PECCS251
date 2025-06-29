SET SERVEROUTPUT ON;

DECLARE
  CURSOR cur_loans IS
    SELECT LOAN_ID, INTEREST_RATE FROM Loans;

  v_loan_id       Loans.LOAN_ID%TYPE;
  v_old_rate      Loans.INTEREST_RATE%TYPE;
  v_new_rate      NUMBER;
BEGIN
  OPEN cur_loans;
  LOOP
    FETCH cur_loans INTO v_loan_id, v_old_rate;
    EXIT WHEN cur_loans%NOTFOUND;

    -- Reduce interest rate by 5%
    v_new_rate := v_old_rate * 0.95;

    UPDATE Loans
    SET INTEREST_RATE = v_new_rate
    WHERE LOAN_ID = v_loan_id;

    DBMS_OUTPUT.PUT_LINE('Loan ID: ' || v_loan_id ||
                         ' | Interest Rate: ' || v_old_rate ||
                         ' -> ' || v_new_rate);
  END LOOP;
  CLOSE cur_loans;

  COMMIT;
END;
/
