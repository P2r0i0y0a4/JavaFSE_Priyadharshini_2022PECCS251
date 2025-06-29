CREATE OR REPLACE FUNCTION CalculateAge(dob DATE)
RETURN NUMBER IS
    age NUMBER;
BEGIN
    age := FLOOR(MONTHS_BETWEEN(SYSDATE, dob) / 12);
    RETURN age;
END;
/

-- SELECT CalculateAge(DATE '2000-05-10') AS Age FROM dual;
