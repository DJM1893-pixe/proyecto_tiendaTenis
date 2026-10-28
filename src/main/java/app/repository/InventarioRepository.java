package main.java.app.repository;

import main.java.app.domain.Inventario;

import java.util.ArrayList;
import java.util.List;

public class InventarioRepository {

    private final List<Inventario> inventarios = new ArrayList<>();

    public void guardar(Inventario inventario) {
        inventarios.add(inventario);
    }

    public Inventario buscarPorTalla(int talla) {
        for (Inventario inventario : inventarios) {
            if (inventario.getTalla() == talla) {
                return inventario;
            }
        }
        return null;
    }
    public List<Inventario> obtenerTodos() {
        return new ArrayList<>(inventarios);
    }

    public boolean hayStock(int talla, int cantidad) {
        Inventario inventario = buscarPorTalla(talla);
        return inventario != null && inventario.getStock() >= cantidad;
    }
}

//InventarioRepository: busca el inventario por talla y responde si hay unidades suficientes.