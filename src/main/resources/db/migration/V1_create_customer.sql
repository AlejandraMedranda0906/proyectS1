CREATE TABLE IF NOT EXISTS client(

    id SERIAL,
    full_name  VARCHAR(20) NOT NULL,
    adress VARCHAR(100) NOT NULL,
    phone VARCHAR(15) NOT NULL,
    email VARCHAR(100),
    description VARCHAR(255), --síntomas
    PRIMARY KEY(id)
    );

CREATE TABLE IF NOT EXISTS professional (
      id SERIAL,
      full_name VARCHAR(100) NOT NULL,
      especialidad VARCHAR(100),
      email VARCHAR(100) UNIQUE
      PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS attention(
    id SERIAL PRIMARY KEY,
    client_id INT NOT NULL,
    Professional_id INT NOT NULL,
    fecha DATE NOT NULL,
    descripcion TEXT,
    FOREIGN KEY (client_id) REFERENCES Client(id),
    FOREIGN KEY (Professional_id) REFERENCES Professional(id)
    );




