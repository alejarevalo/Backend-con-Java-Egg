Algoritmo ejerc2_enc10_abr12_cuadrado
// Realizar un programa que lea un n�mero entero (tama�o del lado) y a partir de �l cree
// un cuadrado de asteriscos de ese tama�o. Los asteriscos s�lo se ver�n en el borde del
// cuadrado, no en el interior. Por ejemplo, si se ingresa el n�mero 4 se debe mostrar:
// * * * *
// *     *
// *     *
// * * * *	
	
	Definir i, k, nLado Como Entero
	
	Escribir "Ingresa la longitud que deseas para tu cuadrado: "
	Leer nLado
	
	Para i = 1 Hasta nLado Con Paso 1 Hacer
		
		para k = 1 Hasta nLado con paso 1 Hacer
			Si (i == 1) o (k == 1) o (i == nLado) o (k == nLado) Entonces
				Escribir Sin Saltar " * "
			SiNo
				Escribir Sin Saltar "   "
			FinSi
			
		FinPara
		Escribir ""
	FinPara
	
	
	

FinAlgoritmo
