package app.domain;

import java.util.Date;
import java.util.List;

public class Pedido {

    private int id;
    private Date fecha;
    private String estado;
    private double total;
    private List<DetallePedido> detallesPedido;
    private Pago pago;
    private Envio envio;
    // Constructor vacío
    public Pedido() {
    }

    // Constructor completo
    public Pedido(int id, Date fecha, String estado, double total) {
        this.id = id;
        this.fecha = fecha;
        this.estado = estado;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<DetallePedido> getDetallesPedido() {
        return detallesPedido;
    }
    public void setDetallesPedido(List<DetallePedido> detallesPedido) {
        this.detallesPedido = detallesPedido;
    }
    public Pago getPago() {
        return pago;
    }
    public void setPago(Pago pago) {
        this.pago = pago;

    }

    public Envio getEnvio() {
        return envio;
    }
    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", estado='" + estado + '\'' +
                ", total=" + total +
                ", detallesPedido=" + detallesPedido +
                ", pago=" + pago +
                ", envio=" + envio +
                '}';
    }
}