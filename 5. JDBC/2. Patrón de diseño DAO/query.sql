SHOW DATABASES;
CREATE DATABASE IF NOT EXISTS vivero;
USE vivero;

-- Tabla gama_producto
CREATE TABLE gama_producto (
    id_gama INT PRIMARY KEY,
    gama VARCHAR(50),
    descripcion_texto TEXT,
    descripcion_html TEXT,
    imagen VARCHAR(256)
);

-- Tabla oficina
CREATE TABLE oficina (
    id_oficina INT PRIMARY KEY,
    codigo_oficina VARCHAR(10),
    ciudad VARCHAR(30),
    pais VARCHAR(50),
    region VARCHAR(50),
    codigo_postal VARCHAR(10),
    telefono VARCHAR(20)
);

-- Tabla empleado
CREATE TABLE empleado (
    id_empleado INT PRIMARY KEY,
    codigo_empleado INT,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    extension VARCHAR(10),
    email VARCHAR(100),
    id_oficina INT,
    id_jefe INT,
    puesto VARCHAR(50),
    FOREIGN KEY (id_oficina) REFERENCES oficina(id_oficina),
    FOREIGN KEY (id_jefe) REFERENCES empleado(id_empleado)
);

-- Tabla cliente
CREATE TABLE cliente (
    id_cliente INT PRIMARY KEY,
    codigo_cliente INT,
    nombre_cliente VARCHAR(50),
    nombre_contacto VARCHAR(30),
    apellido_contacto VARCHAR(30),
    telefono VARCHAR(15),
    fax VARCHAR(15),
    ciudad VARCHAR(50),
    region VARCHAR(50),
    pais VARCHAR(50),
    codigo_postal VARCHAR(10),
    id_empleado INT,
    limite_credito DECIMAL(15,2),
    FOREIGN KEY (id_empleado) REFERENCES empleado(id_empleado)
);

-- Tabla producto
CREATE TABLE producto (
    id_producto INT PRIMARY KEY,
    codigo_producto VARCHAR(15),
    nombre VARCHAR(70),
    id_gama INT,
    dimensiones VARCHAR(25),
    proveedor VARCHAR(50),
    descripcion TEXT,
    cantidad_en_stock SMALLINT,
    precio_venta DECIMAL(15,2),
    precio_proveedor DECIMAL(15,2),
    FOREIGN KEY (id_gama) REFERENCES gama_producto(id_gama)
);

-- Tabla pedido
CREATE TABLE pedido (
    id_pedido INT PRIMARY KEY,
    codigo_pedido INT,
    fecha_pedido DATE,
    fecha_esperada DATE,
    fecha_entrega DATE,
    estado VARCHAR(15),
    comentarios TEXT,
    id_cliente INT,
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)
);

-- Tabla detalle_pedido
CREATE TABLE detalle_pedido (
    id_detalle_pedido INT PRIMARY KEY,
    id_pedido INT,
    id_producto INT,
    cantidad INT,
    precio_unidad DECIMAL(15,2),
    numero_linea SMALLINT,
    FOREIGN KEY (id_pedido) REFERENCES pedido(id_pedido),
    FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);

-- Tabla pago
CREATE TABLE pago (
    id_pago INT PRIMARY KEY,
    id_cliente INT,
    forma_pago VARCHAR(40),
    id_transaccion VARCHAR(50),
    fecha_pago DATE,
    total DECIMAL(15,2),
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)
);