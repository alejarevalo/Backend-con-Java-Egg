//Desarrolla un programa que inicialice un arreglo de n�meros, permiti�ndote elegir el tipo y tama�o del arreglo. 
//Puedes generar datos aleatorios para poblar el arreglo o asignar valores manualmente. Posteriormente, 
//crea una funci�n que calcule y devuelva la diferencia entre el valor m�s peque�o y el valor m�s grande de este arreglo. Para cumplir
//con las necesidades de la actividad, se sugiere dividir el proceso en subprocesos o funciones, esto te permitir� tener un c�digo m�s modular y 
//f�cil de entender, cumpliendo con las necesidades de la actividad y facilitando futuras modificaciones o expansiones del programa.
Algoritmo ej4_vectores2_diferenciaMaximoMinimo
	Definir arreglo, tamanio, i Como Entero	
	Definir maximo, minimo Como Entero
	Escribir "Ingrese tama�o del vector:"
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
	
	calcularDiferencia(Calcularmaximo(arreglo,tamanio), CalcularMinimo(arreglo,tamanio)) // qu� bello
	
FinAlgoritmo

//funci�n minimo ---------------------
Funcion minimo <- CalcularMinimo (arreglo,tamanio)
	Definir minimo, i Como Entero
	minimo = arreglo[0]
	Para i=0 Hasta tamanio-1 Hacer
		Si arreglo[i] < minimo Entonces
			minimo = arreglo[i]
		FinSi
	FinPara	
Fin Funcion

//funci�n maximo----------------------
Funcion maximo <- Calcularmaximo (arreglo,tamanio)
	Definir maximo, i Como Entero
	maximo = arreglo[0]
	Para i=0 Hasta tamanio-1 Hacer
		Si arreglo[i] > maximo Entonces
			maximo = arreglo[i]
		FinSi
	FinPara
Fin Funcion

//C�lculo de diferencia

SubProceso calcularDiferencia(maximo, minimo)
	Definir diferencia Como Entero
	diferencia = maximo - minimo
	Escribir "La diferencia entre el valor m�ximo y el m�nimo es: ", diferencia
FinSubProceso
	