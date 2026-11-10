package app.service;

import app.domain.Carrito;
import app.repository.CarritoRepository;
import app.utils.CarritoUtils;

import java.util.List;

public class CarritoService {

    private final CarritoRepository repository;

    public CarritoService(CarritoRepository repository) {
        this.repository = repository;
    }

    public void agregar(Carrito carrito) {
        repository.guardar(carrito);
    }
    public boolean agregarProducto(int carritoId, int productoId, int cantidad) {
        if (cantidad <= 0 || buscarPorId(carritoId) == null) {
            return false;
        }
        repository.agregarProducto(carritoId, productoId, cantidad);
        return true;
    }

    public List<Carrito> obtenerTodos() {
        return repository.obtenerTodos();
    }

    public Carrito buscarPorId(int id) {
        return CarritoUtils.buscarPorId(obtenerTodos(), id);
    }
}