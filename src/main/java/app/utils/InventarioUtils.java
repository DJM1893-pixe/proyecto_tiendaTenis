package main.java.app.utils;

public class InventarioUtils {
    public static boolean tallaValida(int talla) {
        return talla > 0;
    }

    public static boolean cantidadValida(int cantidad) {
        return cantidad > 0;
    }
}
