package app.domain;

import java.util.Date;

public class Pago {

    private int id;
    private Date fecha;
    private double monto;
    private String metodo;
    private String estado;

    // Constructor vacío
    public Pago() {
    }

    // Constructor completo
    public Pago(int id, Date fecha, double monto, String metodo, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.monto = monto;
        this.metodo = metodo;
        this.estado = estado;
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


    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }


    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", monto=" + monto +
                ", metodo='" + metodo + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}