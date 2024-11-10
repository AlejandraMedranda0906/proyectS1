CREATE TABLE IF NOT EXISTS client(

    id SERIAL,
    full_name  VARCHAR(20) NOT NULL,
    adress VARCHAR(100) NOT NULL,
    phone VARCHAR(15) NOT NULL,
    email VARCHAR(100),
    description VARCHAR(255), --síntomas
    PRIMARY KEY(id)
    );

CREATE TABLE IF NOT EXISTS Professional (
      id SERIAL,
      full_name VARCHAR(100) NOT NULL,
      especialidad VARCHAR(100),
      email VARCHAR(100) UNIQUE
      PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS Attention(
    id SERIAL PRIMARY KEY,
    client_id INT NOT NULL,
    Professional_id INT NOT NULL,
    fecha DATE NOT NULL,
    descripcion TEXT,
    FOREIGN KEY (client_id) REFERENCES Client(id),
    FOREIGN KEY (Professional_id) REFERENCES Professional(id)
    );







CREATE TABLE IF NOT EXISTS Atencion (

    id SERIAL PRIMARY KEY,

    cliente_id INT NOT NULL,
    profesional_id INT NOT NULL,
    phone VARCHAR NOT NULL,
    descripcion TEXT, -- Descripción del tipo de ayuda o consulta
    FOREIGN KEY (cliente_id) REFERENCES Cliente(id),
    FOREIGN KEY (profesional_id) REFERENCES Profesional(id)
    );



