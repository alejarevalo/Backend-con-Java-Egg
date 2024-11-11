import java.util.Random;

public class EstadisticasNotas {
    public static void main(String[] args) {
        String[] calificaciones = new String[50];
        Random rand = new Random();
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = String.valueOf(rand.nextDouble(1, 15));
        }
        int desaprobados = 0;
        int aprobados = 0;
        int excelente = 0;
        for (String calificacion : calificaciones) {
            double calificacionDouble = Double.valueOf(calificacion);
            if (calificacionDouble < 4) {
                desaprobados++;
            } else if (calificacionDouble < 10) {
                aprobados++;
            } else {
                excelente++;
            }
        }
        double[] desaprobadosArray = new double[desaprobados];
        double[] aprobadosArray = new double[aprobados];
        double[] excelentesArray = new double[excelente];
        int i = 0, j = 0, k = 0;
        for (String calificacion : calificaciones) {
            double calificacionDouble = Double.valueOf(calificacion);
            if (calificacionDouble < 4) {
                desaprobadosArray[i] = calificacionDouble;
                i++;
            } else if (calificacionDouble < 10) {
                aprobadosArray[j] = calificacionDouble;
                j++;
            } else {
                excelentesArray[k] = calificacionDouble;
                k++;
            }
        }

        double promedioTotal = 0;
        double promedioDesaprobados = 0;
        double promedioAprobados = 0;
        double promedioExcelentes = 0;

        for (String calificacion : calificaciones) {
            double calificacionDouble = Double.valueOf(calificacion);
            promedioTotal += calificacionDouble;
        }
        promedioTotal /= calificaciones.length;
        System.out.println("Promedio total: " + promedioTotal);

        if (desaprobadosArray.length > 0) {
            for (Double calificacion : desaprobadosArray) {
                promedioDesaprobados += calificacion;
            }
            promedioDesaprobados /= desaprobadosArray.length;
            System.out.println("Promedio desaprobados: " + promedioDesaprobados);
        } else {
            System.out.println("Nadie desaprobó");
        }

        if (aprobadosArray.length > 0) {
            for (Double calificacion : aprobadosArray) {
                promedioAprobados += calificacion;
            }
            promedioAprobados /= aprobadosArray.length;
            System.out.println("Promedio aprobados: " + promedioAprobados);
        } else {
            System.out.println("Nadie aprobó");
        }

        if (excelentesArray.length > 0) {
            for (Double calificacion : excelentesArray) {
                promedioExcelentes += calificacion;
            }
            promedioExcelentes /= excelentesArray.length;
            System.out.println("Promedio excelentes: " + promedioExcelentes);
        } else {
            System.out.println("Nadie obtuvo una nota excelente");
        }
    }
}
