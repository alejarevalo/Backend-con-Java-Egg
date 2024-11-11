Algoritmo ejer2_FuncionImpar
	Definir numeroUsuario Como real
	Definir resultado Como Logico
	
	Escribir "Ingresa un número: "
	Leer numeroUsuario
	
	resultado = esimpar(numeroUsuario)
	
	Escribir "¿Tu número es impar? ", resultado
	
FinAlgoritmo


Funcion impar = esimpar (num)
	Definir impar Como Logico
	Si num mod 2 <> 0 Entonces
		impar = Verdadero
	SiNo
		impar = falso		
	FinSi	
FinFuncion
	