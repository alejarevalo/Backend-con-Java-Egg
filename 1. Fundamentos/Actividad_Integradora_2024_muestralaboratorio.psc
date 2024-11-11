Algoritmo Actividad_Integradora_2024_muestralaboratorio
	Definir i, j, contLetras Como Entero
	Definir secuencia como Cadena
	Definir secuenciaValida, diagonalPrincipal, diagonalSecundaria Como Logico
	Definir letraActual, matriz Como Caracter
	secuenciaValida = Falso
	diagonalPrincipal = Verdadero
	diagonalSecundaria = Verdadero
	secuencia = ''
	
	Repetir
		contLetras = 0
		Escribir "Por favor ingrese una secuencia de ADN:"
		leer secuencia
		secuencia = Mayusculas(secuencia)
		Para i=0 Hasta Longitud(secuencia)-1 Hacer
			letraActual = Subcadena(secuencia, i, i)
			Segun letraActual Hacer
				'A':
					contLetras = contLetras + 1
				'B':
					contLetras = contLetras + 1
				'C':
					contLetras = contLetras + 1
				'D':
					contLetras = contLetras + 1
				De Otro Modo:
					secuenciaValida = Falso
			Fin Segun
		FinPara
		Si (Longitud(secuencia) = 9 o Longitud(secuencia) = 16) Y contLetras = Longitud(secuencia) Entonces
			secuenciaValida = Verdadero
		FinSi
	Mientras Que NO secuenciaValida
	
	Si Longitud(secuencia)==9 Entonces
		Dimension matriz[3, 3]
	SiNo
		Dimension matriz[4, 4]
	FinSi
	
	contLetras = 0
	Para i = 0 Hasta raiz(Longitud(secuencia))-1 Hacer
		Para j = 0 Hasta raiz(Longitud(secuencia))-1 Hacer
			matriz[i, j] = Subcadena(secuencia, contLetras, contLetras)
			contLetras = contLetras + 1
		FinPara
	FinPara
	
	letraActual = matriz[0,0]
	Para i = 0 Hasta raiz(Longitud(secuencia))-1 Hacer
		Para j = 0 Hasta raiz(Longitud(secuencia))-1 Hacer
			Si i == j Y letraActual <> matriz[i, j] Entonces
				diagonalPrincipal = Falso
			FinSi
		FinPara
	FinPara
	
	letraActual = matriz[0,raiz(Longitud(secuencia))-1]
	Para i = 0 Hasta raiz(Longitud(secuencia))-1 Hacer
		Para j = 0 Hasta raiz(Longitud(secuencia))-1 Hacer
			Si i == raiz(Longitud(secuencia)) - j -1 Y letraActual <> matriz[i, j] Entonces
				diagonalSecundaria = Falso
			FinSi
		FinPara
	FinPara
	imprimeMatriz(matriz, raiz(Longitud(secuencia)))
	Si diagonalPrincipal Y diagonalSecundaria Entonces
		Escribir "¡Felicidades! La muestra contiene patrones específicos en sus diagonales"
	SiNo
		Escribir "La muestra NO contiene los patrones especificados en sus diagonales"
	FinSi
	
FinAlgoritmo

SubProceso imprimeMatriz(matriz Por Referencia, m)
	Definir i, j Como Entero
	Escribir "Esta es la matriz:"
	Para i = 0 Hasta m-1
		Para j = 0 hasta m-1
			Escribir matriz[i,j], " " Sin Saltar
		FinPara
		Escribir " "
	FinPara
	Escribir " ---------------"
FinSubProceso


