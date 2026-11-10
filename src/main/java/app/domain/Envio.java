package app.domain;

public class Envio {

    private int id;
    private String direccion;
    private String transportadora;
    private String numeroGuia;
    private String estado;

    // Constructor vacío
    public Envio() {
    }

    // Constructor completo
    public Envio(int id, String direccion, String transportadora,
                 String numeroGuia, String estado) {
        this.id = id;
        this.direccion = direccion;
        this.transportadora = transportadora;
        this.numeroGuia = numeroGuia;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(String transportadora) {
        this.transportadora = transportadora;
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Envio{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", transportadora='" + transportadora + '\'' +
                ", numeroGuia='" + numeroGuia + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}