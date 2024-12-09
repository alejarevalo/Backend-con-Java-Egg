package modelos;
/*
 * Luego, deberás crear dos clases que hereden de la clase "Animal": La clase "Perro" y la clase "Gato". Cada una de estas subclases debe poseer sus propios atributos y métodos únicos. Por ejemplo, la clase "Perro" podría incluir el atributo "raza" y el método "ladrar()".
 */
public class Gato extends Animal{
    private String color;
    
    public Gato() {
        super();
    }

    public Gato (String nombre, Integer edad, String color){
        super(nombre, edad);
        this.color = color  ;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void maullar(){
        System.out.println("Maullando");
    }

    @Override
    public void comer() {        
       // super.comer(); -> esto implementa tal cual está en Animal
       System.out.println("Gato comiendo elegantemente.");
    }

    @Override
    public void dormir() {
        super.dormir(); // vamos a dejar "Durmiendo"
        System.out.println("El gato duerme hasta 16 horas al día.");
    }


}