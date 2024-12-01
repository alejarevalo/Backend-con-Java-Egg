public class Saludo {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(null);
        try {
            System.out.println(usuario.solicitarNombre());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}