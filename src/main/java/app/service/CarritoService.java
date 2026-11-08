package app.service;

import app.domain.Carrito;
import app.utils.CarritoUtils;

import java.util.List;

public class CarritoService {

    private final List<Carrito> carritos;

    public CarritoService(List<Carrito> carritos) {
        this.carritos = carritos;
    }

    public List<Carrito> obtenerTodos() {
        return carritos;
    }

    public Carrito buscarPorId(int id) {
        return CarritoUtils.buscarPorId(carritos, id);
    }
}
