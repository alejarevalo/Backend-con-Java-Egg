Algoritmo matrizOrganizarR_colega
	Definir palabras Como Caracter
	Definir n,m Como Entero
	Definir p1,p2,p3,p4,p5,p6,p7,p8, p9 como Cadena
	n = 9
	m = 12
	Dimension palabras[n,m]
	
	inicializarMatriz(palabras, n, m)
	
	p1 = "VECTOR"
	p2 = "MATRIX"
	p3 = "PROGRAMA"
	p4 = "SUBPROGRAMA"
	p5 = "SUBPROCESO"
	p6 = "VARIABLE"
	P7 = "ENTERO"
	p8 = "PARA"
	p9 = "MIENTRAS"
	agregarPalabra(palabras, 0, p1)
	agregarPalabra(palabras, 1, p2)
	agregarPalabra(palabras, 2, p3)
	agregarPalabra(palabras, 3, p4)
	agregarPalabra(palabras, 4, p5)
	agregarPalabra(palabras, 5, p6)
	agregarPalabra(palabras, 6, p7)
	agregarPalabra(palabras, 7, p8)
	agregarPalabra(palabras, 8, p9)
	acomodarPalabra(palabras, n, m)
	imprimirMatriz(palabras, n, m)
	
	
FinAlgoritmo

SubProceso inicializarMatriz(A Por Referencia, n Por Valor, m Por Valor)
	Definir i,j Como Entero
	Para i = 0 Hasta n-1 Hacer
		Para j = 0 Hasta m-1 Hacer
			A[i,j] = '*'
		FinPara
	FinPara
FinSubProceso

SubProceso imprimirMatriz(A Por Referencia, n Por Valor, m Por Valor)
	Definir i,j Como Entero
	Para i = 0 Hasta n-1 Hacer
		Para j = 0 Hasta m-2 Hacer
			Escribir A[i,j], " " Sin Saltar
		FinPara
		Escribir A[i,j]
	FinPara
FinSubProceso

Funcion posicion<-buscarR(matriz,n, m)
	Definir posicion, i Como Entero
	posicion=-1
	i=0
	Mientras posicion == -1 y i<m Hacer
		Si Minusculas(matriz[n,i])=='r'Entonces
			posicion=i
		FinSi
		i=i+1
	Fin Mientras
FinFuncion

SubProceso agregarPalabra(matriz, n, palabra)
	Definir i Como Entero
	Para i=0 Hasta Longitud(palabra)-1 Hacer
		matriz[n,i]=Subcadena(palabra, i, i)
	FinPara
FinSubProceso

SubProceso acomodarUnaPalabra(matriz, n, m)
	Definir posicion, i Como Entero
	Definir aux Como Caracter
	Definir auxCadena Como Cadena
	i = 0
	posicion=buscarR(matriz, n, m)
	auxCadena = ""
	Mientras matriz[n,i] <> '*' Hacer
		auxCadena = Concatenar(auxCadena,matriz[n,i])
		i = i+ 1
	FinMientras
	Para i=0 Hasta m-1
		Si i >= 5-posicion y i < (Longitud(auxCadena) + 5 - posicion) Entonces
			matriz[n,i] = Subcadena(auxCadena,(i-5+posicion),(i-5+posicion))
		SiNo
			matriz[n,i] = '*'
		FinSi
	FinPara
FinSubProceso

SubProceso acomodarPalabra(matriz, n, m)
	Definir i Como Entero
	Para i = 0 Hasta n-1 Hacer
		acomodarUnaPalabra(matriz,i,m)
	FinPara
FinSubProceso
