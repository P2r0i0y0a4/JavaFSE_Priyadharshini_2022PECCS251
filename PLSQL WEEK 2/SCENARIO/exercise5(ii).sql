CREATE TABLE AuditLog (
    LogID NUMBER PRIMARY KEY,
    TransactionID NUMBER,
    ActionDate DATE,
    ActionType VARCHAR2(20)
);

CREATE SEQUENCE AuditLog_Seq START WITH 1 INCREMENT BY 1;

CREATE OR REPLACE TRIGGER AuditLog_BI
BEFORE INSERT ON AuditLog
FOR EACH ROW
DECLARE
    next_id NUMBER;
BEGIN
    SELECT AuditLog_Seq.NEXTVAL INTO next_id FROM dual;
    :NEW.LogID := next_id;
END;
/

INSERT INTO AuditLog (TransactionID, ActionDate, ActionType)
VALUES (101, SYSDATE, 'INSERT');

INSERT INTO AuditLog (TransactionID, ActionDate, ActionType)
VALUES (102, SYSDATE, 'INSERT');

COMMIT;

SELECT * FROM AuditLog;
