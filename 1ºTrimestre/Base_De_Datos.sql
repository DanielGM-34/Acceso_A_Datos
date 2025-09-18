CREATE DATABASE Ev0;
Use Ev0;
Create table usuario(
idUsuario VARCHAR(15) PRIMARY KEY,
nombre varchar(10),
email varchar(20),
fecha date
);

Create table canal (
idCanal varchar(15) PRIMARY KEY,
titulo varchar(20),
fechaInicio date,
idUsuario varchar(15),
constraint fk_key foreign key (idUsuario) REFERENCES usuario(idUsuario)
);

create table sigueCanal(
idUsuario varchar(15),
idCanal varchar(15),
constraint fk_key_Usuario foreign key (idUsuario) REFERENCES usuario(idUsuario),
constraint fk_key_Canal foreign key (idCanal) REFERENCES canal(idCanal)
);

create table retransmision(
idTransmision varchar(15) primary key,
titulo varchar(15),
fechaConHora datetime,
duracion float,
idCanal varchar(15),
constraint fk_key_Canal_Retransmision foreign key (idCanal) REFERENCES canal(idCanal)
);

ALTER TABLE usuario add Streamer boolean;
