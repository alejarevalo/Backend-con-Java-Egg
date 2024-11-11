import java.util.Arrays;
import java.util.Scanner;
public class LlenadoPersonalizado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digita el tamaño del arreglo:");
            int size = sc.nextInt();
            int[] array = new int[size];
            System.out.println("Digita el número con con el que vas a llenar el arreglo:");
            int num =  sc.nextInt();
            int index =  0;
            do {
                System.out.printf("Hasta qué indice quieres rellenarlo (Debe ser menor al tamaño %d):", size);
                index = sc.nextInt();
            } while (index >=  size);
            
            Arrays.fill(array,0,index,num);
            int index2 = 0;

            do {
                System.out.println("Ingresa otro numero para llenar:");
                int num2 = sc.nextInt();   // pide nuevo número para llenar   
                do {      //ingresa al bucle para verificar que el nuevo índice sea mayor al anterior
                System.out.printf("Ingresa el nuevo índice hasta donde quieres llenar (mayor al anterior %d \ny menor o igual al tamaño %d):", index, size);
                index2 = sc.nextInt();
                } while (index2 <= index);
                Arrays.fill(array,index,index2,num2);
                index =  index2;
            } while (index2 < size);

            sc.close();
            System.out.println("El arreglo quedó así: ");
            System.out.println(Arrays.toString(array));

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: El índice ingresado es mayor al tamaño del arreglo: "+e.getMessage());
        }

    }
}
/* OTRAS FORMAS:
 * public static void arraysOpcionals(Scanner scanner) {
try {
System.out.println("Enter a number for the length of an array: ");
int length = scanner.nextInt();
int[] array = new int[length];

int lastIndex = 0; // Comienza desde el índice 0

while (lastIndex < length) {
System.out.println("Enter a value to fill the array: ");
int value = scanner.nextInt();

System.out.println("Enter an index (between " + lastIndex + " and " + (length - 1) + ") to fill up to: ");
int index = scanner.nextInt();

if (index < lastIndex || index >= length) {
System.out.println("Invalid index. Please try again.");
continue; // Repite la solicitud si el índice no es válido
}

// Llenar el array desde lastIndex hasta index con el valor dado
for (int i = lastIndex; i <= index; i++) {
array[i] = value;
}

lastIndex = index + 1; // Actualizar lastIndex para la próxima iteración
}

// Mostrar el array completo
System.out.println("Final array: ");
for (int i : array) {
System.out.print(i + " ");
}

} catch (Exception e) {
System.out.println("Invalid input");
}
}
 */

 /* Rellenando un arreglo de manera personalizada
 
 Escribe un programa en Java que realice lo siguiente:
 Solicita al usuario un tamaño para un arreglo.
 Luego, pídele que ingrese un número con el que desea rellenar el array.
 Solicita el índice hasta el cual quiere rellenar el array con el número anterior.
 El array deberá ser rellenado con el número proporcionado hasta el índice ingresado por el usuario.
 Asegúrate de validar lo siguiente:
 La primera vez que se pide al usuario un número para rellenar el arreglo, el índice inicial debe ser 0.
 Si el índice ingresado no es el índice del último elemento del arreglo, el programa debe continuar pidiendo
 al usuario nuevos números e índices para rellenar el arreglo.
 El índice siempre debe ser menor que el tamaño total del arreglo.
 Cada vez que se solicita un nuevo número para rellenar el arreglo, el índice ingresado
 debe ser mayor que el último índice ingresado; a su vez, se debe rellenar el array con el nuevo número
 desde el índice anterior hasta el nuevo índice.
 Por último, el programa debe imprimir por consola el arreglo completo.
 
 ]
 
 */
 
 
//  public class complementario {
//  public static void main(String[] args) {
//  Scanner scanner = new Scanner(System.in);
//  System.out.println("Ingrese el tamaño del arreglo:");
//  int size = scanner.nextInt();
//  int[] array = new int[size];
//  System.out.println("Ingrese un número para rellenar el arreglo:");
//  int num = scanner.nextInt();
//  scanner.nextLine();
//  int lastIndex = 0;
//  while (true) {
//  System.out.println("Ingrese el índice hasta donde quiere rellenar el arreglo (mayor o igual a " + lastIndex + " y menor que " + size + "):");
//  int index = scanner.nextInt();
//  if (index < lastIndex || index > size) {
//  System.out.println("Índice inválido. Inténtelo de nuevo.");
//  continue;
//  }
//  Arrays.fill(array, lastIndex, index, num);
//  lastIndex = index;
//  if (lastIndex == size) {
//  break;
//  }
//  System.out.println("Ingrese otro número para rellenar el arreglo:");
//  num = scanner.nextInt();
//  scanner.nextLine();
//  }
//  System.out.println(Arrays.toString(array));
//  scanner.close();
//  }
//  }