package app.utils;

import app.domain.Pedido;

import java.util.List;

public class PedidoUtils {

    public static Pedido buscarPorId(List<Pedido> pedidos, int id) {

        for (Pedido pedido : pedidos) {
            if (pedido.getId() == id) {
                return pedido;
            }
        }

        return null;
    }

    public static String resumenPedido(Pedido pedido) {

        return "ID: " + pedido.getId() +
                " | Estado: " + pedido.getEstado() +
                " | Total: $" + pedido.getTotal();
    }
package app.utils;

import app.domain.Pedido;

import java.util.List;

public class PedidoUtils {

    public static Pedido buscarPorId(List<Pedido> pedidos, int id) {
        for (Pedido p : pedidos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public static Pedido buscarPorEstado(List<Pedido> pedidos, String estado) {
        for (Pedido p : pedidos) {
            if (p.getEstado().equalsIgnoreCase(estado)) {
                return p;
            }
        }
        return null;
    }

    public static boolean validarTotal(double total) {
        return total >= 0;
    }

    public static boolean validarEstado(String estado) {
        return estado != null && !estado.trim().isEmpty();
    }

    public static String resumenPedido(Pedido pedido) {
        return "ID: " + pedido.getId() +
                " | Fecha: " + pedido.getFecha() +
                " | Estado: " + pedido.getEstado() +
                " | Total: $" + pedido.getTotal();
    }
}