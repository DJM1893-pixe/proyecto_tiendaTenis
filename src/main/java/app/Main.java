package main.java.app;

import main.java.app.domain.Inventario;
import main.java.app.domain.Proveedor;
import main.java.app.interfaces.MenuView;
import main.java.app.repository.InventarioRepository;
import main.java.app.service.ProveedorService;
import main.java.app.view.InventarioView;
import main.java.app.view.ProveedorView;

import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Proveedor p1 = new Proveedor(1, "Nike Colombia", "3001234567");
                Proveedor p2 = new Proveedor(2, "Adidas Colombia", "3109876543");
                Proveedor p3 = new Proveedor(3, "Puma Colombia", "3112223344");
                Proveedor p4 = new Proveedor(4, "New Balance Colombia", "3205556677");

                List<Proveedor> proveedores = List.of(p1, p2, p3, p4);

                Inventario inv1 = new Inventario(1, 40, 50);
                Inventario inv2 = new Inventario(2, 42, 120);

                Scanner scanner = new Scanner(System.in);

                ProveedorService proveedorService = new ProveedorService(proveedores);

                InventarioRepository inventarioRepository = new InventarioRepository();
                inventarioRepository.guardar(inv1);
                inventarioRepository.guardar(inv2);

                MenuView vistaProveedores =
                        new ProveedorView(proveedorService, scanner);
                MenuView vistaInventario =
                        new InventarioView(inventarioRepository, scanner);

                boolean continuar = true;

                while (continuar) {
                        System.out.println("\n=== TIENDA DE TENIS ===");
                        System.out.println("1. Proveedores");
                        System.out.println("2. Inventario");
                        System.out.println("0. Salir");
                        System.out.print("Opción: ");

                        String opcion = scanner.nextLine();

                        switch (opcion) {
                                case "1":
                                        vistaProveedores.mostrarMenu();
                                        break;
                                case "2":
                                        vistaInventario.mostrarMenu();
                                        break;
                                case "0":
                                        continuar = false;
                                        System.out.println("Hasta luego.");
                                        break;
                                default:
                                        System.out.println("Opción no válida.");
                        }
                }

                scanner.close();
        }
}


