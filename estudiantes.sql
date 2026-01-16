CREATE DATABASE SIMULACRO;
use SIMULACRO;
CREATE TABLE ciudad (
 id_ciudad INT AUTO_INCREMENT PRIMARY KEY,
 direccion VARCHAR(50) NOT NULL,
 codigo_postal INT,
 calle varchar(50),
 numero int
 );

CREATE TABLE estudiante (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    notaMedia float,
    ciudad_id int,
    FOREIGN KEY (ciudad_id) REFERENCES ciudad(id_ciudad)
);

CREATE TABLE puntuaciones (
id_puntuaciones INT AUTO_INCREMENT PRIMARY KEY,
puntuacion float,
tipo ENUM('EXAM','QUIZ','HOMEWORK'),
id_estudiante int,
FOREIGN KEY (id_estudiante) REFERENCES estudiante(id)
);

DROP DATABASE SIMULACRO;











create database ejercicioGpt;
CREATE DATABASE ejercicioGpt;
use ejercicioGpt;
CREATE TABLE Proyecto (
    idProyecto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    descripcion TEXT,
    fechaInicio DATE,
    fechaFin DATE
);

CREATE TABLE Desarrollador (
    idDesarrollador INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    email VARCHAR(100),
    especialidad ENUM('BACKEND','FRONTEND','MOBILE','DBA')
);

CREATE TABLE Tarea (
    idTarea INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100),
    estado ENUM('PENDIENTE','EN_PROGRESO','COMPLETADA'),
    horasEstimadas FLOAT,
    idProyecto INT,
    idDesarrollador INT,
    FOREIGN KEY (idProyecto) REFERENCES Proyecto(idProyecto),
    FOREIGN KEY (idDesarrollador) REFERENCES Desarrollador(idDesarrollador)
);
 
INSERT INTO Proyecto (nombre, descripcion, fechaInicio, fechaFin)
VALUES ('App Gestión DAM', 'Aplicación para gestionar proyectos DAM', '2025-01-01', '2025-06-30');

INSERT INTO Desarrollador (nombre, email, especialidad)
VALUES ('Ana López', 'ana@dam.com', 'BACKEND'),
       ('Carlos Ruiz', 'carlos@dam.com', 'FRONTEND');

INSERT INTO Tarea (titulo, estado, horasEstimadas, idProyecto, idDesarrollador)
VALUES ('Diseñar BD', 'COMPLETADA', 20, 1, 1),
       ('Crear interfaz', 'EN_PROGRESO', 15, 1, 2);
       
       SELECT 
    T.idTarea,
    T.titulo,
    T.estado,
    P.nombre AS Proyecto,
    D.nombre AS Desarrollador,
    D.especialidad
FROM Tarea T
JOIN Proyecto P ON T.idProyecto = P.idProyecto
JOIN Desarrollador D ON T.idDesarrollador = D.idDesarrollador;

SELECT 
    P.nombre AS Proyecto,
    T.titulo AS Tarea,
    T.estado
FROM Proyecto P
LEFT JOIN Tarea T ON P.idProyecto = T.idProyecto;


SELECT 
    D.nombre AS Desarrollador,
    SUM(T.horasEstimadas) AS TotalHoras
FROM Tarea T
JOIN Desarrollador D ON T.idDesarrollador = D.idDesarrollador
GROUP BY D.nombre;

SELECT 
    estado,
    COUNT(*) AS NumeroTareas
FROM Tarea
GROUP BY estado;


SELECT 
    P.nombre AS Proyecto,
    COUNT(T.idTarea) AS NumeroTareas,
    SUM(T.horasEstimadas) AS HorasTotales
FROM Proyecto P
JOIN Tarea T ON P.idProyecto = T.idProyecto
GROUP BY P.nombre;
