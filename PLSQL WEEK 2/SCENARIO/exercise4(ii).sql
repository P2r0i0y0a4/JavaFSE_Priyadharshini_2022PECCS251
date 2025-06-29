CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    loanAmount IN NUMBER,
    annualInterestRate IN NUMBER,
    loanDurationYears IN NUMBER
)
RETURN NUMBER
IS
    monthlyRate NUMBER;
    totalMonths NUMBER;
    emi NUMBER;
BEGIN
    monthlyRate := annualInterestRate / 12 / 100;
    totalMonths := loanDurationYears * 12;

    IF monthlyRate = 0 THEN
        emi := loanAmount / totalMonths;
    ELSE
        emi := (loanAmount * monthlyRate * POWER(1 + monthlyRate, totalMonths)) /
               (POWER(1 + monthlyRate, totalMonths) - 1);
    END IF;

    RETURN ROUND(emi, 2);
END;
/
-SELECT CalculateMonthlyInstallment(500000, 7.5, 10) AS EMI FROM dual;
