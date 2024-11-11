// Desarrolla un programa que calcule la multiplicación de dos matrices de enteros de tamaño 3x3. 
// Asegúrate de inicializar las matrices para evitar tener que ingresar datos desde el teclado. 
//	La multiplicación se almacenará en una tercera matriz, donde cada elemento será el resultado de multiplicar 
//	los elementos correspondientes en la misma posición de las matrices A y B. Por ejemplo, el elemento en la 
//	posición (0,0) de la matriz C será el resultado de multiplicar el elemento en la 
//	posición (0,0) de la matriz A con el elemento en la posición (0,0) de la matriz B.
Algoritmo matriz_multiplicacion
	Definir i, j, matriz_A, matriz_B, matriz_C Como Entero
	Dimension matriz_A[3,3]
	Dimension matriz_B[3,3]
	Dimension matriz_C[3,3]
	
	Para i = 0 hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			matriz_A[i,j] = Aleatorio(1,10)
			Escribir matriz_A[i,j], " " Sin Saltar
		FinPara
		Escribir " "
	FinPara
	Escribir "---------------"
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			matriz_B[i,j] = Aleatorio(1,10)
			Escribir matriz_B[i,j], " " Sin Saltar
		FinPara
		Escribir " "
	FinPara
	Escribir "---------------"
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			matriz_C[i,j] = matriz_A[i,j] * matriz_B[i,j]
			Escribir matriz_C[i,j], " " Sin Saltar
		FinPara
		Escribir " "
	FinPara
FinAlgoritmo