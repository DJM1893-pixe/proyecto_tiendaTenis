package app.service;

import app.domain.Producto;
import app.utils.ProductoUtils;

import java.util.List;

public class ProductoService {

    private final List<Producto> productos;

    public ProductoService(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Producto> obtenerTodos() {
        return productos;
    }

    public Producto buscarPorId(int id) {
        return ProductoUtils.buscarPorId(productos, id);
    }

    public Producto buscarPorNombre(String nombre) {
        return ProductoUtils.buscarPorNombre(productos, nombre);
    }

    public boolean precioValido(double precio) {
        return ProductoUtils.validarPrecio(precio);
    }
}
