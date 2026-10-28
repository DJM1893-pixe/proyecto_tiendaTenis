package main.java.app.view;
import main.java.app.utils.InventarioUtils;
import main.java.app.interfaces.MenuView;

import main.java.app.repository.InventarioRepository;

import java.util.Scanner;

    public class InventarioView  implements MenuView {
        private final InventarioRepository inventarioRepository;
        private final Scanner scanner;

        public InventarioView(InventarioRepository inventarioRepository, Scanner scanner) {
            this.inventarioRepository = inventarioRepository;
            this.scanner = scanner;
        }

        @Override
        public void mostrarMenu() {
            System.out.println("\n--- INVENTARIO ---");
            System.out.println("1. Consultar disponibilidad por talla");
            System.out.println("0. Volver");
            System.out.print("Opción: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    consultarDisponibilidad();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        private void consultarDisponibilidad() {
            int talla = leerEntero("Talla que buscas: ");
            int cantidad = leerEntero("Cantidad solicitada: ");

            if (talla <= 0 || cantidad <= 0) {
                System.out.println("La talla y la cantidad deben ser mayores que cero.");
                return;
            }

            boolean disponible = inventarioRepository.hayStock(talla, cantidad);
            System.out.println(disponible
                    ? "Hay stock suficiente de la talla " + talla + "."
                    : "No hay stock suficiente de la talla " + talla + ".");
        }

        private int leerEntero(String mensaje) {
            while (true) {
                System.out.print(mensaje);
                try {
                    return Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Escribe un número entero.");
                }
            }
        }
    }

