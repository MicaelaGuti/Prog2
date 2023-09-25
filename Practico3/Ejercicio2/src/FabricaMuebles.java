import java.util.ArrayList;
import java.util.List;

public class FabricaMuebles {
    private List<Producto> stock;

    public FabricaMuebles() {
        stock = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        stock.add(producto);
    }

    public double calcularCostoTotalEnStock() {
        double costoTotal = 0;
        for (Producto producto : stock) {
            costoTotal += producto.getCostoTotal();
        }
        return costoTotal;
    }

    public double calcularPrecioVentaTotal() {
        double precioVentaTotal = 0;
        for (Producto producto : stock) {
            precioVentaTotal += producto.getPrecioVenta();
        }
        return precioVentaTotal;
    }
}
