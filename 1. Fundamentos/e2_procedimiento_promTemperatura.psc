//Crea un procedimiento que calcule la temperatura media de un d�a a partir de la temperatura m�xima y m�nima. Luego, desarrolla un programa principal que, 
//utilizando este procedimiento, solicite la temperatura m�xima y m�nima de n d�as y muestre la media de cada d�a. 
//El programa pedir� al usuario el n�mero de d�as a introducir. 

Algoritmo e2_procedimiento_promTemperatura
	Definir i, maxima, minima, numDias Como Entero
	Definir media Como Real
	
	Escribir "Ingresa el numero de d�as"
	leer numDias
	media=0
	
	Para i = 1 Hasta numDias Hacer
		Escribir "Ingresa la temperatura minima del d�a ", i
		Leer minima
		Escribir "Ingresa la temperatura minima del d�a ", i
		Leer maxima
		
		promTemperatura(media,minima,maxima)
		Escribir "el promedio de temperatura del d�a ", i, " es: ", media
		Escribir "-----------"
	FinPara
	
FinAlgoritmo

//-------------------------
Subproceso promTemperatura(media Por Referencia,minima,maxima)

	media = (minima+maxima)/2
	
FinSubProceso
	