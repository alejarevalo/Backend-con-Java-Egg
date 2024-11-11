//	Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//	primo o no. Un número es primo cuando es divisible sólo por 1 y por sí mismo, por ejemplo: 2,
//	3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.

Funcion resultado <- esPrimo ( num1 )
	Definir resultado Como Logico
	Definir i, sumaNoPrimos  como entero
	
	sumaNoPrimos = 0
	resultado = verdadero
	
	Para i = 2 Hasta num1-1 Con Paso 1 Hacer
		Si num1 mod i = 0 Entonces
			sumaNoPrimos = sumaNoPrimos + 1
		FinSi
	FinPara
	
	Si sumaNoPrimos > 0 Entonces
		resultado = Falso
	FinSi
	
Fin Funcion

Algoritmo ejer5_enc13_esPrimo
	Definir resultado Como Logico
	Definir num1 Como Entero
	
	Escribir "Ingrese un número"
	Leer num1
	
	resultado <- esPrimo ( num1 )
	
	Si resultado = falso Entonces
		Escribir "El número no es primo"
	SiNo
		Escribir "El número es primo"
	FinSi
	
		
FinAlgoritmo
