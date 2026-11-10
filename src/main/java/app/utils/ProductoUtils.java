package app.utils;

import app.domain.Producto;

import java.util.List;

public class ProductoUtils {

    public static Producto buscarPorId(List<Producto> productos, int id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public static Producto buscarPorNombre(List<Producto> productos, String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    public static boolean validarPrecio(double precio) {
        return precio > 0;
    }

    public static String resumenProducto(Producto producto) {
        return "ID: " + producto.getId() +
                " | Nombre: " + producto.getNombre() +
                " | Marca: " + producto.getMarca() +
                " | Precio: $" + producto.getPrecio();
    }
}