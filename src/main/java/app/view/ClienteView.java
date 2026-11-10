package app.view;

import app.domain.Cliente;
import app.interfaces.MenuView;
import app.service.ClienteService;

import java.util.Scanner;

public class ClienteView implements MenuView {

    private final ClienteService clienteService;
    private final Scanner scanner;

    public ClienteView(ClienteService clienteService, Scanner scanner) {
        this.clienteService = clienteService;
        this.scanner = scanner;
    }

    @Override
    public void mostrarMenu() {

        System.out.println("\n--- CLIENTES ---");
        System.out.println("1. Registrar cliente");
        System.out.println("2. Buscar cliente por ID");
        System.out.println("3. Listar clientes");
        System.out.println("0. Volver");

        System.out.print("Opción: ");

        String opcion = scanner.nextLine();

        switch (opcion) {

            case "1":
                registrarCliente();
                break;

            case "2":
                buscarPorId();
                break;

            case "3":
                listarClientes();
                break;

            case "0":
                return;

            default:
                System.out.println("Opción no válida.");
        }
    }

    private void registrarCliente() {

        Cliente cliente = new Cliente();

        System.out.print("ID: ");
        cliente.setId(Integer.parseInt(scanner.nextLine()));

        System.out.print("Nombre: ");
        cliente.setNombre(scanner.nextLine());

        System.out.print("Correo: ");
        cliente.setCorreo(scanner.nextLine());

        System.out.print("Contraseña: ");
        cliente.setContrasena(scanner.nextLine());

        clienteService.agregarCliente(cliente);

        System.out.println("Cliente registrado correctamente.");
    }

    private void buscarPorId() {

        System.out.print("ID del cliente: ");

        int id = Integer.parseInt(scanner.nextLine());

        Cliente cliente = clienteService.buscarPorId(id);

        if (cliente == null) {

            System.out.println("Cliente no encontrado.");

        } else {

            System.out.println(cliente);
        }
    }

    private void listarClientes() {

        for (Cliente cliente : clienteService.obtenerTodos()) {
            System.out.println(cliente);
        }
    }
}
