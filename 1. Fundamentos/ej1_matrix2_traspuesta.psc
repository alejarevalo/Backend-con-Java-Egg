Algoritmo ej1_matrix2_traspuesta
	
	Definir n, m, i, j Como Entero
	Escribir "Ingrese el tamano de las filas"
	Leer n
	Escribir "Ingrese el tamano de las columnas"
	Leer m
	Definir matriz Como Entero
	Dimension matriz[n,m]
	
	Para i = 0 Hasta n-1 Hacer
		Para j = 0 Hasta m-1 Hacer
			matriz[i,j] = Aleatorio(1,100)
			Escribir matriz[i,j] " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	Escribir "-------------"
	Para i = 0 Hasta m-1 Hacer
		Para j = 0 Hasta n-1 Hacer
			Escribir matriz[j,i] " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
