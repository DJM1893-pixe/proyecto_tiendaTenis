public class Main {
    public static void main(String[] args) {

            Proveedor p1 = new Proveedor();
            p1.setId(1);
            p1.setNombre("Nike Colombia");
            p1.setContacto("3001234567");

            Proveedor p2 = new Proveedor(2, "Adidas Colombia", "3109876543");

            Proveedor p3 = new Proveedor(3, "Puma Colombia", "3112223344");

            Proveedor p4 = new Proveedor();
            p4.setId(4);
            p4.setNombre("New Balance Colombia");
            p4.setContacto("3205556677");

            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
            System.out.println(p4);

            Inventario inv1 = new Inventario();
            inv1.setId(1);
            inv1.setStock(50);

            Inventario inv2 = new Inventario(2, 120);

            System.out.println(inv1);
            System.out.println(inv2);
    }


    }




