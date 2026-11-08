package app.domain;

public class DetalleCarrito {

    private int cantidad;
    private Producto producto;

    public DetalleCarrito() {
    }

    public DetalleCarrito(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "DetalleCarrito{" +
                "cantidad=" + cantidad +
                ", producto=" + producto +
                '}';
    }
}