Algoritmo MatrizPalabras
	Definir matriz, matrizOrdenada Como Caracter
	Definir i, j, filas, columnas, posicionR Como Entero
	filas <- 5
	columnas <- 10
	
	Dimension matriz[filas, columnas]
	Dimension matrizOrdenada[filas, columnas]
	inicializarMatriz(matriz, filas, columnas)
	
	agregarPalabra(matriz, 0, "VECTOR")
	
	agregarPalabra(matriz, 1, "RADIO")
	
	agregarPalabra(matriz, 2, "RAMPA")
	
	agregarPalabra(matriz, 3, "ROTOR")
	
	agregarPalabra(matriz, 4, "RANGO")
	
	imprimirMatriz(matriz,filas,columnas)
	
	acomodarPalabra(matriz, matrizOrdenada)
	Escribir "------------------------------"
	imprimirMatriz(matrizOrdenada, filas, columnas)
	
	
FinAlgoritmo

// Subprograma para inicializar la matriz con asteriscos
SubProceso inicializarMatriz(matriz por referencia, filas, columnas)
	Definir i, j Como Entero
	Para i <- 0 Hasta filas-1 Hacer
		Para j <- 0 Hasta columnas-1 Hacer
			matriz[i, j] <- "*"
		Fin Para
	Fin Para
	
FinSubProceso

// Subprograma para imprimir la matriz con espacios entre letras
SubProceso imprimirMatriz(matriz Por Referencia, filas, columnas)
	Definir i, j Como Entero
	Para i <- 0 Hasta filas-1 Hacer
		Para j <- 0 Hasta columnas-1 Hacer
			Escribir Sin Saltar matriz[i,j], " "
		Fin Para
		Escribir ""
	Fin Para
FinSubProceso

// Subprograma para agregar una palabra en una fila específica de la matriz
SubProceso agregarPalabra(matriz por referencia, filas, palabra)
	Definir i Como Entero
	Para i <- 0 Hasta Longitud(palabra)-1 Hacer
		matriz[filas, i] <- Subcadena(palabra, i, i)
	Fin Para
FinSubProceso

// Subprograma para buscar R
Funcion posicionR <- buscarR(matriz Por Referencia, filas)
	Definir posicionR, i Como Entero
	Definir letra Como Caracter
	letra = ""
	i=0
	Repetir
		letra = matriz(filas, i)
		i = i + 1
	Mientras Que (letra <> "R") y (i < 9)	

	posicionR = i
Fin Funcion

SubProceso acomodarPalabra(matriz Por Referencia, matrizOrdenada)
	Definir posicionR, i, j, diferencia Como Entero
	Definir aux como caracter
	Para i = 0 hasta 4 Hacer
		posicionR = buscarR(matriz,i)		
		Si posicionR < 5 Entonces
			diferencia = 5 - posicionR
			Para j = 0 Hasta 9 Hacer
				matrizOrdenada(i,j + diferencia) = matriz(i,j) 
				Si matrizOrdenada(i,j) = "" Entonces
					matrizOrdenada(i,j) = "*"
				FinSi
			FinPara
		SiNo
			Si posicionR > 5 Entonces
				diferencia = posicionR - 5
				Para j = 0 Hasta 9 Hacer
					matrizOrdenada(i,j - diferencia) = matriz(i,j) 
					//Escribir j + diferencia
					Si matrizOrdenada(i,j) = "" Entonces
						matrizOrdenada(i,j) = "*"
					FinSi
				FinPara
			FinSi			
		FinSi
	FinPara	
FinSubProceso

Algoritmo MatrizPalabras
	Definir matriz, matrizOrdenada Como Caracter
	Definir i, j, filas, columnas, posicionR Como Entero
	filas <- 5
	columnas <- 10
	
	Dimension matriz[filas, columnas]
	Dimension matrizOrdenada[filas, columnas]
	inicializarMatriz(matriz, filas, columnas)
	
	agregarPalabra(matriz, 0, "VECTOR")
	
	agregarPalabra(matriz, 1, "RADIO")
	
	agregarPalabra(matriz, 2, "RAMPA")
	
	agregarPalabra(matriz, 3, "ROTOR")
	
	agregarPalabra(matriz, 4, "RANGO")
	
	imprimirMatriz(matriz,filas,columnas)
	
	acomodarPalabra(matriz, matrizOrdenada)
	Escribir "------------------------------"
	imprimirMatriz(matrizOrdenada, filas, columnas)
	
	
FinAlgoritmo

// Subprograma para inicializar la matriz con asteriscos
SubProceso inicializarMatriz(matriz por referencia, filas, columnas)
	Definir i, j Como Entero
	Para i <- 0 Hasta filas-1 Hacer
		Para j <- 0 Hasta columnas-1 Hacer
			matriz[i, j] <- "*"
		Fin Para
	Fin Para
	
FinSubProceso

// Subprograma para imprimir la matriz con espacios entre letras
SubProceso imprimirMatriz(matriz Por Referencia, filas, columnas)
	Definir i, j Como Entero
	Para i <- 0 Hasta filas-1 Hacer
		Para j <- 0 Hasta columnas-1 Hacer
			Escribir Sin Saltar matriz[i,j], " "
		Fin Para
		Escribir ""
	Fin Para
FinSubProceso

// Subprograma para agregar una palabra en una fila específica de la matriz
SubProceso agregarPalabra(matriz por referencia, filas, palabra)
	Definir i Como Entero
	Para i <- 0 Hasta Longitud(palabra)-1 Hacer
		matriz[filas, i] <- Subcadena(palabra, i, i)
	Fin Para
FinSubProceso

// Subprograma para buscar R
Funcion posicionR <- buscarR(matriz Por Referencia, filas)
	Definir posicionR, i Como Entero
	Definir letra Como Caracter
	letra = ""
	i=0
	Repetir
		letra = matriz(filas, i)
		i = i + 1
	Mientras Que (letra <> "R") y (i < 9)	
	
	posicionR = i
Fin Funcion

SubProceso acomodarPalabra(matriz Por Referencia, matrizOrdenada)
	Definir posicionR, i, j, diferencia Como Entero
	Definir aux como caracter
	Para i = 0 hasta 4 Hacer
		posicionR = buscarR(matriz,i)		
		Si posicionR < 5 Entonces
			diferencia = 5 - posicionR
			Para j = 0 Hasta 9 Hacer
				matrizOrdenada(i,j) = matriz(i,j - diferencia) 
				Si matrizOrdenada(i,j) = "" Entonces
					matrizOrdenada(i,j) = "*"
				FinSi
			FinPara
		SiNo
			Si posicionR > 5 Entonces
				diferencia = posicionR - 5
				Para j = 0 Hasta 9 Hacer
					matrizOrdenada(i,j) = matriz(i,j + (diferencia-1)) 
					Si matrizOrdenada(i,j) = "" Entonces
						matrizOrdenada(i,j) = "*"
					FinSi
				FinPara
			FinSi			
		FinSi
	FinPara	
FinSubProceso
