package main.java.app.view;

import main.java.app.domain.Proveedor;
import main.java.app.service.ProveedorService;
import main.java.app.interfaces.MenuView;

import java.util.List;
import java.util.Scanner;

public class  ProveedorView implements MenuView {
    private final ProveedorService proveedorService;
    private final Scanner scanner;

    public ProveedorView(ProveedorService proveedorService, Scanner scanner) {
        this.proveedorService = proveedorService;
        this.scanner = scanner;
    }

    @Override
    public void mostrarMenu() {
        System.out.println("\n--- PROVEEDORES ---");
        System.out.println("1. Buscar por ID");
        System.out.println("2. Buscar por nombre");
        System.out.println("3. Validar contacto de ejemplo");
        System.out.println("4. Listar proveedores");
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
                validarContacto();
                break;
            case "4":
                listarProveedores();
                break;
            case "0":

                return;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private void listarProveedores() {
    }

    private void buscarPorId() {
        System.out.print("ID del proveedor: ");
        int id = Integer.parseInt(scanner.nextLine());

        Proveedor proveedor = proveedorService.buscarPorId(id);
        mostrarProveedor(proveedor);
    }

    private void buscarPorNombre() {
        System.out.print("Nombre del proveedor: ");
        String nombre = scanner.nextLine();

        Proveedor proveedor = proveedorService.buscarPorNombre(nombre);
        mostrarProveedor(proveedor);
    }

    private void validarContacto() {
        System.out.print("Contacto a validar: ");
        String contacto = scanner.nextLine();

        boolean valido = proveedorService.contactoValido(contacto);
        System.out.println(valido ? "Contacto válido." : "Contacto inválido.");
    }


    private void mostrarProveedor(Proveedor proveedor) {
        if (proveedor == null) {
            System.out.println("Proveedor no encontrado.");
        } else {
            System.out.println(proveedor);
        }

    }
}

//La vista se encargará de mostrar opciones y recibir datos
