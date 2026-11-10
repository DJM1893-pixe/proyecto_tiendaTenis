package app.service;

import app.domain.Pedido;
import app.utils.PedidoUtils;

import java.util.List;

public class PedidoService {

    private final List<Pedido> pedidos;

    public PedidoService(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public List<Pedido> obtenerTodos() {
        return pedidos;
    }

    public Pedido buscarPorId(int id) {
        return PedidoUtils.buscarPorId(pedidos, id);
    }

    public Pedido buscarPorEstado(String estado) {
        return PedidoUtils.buscarPorEstado(pedidos, estado);
    }

    public boolean estadoValido(String estado) {
        return PedidoUtils.validarEstado(estado);
    }
}