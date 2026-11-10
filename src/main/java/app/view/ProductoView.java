package app.view;

import app.domain.Producto;
import app.interfaces.MenuView;
import app.service.ProductoService;

import java.util.Scanner;

public class ProductoView implements MenuView {

    private final ProductoService productoService;
    private final Scanner scanner;

    public ProductoView(ProductoService productoService, Scanner scanner) {
        this.productoService = productoService;
        this.scanner = scanner;
    }

    @Override
    public void mostrarMenu() {

        System.out.println("\n--- PRODUCTOS ---");
        System.out.println("1. Buscar por ID");
        System.out.println("2. Buscar por nombre");
        System.out.println("3. Listar productos");
        System.out.println("4. Agregar producto");
        System.out.println("0. Volver");

        System.out.print("Opción: ");
        String opcion = scanner.nextLine();

        switch (opcion) {

            case "1":
                buscarPorId();
                break;

            case "2":
                buscarPorNombre();
                break;

            case "3":
                listarProductos();
                break;

            case "4":
                agregarProducto();
                break;

            case "0":
                return;

            default:
                System.out.println("Opción no válida.");
        }
    }

    private void listarProductos() {
        for (Producto producto : productoService.obtenerTodos()) {
            System.out.println(producto);
        }
    }

    private void agregarProducto() {

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();

        System.out.print("Precio: ");
        double precio;
        try {
            precio = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Precio no válido.");
            return;
        }

        if (!productoService.precioValido(precio)) {
            System.out.println("El precio debe ser válido.");
            return;
        }

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setDescripcion(descripcion);
        producto.setPrecio(precio);
        producto.setMarca(marca);

        productoService.agregar(producto);
        System.out.println("Producto guardado con ID " + producto.getId());
    }

    private void buscarPorId() {

        System.out.print("ID del producto: ");
        int id = Integer.parseInt(scanner.nextLine());

        Producto producto = productoService.buscarPorId(id);

        mostrarProducto(producto);
    }

    private void buscarPorNombre() {

        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();

        Producto producto = productoService.buscarPorNombre(nombre);

        mostrarProducto(producto);
    }

    private void mostrarProducto(Producto producto) {

        if (producto == null) {
            System.out.println("Producto no encontrado.");
        } else {
            System.out.println(producto);
        }
    }
}