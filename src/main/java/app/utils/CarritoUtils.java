package app.utils;

import app.domain.Carrito;

import java.util.List;

public class CarritoUtils {

    public static Carrito buscarPorId(List<Carrito> carritos, int id) {

        for (Carrito carrito : carritos) {
            if (carrito.getId() == id) {
                return carrito;
            }
        }

        return null;
    }

    public static String resumenCarrito(Carrito carrito) {

        return "ID: " + carrito.getId() +
                " | Fecha creación: " + carrito.getFechaCreacion();
    }
}