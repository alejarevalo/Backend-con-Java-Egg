//Desarrolla un programa que genere una matriz de tamaño 5x15. Tu tarea consiste en llenar 
//la matriz con unos y ceros, donde los 1 ocupan el borde externo de la matriz y los 0 llenarán el área interior.

Algoritmo ej2_matrix2_UnosBordesCerosCentro
	Definir matrix, i, j Como Entero
	Dimension matrix(5,15)
	Para i = 0 Hasta 14 Hacer
		Para j = 0 Hasta 14 Hacer
			si i=0 o i=4 o j=0 o j=14 Entonces
				matrix(i,j) = 1
			SiNo
				matrix(i,j) = 0
			FinSi
			Escribir matrix[i,j] " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
