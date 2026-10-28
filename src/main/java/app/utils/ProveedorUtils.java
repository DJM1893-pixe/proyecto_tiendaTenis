package main.java.app.utils;

import main.java.app.domain.Proveedor;

import java.util.List;

public class ProveedorUtils {

    public static Proveedor buscarPorId(List<Proveedor> proveedores, int id) {
        for (Proveedor p : proveedores) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public static Proveedor buscarPorNombre(List<Proveedor> proveedores, String nombre) {
        for (Proveedor p : proveedores) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    public static boolean validarContacto(String contacto) {
        return contacto != null && contacto.trim().length() >= 7;
    }

    public static String resumenProveedor(Proveedor proveedor) {
        return "ID: " + proveedor.getId() +
                " | Nombre: " + proveedor.getNombre() +
                " | Contacto: " + proveedor.getContacto();
    }
}

