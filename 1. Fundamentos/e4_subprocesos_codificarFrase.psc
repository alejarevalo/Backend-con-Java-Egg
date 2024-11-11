//Escribe un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, 
//y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por un car�cter seg�n la tabla:
//a -> @
//e -> #
//i -> $
//o -> %
//u -> *
//Realiza un subprograma que reciba una secuencia de caracteres y retorne la codificaci�n 
//correspondiente, utilizando la estructura "seg�n" para la transformaci�n. Por ejemplo, si el usuario ingresa: 
//"Ayer, lunes, salimos a las once y 10.", la salida del programa deber�a ser: "@y#r, l*n#s, s@l$m%s @ l@s %nc# y 10."
//Considera repasar el uso de la funci�n concatenar de PSeInt para armar la palabra/frase. Recuerda nombrar y guardar tu algoritmo.
Algoritmo e4_subprocesos_codificarFrase
	Definir frase, nuevaFrase como cadena
	Escribir "Escribe la frase:"
	Leer frase	
	frase = Minusculas(frase)
	Codificacion(frase,nuevaFrase)
	Escribir "La frase codificada es: ", nuevaFrase	
FinAlgoritmo

//-------------------------
Subproceso Codificacion(frase Por valor, nuevaFrase Por Referencia)
	Definir letra Como caracter
	Definir i como entero	
	nuevaFrase=""	
	Para i = 0 hasta Longitud(frase)-1 Hacer
		letra = Subcadena(frase, i, i)		
		Segun letra Hacer			
			"a":
				nuevaFrase=Concatenar(nuevaFrase,"@")
			"e":
				nuevaFrase=Concatenar(nuevaFrase,"#")
			"i":
				nuevaFrase=Concatenar(nuevaFrase,"$")
			"o":
			    nuevaFrase=Concatenar(nuevaFrase,"%")
			"u":
				nuevaFrase=Concatenar(nuevaFrase,"*")
			De Otro Modo:
				nuevaFrase=Concatenar(nuevaFrase,letra)
		Fin Segun
	FinPara	
FinSubProceso

