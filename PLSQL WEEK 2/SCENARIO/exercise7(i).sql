-- Package Specification
CREATE OR REPLACE PACKAGE CustomerManagement AS
  PROCEDURE AddCustomer(p_CustomerID NUMBER, p_Name VARCHAR2, p_DOB DATE);
  PROCEDURE UpdateCustomerDetails(p_CustomerID NUMBER, p_Name VARCHAR2, p_DOB DATE);
  FUNCTION GetCustomerBalance(p_CustomerID NUMBER) RETURN NUMBER;
END CustomerManagement;
/

-- Package Body
CREATE OR REPLACE PACKAGE BODY CustomerManagement AS

  PROCEDURE AddCustomer(p_CustomerID NUMBER, p_Name VARCHAR2, p_DOB DATE) IS
  BEGIN
    INSERT INTO Customer (CustomerID, Name, DOB)
    VALUES (p_CustomerID, p_Name, p_DOB);
  END AddCustomer;

  PROCEDURE UpdateCustomerDetails(p_CustomerID NUMBER, p_Name VARCHAR2, p_DOB DATE) IS
  BEGIN
    UPDATE Customer
    SET Name = p_Name,
        DOB = p_DOB
    WHERE CustomerID = p_CustomerID;
  END UpdateCustomerDetails;

  FUNCTION GetCustomerBalance(p_CustomerID NUMBER) RETURN NUMBER IS
    v_Balance NUMBER;
  BEGIN
    SELECT Balance INTO v_Balance
    FROM Customer
    WHERE CustomerID = p_CustomerID;
    
    RETURN v_Balance;
  EXCEPTION
    WHEN NO_DATA_FOUND THEN
      RETURN 0;
  END GetCustomerBalance;

END CustomerManagement;
/
