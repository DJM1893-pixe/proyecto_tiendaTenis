public class Proveedor {
    // Atributos
    private int id;
    private String nombre;
    private String contacto;

    // Constructores
    public Proveedor() {
    }

    public Proveedor(int id, String nombre, String contacto) {
        this.id = id;
        this.nombre = nombre;
        this.contacto = contacto;
    }

    // Getters y setters
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

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    // ----- Métodos CRUD (sin lógica todavía) -----

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
        return "Proveedor{id=" + id + ", nombre='" + nombre + "', contacto='" + contacto + "'}";
    }
}


