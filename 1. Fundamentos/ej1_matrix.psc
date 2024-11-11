Algoritmo ej1_matrix
	Definir i, j, matrix Como Entero	
	Dimension matrix[3,3]	
	para i=0 Hasta 2 Hacer
		para j=0 Hasta 2 Hacer
			Escribir "Ingresa un numero entero para la fila ", i, " y para la columna ", j
			Leer matrix[i,j]
		FinPara
	FinPara	
	muestra(matrix)	
FinAlgoritmo

SubProceso muestra(matrix Por Referencia)	
	Definir i, j Como Entero
	para i=0 Hasta 2 Hacer
		para j=0 Hasta 2 Hacer
			Escribir matrix[i,j], Sin Saltar " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso
	