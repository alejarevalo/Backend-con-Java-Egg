    /* Escribe un programa en Java que permita al usuario realizar diversas operaciones con una oración. El programa debe cumplir con los siguientes requisitos:
    1.	Muestra un menú de opciones al usuario donde podrá:
    1.	Crear oración o Borrar oración: Si la oración está vacía, mostrar el mensaje "Crear oración". Si la oración tiene contenido, mostrar el mensaje "Borrar oración".
    2.	Cantidad de caracteres de la oración: Calcular y mostrar la cantidad total de caracteres en la oración (incluyendo espacios).
    3.	Cantidad de palabras de la oración: Calcular y mostrar la cantidad de palabras en la oración.
    4.	Mostrar palabras ordenadas alfabéticamente: Mostrar las palabras de la oración ordenadas alfabéticamente.
    5.	Ingresar un número y devolver la palabra correspondiente: Solicitar al usuario ingresar un número y mostrar la palabra correspondiente a esa posición en la oración.
    Si se ingresa un número fuera del rango de número de palabras (la primera palabra corresponde al número 1), mostrar el mensaje "Número inválido. Intente nuevamente".
    6.	Buscar palabra dentro de la oración: Solicitar al usuario ingresar una palabra y verificar si esa palabra se encuentra en la oración. Mostrar un mensaje indicando 
    si la palabra fue encontrada y la posición en la que se encuentra.
    7.	Modificar palabra dentro de la oración: Solicitar al usuario ingresar la palabra que se quiere cambiar, mostrar un mensaje de error si no se encuentra y volver 
    a solicitar la palabra. Si la palabra es correcta, solicitar una nueva palabra (o frase) y reemplazar la anterior. Mostrar la nueva oración modificada (recordar validar
    que solo contenga letras y espacios).
    8.	Agregar contenido a la oración: Solicitar al usuario ingresar contenido y agregar ese contenido al final de la oración.
    9.	Salir: Terminar el programa.
    Después de realizar una operación, mostrar el menú de opciones nuevamente para que el usuario pueda elegir otra acción, excepto cuando elija "Salir".*/

import java.util.Arrays;
import java.util.Scanner;

