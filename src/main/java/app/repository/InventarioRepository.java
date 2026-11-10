package app.repository;

import app.Persistence.db.ConexionBD;
import app.domain.Inventario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InventarioRepository {

    private Connection conn() {
        return ConexionBD.getInstance().getConnection();
    }

    public void guardar(Inventario inventario) {
        String sql = "INSERT INTO inventario (talla, stock) VALUES (?, ?)";

        try (PreparedStatement ps = conn().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, inventario.getTalla());
            ps.setInt(2, inventario.getStock());
            ps.executeUpdate();

            try (ResultSet keys = ps.getGeneratedKeys()) {
                if (keys.next()) {
                    inventario.setId(keys.getInt(1));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al guardar el inventario", e);
        }
    }

    public Inventario buscarPorTalla(int talla) {
        String sql = "SELECT id, talla, stock FROM inventario WHERE talla = ?";

        try (PreparedStatement ps = conn().prepareStatement(sql)) {
            ps.setInt(1, talla);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Inventario(
                            rs.getInt("id"),
                            rs.getInt("talla"),
                            rs.getInt("stock")
                    );
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al buscar el inventario", e);
        }
        return null;
    }

    public List<Inventario> obtenerTodos() {
        List<Inventario> lista = new ArrayList<>();
        String sql = "SELECT id, talla, stock FROM inventario";

        try (PreparedStatement ps = conn().prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new Inventario(
                        rs.getInt("id"),
                        rs.getInt("talla"),
                        rs.getInt("stock")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al listar el inventario", e);
        }
        return lista;
    }

    public boolean hayStock(int talla, int cantidad) {
        Inventario inventario = buscarPorTalla(talla);
        return inventario != null && inventario.getStock() >= cantidad;
    }
}