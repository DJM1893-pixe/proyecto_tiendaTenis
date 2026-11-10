package app.service;
import app.domain.Cliente;
import java.util.List;

public class ClienteService {

    private final List<Cliente> clientes;

    public ClienteService(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Cliente> obtenerTodos() {
        return clientes;
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarPorId(int id) {

        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }

        return null;
    }
}
