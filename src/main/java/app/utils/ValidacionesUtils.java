package main.java.app.utils;

public class ValidacionesUtils {
    // Validar que un string no esté vacío
    public static boolean validarTexto(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    // Validar que un número sea positivo
    public static boolean validarNumeroPositivo(int numero) {
        return numero > 0;
    }

    // Validar que un precio esté dentro de un rango
    public static boolean validarPrecio(double precio, double min, double max) {
        return precio >= min && precio <= max;
    }
}

