package app.service;
import app.domain.Usuario;
import app.utils.UsuarioUtils;

import java.util.List;

public class UsuarioService {
    private final List<Usuario> usuarios;

        public UsuarioService(List<Usuario> usuarios) {
            this.usuarios = usuarios;
        }

        public List<Usuario> obtenerTodos() {
            return usuarios;
        }

        public Usuario buscarPorId(int id) {
            return UsuarioUtils.buscarPorId(usuarios, id);
        }

        public Usuario buscarPorCorreo(String correo) {
            return UsuarioUtils.buscarPorCorreo(usuarios, correo);
        }

        public boolean correoValido(String correo) {
            return UsuarioUtils.validarCorreo(correo);
        }

        public boolean contrasenaValida(String contrasena) {
            return UsuarioUtils.validarContrasena(contrasena);
        }
    }

