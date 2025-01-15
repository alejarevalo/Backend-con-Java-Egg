CREATE DATABASE mi_bd; -- creación de bases de datos
CREATE DATABASE mi_bd_2;

DROP DATABASE mi_bd_2; -- eliminación de bases de datos (no recomendado)

USE mi_bd; -- Selecciona BD en donde se creará la tabla
-- Creación de de tabla con sus atributos.
CREATE TABLE empleados (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    edad INT,
    salario DECIMAL(10, 2),
    fecha_contratacion DATE
);





