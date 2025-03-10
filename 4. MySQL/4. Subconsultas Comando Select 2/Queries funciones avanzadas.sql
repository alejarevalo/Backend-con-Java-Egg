-- Encuentra el salario máximo de todos los empleados.
SELECT  MAX(salario) FROM empleados; 
-- Encuentra la cantidad máxima de productos vendidos en una sola venta.
SELECT MAX(cantidad) FROM ventas;
-- Encuentra la edad máxima de los empleados.
SELECT MAX(edad) FROM empleados;

-- Encuentra el salario mínimo de todos los empleados.
SELECT  MIN(salario) FROM empleados; 

-- Cuenta cuántos empleados hay en total.
SELECT  COUNT(id) as cantidad_empleados FROM empleados; 
-- Cuenta cuántas ventas se han realizado.
SELECT  COUNT(id) as cantidad_ventas FROM ventas; 
-- Cuenta cuántos productos tienen un precio superior a $500.
SELECT  COUNT(id) as cantidad_productos FROM productos WHERE precio > 500; 

-- Calcula la suma total de salarios de todos los empleados.
SELECT  SUM(salario) as total_salarios FROM empleados; 
-- Calcula la suma total de montos vendidos en todas las ventas.
SELECT  SUM(monto_total) as total_montos FROM ventas; 

-- Calcula el salario promedio de todos los empleados.
SELECT  AVG(salario) as promedio_salarios FROM empleados;
-- Calcula la edad promedio de los empleados.
SELECT  AVG(edad) as prom_edad FROM empleados; 

------------------------- GROUP BY ------------------------------

-- Agrupa las ventas por empleado y muestra la cantidad total de ventas realizadas por cada empleado.
SELECT empleado_id, COUNT(*)
FROM ventas
GROUP BY empleado_id;
-- Agrupa los productos por precio y muestra la cantidad de productos con el mismo precio.
SELECT precio, count(*)
FROM productos
GROUP BY precio; -- (con el mismo precio, de eso se trata el agrupamiento)
-- Agrupa los empleados por departamento y muestra la cantidad de empleados en cada departamento.
SELECT departamento_id, COUNT(*)
FROM empleados
group by departamento_id;

-- -------HAVING---------

-- Encuentra los departamentos con un salario promedio de sus empleados superior a $3,000.
SELECT departamento_id, AVG(salario) as 'salario_promedio'
FROM empleados
GROUP BY departamento_id
HAVING salario_promedio > 3000;
-- Encuentra los productos que se han vendido al menos 5 veces.
SELECT producto_id, COUNT(*) as 'ventas_producto'
FROM ventas
GROUP BY producto_id
HAVING COUNT(*) >= 5;
-- Selecciona los empleados que tengan una “o” en su nombre o apellido y agrúpalos por departamento 
-- y muestra los que tengan el salario máximo.
SELECT departamento_id, MAX(salario)
FROM empleados
WHERE LOWER(nombre) LIKE '%o%' OR LOWER(apellido) LIKE '%o%'
GROUP BY departamento_id
HAVING MAX(salario) = MAX(salario);