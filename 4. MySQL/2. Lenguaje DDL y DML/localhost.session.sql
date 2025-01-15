SHOW DATABASES;
USE mi_bd;

SHOW TABLES;
-- Modifica la columna "edad" para que no pueda tener valores nulos.
ALTER TABLE empleados MODIFY edad INT NOT NULL;
-- Modifica la columna "salario" para que tenga un valor predeterminado de 0 en lugar de nulo.
ALTER TABLE empleados MODIFY salario INT DEFAULT 0;
-- Agrega una columna llamada "departamento" de tipo VARCHAR(50) para almacenar 
-- el departamento al que pertenece cada empleado.
ALTER TABLE empleados ADD departamento VARCHAR(50);
/* Agrega una columna llamada "correo_electronico" de tipo VARCHAR(100) para 
almacenar las direcciones de correo electrónico de los empleados.*/
ALTER TABLE empleados ADD correo_electronico VARCHAR(100);
-- Elimina la columna "fecha_contratacion" de la tabla "empleados".
ALTER TABLE empleados DROP fecha_contratacion;

/* Vuelve a crear la columna "fecha_contratacion" de la tabla "empleados" pero con un 
valor por default que sea la fecha actual. Para eso puedes usar las funciones “CURRENT_DATE”
o “NOW()”.*/
AlTER TABLE empleados ADD fecha_contratacion DATE DEFAULT (CURRENT_DATE);
/*
Crea una nueva tabla llamada "departamentos" con las siguientes columnas:
    id (clave primaria, tipo INT AUTO_INCREMENT)
    nombre (tipo VARCHAR(50))
*/
CREATE TABLE IF NOT EXISTS departamentos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);
SELECT * FROM departamentos;
/* Agrega una nueva columna llamada "departamento_id" en la tabla "empleados" 
que servirá como clave foránea para hacer referencia al departamento al que 
pertenece cada empleado. */
ALTER TABLE empleados ADD COLUMN departamento_id INT;


/*Modifica la tabla “empleados” y establece una restricción de clave foránea en
la columna "departamento_id" para que haga referencia a la columna "id" en
la tabla "departamentos".*/
ALTER TABLE empleados 
ADD FOREIGN KEY (departamento_id)
REFERENCES departamentos (id);

/*Elimina el campo “departamentos” de la tabla empleados, ahora usaremos la 
clave foránea para poder relacionar ambas tablas*/
ALTER TABLE empleados DROP COLUMN departamento;
SELECT * FROM empleados;