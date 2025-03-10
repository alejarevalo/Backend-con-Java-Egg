SHOW DATABASES;
USE mi_bd;
DROP TABLE estudiantes;
CREATE TABLE estudiantes (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    edad INT,
    promedio FLOAT    
);
INSERT INTO estudiantes (id, nombre, apellido, edad, promedio)
VALUES 
(1, 'Juan', 'Pérez', 22, 85.5),
(2, 'María', 'Gómez', 21, 90.0),
(3, 'Luis', 'Rodríguez', 20, 88.5),
(4, 'Ana', 'Martínez', 23, 92.0),
(5, 'Carlos', 'López', 22, 86.5);
/*Concatena el nombre y el apellido del estudiante con el nombre "María" y apellido "Gómez" con un espacio en el medio. */
SELECT CONCAT(' ', nombre, apellido) as 'nombre_completo' from estudiantes where nombre = 'María' AND apellid = 'Gómez';
/*Encuentra la posición de la primera 'e' en el apellido del estudiante con el nombre "Juan" y apellido "Pérez".*/
SELECT LOCATE('é', apellido) posicion_e
FROM estudiantes WHERE nombre = 'Juan' and apellido = 'Pérez';

TABLE estudiantes;

-- Convierte el nombre del estudiante con el nombre "Luis" y apellido "Rodríguez" a minúsculas. (LOWER)
SELECT LOWER(nombre) nombre_modificado 
FROM estudiantes
WHERE nombre = 'Luis' and apellido = 'Rodríguez';

-- Inserta la cadena ' García' en la posición 3 del nombre del estudiante con el nombre "Ana" y apellido "Martínez".
SELECT RIGHT(apellido, 3) letras 
FROM estudiantes
WHERE nombre = 'Ana' and apellido = 'Martínez';

SELECT LOCATE('ó', apellido) posicion_e
FROM estudiantes WHERE nombre = 'Carlos' and apellido = 'López';

SELECT LOCATE('a', nombre) posicion_e
FROM estudiantes WHERE nombre = 'María' and apellido = 'Gómez';

-- Reemplaza 'a' con 'X' en el nombre del estudiante con el nombre "Ana" y apellido "Martínez". 
SELECT REPLACE(nombre, 'a', 'X') reemplazo
FROM estudiantes
WHERE nombre = 'Ana' and apellido = 'Martínez';

/*Encuentra la subcadena de 3 caracteres de longitud de la columna 'nombre' del estudiante con el nombre "María" y 
apellido "Gómez", comenzando en la posición 2.*/

SELECT SUBSTRING(nombre, 2, 3) 
FROM estudiantes
WHERE nombre = 'María' and apellido = 'Gómez';

/*Combina los nombres de todos los estudiantes en una única cadena separada por guiones.*/
SELECT GROUP_CONCAT(nombre SEPARATOR ' - ') FROM estudiantes;

/*Combina los nombres de todos los estudiantes en una única cadena separada por guiones.*/
SELECT GROUP_CONCAT(CONCAT(nombre, ' ', apellido) SEPARATOR ' | ') FROM estudiantes;

/*Elimina los espacios en blanco iniciales del texto "    … usé muchos espacios    ".*/
SELECT LTRIM("    … usé muchos espacios    ");

/*Elimina los espacios en blanco finales del texto "    … usé muchos espacios    ".*/
SELECT RTRIM("    … usé muchos espacios    ");

SELECT QUOTE(LTRIM(" … usé muchos espacios ")) cita,
QUOTE(TRIM(TRAILING ' ' FROM ' … usé muchos espacios ')) cita2;

-- --------------------------------------------------------COMPLEMENTARIOS -------------------------------------------------

/*Repite el nombre y apellido del estudiante con el nombre "Juan" y apellido "Pérez" tres veces. */
SELECT REPEAT(CONCAT(nombre, ' ', apellido, ' '), 3) repetido
FROM estudiantes WHERE nombre = 'Juan' and apellido = 'Pérez';

-- Invierte el nombre del estudiante con el nombre "Ana" y apellido "Martínez". 
SELECT REVERSE(nombre)
FROM estudiantes
WHERE nombre = 'Ana' and apellido = 'Martínez';

/*Devuelve una cadena que contenga 8 caracteres de espacio usando la función SPACE y muéstrala con la función QUOTE.*/
SELECT QUOTE(SPACE(16));

/*Extrae una subcadena que contiene el nombre del estudiante con el nombre "María" y apellido "Gómez" antes de la segunda 
a utilizando SUBSTRING_INDEX.*/
SELECT SUBSTRING_INDEX(nombre, 'a', -2)
FROM estudiantes
WHERE nombre = 'María' and apellido = 'Gómez';

/*Combina las edades de todos los estudiantes en una única cadena separada por comas y orden descendente.*/
SELECT GROUP_CONCAT(edad ORDER BY edad DESC SEPARATOR ', ') FROM estudiantes;

/*Elimina las ‘a’ del nombre' del estudiante con el nombre "Ana" y apellido "Martínez" usando la función REPLACE. */
SELECT REPLACE(nombre, 'a', '') reemplazo
FROM estudiantes
WHERE nombre = 'Ana' and apellido = 'Martínez';

/*Rellena a la derecha el promedio del estudiante con el nombre "Luis" y apellido "Rodríguez" con asteriscos hasta 
una longitud total de 10 caracteres. */ 
SELECT RPAD(promedio, 10, '*') promedio_rellenado
FROM estudiantes
WHERE nombre = 'Luis' and apellido = 'Rodríguez';

/*Obtén el promedio del estudiante con nombre 'Carlos' y apellido 'López', formateado con dos decimales y utilizando 
la configuración regional 'es_AR'.*/ 
SELECT FORMAT(promedio, 2, 'es_AR') promedio_formateado
FROM estudiantes
WHERE nombre = 'Carlos' and apellido = 'López';

