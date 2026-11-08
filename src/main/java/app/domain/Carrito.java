package app.domain;

import java.util.Date;
import java.util.List;

public class Carrito {

    private int id;
    private Date fechaCreacion;
    private List<DetalleCarrito> detalles;

    // Constructor vacío
    public Carrito() {
    }

    // Constructor completo
    public Carrito(int id, Date fechaCreacion) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<DetalleCarrito> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleCarrito> detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "Carrito{" +
                "id=" + id +
                ", fechaCreacion=" + fechaCreacion +
                ", detalles=" + detalles +
                '}';
    }
}