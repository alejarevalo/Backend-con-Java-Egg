//Dada una matriz de tamaño n x m, donde n y m son valores ingresados por el usuario, se requiere implementar dos subprogramas:
//El primer subprograma se encargará de llenar la matriz con números aleatorios.
//El segundo subprograma calculará y mostrará la suma de todos los elementos de la matriz.
//Después de ejecutar ambos subprogramas, se mostrará la matriz generada junto con los resultados de la suma por pantalla.

Algoritmo ej2_matrix_sumaElementosMatriz
	Definir i, j, n, m, matrix Como Entero
	Escribir "Ingresa la cardinalidad de las filas:"
	Leer n
	Escribir "Ingresa la cardinalidad de las columnas:"
	Leer m
	Dimension matrix(n,m)
	llenar(matrix,n,m)
	Escribir "La matriz quedó así:"
	muestra(matrix,n,m)	
	Escribir "La suma de sus elementos es: ", sumar(matrix, n, m)	
FinAlgoritmo

//proceso de llenado de matriz
SubProceso llenar(matrix Por Referencia, n, m)
	Definir i, j Como Entero
	para i=0 Hasta n-1 Hacer
		para j=0 Hasta m-1 Hacer
			matrix[i,j] = Aleatorio(0,10) 
		FinPara
	FinPara
FinSubProceso

//suma de sus elementos
Funcion suma <- sumar(matrix Por Referencia, n, m)
	Definir suma, i, j Como Entero
	suma = 0
	para i=0 Hasta n-1 Hacer
		para j=0 Hasta m-1 Hacer
			suma = suma + matrix[i,j] 
		FinPara
	FinPara
Fin Funcion

//muestra en pantalla de elementos de matriz
SubProceso muestra(matrix Por Referencia, n, m)	
	Definir i, j Como Entero
	para i=0 Hasta n-1 Hacer
		para j=0 Hasta m-1 Hacer
			Escribir matrix[i,j], Sin Saltar " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso