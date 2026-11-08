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
}