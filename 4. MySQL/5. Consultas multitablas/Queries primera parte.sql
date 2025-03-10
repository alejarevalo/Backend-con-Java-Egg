SHOW DATABASES;
USE mi_bd;

/*Une las tablas de empleados con departamentos y solo muestra las columnas nombre, apellido, edad, 
salario de empleados y la columna nombre de departamentos.*/
SELECT e.nombre, e.apellido, e.edad, e.salario, d.nombre 
FROM empleados e, departamentos d 
WHERE e.departamento_id = d.id;

-- Une las tablas ventas con la tabla empleados donde se muestren todas las columnas de ventas 
-- exceptuando la columna empleado_id y en su lugar muestres el nombre y apellido de la tabla empleados.

select concat(e.nombre, ' ', e.apellido) as 'empleado', v.id, v.producto_id, v.cliente_id, v.cantidad, v.precio_unitario, v.monto_total 
from ventas v, empleados e 
where v.empleado_id = e.id;

/*Une las tablas ventas con la tabla productos donde se muestren todas las columnas de ventas 
exceptuando la columna producto_id y en su lugar muestres la columna nombre de la tabla productos.*/

select v.id, p.nombre, v.cliente_id, v.cantidad, v.precio_unitario, v.monto_total 
from ventas v, productos p 
where v.producto_id = p.id;

/*Une las tablas ventas con la tabla clientes donde se muestren todas las columnas de 
ventas exceptuando la columna cliente_id y en su lugar muestres la columna nombre de la tabla clientes.*/
select v.id, v.producto_id, c.nombre, v.cantidad, v.precio_unitario, v.monto_total, v.empleado_id
from clientes c, ventas v
where v.cliente_id = c.id;

/*Une las tablas ventas con la tablas empleados y departamentos donde se muestren todas las columnas
de ventas exceptuando la columna empleado_id y en su lugar muestres el nombre y apellido de la tabla 
empleados y además muestres la columna nombre de la tabla departamentos.*/

SELECT v.id, v.producto_id, v.cliente_id, v.cantidad, v.precio_unitario, v.monto_total, concat(e.nombre, ' ', e.apellido), d.nombre  
FROM ventas v, empleados e, departamentos d
WHERE v.empleado_id = e.id AND e.departamento_id = d.id;

/*Une las tablas ventas, empleados, productos y clientes donde se muestren las 
columnas de la tabla ventas reemplazando sus columnas de FOREIGN KEYs con las
 respectivas columnas de “nombre” de las otras tablas.*/

SELECT v.id, p.nombre AS nombre_producto, c.nombre AS nombre_cliente, v.cantidad, v.precio_unitario, v.monto_total, e.nombre AS nombre_empleado
FROM ventas v, empleados e, productos p, clientes c
WHERE v.producto_id = p.id AND v.empleado_id = e.id AND v.cliente_id = c.id;

/*Calcular el salario máximo de los empleados en cada departamento y mostrar el nombre del 
departamento junto con el salario máximo.*/

SELECT d.nombre, max(e.salario) FROM departamentos d, empleados e
WHERE d.id = e.departamento_id GROUP BY d.id; -- voy a sacar el salario máximo según el departamento

