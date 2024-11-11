//Crea una función esMultiplo que reciba dos números proporcionados 
//por el usuario y valide si el primer número es múltiplo del segundo. 
//La función debe devolver True si el primer número es múltiplo del segundo, 
//y False en caso contrario. Recuerda nombrar y guardar tu algoritmo.

Algoritmo ejer3_funcionEsMultiplo
	Definir numIng1, numIng2 Como Entero
	Definir resultado Como Logico
	
	Escribir "Ingrese el primer número:"
	Leer numIng1
	Escribir "Ingrese el segundo número:"
	Leer numIng2
	
	Si EsMultiplo(numIng1, numIng2) Entonces
		Escribir "El número ", numIng1, " es múltiplo de ", numIng2
	SiNo
		Escribir "El número ", numIng1, " NO es múltiplo de ", numIng2
	FinSi
	
FinAlgoritmo

//---------------
Funcion res <- EsMultiplo (num1, num2)
	Definir res Como Logico
	res = falso
	Si num1 mod num2 == 0 Entonces
		res = Verdadero
	FinSi	
Fin Funcion