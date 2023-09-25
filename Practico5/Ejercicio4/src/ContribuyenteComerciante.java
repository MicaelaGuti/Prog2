public class ContribuyenteComerciante extends Contribuyente {
    private double montoFijo;
    private double ventas;

    public ContribuyenteComerciante(String nombre, double montoFijo, double ventas) {
        super(nombre);
        this.montoFijo = montoFijo;
        this.ventas = ventas;
    }

    @Override
    public double calcularImpuesto() {
        return (montoFijo + 0.035 * ventas);
    }
}