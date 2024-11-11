//Una distribuidora de Nescafé cuenta con 4 representantes que recorren toda Argentina para ofrecer sus productos. Para la gestión administrativa, el 
//	país está dividido en cinco zonas: Norte, Sur, Este, Oeste y Centro. Mensualmente, la empresa registra los datos de ventas de los representantes 
//en cada zona y recopila diversas estadísticas sobre su desempeño.
//Se requiere un programa que lea el monto de las ventas de los representantes en cada zona y realice los siguientes cálculos:
//	Total de ventas de una zona especificada por el usuario.
//	Total de ventas de un representante seleccionado por el usuario en cada una de las zonas.
//	Total de ventas de todos los representantes.


Algoritmo ej1_extra1_matrixNescafe
	Definir zona Como Caracter
	Definir ventas, representantes, i, j, matriz_nescafe, contador Como Entero
	Dimension matriz_nescafe[6,5] //sumamos una fila y una columna para el total q va a solicitar el usuario
	contador = 0
	para i= 0 hasta 5 Hacer
		para j= 0 hasta 4 Hacer
			Si j<>4 Entonces
				contador = contador + matriz_nescafe [i,j]
			Sino
				matriz_nescafe(i,j) = Aleatorio(1,10)
				matriz_nescafe(i,4) = contador
			FinSi
			Escribir matriz_nescafe(i,j)," " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo