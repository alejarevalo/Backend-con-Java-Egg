Algoritmo Integrador_Pseint
	Definir secuencia, matriz como cadena
	Definir caracteresValidos, diagonalIgual, diagonalIgual2 Como Logico
	Definir long, m Como Entero
	
//	Escribir "Ingresa tu muestra para detectar el gen Z"
	//	Leer secuencia
	secuencia = "BCAADCCBABCCBABB"
	secuencia = Mayusculas(secuencia)
	Long = Longitud(secuencia)
	validarOrden(secuencia,long)
	caracteresValidos <- validarChar(secuencia,long)
	m = (raiz(long))
	Dimension matriz[m,m]
	llenadoMatriz(matriz,secuencia,m)
	imprimeMatriz(matriz,m)
	diagonalIgual <- validardiagonal(matriz,m)
	diagonalIgual2 <- validardiagonal2(matriz, m)
	
	Si diagonalIgual y diagonalIgual2 Entonces
		Escribir "Se ha detectado el gen Z. ¡Cuidado!"
	SiNo
		Escribir "No se ha detectado el gen Z."
	FinSi
FinAlgoritmo

//--- VALIDAR LONGITUD 9, 16 O 1369-------------
SubProceso validarOrden(secuencia Por Referencia,long)

	Si long <> 9 y long <> 16 y long <> 1369 Entonces
		Escribir "La longitud de tu muestra es incorrecta. Debe ser 9, 16 o 1369."
		Escribir "Ingresa una nueva muestra:"
		leer secuencia
	FinSi
FinSubProceso

//--------------VALIDAR LETRAS------------
Funcion caracteresValidos <- validarChar(secuencia Por Referencia, long)
	Definir i Como Entero
	Definir char Como Caracter
	Definir caracteresValidos Como Logico
	i = 0
	long = Longitud(secuencia)
	caracteresValidos = Falso
	Mientras i < long Hacer
		char = Subcadena(secuencia,i,i)
		Si char = "A" o char = "B" o char = "C" o char = "D" Entonces
			caracteresValidos = Verdadero
		SiNo
			caracteresValidos = Falso
			i = long +1
		FinSi
		i = i + 1
	FinMientras
Fin Funcion

//------------ASIGNACION MATRIZ-----------
SubProceso llenadoMatriz(matriz Por Referencia, secuencia Por Referencia, m)
	Definir contador, i, j Como Entero
	contador = 0
	Para i = 0 hasta m-1 Hacer		
		Para j = 0 hasta m-1 Hacer
			//			matriz[i,j] = Subcadena(secuencia,i*m+j,i*m+j)
			matriz[i,j] = Subcadena(secuencia,contador,contador) // esta es otra forma de llenar los caracteres sin repetirlos por fila :O
			contador = contador + 1
		FinPara
	FinPara	
FinSubProceso

//------------Validar diagonal 1-----------
Funcion diagonalIgual <- validardiagonal(matriz Por Referencia, m)
	Definir char Como Caracter
	Definir i, j Como Entero
	Definir diagonalIgual Como Logico
	char = matriz [0,0]
	diagonalIgual = Verdadero
	Para i = 0 Hasta m-1 Hacer
		Para j = 0 hasta m-1 hacer
			Si i = j Entonces
				Si char <> matriz[i,j] Entonces
					diagonalIgual = Falso
					i = m
				FinSi
			FinSi			
		FinPara	
	FinPara	
Fin Funcion

//------------Validar diagonal invertida (2)-----------
Funcion diagonalIgual2 <- validardiagonal2(matriz Por Referencia, m)
	Definir char Como Caracter
	Definir i, j Como Entero
	Definir diagonalIgual2 Como Logico
	char = matriz [0,m-1]
	diagonalIgual2 = Falso
	
	Para i = 0 Hasta m-1 Hacer
		Para j = m-1 hasta 0 hacer			
			Si char = matriz[i,j] Entonces
				diagonalIgual2 = Verdadero
				i = i + 1
			SiNo
				diagonalIgual2 = Falso
				j = 0
				i = m
			FinSi
		FinPara	
	FinPara
Fin Funcion

////--------------------------------
SubProceso  imprimeMatriz(matriz Por Referencia, m)
	Definir i, j Como Entero
	Escribir "Esta es la matriz:"
	Para i = 0 Hasta m-1
		Para j = 0 hasta m-1
			Escribir  matriz[i,j], " " Sin Saltar
		FinPara
		Escribir " "	
	FinPara
	Escribir " ---------------"
FinSubProceso
