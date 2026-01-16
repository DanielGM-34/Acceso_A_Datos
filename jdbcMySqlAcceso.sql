ALTER USER 'root'@'localhost' IDENTIFIED BY 'accesoDatos1234';
FLUSH PRIVILEGES;

 
CREATE DATABASE jdbcMySqlAcceso;

CREATE TABLE jdbcMySqlAcceso.GarciaDanielJugador (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100)  NOT NULL,
    nick VARCHAR(100) NOT NULL,
    puntosTotales INT DEFAULT 0 
);

CREATE TABLE jdbcMySqlAcceso.GarciaDanielPartida (
    id INT AUTO_INCREMENT PRIMARY KEY, 
    torneo_id INT,
    narrador_id INT,
    fecha DATE NOT NULL,
    resultado ENUM('TODOS', 'NADIE', 'ALGUNOS', 'POCOS') NOT NULL,
    FOREIGN KEY (narrador_id) REFERENCES GarciaDanielJugador(id)
);

use jdbcMySqlAcceso;

