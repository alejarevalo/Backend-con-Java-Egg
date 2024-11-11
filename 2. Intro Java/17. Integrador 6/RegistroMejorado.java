/*
 * Se agregó un try -catch para manejar la entrada de número de alumnos (tamanioAlumnos).
 * Se agregó un do-while para asegurarse de que el usuario ingrese un número entero positivo en el número de alumnos.
 * Se manejó la impresión del null en caso de que el usuario no haya  ingresado un número de alumnos y seleccione el case 2 y el 3.
 * Se manejó el error "Cannot invoke "String.toLowerCase()" because "alumnos[i]" is null" en el case 4, 5 y 6.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class RegistroMejorado{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int option=0; int tamanioAlumnos; 
        System.out.println("REGISTRO DE ESTUDIANTES\n-------------------");
        try{  
            do{          
            System.out.println("¿Cuantos alumnos quiere registrar?");
            tamanioAlumnos = Integer.parseInt(sc.nextLine());//para limpiar el buffer  
            }while(tamanioAlumnos<=0);                    
        }catch  (NumberFormatException e){ 
            System.out.println("Error, no se puede leer el valor"); 
            sc.close();//se cierra aquí para que no quede abierto por si lanza error. La otra opción es un finally, (mirar al final del código)
            return;}

        String [] alumnos = new String[tamanioAlumnos];
        double [] notas = new double[tamanioAlumnos];
        String alumno;
        boolean hayAlumnos=false;
        
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
                                if(alumnos[i] != null){
                                    System.out.println("Alumno: "+alumnos[i]+" - Nota: "+notas[i]);                             
                                    hayAlumnos=true;        
                                  
                                }                                  
                            } 
                            if (!hayAlumnos) System.out.println("No hay alumnos registrados.");                               
                        }
                        case 3 -> {                        
                            double suma = 0;

                            for (int i  = 0; i < tamanioAlumnos; i++) {
                                if(alumnos[i] != null){
                                suma +=  notas[i];
                                hayAlumnos=true;
                                }
                            }
                            if (hayAlumnos){
                            double promedio = suma/tamanioAlumnos;
                            System.out.println("El promedio de notas es: "+promedio);
                            }else System.out.println("No hay alumnos registrados.");

                        }
                        case 4  -> {
                            System.out.println("Ingrese el nombre del alumno para buscar: ");
                            alumno = sc.nextLine().toLowerCase();
                            int i;
                            for (i = 0; i < alumnos.length; i++) {
                                if (alumnos[i] != null && alumnos[i].toLowerCase().contains(alumno)) {
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
                                if (alumnos[i] != null && alumnos[i].toLowerCase().contains(alumno)) {
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
                                if (alumnos[i] != null && alumnos[i].toLowerCase().contains(alumno)) {
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
            }/*finally {
                sc.close(); /*finally es un bloque de código que se ejecuta después de try-catch, sin importar si hubo una excepción o no.
                Esto garantiza que los recursos, como Scanner, se cierren correctamente.*/
            //}       
    }
}