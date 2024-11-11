Algoritmo desafio_enc26
	Definir matriz, palabra como Caracter
	Definir fila Como Entero
	Dimension matriz[9,12]
	inicializarMatriz(matriz)
	agregarPalabra(matriz, 0, "vector")
	agregarPalabra(matriz, 1, "matrix")
	agregarPalabra(matriz, 2, "programa")
	agregarPalabra(matriz, 3, "subprograma")
	agregarPalabra(matriz, 4, "subproceso")
	agregarPalabra(matriz, 5, "variable")
	agregarPalabra(matriz, 6, "entero")
	agregarPalabra(matriz, 7, "para")	
	agregarPalabra(matriz, 8, "mientras")	
//	acomodarPalabra(matriz)
	imprimirMatriz(matriz)
FinAlgoritmo

Subproceso inicializarMatriz(matriz Por Referencia)
	Definir i, j como entero
	Para i = 0 Hasta 8 Hacer
        Para j = 0 Hasta 11 Hacer
            matriz[i,j] = "*"
        Fin Para
    Fin Para
Fin Subproceso

Subproceso imprimirMatriz(matriz Por Referencia)
	Definir i, j como entero
	Para i = 0 Hasta 8 Hacer
        Para j = 0 Hasta 11 Hacer
            Escribir " ", matriz[i,j] Sin Saltar
        Fin Para
        Escribir ""
    Fin Para
	Escribir "-------------------------"
Fin Subproceso

Subproceso agregarPalabra(matriz Por Referencia, fila, palabra)
    Definir long, i, j Como Entero
	long = Longitud(palabra) // se saca esto para delimitar el bucle de asignación de cada letra de la palabra
    Para i = 0 Hasta long-1 Hacer
        matriz[fila,i] = Subcadena(palabra, i, i) //en la posicion "fila, i" de la matriz, vamos incluyendo cada letra
    Fin Para
Fin Subproceso

Subproceso buscarR(matriz Por Referencia, fila)
	Definir long, posicionR, i Como Entero
	long = Longitud(matriz[fila]) 
	posicionR = 0 // Si no se encuentra la letra 'R' 
	
	Mientras i <= long-1 y posicionR = 0 Hacer // mientras que no se exceda el largo de la fila [?] y la posición no tenga R, haga
		Si matriz[fila,i] == "r" Entonces // si el lugar de la matriz es igual a "R" 
			posicionR = i // emtonces la variable "posicionR" toma el valor de ese lugar
		FinSi
		i = i + 1
	FinMientras
// devuelvo el valor de la posicion a la variable de la función.
FinSubProceso


Subproceso acomodarPalabra(matriz)
	Definir movimiento como entero
    fila = Longitud(matriz)
    Para i = 0 Hasta 8 Hacer
        posicionR = buscarR(matriz, fila)
        Si posicionR <> 0 Entonces
            movimiento = 5 - posicionR
            Para j = Longitud(matriz[i]) + 1 Hasta 1 Con Paso -1
                matriz[i,j+movimiento] = matriz[i,j]
            Fin Para
            Para j = 1 Hasta movimiento Hacer
                matriz[i,j] = "*"
            Fin Para
        Fin Si
    Fin Para
Fin Subproceso



