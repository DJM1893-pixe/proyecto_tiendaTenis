package domain;

import java.util.Date;
import java.time.LocalDate;

public class Oferta {

    //Atributos
    private int idOferta;
    private String descripcionOferta;
    private double porcentaje;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    //Constructores
    public Oferta() {
    }

    public Oferta(int idOferta, String descripcionOferta, double porcentaje, LocalDate fechaInicio, LocalDate fechaFin) {
        this.idOferta = idOferta;
        this.descripcionOferta = descripcionOferta;
        this.porcentaje = porcentaje;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    //Getters and Setters

    public int getIdOferta() {
        return idOferta;
    }

    public String getDescripcionOferta() {
        return descripcionOferta;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    public void setDescripcionOferta(String descripcionOferta) {
        this.descripcionOferta = descripcionOferta;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "idOferta=" + idOferta +
                ", descripcionOferta='" + descripcionOferta + '\'' +
                ", porcentaje=" + porcentaje +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }
}
