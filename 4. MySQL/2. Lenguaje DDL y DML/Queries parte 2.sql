SHOW DATABASES;
USE mi_bd;
SHOW TABLES;
SELECT * FROM departamentos;
SELECT * FROM empleados;
--  Inserta un departamento llamado "Ventas" en la tabla "departamentos". (ID:1)
INSERT INTO departamentos (nombre) VALUES ('ventas');
-- Inserta un departamento llamado "Recursos Humanos" en la tabla "departamentos". (ID:2)
INSERT INTO departamentos (nombre) VALUES ('Recursos Humanos');

-- Inserción de empleados
INSERT INTO empleados (nombre, apellido, edad, salario, correo_electronico, departamento_id)
VALUES ('Ana', 'Rodríguez', 28, 3000.00, 'anarodriguez@mail.com', 1);
INSERT INTO empleados (nombre, apellido, edad, salario, correo_electronico, departamento_id)
VALUES ('Carlos', 'López', 32, 3200.50, 'carloslopez@mail.com', 2);
INSERT INTO empleados (nombre, apellido, edad, salario, correo_electronico, departamento_id)
VALUES ('Laura', 'Pérez', 26, 2800.75, 'lauraperez@mail.com', 1);
INSERT INTO empleados (nombre, apellido, edad, salario, correo_electronico, departamento_id)
VALUES ('Martín', 'González', 30, 3100.25, 'martingonzalez@mail.com', 2);
-- Actualiza el salario del empleado con nombre "Ana" para aumentarlo en un 10%.
UPDATE empleados SET salario = salario*1.10 WHERE nombre = 'Ana' AND apellido = 'Rodríguez'; 
-- Crea un departamento llamado “Contabilidad”. 
INSERT INTO departamentos (nombre) VALUES ('Contabilidad');
-- Cambia el departamento del empleado con nombre "Carlos" de "Recursos Humanos" a "Contabilidad":
UPDATE empleados SET departamento_id = 3 WHERE nombre = 'Carlos';
-- Elimina al empleado con nombre "Laura"
DELETE FROM empleados WHERE nombre = 'Laura';

