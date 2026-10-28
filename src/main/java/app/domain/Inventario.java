package main.java.app.domain;

public class Inventario {
    // Atributos
    private int id;
    private int stock;
    private int talla;



    // Constructores
    public Inventario() {
    }

    public Inventario(int id,int talla, int stock) {
        this.id = id;
        this.talla = talla;
        this.stock = stock;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTalla() {
        return talla;
    }
    public void setTalla(int talla) {
        this.talla = talla;
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
        return "Java.Java.App.main.java.app.domain.Inventario{id=" + id + ", stock=" + stock + "}";
    }
}


