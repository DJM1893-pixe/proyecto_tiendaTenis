package app.repository;

import app.Persistence.db.ConexionBD;
import app.domain.Carrito;
import app.domain.DetalleCarrito;
import app.domain.Producto;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarritoRepository {

    private final ProductoRepository productoRepository = new ProductoRepository();

    private Connection conn() {
        return ConexionBD.getInstance().getConnection();
    }
    public void agregarProducto(int carritoId, int productoId, int cantidad) {
        String sql = "INSERT INTO detalle_carrito (carrito_id, producto_id, cantidad) VALUES (?, ?, ?) "
                + "ON DUPLICATE KEY UPDATE cantidad = cantidad + VALUES(cantidad)";

        try (PreparedStatement ps = conn().prepareStatement(sql)) {
            ps.setInt(1, carritoId);
            ps.setInt(2, productoId);
            ps.setInt(3, cantidad);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error al agregar el producto al carrito", e);
        }
    }

    public void guardar(Carrito carrito) {
        String sqlCarrito = "INSERT INTO carrito (fecha_creacion) VALUES (?)";
        String sqlDetalle = "INSERT INTO detalle_carrito (carrito_id, producto_id, cantidad) VALUES (?, ?, ?)";

        Connection conn = conn();
        try {
            conn.setAutoCommit(false); // o se guarda todo, o nada

            Date fecha = carrito.getFechaCreacion() != null ? carrito.getFechaCreacion() : new Date();

            try (PreparedStatement ps = conn.prepareStatement(sqlCarrito, Statement.RETURN_GENERATED_KEYS)) {
                ps.setTimestamp(1, new Timestamp(fecha.getTime()));
                ps.executeUpdate();

                try (ResultSet keys = ps.getGeneratedKeys()) {
                    if (keys.next()) {
                        carrito.setId(keys.getInt(1));
                    }
                }
            }

            if (carrito.getDetalles() != null) {
                try (PreparedStatement ps = conn.prepareStatement(sqlDetalle)) {
                    for (DetalleCarrito d : carrito.getDetalles()) {
                        ps.setInt(1, carrito.getId());
                        ps.setInt(2, d.getProducto().getId());
                        ps.setInt(3, d.getCantidad());
                        ps.addBatch();
                    }
                    ps.executeBatch();
                }
            }

            conn.commit();
        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException ignored) {
            }
            throw new RuntimeException("Error al guardar el carrito", e);
        } finally {
            try {
                conn.setAutoCommit(true);
            } catch (SQLException ignored) {
            }
        }
    }

    public List<Carrito> obtenerTodos() {
        List<Carrito> lista = new ArrayList<>();
        String sql = "SELECT id, fecha_creacion FROM carrito";

        try (PreparedStatement ps = conn().prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                Date fecha = rs.getTimestamp("fecha_creacion");
                lista.add(new Carrito(id, fecha, obtenerDetalles(id)));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al listar carritos", e);
        }
        return lista;
    }

    private List<DetalleCarrito> obtenerDetalles(int carritoId) {
        List<DetalleCarrito> detalles = new ArrayList<>();
        String sql = "SELECT producto_id, cantidad FROM detalle_carrito WHERE carrito_id = ?";

        try (PreparedStatement ps = conn().prepareStatement(sql)) {
            ps.setInt(1, carritoId);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Producto producto = productoRepository.buscarPorId(rs.getInt("producto_id"));
                    detalles.add(new DetalleCarrito(rs.getInt("cantidad"), producto));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al leer los detalles del carrito", e);
        }
        return detalles;
    }
}