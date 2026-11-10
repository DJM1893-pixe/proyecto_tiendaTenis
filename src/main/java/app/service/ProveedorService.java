package app.service;

import app.domain.Proveedor;
import app.repository.ProveedorRepository;
import app.utils.ProveedorUtils;

import java.util.List;

public class ProveedorService {
    private final ProveedorRepository repository;

    public ProveedorService(ProveedorRepository repository) {
        this.repository = repository;
    }

    public void agregar(Proveedor proveedor) {
        repository.guardar(proveedor);
    }

    public List<Proveedor> obtenerTodos() {
        return repository.obtenerTodos();
    }

    public Proveedor buscarPorId(int id) {
        return ProveedorUtils.buscarPorId(obtenerTodos(), id);
    }

    public Proveedor buscarPorNombre(String nombre) {
        return ProveedorUtils.buscarPorNombre(obtenerTodos(), nombre);
    }

    public boolean contactoValido(String contacto) {
        return ProveedorUtils.validarContacto(contacto);
    }
}