//Desarrolla un programa que defina un vector de tamaño n, que almacene números, determinando por el usuario el tamaño que tendrá dicho arreglo. 
//Este tamaño debe ser solicitado al usuario por teclado, y almacenado en una variable para dicho fin. 

//Haciendo uso de la variable creada para ese fin, dimensionar el arreglo, y llenar cada una de sus posiciones con valores aleatorios entre 1 y 25. 
//Luego, se solicitará al usuario que ingrese un número para buscar dentro del arreglo. El programa buscará el elemento dentro del arreglo y mostrará la posición donde se encuentra.	
//Si el número se encuentra dentro del arreglo, se imprimirán todas las posiciones donde se encuentra ese valor, en caso de que estuviera repetido.	
//Si el número a buscar no está dentro del arreglo, se mostrará un mensaje indicándolo.

Algoritmo ej3_vectores_posicionNumIngresado
	Definir VectorNumeros Como Real
	Definir indice, i, numeroIng Como Entero
	Definir numeroIngEsta Como Logico
	
	Escribir "Ingresa el índice del vector"
	Leer indice
	Dimension VectorNumeros[indice]
	
	Para i Desde 0 Hasta indice-1 Hacer
		VectorNumeros[i] = aleatorio(1,25)
	FinPara
	
	//Escribir el Vector
	
	Para i Desde 0 Hasta indice-1 Hacer
		Escribir VectorNumeros[i], " | " Sin Saltar
	FinPara
	Escribir ""
	
	Escribir "¿Cuál numero quieres buscar?"
	Leer numeroIng
	
	numeroIngEsta = Falso
	
	Para i Desde 0 Hasta indice-1 Hacer
		Si VectorNumeros[i] == numeroIng Entonces
			Escribir i+1, ", "Sin Saltar
			numeroIngEsta= Verdadero
		SiNo
			numeroIngEsta = Falso
		FinSi
	FinPara
	Escribir ""
	
	Si numeroIngEsta == falso Entonces
		Escribir "El número no se encuentra en el vector."
	FinSi
	Escribir "------------------------------------------------"
	
FinAlgoritmo
