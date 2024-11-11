//Desarrolla un programa que defina un vector de tama�o n, que almacene n�meros, determinando por el usuario el tama�o que tendr� dicho arreglo. 
//Este tama�o debe ser solicitado al usuario por teclado, y almacenado en una variable para dicho fin. 

//Haciendo uso de la variable creada para ese fin, dimensionar el arreglo, y llenar cada una de sus posiciones con valores aleatorios entre 1 y 25. 
//Luego, se solicitar� al usuario que ingrese un n�mero para buscar dentro del arreglo. El programa buscar� el elemento dentro del arreglo y mostrar� la posici�n donde se encuentra.	
//Si el n�mero se encuentra dentro del arreglo, se imprimir�n todas las posiciones donde se encuentra ese valor, en caso de que estuviera repetido.	
//Si el n�mero a buscar no est� dentro del arreglo, se mostrar� un mensaje indic�ndolo.

Algoritmo ej3_vectores_posicionNumIngresado
	Definir VectorNumeros Como Real
	Definir indice, i, numeroIng Como Entero
	Definir numeroIngEsta Como Logico
	
	Escribir "Ingresa el �ndice del vector"
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
	
	Escribir "�Cu�l numero quieres buscar?"
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
		Escribir "El n�mero no se encuentra en el vector."
	FinSi
	Escribir "------------------------------------------------"
	
FinAlgoritmo