public class MenuOraciones {
    public static void main(String[] args) throws Exception{
        Scanner reader = new Scanner(System.in);
        int option = 0, i;
        String sentence = "", palabra = "", palabra2 = "";
        String[] palabras={};
        boolean vbool;

        do {
            System.out.println("Menú de opciones");

            System.out.println("1. " + (sentence.isEmpty() ? "Crear oración" : "Borrar oración")); // para que le aparezca la opción 
            //según lo que lleve dentro la variable sentence
            System.out.println("2. Cantidad de caracteres");
            System.out.println("3. Cantidad de palabras");
            System.out.println("4. Ordenadas alfabéticamente");
            System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
            System.out.println("6. Buscar palabra");
            System.out.println("7. Modificar palabra");
            System.out.println("8. Agregar contenido");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            option = reader.nextInt();
            reader.nextLine();// cuando leemos un entero o un double, toma el salto de línea, por eso leemos otro nextLine() para que no nos de error
            switch (option) {
                case 1:
                    if (sentence.isEmpty()) {
                        System.out.println("Crear una oracion:");
                        sentence = reader.nextLine().trim();
                        palabras = sentence.split(" "); //al parecer esto ya inicializa tanto el tamaño como los elementos del array palabras (??)
                    } else {
                        System.out.println("Borrando oración...");
                        sentence = "";
                    }
                    break;
                case 2:
                    System.out.println("La cantidad de caracteres es: " + sentence.length());
                    break;
                case 3:
                    System.out.println("La cantidad de palabras es: " + palabras.length);// el  split() divide la oración en palabras, el regex
                    // es el separador y el .length es para contar cuántas palabras hay
                    break;
                case 4:
                    Arrays.sort(palabras, String.CASE_INSENSITIVE_ORDER); //Organiza alfabéticamente el array de palabras 
                    // (el comparador String.CASE_INSENSITIVE_ORDER hace
                    //que java ignore la mayúscula y minúscula al ordenar) (Lo veré más adelante en interfaces, I guess)

                    System.out.println("Palabras organizadas: " + Arrays.toString(palabras)); //lo convierte a String
                     // no se puede poner Arrays.toString(Arrays.sort(aux)) porque sort() devuelve void

                    break;
                case 5:
                    System.out.println("Ingrese un numero");
                    int posicion = reader.nextInt() - 1; // se pone -1 para que coincida con el index del arreglo
                    reader.nextLine();                    
                    if (posicion < palabras.length) {
                        palabra = palabras[posicion];// se guarda la palabra de esa posición.
                        System.out.printf("La palabra en la posición %d es %s.\n",(posicion + 1), palabra);
                    } else {
                        System.out.println("Número inválido. Intente nuevamente.");
                    }
                    break;
                case 6:
                    System.out.println("Ingrese una palabra a buscas:");
                    palabra = reader.nextLine().toLowerCase();                    
                    for (i = 0; i < palabras.length; i++) {
                        if (palabras[i].toLowerCase().contains(palabra)) { //usamos los métodos de la clase STRING 1) para comparar sin interferencias por mayúsculas 
                            // y 2) para saber si la palabra de la posición [i] es la misma que la buscada dentro del método booleano contains()
                            System.out.println("La palabra es:" + palabras[i] + " y está en la posicion:" + (i + 1));
                            break; // se sale del for tan pronto encuentra la palabra

                        }
                    }
                    if (i == palabras.length) { // si i es igual al tamaño del array, significa que hizo todas las iteraciones sin encontrar la palabra
                        System.out.println("No está tu palabra.");
                    }
                    break;
                case 7:
                    do {
                        System.out.println("Ingrese una palabra a modificar:");
                        palabra = reader.nextLine().toLowerCase();
                        vbool = sentence.contains(palabra);
                        if (vbool) {
                            do{
                                System.out.println("Ingresa la nueva palabra (solo letras y espacios):");
                                palabra2 = reader.nextLine();
                                if (palabra2.matches("^[A-Za-zÀ-ÿ\\s]+$")){ // "^[A-Za-zÀ-ÿ\\s]+$" es una expresion regular que se asegura de 
                                // que la palabra ingresada solo contenga letras y espacios
                                    sentence = sentence.replaceFirst(palabra, palabra2); // se remplaza la primera ocurrencia con la nueva. 
                                    // Si se quiere remplazar todas las ocurrencias, entonces se pondría solo sentence.replace(palabra, palabra2)
                                    System.out.println("La nueva oracion: " + sentence);
                                    break; // este break  sale del do-while

                                } else System.out.println("La nueva palabra solo debe contener letras y espacios. Intente de nuevo.");
                            } while(true);
                                
                        }  else System.out.println("La palabra no se encuentra en la oración. Intente de nuevo.");

                    } while (!vbool);

                    
                    break;
                case 8:
                    System.out.print("Ingrese nuevo contenido a la oración: ");
                    palabra = reader.nextLine();
                    sentence = sentence.concat(" ").concat(palabra).trim();  // se concatena el espacio y la nueva palabra y se elimina el espacio del final (?)
                    System.out.println("Nueva oración: " + sentence);

                    break;
                case 9:
                    System.out.println("Chau");
                    break;
                default:
                    option = 10;
                
            }//switch end
            System.out.println("-------------------------------------------");
        } while (option != 9);
        reader.close();
    }
}

