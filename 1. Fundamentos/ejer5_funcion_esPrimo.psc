Algoritmo ejer5_funcion_esPrimo
Definir numeroIngresado Como Entero
Escribir "Ingrese el n�mero"
Leer numeroIngresado

Si esPrimo(numeroIngresado) Entonces
	Escribir "El n�mero ", numeroIngresado, " es Primo."
SiNo
	Escribir "El n�mero ", numeroIngresado, " no es Primo."
FinSi

FinAlgoritmo

Funcion res <- esPrimo (num)
	Definir res Como Logico
	Definir i Como Entero
	
	res = Verdadero
	
	Para i<-2 Hasta (num - 1) Hacer
		Si num % i = 0 Entonces
			res = Falso
		FinSi
	FinPara

Fin Funcion