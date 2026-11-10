package app.domain;

public class DetallePedido {

    private int cantidad;
    private double precioUnitario;
    private Producto producto;

    // Constructor vacío
    public DetallePedido() {
    }

    // Constructor completo
    public DetallePedido(int cantidad, double precioUnitario) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "DetallePedido{" +
                "cantidad=" + cantidad +
                ", precioUnitario=" + precioUnitario +
                ", producto=" + producto +
                '}';
    }
}