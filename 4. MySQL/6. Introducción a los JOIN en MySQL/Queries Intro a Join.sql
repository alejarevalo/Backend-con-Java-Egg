SHOW databases;
USE mi_bd;

/*Encuentra el nombre y apellido de los empleados junto con la cantidad total de ventas que han realizado.*/
SELECT e.nombre, e.apellido, count(v.id) as cantidad_ventas
FROM empleados e 
JOIN ventas v
ON e.id = v.empleado_id
GROUP BY e.nombre, e.apellido;
-- Calcula el monto total vendido a cada cliente y muestra el nombre del cliente, su dirección y el monto total.
SELECT c.nombre, c.direccion, SUM(v.monto_total)
FROM clientes c
INNER JOIN ventas v
WHERE c.id = v.cliente_id -- poner on se puede pero suele usarse con más puntos de unión. 
GROUP BY c.nombre, c.direccion;
/*Encuentra los productos vendidos por cada empleado en el departamento de "Ventas" y muestra el nombre del empleado 
junto con el nombre de los productos que han vendido.*/
SELECT e.nombre, p.nombre
FROM empleados e
INNER JOIN productos p
INNER JOIN ventas v
INNER JOIN departamentos d
WHERE d.nombre = "ventas" AND d.id = e.departamento_id AND v.empleado_id = e.id AND v.producto_id = p.id;
-- Encuentra el nombre del cliente, el nombre del producto y la cantidad comprada de productos con un precio superior a $500.
SELECT c.nombre, p.nombre, sum(v.cantidad) 
FROM ventas v
INNER JOIN clientes c
INNER JOIN productos p
WHERE v.precio_unitario > 500 AND c.id = v.cliente_id AND v.producto_id = p.id
GROUP BY c.nombre, p.nombre;
-- Calcula la cantidad de ventas por departamento, incluso si el departamento no tiene ventas.
SELECT count(v.id) AS ventas_depto, d.nombre
FROM ventas v
INNER JOIN empleados e ON v.empleado_id = e.id  
LEFT JOIN departamentos d ON e.departamento_id = d.id
GROUP BY d.nombre;
-- PARTE 2---------------------------------------------------------------------------------------------------------------------------------------------------
-- Encuentra el nombre y la dirección de los clientes que han comprado más de 3 productos distintos y muestra la cantidad de productos comprados.
SELECT c.nombre, c.direccion, COUNT(v.producto_id) AS cantidad_productos
FROM clientes c
INNER JOIN ventas v
WHERE c.id = v.cliente_id
GROUP BY c.nombre, c.direccion
HAVING cantidad_productos > 3;
 
 -- Calcula el monto total de ventas realizadas por cada departamento y muestra el nombre del departamento junto con el monto total de ventas.
SELECT d.nombre, SUM(v.monto_total) as monto_totalisimo
FROM departamentos d
INNER JOIN empleados e ON d.id = e.departamento_id
INNER JOIN ventas v ON v.empleado_id = e.id
GROUP BY d.nombre;

 
 