/** OTRA VERSIÓN:
 * 
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManipulandoOracion{

public static void main(String[] args) {
System.out.println("\33\143");
Scanner sc = new Scanner(System.in);
int opcion;
String oracion = "";

try {
do {
System.out.println("-----------------------");
System.out.println("MENU");
System.out.println("1. Crear oración o Borrar oración");
System.out.println("2. Cantidad de caracteres de la oración [incluyendo espacios]");
System.out.println("3. Cantidad de palabras de la oración");
System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
System.out.println("6. Buscar palabra dentro de la oración");
System.out.println("7. Modificar palabra dentro de la oración");
System.out.println("8. Agregar contenido a la oración");
System.out.println("9. Salir");
System.out.println("-----------------------");
System.out.print("Ingrese la opcion deseada: ");
opcion = sc.nextInt();
System.out.println("");
sc.nextLine();

switch (opcion) {
case 1 -> {
if (oracion.equals("")) {
System.out.println("Creando una oración...");
System.out.print("Ingrese una oración: ");
oracion = sc.nextLine();
} else {
System.out.println("Borrando oración...");
oracion = "";
}
System.out.println(oracion);
}
case 2 -> {
System.out.printf("La oracion '%S' tiene %d caracteres\n", oracion, oracion.length());
}
case 3 -> {
int cant = 1;
for (int i = 0; i < oracion.length(); i++) {
char car = oracion.charAt(i);
if (car == ' ') {
cant++;
}
}
System.out.printf("La oración %S tiene %d palabras\n", oracion, cant);
}
case 4 -> {
System.out.println("Opcion 4");
String[] oracionOrdenada = oracion.split(" ");
Arrays.sort(oracionOrdenada);
System.out.println("Las palabras ordenadas serian: "+Arrays.toString(oracionOrdenada));
}
case 5 -> {System.out.println("Opcion 5");
System.out.println("ingresa el numero de la posicion deseada: ");
int posicion = sc.nextInt();
String[] oracionOrdenada = oracion.split(" ");

while (posicion > oracionOrdenada.length -1) {
System.out.println("la posicion ingresada no es valida. Ingresa nuevamente el numero");
posicion = sc.nextInt();
}
System.out.println("la palabra en la poscion "+posicion+": "+oracionOrdenada[posicion]);

}
case 6 -> {System.out.println("Opcion 6");
System.out.println("Ingresa una palabra: ");
String palabraNueva = sc.nextLine();
String[] palabra = oracion.split(" ");
boolean coincide = false;
for (int i = 0; i < palabra.length; i++) {
if (palabra[i].equals(palabraNueva)) {
System.out.println("La palabra " + palabraNueva + " se encuentra en la posición " + i);
coincide = true;
break;
}
}
if (!coincide) {
System.out.println("La palabra no se encuentra en la oración.");
}
break;

/*
System.out.println("Ingresa una palabra: ");
String palabraNueva=sc.nextLine();
String[] palabra = oracion.split(" ");
for (int i=0; i<palabra.length;i++){
if (palabraNueva.equals(palabra[i])) {
System.out.println("La palabra " + palabraNueva + " se encuentra en la posición " + i);
}
System.out.println("La palabra no se encuentra en la oración." );
}
//default:
break;
*
*/
/*
System.out.println("ingresa una palabra: ");
String palabraNueva = sc.nextLine();
String[] oracionOrdenada = palabraNueva.split(" ");
for (int i = 0; i < oracionOrdenada.length; i++) {
if (oracionOrdenada[i].equals(palabraNueva) ) {
System.out.println("la nueva palabra se encuentra en la posicion "+i);
} else {
System.out.println("la nueva palabra no se encuentra en la oracion.");
}
}
*


}

case 7 -> {System.out.println("Opcion 7");
System.out.println("Ingresa una palabra que quieres cambiar: ");
String palabraAModificar = sc.nextLine();
String[] palabra = oracion.split(" ");
boolean coincide = false;

do {
for (int i = 0; i < palabra.length; i++) {
if (palabra[i].equals(palabraAModificar)) {
System.out.println("La palabra " + palabraAModificar + " se encuentra en la posición " + i);
coincide = true;
break;
}
}
if (!coincide) {
System.out.println("La palabra no se encuentra en la oración.");
}
break;
} while (!coincide);
palabra[i] = palabraAModificar;
System.out.println("la palabra modificada es "+Arrays.toString(palabra));
}

case 8 -> System.out.println("Opcion 8");
case 9 -> System.out.println("Adios!");
default -> System.out.println("OPCION INVÁLIDA!");
}
} while (opcion != 9);

} catch (InputMismatchException e) {
System.out.println("-----------------------");
System.out.println("ERROR! Se debe ingresar un entero");
System.out.println("-----------------------");
}

sc.close();
}
}
*/