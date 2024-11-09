CREATE TABLE IF NOT EXISTS client(

    id SERIAL,
    full_name  VARCHAR(20) NOT NULL,
    adress VARCHAR(100) NOT NULL,
    phone VARCHAR(15) NOT NULL,
    email VARCHAR(100),
    description VARCHAR(255), --síntomas
    PRIMARY KEY(id)
    );



