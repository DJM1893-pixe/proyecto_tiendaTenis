package app.view;

import app.domain.Pedido;
import app.interfaces.MenuView;
import app.service.PedidoService;

import java.util.Scanner;

public class PedidoView implements MenuView {

    private final PedidoService pedidoService;
    private final Scanner scanner;

    public PedidoView(PedidoService pedidoService, Scanner scanner) {
        this.pedidoService = pedidoService;
        this.scanner = scanner;
    }

    @Override
    public void mostrarMenu() {
        System.out.println("\n--- PEDIDOS ---");
        System.out.println("1. Buscar por ID");
        System.out.println("2. Buscar por estado");
        System.out.println("3. Validar estado");
        System.out.println("4. Listar pedidos");
        System.out.println("0. Volver");

        System.out.print("Opción: ");
        String opcion = scanner.nextLine();

        switch (opcion) {
            case "1":
                buscarPorId();
                break;
            case "2":
                buscarPorEstado();
                break;
            case "3":
                validarEstado();
                break;
            case "4":
                listarPedidos();
                break;
            case "0":
                return;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private void listarPedidos() {
        for (Pedido pedido : pedidoService.obtenerTodos()) {
            System.out.println(pedido);
        }
    }

    private void buscarPorId() {
        System.out.print("ID del pedido: ");
        int id = Integer.parseInt(scanner.nextLine());

        Pedido pedido = pedidoService.buscarPorId(id);
        mostrarPedido(pedido);
    }

    private void buscarPorEstado() {
        System.out.print("Estado del pedido: ");
        String estado = scanner.nextLine();

        Pedido pedido = pedidoService.buscarPorEstado(estado);
        mostrarPedido(pedido);
    }

    private void validarEstado() {
        System.out.print("Estado a validar: ");
        String estado = scanner.nextLine();

        boolean valido = pedidoService.estadoValido(estado);

        System.out.println(
                valido ? "Estado válido." : "Estado inválido."
        );
    }

    private void mostrarPedido(Pedido pedido) {
        if (pedido == null) {
            System.out.println("Pedido no encontrado.");
        } else {
            System.out.println(pedido);
        }
    }
}