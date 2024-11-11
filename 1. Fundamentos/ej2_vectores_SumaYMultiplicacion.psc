//Realiza un programa que lea 10 números reales por 
//teclado, los almacene en un arreglo y muestre por pantalla la suma 
//y multiplicación de todos los números ingresados al arreglo.
Algoritmo ej2_vectores_SumaYMultiplicacion
	Definir VectorNumeros Como Real
	Dimension VectorNumeros[10]
	Definir suma, multiplicacion Como Real
	suma := 0
	multiplicacion := 1
	Para i Desde 1 Hasta 10 Hacer
		Escribir "Ingresa el número ", i, ":"
		Leer VectorNumeros[i]
		suma = suma + VectorNumeros[i]
		multiplicacion = multiplicacion * VectorNumeros[i]
	FinPara
	Escribir "La suma de los números es: ", suma
	Escribir "La multiplicación de los números es: ", multiplicacion
FinAlgoritmo