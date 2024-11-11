Algoritmo ejer2_para
	//Crea un programa que solicite al usuario ingresar una frase y luego la muestre
	//en pantalla con un espacio entre cada letra. Es importante almacenar esta nueva
	//palabra con espacios en una variable destinada a dicho fin.
	
		
		Definir FraseInicial, FraseFinal Como Cadena
		Definir i Como Entero
		
		FraseFinal = ""
		
		Escribir "Por favor, ingresa una frase"
		
		Leer FraseInicial
		
		Para i = 0 Hasta Longitud(FraseInicial) Con Paso 1 Hacer
			FraseFinal = FraseFinal + SubCadena(FraseInicial,i,i) + " "
		FinPara
		
		Escribir FraseFinal
		
FinAlgoritmo

