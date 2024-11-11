//Crea un programa que cumpla con las siguientes condiciones:
//Define y dimensiona una matriz de 5x5 para almacenar datos numéricos enteros.
//Rellena la matriz de manera aleatoria con números comprendidos entre 10 y 40.
//Permite al usuario ingresar un número para buscarlo dentro de la matriz.
//Si el número se encuentra, muestra en pantalla un mensaje adecuado junto con las coordenadas en la matriz (fila y columna). 
//En caso de que el número esté repetido, solo se mostrará la posición de la primera ocurrencia.
//Si el número no se encuentra, informa por pantalla.

Algoritmo ej3_matrix_buscaNumeroEnMatriz
	Definir i, j, matrix, numBuscado Como Entero
	Dimension matrix(5,5)
	llenar(matrix)
	Escribir "Ingresa el número que quieres buscar:"
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

//Buscar numero e informar por pantalla si está y en dónde
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
					Escribir "El número ", numBuscado, " se encuentra en la fila ", i+1, " y en la columna ", j+1
				FinSi
			FinSi
		FinPara
	FinPara
	
	Si numBuscadoEsta = Falso Entonces
		Escribir "El número ", numBuscado, " no se encuentra en la matriz."
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