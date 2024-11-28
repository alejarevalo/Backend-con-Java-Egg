import enums.DiaSemana;

public class App{
    public static void main(String[] args) {
        DiaSemana[] dias = new DiaSemana[10];

        for (int i = 0; i < dias.length; i++) {
            int numeroAzar= (int)(Math.random()*(7));
            dias[i]=DiaSemana.values()[numeroAzar];
            System.out.println("El día "+dias[i].name());
            imprimeDia(dias[i]);
            
        }
        
    }

    public static void imprimeDia(DiaSemana dia){
        if (dia.esDiaLaboral(dia)) System.out.println("Es día laboral");
        else System.out.println("No es día laboral");
    }
}