//Dise�a un algoritmo que permita al usuario ingresar una frase.  Deber�s asegurarte de que la longitud de la frase no exceda los 100 caracteres; en caso 
//de superar este l�mite, se solicitar� al usuario que vuelva a ingresar la frase hasta que cumpla con esta condici�n. 
//Una vez ingresada la frase, el programa separar� los caracteres en dos vectores: uno para almacenar exclusivamente las vocales (A-E-I-O-U) y 
//otro para las consonantes, as� como para los caracteres especiales y los espacios. 
//Los elementos en cada vector se acomodar�n inicialmente por orden de aparici�n en la frase. Adem�s, se requiere la implementaci�n de un subprograma 
//que permita mostrar los vectores creados, as� como el recuento total de elementos en cada uno de ellos.

Algoritmo integrador3_VocalesYConsonantes_vectores
	Definir frase como Cadena
	frase = ""
	Repetir
		Escribir "Escriba una frase de menos de 100 chars. "
		Leer frase
	Hasta Que Longitud(frase) < 100
	frase = Mayusculas(frase)
	Definir vectorVoc, vectorCon Como Caracter
	Definir nVoc Como Entero
	nVoc = contarVocales(frase)
	Dimension vectorVoc(nVoc)
	Dimension vectorCon(Longitud(frase) - nVoc)
	separarFrase(vectorVoc, vectorCon, frase)
	mostrarVector(vectorVoc, nVoc)
	mostrarVector(vectorCon, Longitud(frase) - nVoc)
FinAlgoritmo

Funcion mostrarVector(vector, longVector)
	Definir i Como Entero
	Para i=0 Hasta longVector-1 Hacer
		Escribir , " | ", vector[i], " | " Sin Saltar
	FinPara
	Escribir ""
FinFuncion

SubProceso separarFrase(vectorVoc Por Referencia, vectorCon Por Referencia, frase)
	Definir i, posV, posC Como Entero
	posC = 0
	posV = 0
	Para i=0 hasta Longitud(frase)-1
		Si Subcadena(frase, i,i) == "A" o Subcadena(frase, i,i) == "E" o Subcadena(frase, i,i) == "I" o Subcadena(frase, i,i) == "O" o Subcadena(frase, i,i) == "U" Entonces
			vectorVoc(posV) = Subcadena(frase, i,i)
			posV = posV + 1
		SiNo
			vectorCon(posC) = Subcadena(frase, i,i)
			posC = posC + 1
		FinSi
	FinPara
FinSubProceso

Funcion numVocales<-contarVocales(frase)
	Definir numVocales, i Como Entero
	numVocales = 0
	Para i=0 hasta Longitud(frase)-1
		si Subcadena(frase, i,i) == "A" o Subcadena(frase, i,i) == "E" o Subcadena(frase, i,i) == "I" o Subcadena(frase, i,i) == "O" o Subcadena(frase, i,i) == "U" Entonces
			numVocales = numVocales + 1
		FinSi
	FinPara
FinSubProceso
