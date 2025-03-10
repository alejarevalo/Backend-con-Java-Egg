SHOW DATABASES;
USE mi_bd;

-- Encuentra los empleados cuyos IDs son 1, 3 o 5.
SELECT * FROM empleados WHERE id IN(1, 3, 5);
--  Busca los productos con IDs 2, 4 o 6 en la tabla de productos.
SELECT * FROM productos WHERE id IN(2, 4, 6);
-- Encuentra los empleados cuyos nombres comienzan con "L".
SELECT * FROM empleados WHERE LOWER(nombre) LIKE 'l%';
-- Busca los productos cuyos nombres contengan la palabra "Teléfono".
SELECT * FROM productos WHERE nombre LIKE '%Teléfono%';
-- Encuentra los clientes cuyas direcciones contienen la palabra "Calle".
SELECT * FROM clientes WHERE LOWER(direccion) LIKE '%calle%';

-- Ordena los empleados por salario de manera ascendente.
SELECT * FROM empleados WHERE salario ORDER BY salario ASC;
-- Ordena los productos por nombre de manera descendente.
SELECT * FROM productos ORDER BY nombre DESC;
-- Ordena las ventas por cantidad de manera ascendente y luego por precio_unitario de manera descendente. ¡INTERESANTE!
SELECT * FROM ventas ORDER BY cantidad ASC, precio_unitario DESC;

-- Muestra los 5 productos más caros de la tabla "productos".
SELECT * FROM productos ORDER BY precio DESC LIMIT 5;
-- Muestra los 10 primeros empleados en orden alfabético por apellido.
SELECT apellido, nombre FROM empleados ORDER BY apellido ASC LIMIT 10;
-- Muestra las 3 ventas con el monto total más alto.
SELECT * FROM ventas ORDER BY monto_total DESC LIMIT 3;

/*Crea una consulta que muestre el salario de los empleados junto con el salario aumentado en un 10% 
nombrando a la columna como “Aumento del 10%”.*/
SELECT nombre, apellido, salario, salario*1.1 as salario_aumentado FROM empleados;
/*Crea una consulta que calcule el monto total de las compras realizadas por cliente y que la columna 
se llame “Monto total gastado”.*/
SELECT cliente_id, sum(monto_total) as monto_total_gastado FROM ventas GROUP BY cliente_id;
/*Muestra los nombres completos de los empleados concatenando los campos "nombre" y "apellido" y que 
la columna se llame “Nombre y apellido”.*/
SELECT id, concat(nombre, ' ', apellido) as nombre_y_apellido FROM empleados; 

/*Crea una consulta que muestre el nombre de los productos y los categorice como "Caro" si el precio 
es mayor o igual a $500, "Medio" si es mayor o igual a $200 y menor que $500, y "Barato" en otros casos.*/
SELECT nombre, precio,
	CASE
		WHEN precio >= 500 THEN 'Caro'
        WHEN precio >= 200 THEN 'Medio'
        ELSE 'Barato'
	END AS 'Categoria'
FROM productos;   
/*Crea una consulta que muestre el nombre de los empleados y los categorice como "Joven" si tienen menos de 30 años, 
"Adulto" si tienen entre 30 y 40 años, y "Mayor" si tienen más de 40 años.*/
SELECT nombre, edad,
	CASE
		WHEN edad < 30 THEN 'Joven'
        WHEN edad between 30 AND 40 THEN 'Adulto'
        WHEN edad > 40 THEN 'Mayor'
	END AS 'Categoria'
FROM empleados 
ORDER BY edad ASC;   
/*Crea una consulta que muestre el ID de la venta y los categorice como "Poca cantidad" si la cantidad es 
menor que 3, "Cantidad moderada" si es igual o mayor que 3 y menor que 6, y "Mucha cantidad" en otros casos.*/
SELECT id, cantidad,
	CASE
		WHEN cantidad < 3 THEN 'Poca'
        WHEN cantidad between 3 AND 6 THEN 'Moderada'
        ELSE 'Mucha'
	END AS 'Categoria_cantidad'
FROM ventas;
/*Crea una consulta que muestre el nombre de los clientes y los categorice como "Comienza con A" si su nombre 
comienza con la letra 'A', "Comienza con M" si comienza con 'M' y "Otros" en otros casos.*/
SELECT nombre, 
	CASE
		WHEN LOWER(nombre) LIKE 'a%' THEN 'A'
        WHEN LOWER(nombre) LIKE 'm%' THEN 'M'
        ELSE 'Otros'
	END AS 'Empieza_por'
FROM clientes;
/*Crea una consulta que muestre el nombre de los empleados y los categorice como "Salario alto" si el salario es
 mayor o igual a $3500, "Salario medio" si es mayor o igual a $3000 y menor que $3500, y "Salario bajo" en otros casos.*/
 SELECT nombre, salario,
	CASE
		WHEN salario > 3500 THEN 'Alto'
        WHEN salario between 3000 AND 3500 THEN 'Medio'
        ELSE 'Bajo'
	END AS 'Categoria'
FROM empleados 
ORDER BY salario ASC;  

