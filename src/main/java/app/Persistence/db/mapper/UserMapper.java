package app.Persistence.db.mapper;

import app.domain.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<Cliente> {

    @Override
    public Cliente mapRow(ResultSet rs) throws SQLException {

        Cliente cliente = new Cliente();

        cliente.setId(rs.getInt("id"));
        cliente.setNombre(rs.getString("nombre"));
        cliente.setCorreo(rs.getString("correo"));
        cliente.setContrasena(rs.getString("contrasena"));

        return cliente;
    }
}