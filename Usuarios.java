import java.util.Scanner;

public class Usuarios {
    public Scanner sc = new Scanner(System.in);

// Atributos
    public int idUsuario;
    public String usuario;
    public String correo;
    public String contraseña;
    public boolean estado;

// Metodos
  public void create(){
 }
  public void select(){
 }


 // Constructores
    public Usuarios(int idUsuario, String usuario, String contraseña, String correo, boolean estado) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.correo = correo;
        this.estado = estado;
    }

 // Getters and Sellers
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}


