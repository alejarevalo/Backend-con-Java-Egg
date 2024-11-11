Algoritmo ejer3_para_multiplos
	Definir i,mult2, mult3 Como Entero
	
	mult2=0
	mult3=0
	
	Para i = 1 hasta 100
		Si i mod 2 == 0 Entonces
			mult2 = mult2 + 1
		FinSi
		Si i mod 3 == 0 Entonces
			mult3 = mult3 + 1
		FinSi
		
	FinPara
	
	Escribir  "Hay ", mult2, " multiplos de 2. Y hay ", mult3, " múltiplos de 3."
	
FinAlgoritmo
