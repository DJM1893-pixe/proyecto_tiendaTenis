package app.repository;

import app.Persistence.db.ConexionBD;
import app.domain.Producto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepository {

    private Connection conn() {
        return ConexionBD.getInstance().getConnection();
    }

    public void guardar(Producto p) {
        String sql = "INSERT INTO producto (nombre, descripcion, precio, marca) VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = conn().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setDouble(3, p.getPrecio());
            ps.setString(4, p.getMarca());
            ps.executeUpdate();

            try (ResultSet keys = ps.getGeneratedKeys()) {
                if (keys.next()) {
                    p.setId(keys.getInt(1)); // el id lo genera MySQL
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al guardar el producto", e);
        }
    }

    public Producto buscarPorId(int id) {
        String sql = "SELECT id, nombre, descripcion, precio, marca FROM producto WHERE id = ?";

        try (PreparedStatement ps = conn().prepareStatement(sql)) {
            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Producto(
                            rs.getInt("id"),
                            rs.getString("nombre"),
                            rs.getString("descripcion"),
                            rs.getDouble("precio"),
                            rs.getString("marca")
                    );
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al buscar el producto", e);
        }
        return null;
    }

    public List<Producto> obtenerTodos() {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT id, nombre, descripcion, precio, marca FROM producto";

        try (PreparedStatement ps = conn().prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new Producto(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getDouble("precio"),
                        rs.getString("marca")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al listar productos", e);
        }
        return lista;
    }
}