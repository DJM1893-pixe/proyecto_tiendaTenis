import java.util.Date;
import java.util.Scanner;

public class Envios extends Usuarios{
    public Scanner sc = new Scanner(System.in);

// Atributos
    public int idEnvio;
    public Date fechaEnvio;
    public String direccionEntrega;
    public String estadoEnvio;

// Metodos
    @Override
    public void create(){
    super.create();}

    @Override
    public void select(){
    super.select();}


// Constructores
    public Envios (int idUsuario, String usuario, String correo, String contraseña, boolean estado,
                   int idEnvio, Date fechaEnvio, String direccionEntrega, String estadoEnvio){
        super(idUsuario, usuario, correo, contraseña, estado);

        this.idEnvio = idEnvio;
        this.fechaEnvio = fechaEnvio;
        this.direccionEntrega = direccionEntrega;
        this.estadoEnvio = estadoEnvio;
    }


// Getters and Sellers

    public int getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(int idEnvio) {
        this.idEnvio = idEnvio;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }


}
