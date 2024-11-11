//Crea un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre 0 y 10 generadas aleatoriamente.. 
//Luego, de acuerdo a las notas almacenadas en el arreglo, el programa debe indicar cuántos estudiantes son:

//Deficientes: 0-3
//Regulares: 4-6
//Buenos: 7-8
//Excelentes: 9-10

SubProceso generarNotasEstudiantes(vec Por Referencia, lon)
	DEfinir i Como Entero
	Para i=0 Hasta lon-1
		vec[i] = aleatorio(0, 10)
	FinPara
FinSubProceso


SubProceso calificarEstudiantes(vec, rangosNotas Por Referencia, lon)
	DEfinir i Como Entero
	para i = 0 hasta lon-1
		si vec[i] <= 3 //0-3
			rangosNotas[0] = rangosNotas[0] + 1
		FinSi
		
		si vec[i] >= 4 y vec[i] < 7 // 4-6
			rangosNotas[1] = rangosNotas[1] + 1
		FinSi
		
		si vec[i] > 6 y vec[i] < 9 // 7-8
			rangosNotas[2] = rangosNotas[2] + 1
		FinSi
		
		si vec[i] > 8 // 9-10
			rangosNotas[3] = rangosNotas[3] + 1
		FinSi
		
	FinPara
FinSubProceso



Algoritmo sin_titulo
	
	Definir i, vec, rangosNotas Como Entero
	Dimensionar vec[100], rangosNotas[4]
	
	para i = 0 Hasta 3
		rangosNotas[i] = 0
	FinPara
	
	generarNotasEstudiantes(vec, 100)
	calificarEstudiantes(vec, rangosNotas, 100)
	
	
	//Deficientes: 0-3
	//Regulares: 4-6
	//Buenos: 7-8
	//Excelentes: 9-10
	Escribir "Estudiantes Deficientes: ", rangosNotas[0]
	Escribir "Estudiantes Regulares: ", rangosNotas[1]
	Escribir "Estudiantes Buenos: ", rangosNotas[2]
	Escribir "Estudiantes Excelentes: ", rangosNotas[3]
	
	
	
FinAlgoritmo
