/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  user
 * Created: 8 nov. 2022
 */

create database dbmatriculaapp
go
use dbmatriculaapp
go
create table estudiante(
    codigo varchar(30) not null primary key,
    nombre varchar(30) not null,
    apellido varchar(30) not null,
    dni varchar(30) unique not null,
    correo varchar(30) not null,
    celular varchar(20) not null,
    estado int not null
)
go;

select * from estudiante;

create table seccion(
    id_seccion INT AUTO_INCREMENT not NULL  primary key,
    nombre varchar(30) not null,
    turno varchar(30) not null,
    descripcion varchar(30) not null,
    estado int not null
)
go
select * from seccion
create table cursos(
    id_curso int AUTO_INCREMENT not null primary key,
    nombre varchar(30) not null,
    descripcion varchar(30) not null,
    estado int not null,
    id_profesor int not null
)
go
ALTER TABLE cursos ADD CONSTRAINT fk_cursos_profesor FOREIGN KEY (id_profesor) REFERENCES profesor(id_profesor);
select * from cursoscursoscursos

create table profesor(
    id_profesor int AUTO_INCREMENT not null primary key,
    nombre varchar(30) not null,
    apellido varchar(30) not null,
    dni varchar(30) unique not null,
    correo varchar(30) not null,
    celular varchar(20) not null,
    estado int not null
)
go
select * from profesor


create table matricula(
    id_matricula int AUTO_INCREMENT not null primary key,
    credito int not null,
    codigo varchar(30) not null,
    id_seccion int not null,
    id_curso int not null,
    id_profesor int not null,
    aprobado int not null
)
go

ALTER TABLE matricula ADD CONSTRAINT fk_matricula_estudiante FOREIGN KEY (codigo) REFERENCES estudiante(codigo);
ALTER TABLE matricula ADD CONSTRAINT fk_matricula_seccion FOREIGN KEY (id_seccion) REFERENCES seccion(id_seccion);
ALTER TABLE matricula ADD CONSTRAINT fk_matricula_cursos FOREIGN KEY (id_curso) REFERENCES cursos(id_curso);
ALTER TABLE matricula ADD CONSTRAINT fk_matricula_profesor FOREIGN KEY (id_profesor) REFERENCES profesor(id_profesor);







