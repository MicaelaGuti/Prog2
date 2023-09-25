public class ContribuyenteSimple extends Contribuyente {
    private double montoFijo;

    public ContribuyenteSimple(String nombre, double montoFijo) {
        super(nombre);
        this.montoFijo = montoFijo;
    }

    @Override
    public double calcularImpuesto() {
        return montoFijo;
    }
}