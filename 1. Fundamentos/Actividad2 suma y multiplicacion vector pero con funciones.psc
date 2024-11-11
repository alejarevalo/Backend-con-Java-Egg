Algoritmo Actividad2
	Definir vectorNumeros Como Real
	Dimension vectorNumeros[10]
	Definir i Como Entero
	
	Para i=0 Hasta 9 Con Paso 1 Hacer
		Escribir "Ingrese un número para la posición: ", i+1,"/10"
		Leer vectorNumeros[i]
	FinPara
	
	Escribir ""
	
	Escribir "La suma de todos los elementos del vector es: ", suma(vectorNumeros)
	Escribir ""
	Escribir "La multiplicación de todos los elementos del vector es: ", multiplicacion(vectorNumeros)
FinAlgoritmo

Funcion resultado <- suma(vector) //pase Por Valor
	Definir resultado Como Real
	Definir i Como Entero
	resultado = 0
	Para i=0 Hasta 9 Hacer
		resultado = resultado + vector[i]
	FinPara
FinFuncion

Funcion resultado <- multiplicacion(vector) //pase Por Valor
	Definir resultado Como Real
	Definir i Como Entero
	resultado = 1
	Para i=0 Hasta 9 Hacer
		resultado = resultado * vector[i]
	FinPara
FinFuncion
