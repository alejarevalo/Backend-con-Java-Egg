Algoritmo act_MaximoMinimo_conTodasLasDeLaLey
	Definir tamanio, tipo, arregloEntero Como Entero
	Definir arregloReal Como Real
	
	Escribir "Ingrese el tamaño del arreglo"
	Leer tamanio
	
	
	Dimension arregloEntero[tamanio]
	Dimension arregloReal[tamanio]
	Repetir
		Escribir "De que tipo quiere su vector"
		Escribir "1 - Entero"
		Escribir "2 - Real"
		Escribir "3 - Salir"
		Leer tipo
		
		Segun tipo Hacer
			1:
				crearArregloEntero(arregloEntero, tamanio)
			2:
				crearArregloReal(arregloReal, tamanio)
		FinSegun
	Mientras Que tipo <> 3
	
	
FinAlgoritmo

SubProceso crearArregloEntero(vector Por Referencia, tamanio Por Valor)
	Definir tipoIngreso Como Entero
	
	Repetir
		Escribir "De que tipo quiere su vector"
		Escribir "1 - Manual"
		Escribir "2 - Aleatorio"
		Escribir "3 - Salir"
		Leer tipoIngreso
		
		Segun tipoIngreso Hacer
			1:
				arregloManual(vector, tamanio)
			2:
				arregloAleatorio(vector, tamanio)
				
		FinSegun
	Mientras Que tipoIngreso <> 3
FinSubProceso

SubProceso crearArregloReal(vector Por Referencia, tamanio Por Valor)
	Definir tipoIngreso Como Entero
	
	Repetir
		Escribir "De que tipo quiere su vector"
		Escribir "1 - Manual"
		Escribir "2 - Aleatorio"
		Escribir "3 - Salir"
		Leer tipoIngreso
		
		Segun tipoIngreso Hacer
			1:
				arregloManual(vector, tamanio)
			2:
				arregloAleatorio(vector, tamanio)
				
		FinSegun
	Mientras Que tipoIngreso <> 3
FinSubProceso

SubProceso arregloManual(vector Por Referencia, tamanio Por Valor)
	Definir i Como Entero
	Para i = 0 Hasta tamanio - 1 Hacer
		Escribir "Ingrese un numero"
		Leer vector[i]
	FinPara
	Escribir "La diferencia es :", CalcularDiferecnia(vector, tamanio)
FinSubProceso

SubProceso arregloAleatorio(vector Por Referencia, tamanio Por Valor)
	Definir i Como Entero
	Para i = 0 Hasta tamanio - 1 Hacer
		vector[i] = Aleatorio(1,50)
	FinPara
	Escribir "La diferencia es :", CalcularDiferecnia(vector, tamanio)
FinSubProceso

Funcion diferenciaCalculada <- CalcularDiferecnia ( arreglo, tamanio )
	Definir i Como Entero
	Definir diferenciaCalculada, mayor, menor Como Real
	mayor = arreglo[0]
	menor = arreglo[0]
	Para i=0 Hasta tamanio - 1 Hacer
		Si arreglo[i] > mayor Entonces
			mayor = arreglo[i]
		FinSi
		Si arreglo[i] < menor Entonces
			menor = arreglo[i]
		FinSi
	FinPara
	diferenciaCalculada = mayor - menor
Fin Funcion