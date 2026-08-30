package domain;

public class Cliente extends Usuarios {

    //Atributos
    private String telefono;
    private String direccion;

    // Constructores
    public Cliente() {
    }

    public Cliente(String telefono, String direccion) {
        this.telefono = telefono;
        this.direccion = direccion;
    }

    //Getters and Setters
    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //  Métodos CRUD (sin lógica todavía)

    public void create() {
    }

    public void selectAll() {
    }

    public void selectById(int id) {
    }

    public void update(int id) {
    }

    public void delete(int id) {
    }

    @Override
    public String toString() {
        return "domain.Cliente{telefono=" + telefono + ", direccion=" + direccion + "}";
    }

}
