/*Crea un programa que utilice un método "imprimirArray(int[] array)" que se encargue de imprimir un array por consola. El método debe recibir como 
parámetro un arreglo de tipo "int" y no devolver nada. Luego, crea una sobrecarga del método para que acepte arrays de tipo String y arreglos 
bidimensionales de tipo "int" y de tipo "String". */
public class ImprimirArray {
    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 3, 4, 5};
        String[] arrayString = {"Hola", "Mundo", "Java", "Sobrecarga"};
        int [][] arrayIntBidimensional = {{6, 7, 8}, {9, 10, 11}};
        String [][] arrayStringBidimensional = {{"Solo", "Mundo"}, {"Java", "Script"}};
        imprimirArray(arrayInt);
        imprimirArray(arrayString);
        imprimirArray(arrayIntBidimensional);
        imprimirArray(arrayStringBidimensional);
    }

    public  static void imprimirArray(int[] array) {
        for (int elementos:array){
            System.out.println("El arreglo int es:");
            System.out.print(elementos+" ");            
        }
        System.out.println();
    }
    
    public  static void imprimirArray(String[] array) {
        for (String elementos:array){
            System.out.println("El arreglo string es:");
            System.out.print(elementos+" ");
        }
        System.out.println();
    }

    public  static void imprimirArray(int[][] array) {
        System.out.println("La matriz int es:");
        for (int[] elementos:array){
            for (int numero:elementos){                
                System.out.print(numero+" ");
            }
            System.out.println();
        }
    }

    public  static void imprimirArray(String[][] array) {
        System.out.println("La matriz String es:");
        for (String[] elementos:array){
            for (String palabra:elementos){                
                System.out.print(palabra+" ");
            }
            System.out.println();
        }
    }      
    
}
/*
 * public class imprimirArrayMetodo {

public static void main(String[] args) {
int[] numeros = { 1, 2, 3 };
String[] palabras = { "Hola", "que", "tal" };
int[][] numeros2d = { { 1, 2, 3 }, { 3, 2, 1 } };
String[][] palabras2d = { { "Hola", "que", "tal" }, { "soy", "Giuliano", "y programo" } };
imprimirArray(numeros);
imprimirArray(palabras);
imprimirArray(numeros2d);
imprimirArray(palabras2d);
}

public static void imprimirArray(int[] array) {
System.out.println("El arreglo de int es: ");
for (int numero : array) {
System.out.print(numero + " ");
}
System.out.println();
}

public static void imprimirArray(String[] array) {
System.out.println("El arreglo de String es: ");
for (String palabra : array) {
System.out.print(palabra + " ");
}
System.out.println();
}

public static void imprimirArray(int[][] array) {
System.out.println("La matriz de int es: ");
for (int[] numeros : array) {
for (int numero : numeros) {
System.out.print(numero + " ");
}
System.out.println();
}
}

public static void imprimirArray(String[][] array) {
System.out.println("La matriz de String es: ");
for (String[] palabras : array) {
for (String palabra : palabras) {
System.out.print(palabra + " ");
}
System.out.println();
}
System.out.println();
}
}
 */