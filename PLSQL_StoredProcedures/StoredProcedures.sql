SET SERVEROUTPUT ON;
CREATE TABLE Customers (
    customer_id NUMBER PRIMARY KEY,
    customer_name VARCHAR2(50),
    balance NUMBER
);
INSERT INTO Customers VALUES
(
    101,
    'John',
    5000
);
INSERT INTO Customers VALUES
(
    102,
    'Alice',
    8000
);
CREATE OR REPLACE PROCEDURE update_balance (
    id IN NUMBER,
    amount IN NUMBER
)
IS
BEGIN
    UPDATE Customers
    SET balance = balance + amount
    WHERE customer_id = id;
    DBMS_OUTPUT.PUT_LINE(
        'Balance Updated Successfully'

    );
END;

/

BEGIN
    update_balance(
        101,
        2000
    );
END;
/
SELECT * FROM Customers;