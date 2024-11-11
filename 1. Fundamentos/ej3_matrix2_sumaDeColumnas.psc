//Crea una matriz con 3 columnas y una cantidad de filas definida por el usuario.
//En las dos primeras columnas, el usuario ingresará valores enteros (puede diseñar este ingreso de manera 
//aleatoria para enviar la carga manual). En la tercera columna se almacenará el resultado de sumar los números de la primera y segunda 
//columna. La matriz se mostrará de la siguiente forma:
//		
//		3 | 5 | 8 ? 8 se obtuvo de sumar 3 + 5 
//		
//		4 | 3 | 7 ? 7 se obtuvo de sumar 4 + 3 
//		
//		1 | 4 | 5 ? 5 se obtuvo de sumar 1 +4 
Algoritmo ej3_matrix2_sumaDeColumnas
	Definir matrix, i, j, n Como Entero
	
	Escribir "Ingrese numero de filas"
	Leer n
	
	Dimension matrix[n,3]
	llenar(matrix, n)
	Escribir "-------------------------------"
	muestra(matrix, n)
FinAlgoritmo


//proceso de llenado de matriz
SubProceso llenar(matrix Por Referencia, n)
	Definir i, j Como Entero
	para i=0 Hasta n-1 Hacer
		para j=0 Hasta 2 Hacer
			si j<>2 Entonces
				matrix(i,j) = azar(10)
			SiNo
				matrix(i,2) = matrix(i,j-2) + matrix(i,j-1) // no se
			FinSi
			Escribir matrix(i,j), Sin Saltar " | "
		FinPara
		Escribir " La suma de ", matrix(i,0), "+",matrix(i,1), " es igual a: ", matrix(i,2)
	FinPara
FinSubProceso

//muestra en pantalla de elementos de matriz
SubProceso muestra(matrix Por Referencia, n)	
	Definir i, j Como Entero
	para i=0 Hasta n-1 Hacer
		para j=0 Hasta 2 Hacer
			Escribir matrix[i,j], Sin Saltar " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso