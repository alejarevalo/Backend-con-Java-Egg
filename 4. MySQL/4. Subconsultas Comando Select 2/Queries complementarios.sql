SHOW databases;
USE mi_bd;
-- IN: Trae a los clientes que no tengan los IDs 2, 4 o 6.
SELECT * FROM clientes 
WHERE id NOT IN (2, 4, 6);
-- LIKE
-- Busca los empleados cuyos correos electrónicos terminan en "mail.com".
SELECT * FROM empleados
WHERE correo_electronico LIKE '%mail.com';
-- Encuentra los productos cuyos nombres tengan exactamente 6 caracteres.
SELECT * FROM productos
WHERE nombre LIKE '______';
-- Busca los clientes cuyos nombres tengan una "a" en la tercera posición 
SELECT * FROM clientes 
WHERE nombre LIKE '__a%';
-- ORDER BY
-- Ordena los empleados por fecha_contratación de manera descendente.
SELECT nombre, apellido, fecha_contratacion
FROM empleados
ORDER BY fecha_contratacion DESC;

-- MAX Encuentra el monto total máximo de una venta
SELECT MAX(monto_total)
FROM ventas
LIMIT 1;
-- COUNT Cuenta cuántas ventas fueron realizadas por el empleado con el id 9 .
SELECT COUNT(id)
FROM ventas
WHERE empleado_id = 9;
-- SUM Calcula la suma de salarios de empleados en el Departamento 1.
SELECT sum(salario)
FROM empleados
WHERE departamento_id = 1;
-- AVG Calcula el precio promedio de productos con un precio superior a $200.
SELECT AVG(precio)
FROM productos
WHERE precio > 200;

-- GROUP BY
-- Encuentra el salario máximo por departamento.
SELECT departamento_id, max(salario)
FROM empleados
GROUP BY departamento_id;
-- Encuentra la cantidad total de productos vendidos por empleado.
SELECT  empleado_id, COUNT(id) AS productos_vendidos
FROM ventas
GROUP BY empleado_id;

-- HAVING
-- Encuentra los departamentos con al menos 2 empleados con una edad menor de 30 años.
SELECT departamento_id, COUNT(id) AS cantidad_empleados
FROM empleados
WHERE edad < 30
GROUP BY departamento_id
HAVING cantidad_empleados >= 2;
-- Muestra los clientes que han gastado más de $2,000 en total en compras.
SELECT cliente_id, SUM(monto_total) AS gasto_total FROM ventas
GROUP BY cliente_id
HAVING gasto_total > 2000;

-- ----- AS -----------------
/*Crea una consulta que muestre la edad de los empleados junto con la edad aumentada en 5 años
y que esta nueva columna se llame “Edad en 5 años”.*/
SELECT nombre, edad, edad+5 AS 'Edad en 5 años'
FROM empleados;
-- Muestra el monto total de ventas junto con el monto total aumentado en un 21%  y que esta 
-- nueva columna se llame “Precio + IVA”.
SELECT SUM(monto_total) AS Monto_Total, SUM(monto_total) * 1.21 AS 'Precio + IVA'
FROM ventas;

-- LIMIT
-- Muestra los 3 productos más vendidos.
SELECT producto_id, count(id) as 'cantidad_vendida'
FROM ventas
GROUP BY producto_id
ORDER BY cantidad_vendida DESC
LIMIT 3;

-- CASE
/*Crea una consulta que muestre el ID del producto y los clasifique en categorías según la cantidad total de ventas de cada 
producto en la tabla 'ventas'. Utilizando una instrucción 'CASE', establece las siguientes categorías: 
	Si la suma de la cantidad de ventas (SUM(cantidad)) es mayor o igual a 9, la categoría es 'Alto Volumen'. 
	Si la suma de la cantidad de ventas está entre 4 y 8 (inclusive), la categoría es 'Medio Volumen'.
	En otros casos, la categoría es 'Bajo Volumen'.
Recuerda agrupar por producto_id y mostrar el resultado en orden descendente por la suma de la cantidad de ventas.*/
SELECT producto_id, SUM(cantidad) AS total_ventas,
  CASE 
    WHEN SUM(cantidad) >= 9 THEN 'Alto Volumen'
    WHEN SUM(cantidad) BETWEEN 4 AND 8 THEN 'Medio Volumen'
    ELSE 'Bajo Volumen'
  END AS categoria
FROM ventas
GROUP BY producto_id
ORDER BY total_ventas DESC;
/*Crea una consulta que muestre el nombre de los clientes y los categorice como "Dirección larga" si la longitud de su 
dirección es mayor o igual a 30 caracteres, "Dirección mediana" si es mayor o igual a 20 y menor que 30 caracteres, y 
"Dirección corta" en otros casos.*/
SELECT  nombre, direccion,
  CASE 
    WHEN LENGTH(direccion) >= 30 THEN 'Dirección larga'
    WHEN LENGTH(direccion) >= 20 AND LENGTH(direccion) < 30 THEN 'Dirección mediana'
    ELSE 'Dirección corta'
  END AS Categoria_Direccion
FROM clientes;
/*Crea una consulta que muestre el nombre de los productos y los categorice de la siguiente manera:
	- Si el nombre del producto está en la lista ('Laptop', 'Reloj de Pulsera Inteligente', 'Reproductor de Blu-ray', 
	'Auriculares Bluetooth', 'Smart TV 55 Pulgadas', 'Cámara Digital', 'Impresora', 'Tablet', 'Teléfono móvil') y 
	el precio es mayor o igual a 1000, la categoría es 'Tecnología cara'.
	- Si el nombre del producto está en la lista anterior y el precio está entre 500 y 999 (inclusive), la categoría 
	es 'Tecnología gama media'.
	- Si el nombre del producto está en la lista anterior y el precio es menor a 500, la categoría es 'Tecnología 
	barata'.
	- Si el precio es mayor o igual a 1000 y el nombre del producto no está en la lista, la categoría es 'Caro'.
	- Si el precio está entre 500 y 999 (inclusive) y el nombre del producto no está en la lista, la categoría 
	es 'Medio'.
	- Si el precio es menor a 500 y el nombre del producto no está en la lista, la categoría es 'Barato'.*/
SELECT nombre, precio,
  CASE 
    WHEN nombre IN ('Laptop', 'Reloj de Pulsera Inteligente', 'Reproductor de Blu-ray', 
                    'Auriculares Bluetooth', 'Smart TV 55 Pulgadas', 'Cámara Digital', 
                    'Impresora', 'Tablet', 'Teléfono móvil') AND precio >= 1000 THEN 'Tecnología cara'
    WHEN nombre IN ('Laptop', 'Reloj de Pulsera Inteligente', 'Reproductor de Blu-ray', 
                    'Auriculares Bluetooth', 'Smart TV 55 Pulgadas', 'Cámara Digital', 
                    'Impresora', 'Tablet', 'Teléfono móvil') AND precio BETWEEN 500 AND 999 THEN 'Tecnología gama media'
    WHEN nombre IN ('Laptop', 'Reloj de Pulsera Inteligente', 'Reproductor de Blu-ray', 
                    'Auriculares Bluetooth', 'Smart TV 55 Pulgadas', 'Cámara Digital', 
                    'Impresora', 'Tablet', 'Teléfono móvil') AND precio < 500 THEN 'Tecnología barata'
    WHEN precio >= 1000 THEN 'Caro'
    WHEN precio BETWEEN 500 AND 999 THEN 'Medio'
    WHEN precio < 500 THEN 'Barato'
  END AS Categoria
FROM productos;

