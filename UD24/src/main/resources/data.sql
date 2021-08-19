
DROP table IF EXISTS empleados;

create table empleados(
	id int auto_increment,
	nombre varchar(250),
	apellido varchar(250),
	puesto varchar(250),
	salario integer
);

insert into empleados (nombre,apellido,puesto,salario)values('Jose','Marin','programador',1500);
insert into empleados (nombre,apellido,puesto,salario)values('Juan','Lopez','panadero',900);
insert into empleados (nombre,apellido,puesto,salario)values('Pedro','Guillem','charcutero',800);
insert into empleados (nombre,apellido,puesto,salario)values('Jordi','Martin','pescador',750);
insert into empleados (nombre,apellido,puesto,salario)values('Jonatan','Vicente','policia',2000);