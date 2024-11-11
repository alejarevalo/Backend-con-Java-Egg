//Diseña una función que calcule y retorne la suma de todos los divisores de un número n, excluyendo n. 
//El valor de n debe ser ingresado por el usuario. Recuerda nombrar y guardar tu algoritmo.
//FUNCION---------------------------------------
Funcion suma <- sumaDivisores ( n )
	Definir suma, i como entero	
	suma = 0 
	Para i = 1 Hasta (n-1) Hacer
		Si n%i == 0 Entonces
			suma = suma + i
		FinSi
	FinPara		
Fin Funcion
//-----------------PROGRAMA PRINCIPAL---------
Algoritmo e1_extra_sumaDivisores
	Definir numIngresado, resultado Como Entero	
	Escribir "Ingrese un número entero: "
	Leer numIngresado	
	resultado = sumaDivisores(numIngresado)	
	Escribir "La suma de todos los divisores de ", numIngresado, " es: ", resultado	
FinAlgoritmo