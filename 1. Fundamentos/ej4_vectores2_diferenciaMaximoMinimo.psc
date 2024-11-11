//Desarrolla un programa que inicialice un arreglo de números, permitiéndote elegir el tipo y tamaño del arreglo. 
//Puedes generar datos aleatorios para poblar el arreglo o asignar valores manualmente. Posteriormente, 
//crea una función que calcule y devuelva la diferencia entre el valor más pequeño y el valor más grande de este arreglo. Para cumplir
//con las necesidades de la actividad, se sugiere dividir el proceso en subprocesos o funciones, esto te permitirá tener un código más modular y 
//fácil de entender, cumpliendo con las necesidades de la actividad y facilitando futuras modificaciones o expansiones del programa.
Algoritmo ej4_vectores2_diferenciaMaximoMinimo
	Definir arreglo, tamanio, i Como Entero	
	Definir maximo, minimo Como Entero
	Escribir "Ingrese tamaño del vector:"
	Leer tamanio
	Dimension arreglo(tamanio)
	
	Para i=0 Hasta tamanio-1 Hacer
		arreglo[i]= Aleatorio(0,100)
	FinPara
	
	Para i=0 Hasta tamanio-1 Hacer
		Escribir arreglo[i], ", " Sin Saltar
	FinPara
	Escribir ""
	Escribir "----------------------------"
	Escribir ""
	
	calcularDiferencia(Calcularmaximo(arreglo,tamanio), CalcularMinimo(arreglo,tamanio)) // qué bello
	
FinAlgoritmo

//función minimo ---------------------
Funcion minimo <- CalcularMinimo (arreglo,tamanio)
	Definir minimo, i Como Entero
	minimo = arreglo[0]
	Para i=0 Hasta tamanio-1 Hacer
		Si arreglo[i] < minimo Entonces
			minimo = arreglo[i]
		FinSi
	FinPara	
Fin Funcion

//función maximo----------------------
Funcion maximo <- Calcularmaximo (arreglo,tamanio)
	Definir maximo, i Como Entero
	maximo = arreglo[0]
	Para i=0 Hasta tamanio-1 Hacer
		Si arreglo[i] > maximo Entonces
			maximo = arreglo[i]
		FinSi
	FinPara
Fin Funcion

//Cálculo de diferencia

SubProceso calcularDiferencia(maximo, minimo)
	Definir diferencia Como Entero
	diferencia = maximo - minimo
	Escribir "La diferencia entre el valor máximo y el mínimo es: ", diferencia
FinSubProceso
	