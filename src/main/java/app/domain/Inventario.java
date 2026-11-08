package app.domain;

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

    @Override
    public String toString() {
        return "Inventario{id=" + id + ", talla=" + talla + ", stock=" + stock + "}";
    }
}


