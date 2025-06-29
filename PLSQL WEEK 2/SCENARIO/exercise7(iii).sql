-- Package Specification
CREATE OR REPLACE PACKAGE AccountOperations AS
  PROCEDURE OpenAccount(p_AccountID NUMBER, p_CustomerID NUMBER, p_AccountType VARCHAR2, p_InitialBalance NUMBER);
  PROCEDURE CloseAccount(p_AccountID NUMBER);
  FUNCTION GetTotalBalance(p_CustomerID NUMBER) RETURN NUMBER;
END AccountOperations;
/

-- Package Body
CREATE OR REPLACE PACKAGE BODY AccountOperations AS

  PROCEDURE OpenAccount(p_AccountID NUMBER, p_CustomerID NUMBER, p_AccountType VARCHAR2, p_InitialBalance NUMBER) IS
  BEGIN
    INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance)
    VALUES (p_AccountID, p_CustomerID, p_AccountType, p_InitialBalance);
  END OpenAccount;

  PROCEDURE CloseAccount(p_AccountID NUMBER) IS
  BEGIN
    DELETE FROM Accounts
    WHERE AccountID = p_AccountID;
  END CloseAccount;

  FUNCTION GetTotalBalance(p_CustomerID NUMBER) RETURN NUMBER IS
    v_TotalBalance NUMBER;
  BEGIN
    SELECT NVL(SUM(Balance), 0) INTO v_TotalBalance
    FROM Accounts
    WHERE CustomerID = p_CustomerID;
    
    RETURN v_TotalBalance;
  END GetTotalBalance;

END AccountOperations;
/
