package app.domain;

import java.util.Date;

public class Oferta {

    private int id;
    private String descripcion;
    private double porcentajeDescuento;
    private Date fechaInicio;
    private Date fechaFin;

    public Oferta() {
    }

    public void Oferta(int id, String descripcion, double porcentajeDescuento,
                       Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.descripcion = descripcion;
        this.porcentajeDescuento = porcentajeDescuento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", porcentajeDescuento=" + porcentajeDescuento +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }
}