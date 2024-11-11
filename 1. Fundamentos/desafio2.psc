//Escribe un programa que lea un número entero y devuelva la cantidad de dígitos que lo componen. Por ejemplo, 
//si ingresamos el número 12345, el programa deberá devolver 5. Este cálculo se realizará utilizando operaciones matemáticas,
//teniendo en cuenta que las variables de tipo entero truncan los números o resultados.

Algoritmo desafio2
	
	Definir numInicial, num, numCifras Como Entero
	Definir numDividido Como Real
	
	Repetir		
		Escribir "Ingresa un número entero positivo"
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
	
	Escribir "La cantidad de dígitos del número ", numInicial, " es: ", numCifras
	
FinAlgoritmo
