import java.time.LocalDate;

public class PrimerPrograma {
    // boolean
    // char
    // String
    // Int
    // long
    // float
    public static void main(String[] args) {
    boolean esVerdadero = true;
    char caracter = 'A';
    String cadena = "Cadena de caracteres";
    int entero = 12;
    long largo = 3234234;
    float decimal = 343.214F;
    
    System.out.println("esVerdadero "+esVerdadero);
    System.out.println(caracter);
    System.out.println(cadena);
    System.out.println("entero: "+entero);
    System.out.println("long: "+largo);
    System.out.println("float: "+ decimal);
    
    System.out.println("");

    LocalDate dia = LocalDate.of(2024, 10, 2) ;        // para poner una fecha determinada
    
    LocalDate fechaActual = LocalDate.now();//para poner la fecha del día en que se ejecuta el codigo

    System.out.println("Este código se escribió el "+dia+" pero el la fecha de hoy es: "+fechaActual);

    int edad = 33;
    String nombre = "Paula Arévalo";
    
    System.out.println("Mi nombre es "+ nombre +" y tengo " +edad +" años");
        
}
    }