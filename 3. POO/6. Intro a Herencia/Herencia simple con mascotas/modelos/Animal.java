package modelos;
/*
 * En esta actividad, se te solicita crear una clase llamada "Animal". Esta clase debe incluir los atributos "nombre" y "edad", así como los métodos "comer()" y "dormir()". En este contexto, la clase "Animal" actúa como la superclase o clase padre.
 */
public class Animal {
    protected String nombre;
    protected Integer edad;
    
    public Animal() {
    }

    public Animal(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void comer(){
        System.out.println("Comiendo");
    }

    
    public void dormir(){
        System.out.println("Durmiendo");
    }
}