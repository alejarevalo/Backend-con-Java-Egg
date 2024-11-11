//Crea un procedimiento que calcule la temperatura media de un día a partir de la temperatura máxima y mínima. Luego, desarrolla un programa principal que, 
//utilizando este procedimiento, solicite la temperatura máxima y mínima de n días y muestre la media de cada día. 
//El programa pedirá al usuario el número de días a introducir. 

Algoritmo e2_procedimiento_promTemperatura
	Definir i, maxima, minima, numDias Como Entero
	Definir media Como Real
	
	Escribir "Ingresa el numero de días"
	leer numDias
	media=0
	
	Para i = 1 Hasta numDias Hacer
		Escribir "Ingresa la temperatura minima del día ", i
		Leer minima
		Escribir "Ingresa la temperatura minima del día ", i
		Leer maxima
		
		promTemperatura(media,minima,maxima)
		Escribir "el promedio de temperatura del día ", i, " es: ", media
		Escribir "-----------"
	FinPara
	
FinAlgoritmo

//-------------------------
Subproceso promTemperatura(media Por Referencia,minima,maxima)

	media = (minima+maxima)/2
	
FinSubProceso
	