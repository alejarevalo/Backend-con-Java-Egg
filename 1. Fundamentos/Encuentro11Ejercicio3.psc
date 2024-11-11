Algoritmo Encuentro11Ejercicio3
	
	//Necesitamos crear un sistema para una máquina de reciclaje de botellas automática. Dicha
	//máquina nos pagará dinero por la cantidad de plástico reciclado. Tenemos que ingresar
	//nuestro usuario y contraseña para que se nos cargue el saldo por sistema a nuestra cuenta.
	
	//Condición simple anidada: validaremos que el usuario sea "Albus_D", luego si esto es
	//verdadero, validaremos si la contraseña es "caramelosDeLimon". Si la contraseña es
	//correcta haremos que una variable llamada Login sea verdadera.
	
	//Bucle Mientras: Este bloque de validación de la contraseña lo encerraremos en un
	//bucle Mientras para darle al usuario sólo 3 intentos para poner la contraseña.
	
	//Bucle Hacer Mientras(Repetir): Una vez que el login sea verdadero, accederemos al
	//menú de opciones:
	//	o Ingresar botellas
	//	o Consultar saldo
	//	o Salir		
	
	//Ingresar Botellas: Primero preguntaremos cuántas botellas se va a ingresar al sistema.
	//Una vez que tenemos el número vamos a usar un bucle para, a fin de ir ingresando
	//cada botella. En cada ciclo del bucle se debe generar un número aleatorio entre 100 y
	//3000 gr, que va a ser el peso de las botellas a reciclar (simulando que el usuario está
	//ingresando botellas en la máquina). Una vez generado, según el peso del material,
	//usaremos un condicional múltiple para asignarle un valor monetario:
	//	o! Si es menos de 500 gr, corresponden $50
	//	o! Si es entre 501 gr y 1500 gr, corresponden $125
	//	o! Si es más de 1501 gr, corresponden $200
	//Hecho esto, el programa debe informar al usuario por pantalla el valor que se le
	//ofrece. Si el usuario acepta, lo acreditamos a su saldo, sino se debe devolver el
	//material (sólo mostrar en pantalla "Devolviendo material"). Para esto usaremos un
	//condicional doble.
	
	//Consultar saldo: revisaremos el valor monetario que tiene asignada la variable "saldo".
	
	//Tanto al terminar "Ingresar Botellas" como "Consultar Saldo" debe volver al menú principal.
	
	Definir usuario, clave, menu, sumaSaldo Como Caracter
	Definir login Como Logico
	Definir i, intentos, botellas, peso, saldo, precio Como Entero
	
	login = Falso
	intentos = 3
	saldo = 0

	Repetir
		Escribir "Ingrese el nombre de usuario:"
		Leer usuario
		Si usuario = "Albus_D" Entonces
			Escribir "Usuario válido"
			Repetir
				Escribir "Ingrese la clave:"
				Leer clave
				Si clave = "caramelosDeLimon" Entonces
					login = Verdadero
				SiNo
					intentos = intentos - 1
					Si intentos > 0 Entonces
						Escribir "Te quedan ", intentos, " intentos."
					Fin Si
				Fin Si
			Mientras Que login = Falso y intentos > 0
		Fin Si
	Mientras Que login = Falso
	
	Repetir
		Escribir "Eliga una opción del menu:"
		Escribir "1 - Ingresar Botellas"
		Escribir "2 - Consultar Saldo"
		Escribir "3 - Salir"
		Leer menu
		
		Segun menu Hacer
			"1":
				Escribir "Ingrese el número de botellas"
				Leer botellas
				Para i=1 Hasta botellas Hacer
					peso = Aleatorio(100, 3000)
					Escribir "El peso de esta botella es de: ", peso, "gr."
					Si peso <= 500 Entonces
						precio = 50
					SiNo
						Si peso <= 1500 Entonces
							precio = 125
						SiNo
							precio = 200
						Fin Si
					Fin Si
					Escribir "El precio es de ", precio, "$. Desea agregarlo a su saldo? (y/n)"
					Leer sumaSaldo
					Si Minusculas(sumaSaldo) = "y" Entonces
						saldo = saldo + precio
					SiNo
						Escribir "Devolviendo Material"
					Fin Si
				Fin Para
			"2":
				Escribir "Su saldo actual es de: ", saldo, "$."
			"3":
				Escribir "Muchas gracias"
			De Otro Modo:
				Escribir "Opcion inválida"
		Fin Segun
	Mientras Que menu <> "3"

FinAlgoritmo
