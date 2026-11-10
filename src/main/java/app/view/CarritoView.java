package app.view;

import app.domain.Carrito;
import app.interfaces.MenuView;
import app.service.CarritoService;

import java.util.Scanner;

public class CarritoView implements MenuView {

    private final CarritoService carritoService;
    private final Scanner scanner;

    public CarritoView(CarritoService carritoService,
                       Scanner scanner) {

        this.carritoService = carritoService;
        this.scanner = scanner;
    }

    @Override
    public void mostrarMenu() {

        System.out.println("\n--- CARRITOS ---");
        System.out.println("1. Buscar por ID");
        System.out.println("2. Listar carritos");
        System.out.println("3. Agregar producto");
        System.out.println("0. Volver");

        System.out.print("Opción: ");

        String opcion = scanner.nextLine();

        switch (opcion) {

            case "1":
                buscarPorId();
                break;

            case "2":
                listarCarritos();
                break;

            case "3":
                agregarProducto();
                break;

            case "0":
                return;

            default:
                System.out.println("Opción no válida.");
        }
    }

    private void listarCarritos() {

        for (Carrito carrito : carritoService.obtenerTodos()) {
            System.out.println(carrito);
        }
    }

    private void agregarProducto() {

        try {
            System.out.print("ID del carrito: ");
            int carritoId = Integer.parseInt(scanner.nextLine());

            System.out.print("ID del producto: ");
            int productoId = Integer.parseInt(scanner.nextLine());

            System.out.print("Cantidad: ");
            int cantidad = Integer.parseInt(scanner.nextLine());

            boolean agregado =
                    carritoService.agregarProducto(carritoId, productoId, cantidad);

            if (agregado) {
                System.out.println("Producto agregado al carrito.");
            } else {
                System.out.println("No se pudo agregar: revisa que el carrito exista y la cantidad sea mayor a 0.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Debes escribir números.");
        } catch (RuntimeException e) {
            System.out.println("No se pudo agregar: el producto no existe.");
        }
    }

    private void buscarPorId() {

        System.out.print("ID del carrito: ");

        int id = Integer.parseInt(scanner.nextLine());

        Carrito carrito =
                carritoService.buscarPorId(id);

        mostrarCarrito(carrito);
    }

    private void mostrarCarrito(Carrito carrito) {

        if (carrito == null) {
            System.out.println("Carrito no encontrado.");
        } else {
            System.out.println(carrito);
        }
    }
}