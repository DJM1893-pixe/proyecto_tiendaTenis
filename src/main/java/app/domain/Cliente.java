package app.domain;

public class Cliente extends Usuario {

    private String direccion;
    private String telefono;
    private Carrito carrito;

    // Constructor vacío
    public Cliente() {
    }

    // Constructor completo
    public Cliente(int id, String nombre, String correo,
                   String contrasena, String direccion,
                   String telefono, Carrito carrito) {

        super(id, nombre, correo, contrasena);
        this.direccion = direccion;
        this.telefono = telefono;
        this.carrito = carrito;
    }

    // Getters y Setters

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", carrito=" + carrito +
                "} " + super.toString();
    }
}