import java.util.List;

public class Carrito {
    private Integer id;
    private Usuarios cliente;
    private List items;

    public Carrito() {}

    public Carrito(Integer id, Usuarios cliente, List items) {
        this.id = id;
        this.cliente = cliente;
        this.items = items;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Usuarios getCliente() { return cliente; }
    public void setCliente(Usuarios cliente) { this.cliente = cliente; }
    public List getItems() { return items; }
    public void setItems(List items) { this.items = items; }

    public void create() {}
    public void selectAll() {}
    public void selectById(int id) {}
    public void update(int id) {}
    public void delete(int id) {}

}