//Crea un programa que solicite al usuario ingresar el tamaño deseado para dos vectores. El primero almacenará nombres 
//de personas como cadenas, mientras que el segundo vector contendrá la longitud de cada uno de los nombres. 
//Luego, se mostrarán en pantalla los nombres junto con su respectiva longitud.

Algoritmo ej1_vectores2_NombreYLongitudNombre
	Definir vectorNombres como cadena
	Definir n, i, vectorLongitudes Como Entero
	
	Escribir "Ingrese el tamaño del vector"
	Leer n
	Dimension vectorNombres(n), vectorLongitudes(n)
	
	Para i = 0 hasta n - 1 Hacer
		Escribir "Ingrese un nombre"
		Leer vectorNombres(i)
		vectorLongitudes(i) = Longitud(vectorNombres(i))
	FinPara
	
	Para i = 0 Hasta n - 1 Hacer
		Escribir 'Nombre ', vectorNombres[i], ' con longitud ', vectorLongitudes[i]
	FinPara
	
FinAlgoritmo
