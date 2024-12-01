import java.util.Scanner;

public class Usuario {

    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String solicitarNombre() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa nombre");
        String nombre = "";
        String saludar = "";
        try {
            nombre = sc.nextLine();
            System.out.println(nombre.length());
            saludar = "Hola " + nombre;

        } catch (Exception e) {
            throw new Exception("ingresaste una nombre invalido");
        } finally {

            sc.close();
        }
        if (nombre.length() <= 2) {
            throw new Exception("nombre ingresado es menor de dos carácteres");
        }
        setNombre(nombre);

        return saludar;
    }
}
