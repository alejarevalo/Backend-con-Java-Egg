package modelos;
/* Luego, deberás crear dos clases que hereden de la clase "Animal": La clase "Perro" y la clase "Gato". Cada una de estas subclases debe poseer sus propios atributos y métodos únicos. Por ejemplo, la clase "Perro" podría incluir el atributo "raza" y el método "ladrar()".
- Ahora, sobrescribe los métodos "comer()" y "dormir()" en las subclases "Perro" y "Gato" para que muestren comportamientos específicos de cada animal. Por ejemplo, cuando un perro coma, podría imprimir "El perro está comiendo croquetas" y cuando un gato duerma, podría imprimir "El gato está durmiendo encima del sofá".
- Sobrescribe el método "equals()" y "hashCode()" únicamente en la clase "Perro". La clase "Gato" no requerirá esta sobrescritura.
- Recuerda invocar estos métodos desde el método main() para demostrar su funcionamiento.
 */
public class Perro extends Animal{
    private String raza;
    
    public Perro() {
        super();
    }

    public Perro (String nombre, Integer edad, String raza){
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void ladrar(){
        System.out.println("Ladrando");
    }

    @Override
    public void comer() {        
       // super.comer(); -> esto implementa tal cual está en Animal
       System.out.println("Perro tragando como si no hubiera mañana.");
    }

    @Override
    public void dormir() {
        super.dormir(); // vamos a dejar "Durmiendo"
        System.out.println("Perro perezoso.");
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return getNombre().hashCode() + raza.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())            
            return false;
        // if (!super.equals(obj)) //* */
        //     return false;            
        Perro otroPerro = (Perro) obj;
        if (raza == null){
            if (otroPerro.raza != null)
                return false;
        }else if (!raza.equals(otroPerro.raza)) {
            return false;
        }
        return true;

    }



    
    

}