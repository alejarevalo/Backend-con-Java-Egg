

//????
Algoritmo recursiva
	
	Definir n, suma Como Entero
	suma = 0
	Escribir "Ingrese un numero"
	leer n
	recursiv(n, suma)
	
FinAlgoritmo

SubProceso recursiv(n Por Valor, suma Por Referencia)
	suma = suma + n
	si n > 1 Entonces
		recursiv(n -1, suma)
	SiNo
		Escribir "La suma es:", suma
	FinSi
FinSubProceso

