SubProceso menu
	Definir opt1 Como Entero
	Definir valorMin, valorMax, tamanioVector Como Entero
	
	repetir
		Escribir "Bienvenido al programa de Vectores!"
		Escribir "Ingresa el número de tu opción"
		Escribir ""
		Escribir ""
		Escribir "1. Llenar Vector A."
		Escribir "2. Llenar Vector B."
		Escribir "3. Llenar Vector C(Suma Vectores A y B)"
		Escribir "4. Llenar Vector C(Resta Vectores A y B)"
		Escribir "5. Mostrar."
		Escribir "6. Salir."
		
		leer opt1
		
		Borrar Pantalla
		
		Escribir "Ingresa el tamaño del vector: "
		Leer tamanioVector
		
		Segun opt1 Hacer
			1:
				Escribir "Ingresa un valor mínimo: "
				Leer valorMin
				
				Escribir "Ingresa un valor máximo: "
				Leer valorMax
				llenarVector(tamanioVector,valorMin, valorMax)
			2:
				Escribir "Ingresa un valor mínimo: "
				Leer valorMin
				
				Escribir "Ingresa un valor máximo: "
				Leer valorMax
				llenarVector(tamanioVector,valorMin, valorMax)
			3:
				sumarVectoresAyB
			4:
				restarVectoresAyB
			5:
				mostrasVectores
			6:
				salir
				
			Mientras Que opt1 <> 6
FinSubProceso

Funcion llenarVector(tamanio, valorMin, valorMax)
	Dimension VectorNumeros[tamanio]
	
	Para i Desde 0 Hasta indice-1 Hacer
		VectorNumeros[i] = aleatorio(valorMin,valorMax)
	FinPara
FinFuncion

Algoritmo ej1_extra_vectoresMenuOperaciones
	menu
FinAlgoritmo