//Crea una funci�n esMultiplo que reciba dos n�meros proporcionados 
//por el usuario y valide si el primer n�mero es m�ltiplo del segundo. 
//La funci�n debe devolver True si el primer n�mero es m�ltiplo del segundo, 
//y False en caso contrario. Recuerda nombrar y guardar tu algoritmo.

Algoritmo ejer3_funcionEsMultiplo
	Definir numIng1, numIng2 Como Entero
	Definir resultado Como Logico
	
	Escribir "Ingrese el primer n�mero:"
	Leer numIng1
	Escribir "Ingrese el segundo n�mero:"
	Leer numIng2
	
	Si EsMultiplo(numIng1, numIng2) Entonces
		Escribir "El n�mero ", numIng1, " es m�ltiplo de ", numIng2
	SiNo
		Escribir "El n�mero ", numIng1, " NO es m�ltiplo de ", numIng2
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