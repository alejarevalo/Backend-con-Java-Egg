public class Carro {

    String marca;
    String modelo;
    Integer anio;

    public Carro() {

    }

    public Carro(String marca, String modelo, Integer anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Carro(String marca) {
        this.marca = marca;
    }

    public void ImprimirCarro() {

        if (this.marca == null && this.modelo == null && this.anio == null) {

            System.out.println("No se poseen datos");

        } else {

            if (this.marca != null) {

                System.out.println("La marca es: " + this.marca);
                ;

            }
            if (this.modelo != null) {

                System.out.println("El modelo es: " + this.modelo);
                ;

            }

            if (this.anio != null) {

                System.out.println("El año es: " + this.anio);
                ;

            }

        }

    }

}
