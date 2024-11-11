//Escribe un programa que lea un n�mero entero y devuelva la cantidad de d�gitos que lo componen. Por ejemplo, 
//si ingresamos el n�mero 12345, el programa deber� devolver 5. Este c�lculo se realizar� utilizando operaciones matem�ticas,
//teniendo en cuenta que las variables de tipo entero truncan los n�meros o resultados.

Algoritmo desafio2
	
	Definir numInicial, num, numCifras Como Entero
	Definir numDividido Como Real
	
	Repetir		
		Escribir "Ingresa un n�mero entero positivo"
		Leer numInicial
	Mientras Que numInicial <= 0

	numCifras = 0 
	numDividido = 0 
	num = numInicial
	
	Mientras num > 0 Hacer
		numDividido = num/10 
		num = trunc(numDividido)
		numCifras = numCifras + 1
	FinMientras
	
	Escribir "La cantidad de d�gitos del n�mero ", numInicial, " es: ", numCifras
	
FinAlgoritmo
