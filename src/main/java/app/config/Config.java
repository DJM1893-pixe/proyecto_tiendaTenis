package app.config;

import app.repository.ProductoRepository;
import app.service.ProductoService;
import app.service.PedidoService;
import app.view.ProductoView;
import app.view.PedidoView;

import java.util.ArrayList;
import java.util.Scanner;

public class Config {

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static ProductoView productoView() {

        ProductoService productoService =
                new ProductoService(new ProductoRepository());

        return new ProductoView(productoService, scanner());
    }
    public static PedidoView pedidoView() {

        PedidoService pedidoService =
                new PedidoService(new ArrayList<>());

        return new PedidoView(pedidoService, scanner());
    }
}