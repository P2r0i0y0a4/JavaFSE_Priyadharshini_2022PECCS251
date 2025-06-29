CREATE OR REPLACE PACKAGE EmployeeManagement AS
  PROCEDURE HireEmployee(p_EmployeeID NUMBER, p_Name VARCHAR2, p_MonthlySalary NUMBER);
  PROCEDURE UpdateEmployeeDetails(p_EmployeeID NUMBER, p_Name VARCHAR2, p_MonthlySalary NUMBER);
  FUNCTION CalculateAnnualSalary(p_EmployeeID NUMBER) RETURN NUMBER;
END EmployeeManagement;
/

CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS

  PROCEDURE HireEmployee(p_EmployeeID NUMBER, p_Name VARCHAR2, p_MonthlySalary NUMBER) IS
  BEGIN
    INSERT INTO Employee (EmployeeID, Name, MonthlySalary)
    VALUES (p_EmployeeID, p_Name, p_MonthlySalary);
  END HireEmployee;

  PROCEDURE UpdateEmployeeDetails(p_EmployeeID NUMBER, p_Name VARCHAR2, p_MonthlySalary NUMBER) IS
  BEGIN
    UPDATE Employee
    SET Name = p_Name,
        MonthlySalary = p_MonthlySalary
    WHERE EmployeeID = p_EmployeeID;
  END UpdateEmployeeDetails;

  FUNCTION CalculateAnnualSalary(p_EmployeeID NUMBER) RETURN NUMBER IS
    v_MonthlySalary NUMBER;
  BEGIN
    SELECT MonthlySalary INTO v_MonthlySalary
    FROM Employee
    WHERE EmployeeID = p_EmployeeID;

    RETURN v_MonthlySalary * 12;
  EXCEPTION
    WHEN NO_DATA_FOUND THEN
      RETURN 0;
  END CalculateAnnualSalary;

END EmployeeManagement;
/
