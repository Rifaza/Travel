"# Travel" 

Swager API url
http://localhost:8086/swagger-ui/index.html#/

Create Table
CREATE TABLE travel_agent (
    id_travel_agent INTEGER PRIMARY KEY NOT NULL,
    registration_type_id INT NOT NULL,
    br_number CHAR(50), -- Specify the length for CHAR data type
    agency_name CHAR(250), -- Fixed typo from "agentcy_name"
    address CHAR(250) NOT NULL,
    code CHAR(100),
    contact_number CHAR(10) NOT NULL,
    credit_limit DOUBLE PRECISION NOT NULL, -- Corrected "double" to "DOUBLE PRECISION"
    commission_percentage DOUBLE PRECISION NOT NULL, -- Corrected "double" to "DOUBLE PRECISION"
    introducer_code CHAR(20),
    main_commission_code CHAR(20), -- Fixed typo from "main_commision_code"
    created_date DATE NOT NULL,
    created_by CHAR(50)
);

CREATE TABLE registration_type (
    id_registration_type INTEGER PRIMARY KEY NOT NULL,
     registration_type CHAR(200) NOT NULL

);
