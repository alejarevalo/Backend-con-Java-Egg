//Desarrolla un programa que rellene un vector de tama�o N, con valores num�ricos ingresados por el usuario.
//A continuaci�n, se deber� crear una funci�n que reciba el vector y devuelva el valor m�s grande del arreglo.

Algoritmo ej4_vectorMayor
	Definir VectorNumeros Como Real
	Definir i, mayor Como Entero

	Dimension VectorNumeros[10]	
	mayor=0	
	
	Para i Desde 0 Hasta 9 Hacer
		Escribir "Ingresa el n�mero ", i, ":"
		Leer VectorNumeros[i]
		Si VectorNumeros[i] > mayor Entonces
			mayor = VectorNumeros[i]
		FinSi		
	FinPara
	Escribir ""
	Escribir "El valor m�s grande de este vector es: ", mayor
	Escribir ""
	Escribir "---------------------------------------------"
	
	//Escribir el Vector para verificar
	Para i Desde 0 Hasta 9 Hacer
		Escribir VectorNumeros[i], " | " Sin Saltar
	FinPara
	Escribir ""

FinAlgoritmo
