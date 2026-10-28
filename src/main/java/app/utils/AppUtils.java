package main.java.app.utils;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class AppUtils {
    // Generar un ID único para productos, proveedores, etc.
    public static String generarIdUnico(String prefijo) {
        return prefijo + "_" + System.currentTimeMillis();
    }

    // Formatear fechas en un formato estándar
    public static String formatearFecha(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return sdf.format(fecha);
    }

    // Generar un número aleatorio dentro de un rango
    public static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    // Convertir texto a mayúsculas de forma segura
    public static String convertirMayusculas(String texto) {
        return texto != null ? texto.toUpperCase() : "";
    }
}

