SHOW DATABASES;
USE nba;

SHOw TABLES;
DESC jugadores;
DESC estadisticas;
DESC equipos;
DESC partidos;


/*Mostrar el nombre y peso de los diez jugadores que sean pivots (‘C’) y que pesen más de 
200 libras, ordenados por peso.*/
SELECT Nombre, Peso
FROM jugadores
WHERE Posicion = 'C'
AND Peso > 200
ORDER BY Peso DESC
LIMIT 10;
/*Mostrar el nombre de los equipos del este (East).*/

/*Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.*/
SELECT Nombre, Ciudad
FROM equipos
WHERE LOWER(Ciudad) LIKE 'c%'
ORDER BY Nombre;
/*Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.*/
SELECT e.Puntos_por_partido, e.temporada, j.Nombre 
FROM estadisticas e
LEFT JOIN jugadores j ON  j.codigo = e.jugador
WHERE j.Nombre = 'Pau Gasol' AND e.temporada = '04/05'
ORDER BY j.Nombre;
/*Mostrar los diez jugadores con más puntos en toda su carrera con un redondeo de dos decimales.*/
SELECT j.Nombre, ROUND(SUM(e.Puntos_por_partido), 2) as 'Total_puntos'
FROM estadisticas e
JOIN jugadores j ON j.codigo = e.jugador
GROUP BY j.Nombre
ORDER BY Total_puntos DESC
LIMIT 10;
/*Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.*/
SELECT e.Nombre, e.Conferencia, e.Division, j.Nombre, j.Altura 
FROM equipos e
JOIN jugadores j ON e.Nombre = j.Nombre_equipo 
ORDER BY j.Altura DESC
LIMIT 1;
/*Mostrar los 10 partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.*/
SELECT p.equipo_local, p.equipo_visitante, ABS(p.puntos_local - p.puntos_visitante) as diferencia
FROM partidos p
ORDER BY diferencia DESC
LIMIT 10;


/*Encuentra el nombre de los diez equipos que mejor porcentaje de victorias tengan en la temporada "98/99". 
El número de porcentaje debe estar escrito del 1 al 100 con hasta dos decimales y acompañado por el símbolo “%”.*/
SELECT
e.nombre AS Equipo,
COUNT(*) AS Partidos_Jugados,
SUM(
    CASE
    WHEN (e.nombre = p.equipo_local AND p.puntos_local > p.puntos_visitante)
    OR (e.nombre = p.equipo_visitante AND p.puntos_visitante > p.puntos_local)
    THEN 1
    ELSE 0
    END
) AS Partidos_Ganados,
ROUND((SUM(
    CASE
    WHEN (e.nombre = p.equipo_local AND p.puntos_local > p.puntos_visitante)
    OR (e.nombre = p.equipo_visitante AND p.puntos_visitante > p.puntos_local)
    THEN 1
    ELSE 0
    END
) / COUNT(*)) * 100,
2
) AS Porcentaje_Victorias
FROM
equipos e
JOIN
partidos p ON p.equipo_local = e.nombre OR p.equipo_visitante = e.nombre
GROUP BY
e.nombre
ORDER BY
Porcentaje_Victorias DESC
LIMIT 10;