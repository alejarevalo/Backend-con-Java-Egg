Algoritmo Desafio_grupal_PesoBotellas
	Definir usuario, contrasenia Como Caracter
	Definir loginOk Como Logico
	Definir intentos Como Entero
	Definir opcionMenu como Entero
	
	loginOk = Falso
	intentos = 0
	
	//Verificar LOGIN, 3 intentos
	Mientras loginOK == falso Y intentos < 3
		Escribir "Ingrese usuario"
		Leer usuario
		Escribir "Ingrese contrasena"
		Leer contrasenia
		Si usuario = "Albus_D" Y contrasenia = "caramelosDeLimon" Entonces
			loginOk = Verdadero
			Escribir "Bienvenido"
		SiNo
			intentos = intentos + 1
			Escribir "Credenciales incorrectas, intente de nuevo"
		FinSi
		Si intentos = 3 Entonces
			Escribir "Ya agotaste tus 3 intentos de inicio de sesión"
		FinSi
	FinMientras
	
	//Realizar MENU
	Definir cantBotellas, pesoBotella, saldoAcumulado, saldoUsuario, i Como Entero
	Definir aceptaSaldoAcumulado Como Caracter
	saldoUsuario = 0
	saldoAcumulado = 0
	Escribir "================================="
	Si loginOk = Verdadero Entonces		
		Repetir
			
			Escribir "================================="
			Escribir "Menu Principal"
			Escribir "1- Ingresar Botellas"
			Escribir "2- Consultar Saldo"
			Escribir "3- Salir"
			Leer opcionMenu
			
			Segun opcionMenu Hacer
				1:
					Escribir "Ingrese cantidad de botellas"
					Leer cantBotellas
					saldoAcumulado = 0
					Para i = 1 Hasta cantBotellas
						pesoBotella = Aleatorio(100, 3000)
						Si pesoBotella <= 500 Entonces
							saldoAcumulado = saldoAcumulado + 50
						SiNo
							Si pesoBotella <= 1500 Entonces
								saldoAcumulado = saldoAcumulado + 125
							SiNo
								saldoAcumulado = saldoAcumulado + 200
							FinSi
						FinSi
					FinPara
					Escribir "El saldo acumulado es de: ", saldoAcumulado
					Escribir "Acepta el saldo? SI/NO"
					Leer aceptaSaldoAcumulado
					aceptaSaldoAcumulado = Mayusculas(aceptaSaldoAcumulado)
					Si aceptaSaldoAcumulado = "SI" Entonces
						saldoUsuario = saldoUsuario + saldoAcumulado
						Escribir "Su saldo actual es de: ", saldoUsuario
					SiNo
						Escribir "Devolviendo material"
					FinSi
				2:
					Escribir "Su saldo actual es: ", saldoUsuario
				3:
					Escribir "¡Vuelva pronto!"
					loginOk = Falso
				De Otro Modo:
					Escribir "Opción inválida"
			FinSegun
			
		Mientras Que opcionMenu <> 3			
	FinSi
		
FinAlgoritmo
