package app;

import app.domain.*;
import app.interfaces.MenuView;
import app.repository.InventarioRepository;
import app.service.CarritoService;
import app.service.ProductoService;
import app.service.ProveedorService;
import app.view.CarritoView;
import app.view.InventarioView;
import app.view.ProductoView;
import app.view.ProveedorView;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

                // PROVEEDORES
                Proveedor p1 = new Proveedor(1, "Nike Colombia", "3001234567");
                Proveedor p2 = new Proveedor(2, "Adidas Colombia", "3109876543");
                Proveedor p3 = new Proveedor(3, "Puma Colombia", "3112223344");
                Proveedor p4 = new Proveedor(4, "New Balance Colombia", "3205556677");

                List<Proveedor> proveedores = List.of(p1, p2, p3, p4);

                // INVENTARIO
                Inventario inv1 = new Inventario(1, 40, 50);
                Inventario inv2 = new Inventario(2, 42, 120);

                // PRODUCTOS
                Producto prod1 = new Producto(
                        1,
                        "Air Max 90",
                        "Tenis deportivos Nike",
                        450000,
                        "Nike"
                );

                Producto prod2 = new Producto(
                        2,
                        "Ultraboost",
                        "Tenis running Adidas",
                        600000,
                        "Adidas"
                );

                Producto prod3 = new Producto(
                        3,
                        "RS-X",
                        "Tenis urbanos Puma",
                        400000,
                        "Puma"
                );

                List<Producto> productos = List.of(
                        prod1,
                        prod2,
                        prod3
                );

                // DETALLES DE CARRITO
                DetalleCarrito detalle1 = new DetalleCarrito(
                        2,
                        prod1
                );

                DetalleCarrito detalle2 = new DetalleCarrito(
                        1,
                        prod2
                );

                DetalleCarrito detalle3 = new DetalleCarrito(
                        3,
                        prod3
                );

                // CARRITOS
                Carrito carrito1 = new Carrito(
                        1,
                        new Date(),
                        List.of(detalle1, detalle2)
                );

                Carrito carrito2 = new Carrito(
                        2,
                        new Date(),
                        List.of(detalle3)
                );

                List<Carrito> carritos = List.of(
                        carrito1,
                        carrito2
                );

                Scanner scanner = new Scanner(System.in);

                // SERVICES
                ProveedorService proveedorService =
                        new ProveedorService(proveedores);

                ProductoService productoService =
                        new ProductoService(productos);

                CarritoService carritoService =
                        new CarritoService(carritos);

                // REPOSITORY
                InventarioRepository inventarioRepository =
                        new InventarioRepository();

                inventarioRepository.guardar(inv1);
                inventarioRepository.guardar(inv2);

                // VIEWS
                MenuView vistaProveedores =
                        new ProveedorView(proveedorService, scanner);

                MenuView vistaInventario =
                        new InventarioView(inventarioRepository, scanner);

                MenuView vistaProductos =
                        new ProductoView(productoService, scanner);

                MenuView vistaCarritos =
                        new CarritoView(carritoService, scanner);

                boolean continuar = true;

                while (continuar) {

                        System.out.println("\n=== TIENDA DE TENIS ===");
                        System.out.println("1. Proveedores");
                        System.out.println("2. Inventario");
                        System.out.println("3. Productos");
                        System.out.println("4. Carritos");
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

                                case "3":
                                        vistaProductos.mostrarMenu();
                                        break;

                                case "4":
                                        vistaCarritos.mostrarMenu();
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