SHOW databases;
USE mi_bd;

-- Utiliza la función PERIOD_ADD para agregar un período de 3 meses al año-mes '2022-07'.
SELECT PERIOD_ADD(202207, 3);
-- Utiliza la función PERIOD_DIFF para calcular el número de meses entre los períodos '2022-03' y '2022-12'.
SELECT PERIOD_DIFF(202212, 202203);
-- Utiliza la función QUARTER para obtener el trimestre de la fecha de entrega del envío con código de producto 'PQR456'.
SELECT fecha_entrega, QUARTER(fecha_entrega) FROM envios WHERE codigo_producto = 'PQR456';
-- Utiliza la función SEC_TO_TIME para convertir 3665 segundos en formato 'hh:mm:ss'.
SELECT SEC_TO_TIME(3665);
-- Utiliza la función SECOND para obtener los segundos de la hora de envío del envío con ID 2.
SELECT fecha_envio, SECOND(fecha_envio) FROM envios WHERE id = 2;
-- Utiliza la función STR_TO_DATE para convertir la cadena '2022()08()15' en una fecha.
SELECT STR_TO_DATE('2022()08()15', '%Y()%m()%d');
-- Utiliza la función SUBDATE (o DATE_SUB) para restar 5 días a la fecha de entrega del envío con código de producto 'GHI888'.
SELECT fecha_entrega, DATE_SUB(fecha_entrega, INTERVAL 5 DAY) FROM envios WHERE codigo_producto = 'GHI888';
-- Utiliza la función SUBTIME para restar 2 horas y 15 minutos a la hora de envío del envío con ID 7.
SELECT fecha_envio, SUBTIME(TIME(fecha_envio), '02:15:00') FROM envios WHERE id = 7;
-- Utiliza la función TIME para extraer la porción de tiempo de la fecha de envío del envío con ID 1.
SELECT fecha_envio, TIME(fecha_envio) FROM envios WHERE id = 1;
-- Utiliza la función TIME_FORMAT para formatear la hora de envío del envío con ID 2 en 'hh:mm:ss'.
SELECT fecha_envio, TIME_FORMAT(TIME(fecha_envio), '%H:%i:%S') FROM envios WHERE id = 2;
-- Utiliza la función TIME_TO_SEC para convertir la hora de envío del envío con ID 3 en segundos.
SELECT fecha_envio, TIME_TO_SEC(TIME(fecha_envio)) FROM envios WHERE id = 3;
-- Utiliza la función TIMEDIFF para calcular la diferencia de horas entre las fechas de envío y entrega del envío con ID 4.
SELECT fecha_envio, fecha_entrega, TIMEDIFF(fecha_entrega, fecha_envio) FROM envios WHERE id = 4;
/*Utiliza la función SYSDATE para obtener la hora exacta en la que se ejecuta la función en la consulta. Para comprobar esto 
invoca SYSDATE, luego la función SLEEP durante 5 segundos y luego vuelve a invocar la función SYSDATE, y verifica la diferencia 
entre ambas invocaciones con TIMEDIFF.*/
SELECT SYSDATE(), SLEEP(5), SYSDATE();
-- Utiliza la función TIMESTAMPADD para agregar 3 horas a la fecha de entrega del envío con código de producto 'XYZ789'.
SELECT fecha_entrega, TIMESTAMPADD(HOUR, 3, fecha_entrega) FROM envios WHERE codigo_producto = 'XYZ789';

