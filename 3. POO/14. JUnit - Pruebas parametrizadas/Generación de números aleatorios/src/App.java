package src;
public class App{
    public static void main(String[] args) {
       for (int i = 0; i < 100; i++) {
        System.out.println("El numero aleatorio es: "+numeroAleatorio());
        }
    }

    public static Integer numeroAleatorio(){
        Integer random = (int) (Math.random()*355-1+1)+1;
        return random;
    }

}