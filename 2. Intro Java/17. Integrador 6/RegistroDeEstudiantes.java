/*Escribe un programa en Java que permita al usuario llevar un registro de alumnos. El programa debe cumplir con los siguientes requisitos:
Muestra un menú de opciones al usuario donde podrá:
1.	Registrar alumno: Permitir al usuario registrar un nuevo alumno ingresando su nombre y nota. 
2.	Mostrar todos los alumnos: Mostrar en pantalla el nombre y la nota de todos los alumnos registrados hasta el momento.
3.	Mostrar promedio de notas: Calcular y mostrar en pantalla el promedio de las notas de todos los alumnos registrados hasta el momento.
4.	Buscar alumno por nombre: Solicitar al usuario ingresar el nombre de un alumno y mostrar en pantalla su nota si el alumno existe.
5.	Modificar nota por nombre: Solicitar al usuario ingresar el nombre de un alumno y permitir modificar su nota si el alumno existe.
6.	Eliminar alumno por nombre: Solicitar al usuario ingresar el nombre de un alumno y eliminar al alumno si existe.
7.	Salir.
El programa debe validar que el nombre no esté vacío y que la nota sea un número válido entre 0.00 y 10.00; debe manejar excepciones utilizando bloques try-catch 
para manejar posibles excepciones al leer datos de entrada del usuario. Después de realizar una operación, mostrar el menú de opciones nuevamente para que el usuario 
pueda elegir otra acción hasta que elija la opción "Salir".
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class RegistroDeEstudiantes{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int option=0;
        System.out.println("¿Cuantos alumnos quiere registrar?");
        int tamanioAlumnos = Integer.parseInt(sc.nextLine());//para limpiar el buffer
        String [] alumnos = new String[tamanioAlumnos];
        double [] notas = new double[tamanioAlumnos];
        String alumno;

        try {
            do{
                System.out.println("""
                ---------------------
                Menú de opciones
                1. Registrar alumno y nota
                2. Mostrar alumnos 
                3. Mostrar promedio de notas
                4. Buscar alumno
                5. Modificar nota
                6. Eliminar alumno
                7. Salir                
                """);
                option = Integer.parseInt(sc.nextLine());

                switch (option) {
                    case 1 -> {

                        for (int i = 0; i < tamanioAlumnos; i++) {
                            do{
                                System.out.println("Ingrese el nombre del alumno "+(i+1)+": ");                    
                                alumnos[i] =  sc.nextLine().trim();                                 
                            } while(alumnos[i].isBlank());
                            do{                           
                                System.out.println("Ingrese la nota del alumno "+(i+1)+": ");
                                notas[i] = Double.parseDouble(sc.nextLine()); 
                            } while(notas[i]<0 || notas[i]>10);
                        }                    
                    }
                    case 2 -> {
                        for (int i = 0; i < tamanioAlumnos; i++) {
                            System.out.println("Alumno: "+alumnos[i]+" - Nota: "+notas[i]);
                        }
                    }
                    case 3 -> {                        
                        double suma = 0;
                        for (int i  = 0; i < tamanioAlumnos; i++) {
                            suma +=  notas[i];
                        }
                        double promedio = suma/tamanioAlumnos;
                        System.out.println("El promedio de notas es: "+promedio);
                    }
                    case 4  -> {
                        System.out.println("Ingrese el nombre del alumno para buscar: ");
                        alumno = sc.nextLine().toLowerCase();
                        int i;
                        for (i = 0; i < alumnos.length; i++) {
                            if (alumnos[i].toLowerCase().contains(alumno)) {
                            System.out.println("La nota del alumno " + alumnos[i] + " es: " + notas[i]);
                            break;
                            }
                        }
                        if (i == alumnos.length) System.out.println("Alumno no encontrado.");                    
                    }
                    case 5 -> {
                        System.out.println("Ingrese el nombre del alumno cuya nota quiere modificar: ");
                        alumno = sc.nextLine().toLowerCase();                        
                        int i;
                        for (i = 0; i < alumnos.length; i++) {
                            if (alumnos[i].toLowerCase().contains(alumno)) {
                            System.out.println("La nota del alumno " + alumnos[i] + " es: " + notas[i]);
                            System.out.println("Ingrese la nueva nota del alumno: ");
                            notas[i] = Double.parseDouble(sc.nextLine());
                            System.out.println("La nueva nota es:  "+notas[i]);
                            break;
                            }
                        }
                        if (i == alumnos.length) System.out.println("Alumno no encontrado."); 
                    }
                    case  6 -> {
                        System.out.println("Ingrese el nombre del alumno para borrar: ");
                        alumno = sc.nextLine().toLowerCase();                       
                        int i;
                        for (i = 0; i < alumnos.length; i++) {
                            if (alumnos[i].toLowerCase().contains(alumno)) {
                                alumnos[i] = "";
                                notas[i] = 0;
                                System.out.println("Alumno borrado.");
                            break;
                            }
                        }
                        if (i == alumnos.length) System.out.println("Alumno no encontrado.");
                    }
                    case 7  -> System.out.println("Gracias por utilizar el sistema");
                }
            } while(option != 7);
            sc.close();
        }catch (InputMismatchException e){
            System.out.println("Tipo de dato inválido: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }         
    }
}