SHOW databases;
USE mi_bd;

-- Utiliza TABLE para consultar la tabla productos de manera simple, ordenando los productos de forma descendente por precio y solo 10 filas.
TABLE productos ORDER BY precio DESC 
LIMIT 10;
-- Crea una tabla temporal de los empleados donde unifiques su nombre y apellido en una sola columna.
DROP TEMPORARY TABLE IF EXISTS nombres_empleados;
CREATE TEMPORARY TABLE nombres_empleados AS
SELECT CONCAT(nombre, ' ', apellido) as 'nombre_completo' FROM empleados;
SELECT * FROM nombres_empleados;
-- Crea una tabla temporal de la tabla clientes donde solo tengas la columna nombre.
DROP TEMPORARY TABLE IF EXISTS nombres_clientes;
CREATE TEMPORARY TABLE nombres_clientes AS
SELECT nombre FROM clientes;
SELECT * FROM nombres_clientes;
-- Realiza la unión entre las tablas temporales de empleados y clientes usando TABLE.
TABLE nombres_empleados UNION TABLE nombres_clientes;
/*Crea una tabla temporal escuela primaria que tenga las siguientes columnas: id(int), nombre(varchar), apellido(varchar), edad(int) 
y grado(int). Y que tenga los siguientes valores: [...]*/
DROP TEMPORARY TABLE IF EXISTS temporal_primaria;
CREATE TEMPORARY TABLE temporal_primaria(
	id INT,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    edad INT, 
    grado INT
    );
INSERT INTO temporal_primaria (id, nombre, apellido, edad, grado)
VALUES
(1, 'Alejandro', 'González', 11, 5),
(2, 'Isabella', 'López', 10, 4),
(3, 'Lucas', 'Martínez', 11, 5),
(4, 'Sofía', 'Rodríguez', 10, 4),
(5, 'Mateo', 'Pérez', 12, 6),
(6, 'Valentina', 'Fernández', 12, 6),
(7, 'Diego', 'Torres', 10, 4),
(8, 'Martina', 'Gómez', 11, 5),
(9, 'Joaquín', 'Hernández', 10, 4),
(10, 'Valeria', 'Díaz', 11, 5);
TABLE temporal_primaria;

-- Agrega un cliente nuevo con el nombre “Ana Rodríguez” y con dirección en “San Martín 2515, Mar del Plata”. 
-- Luego realiza la intersección entre la tabla temporal de empleados y clientes.
INSERT INTO clientes (nombre, direccion)
VALUES ('Ana Rodríguez', 'San Martín 2515, Mar del Plata');
TABLE nombres_empleados INTERSECT TABLE nombres_clientes;
-- or --
SELECT nombre_completo FROM nombres_empleados INTERSECT SELECT nombre FROM nombres_clientes;

