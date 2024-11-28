package modelos;

import enums.Color;

public class ConvertidorColor {
    
    public static Color convertirHexadecimal(String valorHexadecimal) {
        for (Color color : Color.values()) {
            if (color.getValorHexadecimal().equalsIgnoreCase(valorHexadecimal)) {
                return color; // Devuelve el color si encuentra una coincidencia
            }
        }
        return null; // Devuelve null si no encontró coincidencias después de recorrer todos los colores
    }
}
