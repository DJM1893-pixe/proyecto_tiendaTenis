package app.utils;

import app.domain.Cliente;

import java.util.List;

public class ClienteUtils {

    public static Cliente buscarPorId(List<Cliente> clientes, int id) {

        for (Cliente cliente : clientes) {

            if (cliente.getId() == id) {
                return cliente;
            }
        }

        return null;
    }

    public static boolean validarCorreo(String correo) {

        return correo != null &&
                correo.contains("@") &&
                correo.contains(".");
    }

    public static boolean validarNombre(String nombre) {

        return nombre != null &&
                !nombre.trim().isEmpty();
    }
}

