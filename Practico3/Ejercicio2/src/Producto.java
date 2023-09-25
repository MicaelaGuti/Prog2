public class Producto {
    private double peso;
    private double costoFabricacion;
    private double valorVenta;
    private String tipoMadera;
    private String color;

    public double getPeso() {
        return peso;
    }

    public double getCostoFabricacion() {
        return costoFabricacion;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public String getColor() {
        return color;
    }

    public Producto(double peso, double costoFabricacion, String tipoMadera, String color) {
        this.peso = peso;
        this.costoFabricacion = costoFabricacion;
        this.valorVenta = costoFabricacion * 1.10; // Precio de venta es el 10% más del costo de fabricación por defecto
        this.tipoMadera = tipoMadera;
        this.color = color;
    }

    public double getCostoTotal() {
        return costoFabricacion;
    }

    public double getPrecioVenta() {
        return valorVenta;
    }
}
