Algoritmo Ej4_vectores2_verdaderosYfalsos
	Definir vector Como Logico
	Definir i, todosVerdaderos, alMenosUnVerdadero, todosFalsos, alMenosUnFalso Como Entero
	
	todosVerdaderos <- 1
	alMenosUnVerdadero <- 0
	todosFalsos <- 1
	alMenosUnFalso <- 0
	
	Dimension vector[5]
	
	
	Para i <- 0 Hasta 4 Con Paso 1 Hacer
		Escribir "Ingrese un valor l�gico para la posici�n ", i, " (1 para verdadero, 0 para falso): "
		Leer vector[i]
	Fin Para
	
	
	Escribir "Vector original:"
	Para i <- 0 Hasta 4 Con Paso 1 Hacer
		Si vector[i] Entonces
			Escribir "Posici�n ", i, ": Verdadero"
		SiNo
			Escribir "Posici�n ", i, ": Falso"
		FinSi
	Fin Para
	
	Para i <- 0 Hasta 4 Con Paso 1 Hacer
		Si vector[i] = FALSO Entonces
			todosVerdaderos <- 0
		SiNo
			alMenosUnVerdadero <- 1
		FinSi
	Fin Para
	
	Si todosVerdaderos = 1 Entonces
		Escribir "Todos los elementos del vector son verdaderos."
	SiNo
		Escribir "No todos los elementos del vector son verdaderos."
	FinSi
	
	Si alMenosUnVerdadero = 1 Entonces
		Escribir "Al menos un elemento del vector es verdadero."
		
		Para i <- 0 Hasta 4 Con Paso 1 Hacer
			Si vector[i] Entonces
				Escribir "Verdadero en la posici�n ", i
			FinSi
		Fin Para
	SiNo
		Escribir "Ning�n elemento del vector es verdadero."
	FinSi
	
	
	Para i <- 0 Hasta 4 Con Paso 1 Hacer
		Si vector[i] = VERDADERO Entonces
			todosFalsos <- 0
		SiNo
			alMenosUnFalso <- 1
		FinSi
	Fin Para
	
	Si todosFalsos = 1 Entonces
		Escribir "Todos los elementos del vector son falsos."
	SiNo
		Escribir "No todos los elementos del vector son falsos."
	FinSi
	
	Si alMenosUnFalso = 1 Entonces
		Escribir "Al menos un elemento del vector es falso."
		
		Para i <- 0 Hasta 4 Con Paso 1 Hacer
			Si No(vector[i]) Entonces
				Escribir "Falso en la posici�n ", i
			FinSi
		Fin Para
	SiNo
		Escribir "Ning�n elemento del vector es falso."
	FinSi
	
FinAlgoritmo