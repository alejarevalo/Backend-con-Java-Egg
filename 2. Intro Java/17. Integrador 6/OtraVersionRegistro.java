import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class OtraVersionRegistro {
  public static void main(String[] args) {

    boolean flag = true;

    Scanner scan = new Scanner(System.in);

    System.out.println("Bienvenido al menú de alumnos");

    String[] alumnos = new String[0];
    double[] calificaciones = new double[0];

    do {

      System.out.println("Seleccione la accion realizar");
      System.out.println(
          "\n 1 - Registrar alumno \n 2 - Mostrar todos los alumnos \n 3 - Mostrar promedio de notas \n 4 - Buscar alumno por nombre \n 5 - Modificar nota \n 6 - Eliminar alumno \n 7 - Salir");

      try {

        int option = scan.nextInt();
        scan.nextLine(); // esto provocaba el error. hay que limpiar el buffer después de recibir un entero :).

        if (option >= 1 && option <= 7) {
          switch (option) {
            case 1 -> {
              String nombre = "";
              double nota = 0;

              try {
                System.out.println("Ingrese el nombre del alumno");
                nombre = scan.nextLine().trim();

                if (!nombre.matches("[a-zA-Z ]+")) {
                  throw new IllegalArgumentException("Nombre invalido.");
                }

              } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                break;
              }

              alumnos = Arrays.copyOf(alumnos, alumnos.length + 1);
              alumnos[alumnos.length - 1] = nombre;

              try {
                System.out.println("Ingrese la nota del alumno");
                nota = scan.nextDouble();
                scan.nextLine();
              } catch (InputMismatchException e) {
                System.out.println("Nota invalida");
                break;
              }

              calificaciones = Arrays.copyOf(calificaciones, calificaciones.length + 1);
              calificaciones[calificaciones.length - 1] = nota;

              System.out.println("Datos tomados correctamente");

              break;
            }
            case 2 -> {
              if (alumnos.length > 0) {
                String[] infoAlumnos = new String[alumnos.length];

                for (int i = 0; i < infoAlumnos.length; i++) {
                  infoAlumnos[i] = alumnos[i] + " " + calificaciones[i];

                  System.out.println(infoAlumnos[i]);
                }
              } else {
                System.out.println("No hay alumnos ingresados en el sistema");
                break;
              }

              scan.nextLine();
            }
            case 3 -> {
              double suma = 0;

              if (alumnos.length > 0) {
                for (double notaAlumno : calificaciones) {
                  suma = suma + notaAlumno;
                }

                double promedio = suma / alumnos.length;

                System.out.println("El promedio es de todos los alumnos es de: " + promedio);
              } else {
                System.out.println("No hay alumnos inscriptos para calcular el promedio");
              }

              break;
            }
            case 4 -> {
              System.out.println("Ingrese el nombre del alumno");
              String alumno = scan.nextLine();

              if (alumnos.length > 0) {
                boolean verificacion = true;
                int contador = 0;

                do {
                  /*
                   * System.out.println(alumno);
                   * System.out.println(alumnos[contador]);
                   */
                  // Verifica el nombre del alumno

                  // if (alumnos[contador].equals(alumno)) {
                  // System.out.println("La nota del alumno es: " + calificaciones[contador]);
                  // verificacion = false;
                  // } else {
                  // contador++;
                  // }

                  // } while (verificacion && contador < alumnos.length - 1);
                  if (alumnos[contador].equals(alumno)) {
                    System.out.println("La nota del alumno es: " + calificaciones[contador]);
                    verificacion = false;
                  } else {
                    contador++;
                  }

                } while (verificacion && contador < alumnos.length);
              } else {
                System.out.println("No hay alumnos inscriptos para buscar");
              }
            }
          }
        } else {
          System.out.println("Opccion no encontrada, vuelve a intentarlo");
        }

      } catch (InputMismatchException e) {
        System.out.println("Ingresaste un valor invalido, vuelve a intentarlo");
        scan.nextLine();
      }

    } while (flag);

    scan.close();
  }
}