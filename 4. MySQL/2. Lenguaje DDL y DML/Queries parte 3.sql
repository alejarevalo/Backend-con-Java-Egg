
/*Crea una tabla llamada "clientes" con columnas para el "id" (entero autoincremental), 
"nombre" (cadena de hasta 50 caracteres), y "direccion" (cadena de hasta 100 caracteres).*/
CREATE TABLE clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    direccion VARCHAR(100)
);
/*Crea una tabla llamada "productos" con columnas para el "id" (entero autoincremental), 
"nombre" (cadena de hasta 50 caracteres), y "precio" (decimal con 10 dígitos, 2 decimales).*/
CREATE TABLE productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    precio DECIMAL(10, 2)
);
/*Crea una tabla llamada "ventas" con columnas para "id" (entero autoincremental), 
"producto_id" (entero), "cliente_id" (entero), "cantidad" (entero), “precio_unitario” 
(decimal con 10 dígitos, 2 decimales), "monto_total" (decimal con 10 dígitos, 2 decimales),
y "empleado_id" (entero).*/
CREATE TABLE ventas (
    id INT AUTO_INCREMENT,
    producto_id INT,
    cliente_id INT,
    cantidad INT,    
    precio_unitario DECIMAL(10, 2),
    monto_total DECIMAL(10, 2),
    empleado_id INT,
    PRIMARY KEY (id)
);
/*En la tabla creada Ventas, establece restricciones de clave foránea en las columnas 
"producto_id," "cliente_id," y "empleado_id" para hacer referencia a las tablas
 correspondientes. */
ALTER TABLE ventas 
ADD FOREIGN KEY (producto_id) 
REFERENCES productos(id);

ALTER TABLE ventas 
ADD FOREIGN KEY (cliente_id) 
REFERENCES clientes(id);

ALTER TABLE ventas 
ADD FOREIGN KEY (empleado_id) 
REFERENCES empleados(id);

INSERT INTO clientes (nombre, direccion) VALUES ('Juan Pérez', 'Libertad 3215, Mar del Plata');
INSERT INTO productos (nombre, precio) VALUES ('Laptop', 1200.00);

SELECT * FROM ventas;
/*Modifica la columna monto_total de la tabla ventas para que por defecto sea
el resultado de multiplicar la cantidad por el precio del producto_id*/
ALTER TABLE ventas
MODIFY COLUMN monto_total DECIMAL(10, 2) GENERATED ALWAYS AS (cantidad*precio_unitario) STORED;

INSERT INTO ventas (producto_id, cliente_id, cantidad, precio_unitario, empleado_id) VALUES (1, 1, 2, 1200.00, 1);