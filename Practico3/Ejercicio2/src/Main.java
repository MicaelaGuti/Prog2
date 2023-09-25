public class Main {
    public static void main(String[] args) {
        FabricaMuebles fabrica = new FabricaMuebles();

        Silla silla1 = new Silla(5.0, 50.0, "Madera de roble", "Blanca");
        Mesa mesa1 = new Mesa(20.0, 150.0, "Madera de pino", "Café");
        Banco banco1 = new Banco(15.0, 80.0, "Madera de nogal", "Negro");

        fabrica.agregarProducto(silla1);
        fabrica.agregarProducto(mesa1);
        fabrica.agregarProducto(banco1);

        double costoTotalEnStock = fabrica.calcularCostoTotalEnStock();
        double precioVentaTotal = fabrica.calcularPrecioVentaTotal();

        System.out.println("Costo total en stock: $" + costoTotalEnStock);
        System.out.println("Precio de venta total: $" + precioVentaTotal);
    }
}
