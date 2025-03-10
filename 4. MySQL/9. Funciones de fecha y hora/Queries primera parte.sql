SHOW databases;
USE mi_bd;

CREATE TABLE envios (
	id INT AUTO_INCREMENT PRIMARY KEY,
    fecha_envio DATETIME,
    fecha_entrega DATETIME,
    codigo_producto VARCHAR(10)
);

INSERT INTO envios (
fecha_envio,
fecha_entrega,
codigo_producto)
VALUES
('2022-01-15 08:00:00', '2022-01-20 12:30:00', 'ABC123'),
('2022-02-10 10:15:00', '2022-02-15 14:45:00', 'XYZ789'),
('2022-03-05 09:30:00', '2022-03-10 13:20:00', 'PQR456'),
('2022-04-20 11:45:00', '2022-04-25 15:10:00', 'LMN001'),
('2022-05-12 07:55:00', '2022-05-17 10:25:00', 'DEF777'),
('2022-06-08 08:20:00', '2022-06-13 12:40:00', 'GHI888'),
('2022-07-03 10:05:00', '2022-07-08 14:15:00', 'JKL999');

TABLE envios;

/*Utilizando la función DATE_ADD, calcula la fecha de entrega programada para un envío con código de producto 'ABC123'
 cuando se le añaden 5 días a la fecha de envío.*/
 SELECT DATE_ADD(fecha_envio, INTERVAL 5 DAY)
 FROM envios
 WHERE codigo_producto = 'ABC123';
 /*Utilizando la función ADDTIME, encuentra la hora estimada de entrega para un envío con código de producto 'XYZ789' 
 si se suma 4 horas y 30 minutos a la hora de entrega. */
 SELECT fecha_entrega, ADDTIME(fecha_entrega, '4:30:00') FROM envios
 WHERE codigo_producto = 'XYZ789';
 /*Utilizando la función CONVERT_TZ, convierte la fecha de envío de un envío con código de producto 'PQR456' de la zona 
 horaria 'UTC' (+00:00) a la zona horaria de Argentina GMT-3 (-03:00).*/
 SELECT fecha_envio, CONVERT_TZ(fecha_envio, '-05:00', '-03:00') FROM envios
 WHERE codigo_producto = 'XYZ789';
 /*Calcula la diferencia en días entre la fecha de entrega y la fecha de envío para el envío con código de producto 
 'LMN001' utilizando la función DATEDIFF.*/
SELECT fecha_envio, fecha_entrega, DATEDIFF(fecha_entrega, fecha_envio) FROM envios
WHERE codigo_producto = 'LMN001';
/*Utiliza la función CURDATE para obtener la fecha actual y, a continuación, obtener la diferencia en días entre la fecha de entrega 
con código de producto 'DEF777' y la fecha actual.*/
SELECT NOW(), fecha_entrega, DATEDIFF(CURRENT_DATE, fecha_envio) FROM envios
WHERE codigo_producto = 'DEF777';
/*Utilizando la función CURTIME, obtén la hora actual del sistema.*/
SELECT CURTIME();
-- Utiliza la función DATE para extraer la fecha de envío del envío con ID 3.
SELECT DATE(fecha_envio) FROM envios WHERE id=3;
/*Utiliza la función DATE_ADD para calcular la fecha de entrega programada para el envío con código de producto 'XYZ789' 
si se le agregan 3 días a la fecha de envío.*/
 SELECT DATE_ADD(fecha_envio, INTERVAL 3 DAY)
 FROM envios
 WHERE codigo_producto = 'XYZ789';
 /*Utiliza la función DATE_FORMAT para mostrar la fecha de envío del envío con ID 6 en el formato 'DD-MM-YYYY'.*/
SELECT DATE_FORMAT(fecha_envio, '%d-%m-%Y') FROM envios WHERE id = 6;
/*Utiliza la función DATE_SUB para calcular la fecha de envío del envío con ID 4 si se le restan 2 días.*/
SELECT fecha_envio, DATE_SUB(fecha_envio, INTERVAL 2 DAY) FROM envios WHERE id = 2;
/*Utiliza la función DATEDIFF para calcular la diferencia en días entre la fecha de envío y la fecha de entrega 
programada para el envío con código de producto 'PQR456'.*/
SELECT fecha_envio, fecha_entrega, DATEDIFF(fecha_entrega, fecha_envio) FROM envios
WHERE codigo_producto = 'PQR456';
/*Utiliza la función DAY para obtener el día del mes en que se realizó el envío con ID*/
SELECT fecha_envio, DAY(fecha_envio) FROM envios WHERE id = 2;
/*Utiliza la función DAYNAME para obtener el nombre del día de la semana en que se entregará el envío con 
código de producto 'DEF777'.*/
SELECT fecha_entrega, DAYNAME(fecha_entrega) FROM envios WHERE codigo_producto = 'DEF777';
/*Utiliza la función DAYOFMONTH para obtener el día del mes en que se entregará el envío con código de producto 'GHI888'.*/
SELECT fecha_entrega, DAYOFMONTH(fecha_entrega) FROM envios WHERE codigo_producto = 'GHI888';

 