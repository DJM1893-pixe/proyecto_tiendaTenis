package app.domain;

import java.util.List;

public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private String marca;
    private Proveedor proveedor;
    private Oferta oferta;
    private List<DetalleCarrito> detalles;

    // Constructor vacío
    public Producto() {
    }

    // Constructor completo
    public Producto(int id, String nombre, String descripcion,
                    double precio, String marca) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.marca = marca;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public String getMarca() {
        return marca;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }
    public Oferta getOferta() {
        return oferta;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                ", proveedor=" + proveedor +
                ", oferta=" + oferta +
                '}';
    }
}
