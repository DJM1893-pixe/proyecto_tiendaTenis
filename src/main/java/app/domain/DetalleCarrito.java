    package app.domain;

    public class DetalleCarrito {

        private int cantidad;


        // Constructor vacío
        public DetalleCarrito() {
        }

        // Constructor con parámetros
        public DetalleCarrito(int cantidad) {
            this.cantidad = cantidad;
        }

        // Getter
        public int getCantidad() {
            return cantidad;
        }

        // Setter
        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        private Producto producto;
        public Producto getProducto() {
            return producto;
        }


        @Override
        public String toString() {
            return "DetalleCarrito{" +
                    "cantidad=" + cantidad +
                    '}';
        }
    }

