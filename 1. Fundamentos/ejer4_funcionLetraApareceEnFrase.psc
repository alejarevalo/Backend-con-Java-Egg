//Diseña una función que reciba una frase 
//y una letra proporcionadas por el usuario y devuelva la cantidad de veces 
//que la letra aparece en la frase. Recuerda nombrar y guardar tu algoritmo.

Algoritmo funcionLetraApareceEnFrase
	Definir frase como cadena
	Definir letra Como Caracter
	Definir cantidadLetras como entero
	
	Escribir "Ingrese una palabra o una frase:"
	Leer frase	
	Escribir "Ingrese una letra:"
	Leer letra
	
	cantidadLetras = frecuenciaLetra(frase, letra)
	
	Escribir "La letra ", letra, " apararece ", cantidadLetras, " veces."
FinAlgoritmo


Funcion cantidad = frecuenciaLetra(frase, letra)	
	Definir cantidad, i, longitudFrase como entero
	Definir letraComparativa Como Caracter
	
	longitudFrase = longitud(frase)
	cantidad = 0
	//puedo hacerlo de "para atrás"
	Para i=longitudFrase-1 Hasta 0 Hacer
		letraComparativa = subcadena(frase,i,i)
		Si letraComparativa==letra Entonces
			cantidad = cantidad + 1				
		FinSi
	FinPara
	//o hacia adelante:
//	Para i=0 Hasta longitudFrase-1 Hacer
//		letraComparativa = subcadena(frase,i,i)
//		Si letraComparativa==letra Entonces
//			cantidad = cantidad + 1				
//		FinSi
//	FinPara
FinFuncion
	