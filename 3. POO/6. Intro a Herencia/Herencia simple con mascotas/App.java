import modelos.Animal;
import modelos.Perro;

public class App{
    public static void main(String[] args) {
        Perro perro1 = new Perro("Rocky", 6, "Boxer");
        Perro perro2 = new Perro("Miel", 3, "Criolla");
        Perro perro3 = new Perro("Miel", 3, "Criolla");

        System.out.println(perro1.hashCode());
        System.out.println(perro2.hashCode());
        System.out.println(perro3.hashCode());
        System.out.println("--------------------------------------");
        System.out.println("perro 1 = perro 3: "+ perro1.equals(perro3)); // false
        System.out.println("perro 2 = perro 3: "+perro2.equals(perro3)); // true         
   

    }
}