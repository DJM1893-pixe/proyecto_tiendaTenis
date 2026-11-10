package app.repository;

import app.Persistence.db.ConexionBD;
import app.domain.Proveedor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProveedorRepository {

    private Connection conn() {
        return ConexionBD.getInstance().getConnection();
    }

    public void guardar(Proveedor p) {
        String sql = "INSERT INTO proveedor (nombre, contacto) VALUES (?, ?)";

        try (PreparedStatement ps = conn().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getContacto());
            ps.executeUpdate();

            try (ResultSet keys = ps.getGeneratedKeys()) {
                if (keys.next()) {
                    p.setId(keys.getInt(1));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al guardar el proveedor", e);
        }
    }

    public List<Proveedor> obtenerTodos() {
        List<Proveedor> lista = new ArrayList<>();
        String sql = "SELECT id, nombre, contacto FROM proveedor";

        try (PreparedStatement ps = conn().prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new Proveedor(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("contacto")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al listar proveedores", e);
        }
        return lista;
    }
}