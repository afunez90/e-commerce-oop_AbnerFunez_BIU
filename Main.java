public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto(1, "Router", "Router empresarial", 150.0, 10);
        Producto p2 = new Producto(2, "Switch", "Switch 24 puertos", 300.0, 5);

        Carrito carrito = new Carrito();
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);

        System.out.println("Total del carrito: $" + carrito.getTotal());
    }
}
