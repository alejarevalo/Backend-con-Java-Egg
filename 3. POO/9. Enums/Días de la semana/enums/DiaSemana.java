package enums;

public enum DiaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;


    public boolean esDiaLaboral(DiaSemana dia){
        switch (dia) {
            case LUNES, MARTES, MIERCOLES, JUEVES, VIERNES -> {
                return true;
            }
            case SABADO, DOMINGO -> {
                return false;
            }
            default -> {
                return false;
            }
            
        }
    }

}
