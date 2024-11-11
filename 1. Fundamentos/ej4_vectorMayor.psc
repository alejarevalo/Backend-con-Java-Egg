//Desarrolla un programa que rellene un vector de tamaño N, con valores numéricos ingresados por el usuario.
//A continuación, se deberá crear una función que reciba el vector y devuelva el valor más grande del arreglo.

Algoritmo ej4_vectorMayor
	Definir VectorNumeros Como Real
	Definir i, mayor Como Entero

	Dimension VectorNumeros[10]	
	mayor=0	
	
	Para i Desde 0 Hasta 9 Hacer
		Escribir "Ingresa el número ", i, ":"
		Leer VectorNumeros[i]
		Si VectorNumeros[i] > mayor Entonces
			mayor = VectorNumeros[i]
		FinSi		
	FinPara
	Escribir ""
	Escribir "El valor más grande de este vector es: ", mayor
	Escribir ""
	Escribir "---------------------------------------------"
	
	//Escribir el Vector para verificar
	Para i Desde 0 Hasta 9 Hacer
		Escribir VectorNumeros[i], " | " Sin Saltar
	FinPara
	Escribir ""

FinAlgoritmo
