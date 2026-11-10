package app.service;

import app.domain.Producto;
import app.repository.ProductoRepository;
import app.utils.ProductoUtils;

import java.util.List;

public class ProductoService {

    private final ProductoRepository repository;

    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }

    public void agregar(Producto producto) {
        repository.guardar(producto);
    }

    public List<Producto> obtenerTodos() {
        return repository.obtenerTodos();
    }

    public Producto buscarPorId(int id) {
        return ProductoUtils.buscarPorId(obtenerTodos(), id);
    }

    public Producto buscarPorNombre(String nombre) {
        return ProductoUtils.buscarPorNombre(obtenerTodos(), nombre);
    }

    public boolean precioValido(double precio) {
        return ProductoUtils.validarPrecio(precio);
    }
}