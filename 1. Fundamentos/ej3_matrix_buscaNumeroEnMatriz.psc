//Crea un programa que cumpla con las siguientes condiciones:
//Define y dimensiona una matriz de 5x5 para almacenar datos num�ricos enteros.
//Rellena la matriz de manera aleatoria con n�meros comprendidos entre 10 y 40.
//Permite al usuario ingresar un n�mero para buscarlo dentro de la matriz.
//Si el n�mero se encuentra, muestra en pantalla un mensaje adecuado junto con las coordenadas en la matriz (fila y columna). 
//En caso de que el n�mero est� repetido, solo se mostrar� la posici�n de la primera ocurrencia.
//Si el n�mero no se encuentra, informa por pantalla.

Algoritmo ej3_matrix_buscaNumeroEnMatriz
	Definir i, j, matrix, numBuscado Como Entero
	Dimension matrix(5,5)
	llenar(matrix)
	Escribir "Ingresa el n�mero que quieres buscar:"
	Leer numBuscado
	buscar(matrix,numBuscado)
	muestra(matrix)
FinAlgoritmo

SubProceso llenar(matrix Por Referencia)
	Definir i, j Como Entero
	para i=0 Hasta 4 Hacer
		para j=0 Hasta 4 Hacer
			matrix[i,j] = Aleatorio(10,40) 
		FinPara
	FinPara
FinSubProceso

//Buscar numero e informar por pantalla si est� y en d�nde
SubProceso buscar(matrix Por Referencia, numBuscado)
	Definir i, j, numVecesEncontrado Como Entero
	Definir numBuscadoEsta Como Logico	
	numBuscadoEsta = falso
	numVecesEncontrado = 0
	para i=0 Hasta 4 Hacer
		para j=0 Hasta 4 Hacer
			Si numBuscado == matrix[i,j] Entonces
				numVecesEncontrado = numVecesEncontrado+1
				numBuscadoEsta =Verdadero
				Si numVecesEncontrado = 1 Entonces
					Escribir "El n�mero ", numBuscado, " se encuentra en la fila ", i+1, " y en la columna ", j+1
				FinSi
			FinSi
		FinPara
	FinPara
	
	Si numBuscadoEsta = Falso Entonces
		Escribir "El n�mero ", numBuscado, " no se encuentra en la matriz."
	FinSi	
FinSubProceso


//muestra en pantalla de elementos de matriz para probar el algoritmo (se puede omitir)
SubProceso muestra(matrix Por Referencia)	
	Definir i, j Como Entero
	para i=0 Hasta 4 Hacer
		para j=0 Hasta 4 Hacer
			Escribir matrix[i,j], Sin Saltar " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso