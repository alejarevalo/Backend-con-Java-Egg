//Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3.
//Inicialice las matrices para evitar el ingreso de datos por teclado.
Algoritmo extra4_enc25_multiplicaMatrices3x3
	
	Definir matriz, matriz2, matrizResultado, suma, i, j, k Como Entero
	Dimension matriz[3,3], matriz2[3,3], matrizResultado[3,3]
	
	llenadoMatriz(matriz,matriz2)
	imprimeMatriz(matriz)
	imprimeMatriz2(matriz2)

	Para i <- 0 hasta 2 Hacer		
		Para j <- 0 Hasta 2 Hacer
			suma <- 0 // Se reinicia el valor de la suma para obtener otro resultado
			Para k <- 0 hasta 2 Hacer
				suma = suma + matriz[i,k]*matriz2[k,j]	// Se suman los productos de solo la primera fila. 
				//En la matriz1 lo q' aumenta es J (por eso se le pone K a J para que itere 3 veces), y en matriz2 aumenta I (se le pone K a I)
			FinPara
			matrizResultado[i,j] = suma //Se va llenando la nueva matriz
		FinPara
	FinPara
	
	imprimeMatrizResul(matrizResultado)
	
FinAlgoritmo

//------------------------
SubProceso llenadoMatriz(matriz Por Referencia, matriz2 Por Referencia)
	Definir i, j Como Entero
	Para i = 0 hasta 2 Hacer 
		Para j = 0 hasta 2 Hacer
			matriz[i,j] = Aleatorio(1,5)
			matriz2[i,j] = Aleatorio(1,5)
		FinPara
	FinPara
FinSubProceso

////--------------------------------
SubProceso  imprimeMatriz(matriz Por Referencia)
	Definir i, j Como Entero
	Escribir "Esta es la matriz:"
	Para i = 0 Hasta 2
		Para j = 0 hasta 2
			Escribir  matriz[i,j], " " Sin Saltar
		FinPara
		Escribir " "	
	FinPara
	Escribir " ---------------"
FinSubProceso

////--------------------------------
SubProceso  imprimeMatriz2(matriz2 Por Referencia)
	Definir i, j Como Entero
	Escribir "Esta es la matriz 2:"
	Para i = 0 Hasta 2
		Para j = 0 hasta 2
			Escribir  matriz2[i,j], " " Sin Saltar
		FinPara
		Escribir " "	
	FinPara
	Escribir " ---------------"
FinSubProceso

////--------------------------------
SubProceso  imprimeMatrizResul(matrizResultado Por Referencia)
	Definir i, j Como Entero
	Escribir "Esta es la matriz resultado:"
	Para i = 0 Hasta 2
		Para j = 0 hasta 2
			Escribir  matrizResultado[i,j], " " Sin Saltar
		FinPara
		Escribir " "	
	FinPara
	Escribir " ---------------"
FinSubProceso