SHOW DATABASES;
USE mi_bd;

-- Lista los nombres de los empleados sin duplicados
SELECT DISTINCT nombre FROM empleados;
-- Obtén una lista de correos electrónicos únicos de todos los empleados.
SELECT DISTINCT correo_electronico FROM empleados;
-- Muestra los nombres de los empleados que tienen un salario superior a $3200.
SELECT nombre, apellido, salario FROM empleados WHERE salario > 3200;
-- Encuentra todas las ventas donde la cantidad de productos vendidos sea mayor que 2.
SELECT id FROM ventas WHERE cantidad > 2;
-- Muestra las ventas donde el precio unitario sea igual a $480.00.
SELECT id, precio_unitario FROM ventas WHERE precio_unitario = 480;
-- Encuentra las ventas realizadas por el empleado con el ID 1.
SELECT id FROM ventas WHERE empleado_id = 1;
-- Lista los empleados que tienen 32 años de edad o trabajan en el Departamento 3.
SELECT nombre, apellido, edad FROM empleados WHERE edad = 32 OR departamento_id = 3;
-- Encuentra las ventas realizadas por el empleado con el ID 1 y donde el monto total sea mayor que $2000.00.
SELECT id, empleado_id, monto_total FROM ventas WHERE empleado_id = 1 AND monto_total > 2000.00;
-- Encuentra a los empleados cuyas edades están entre 29 y 33 años. Muestra el nombre y la edad de los registros que cumplan esa condición. 
SELECT nombre, apellido, edad FROM empleados WHERE edad BETWEEN 29 AND 33;
-- Muestra las ventas donde el precio unitario esté entre $300.00 y $500.00.
SELECT id, precio_unitario FROM ventas WHERE precio_unitario BETWEEN 300 AND 500;

SELECT * FROM empleados;

