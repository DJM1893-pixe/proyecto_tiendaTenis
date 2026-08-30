public class Inventario {
    // Atributos
    private int id;
    private int stock;

    // Constructores
    public Inventario() {
    }

    public Inventario(int id, int stock) {
        this.id = id;
        this.stock = stock;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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
        return "Inventario{id=" + id + ", stock=" + stock + "}";
    }
}


