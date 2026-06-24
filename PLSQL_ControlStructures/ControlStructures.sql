DECLARE

    customer_id NUMBER := 101;
    customer_age NUMBER := 65;

    loan_interest NUMBER := 8.5;


BEGIN


    DBMS_OUTPUT.PUT_LINE(
        'Customer ID: ' || customer_id
    );


    DBMS_OUTPUT.PUT_LINE(
        'Current Interest Rate: '
        || loan_interest || '%'
    );


    IF customer_age >= 60 THEN


        loan_interest :=
        loan_interest - 1;


        DBMS_OUTPUT.PUT_LINE(
            'Senior Citizen Discount Applied'
        );


    ELSE


        DBMS_OUTPUT.PUT_LINE(
            'No Discount Available'
        );


    END IF;


    DBMS_OUTPUT.PUT_LINE(
        'Final Interest Rate: '
        || loan_interest || '%'
    );


END;
/