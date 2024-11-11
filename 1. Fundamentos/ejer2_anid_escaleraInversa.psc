//Crear un programa que lea un número entero (que represente la altura) y que genere una escalera invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5, se deberá mostrar:
//*****
//****
//***
//**
//*

Algoritmo ejer2_anid_escaleraInversa
	Definir altura, i, j Como Entero
	Definir estrellitas como cadena
	
	Escribir "Ingresa una altura"
	leer altura
	
	Para i = altura hasta 1 con paso -1 Hacer
		estrellitas = ""
		Para j=1 Hasta 1 Hacer
			estrellitas= estrellitas + "*"
		FinPara
		Escribir estrellitas
	FinPara
	
FinAlgoritmo
