package main.java.app.service;

import main.java.app.domain.Proveedor;
import main.java.app.utils.ProveedorUtils;

import java.util.List;

public class ProveedorService {
    private final List<Proveedor> proveedores;

    public ProveedorService(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public List<Proveedor> obtenerTodos() {return proveedores;}

    public Proveedor buscarPorId(int id) {
        return ProveedorUtils.buscarPorId(proveedores, id);
    }

    public Proveedor buscarPorNombre(String nombre) {
        return ProveedorUtils.buscarPorNombre(proveedores, nombre);
    }

    public boolean contactoValido(String contacto) {
        return ProveedorUtils.validarContacto(contacto);
    }
}