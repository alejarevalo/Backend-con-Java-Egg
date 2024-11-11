//Realiza un procedimiento que permita realizar la división entre dos números y muestre el cociente y el residuo utilizando el método de restas sucesivas.
//Este método consiste en restar el divisor del dividendo repetidamente hasta obtener un resultado menor que el divisor. El residuo será el resultado final
//y el número de restas realizadas será el cociente. Por ejemplo, para 50 / 13:
//
// 50 ? 13 = 37 (una resta)
//
// 37 ? 13 = 24 (dos restas)
//
// 24 ? 13 = 11 (tres restas)
//
// Como 11 es menor que 13, el residuo es 11 y el cociente es 3.
//
// Recuerda nombrar y guardar tu algoritmo.
Algoritmo e3_subprocesoRestaSucesivaDividir
	Definir dividendo, divisor, cociente, resto Como Entero
	
	Escribir "Ingrese el dividendo y el divisor de la division"
	Leer dividendo, divisor
	
	division_numeros(dividendo, divisor, cociente, resto)
	
	Escribir dividendo, " dividido ", divisor, " da un cociente de ", cociente, " con resto ", resto
FinAlgoritmo

SubProceso division_numeros(dividendo Por Valor, divisor Por Valor, cociente Por referencia, resto Por Referencia)
	cociente = 0
	resto = 0
	Mientras dividendo >= divisor Hacer
		Escribir dividendo, " - ", divisor, " = ", dividendo - divisor, " (resta ", cociente + 1, ")"
		dividendo = dividendo - divisor
		cociente = cociente + 1
	FinMientras
	resto = dividendo
FinSubProceso