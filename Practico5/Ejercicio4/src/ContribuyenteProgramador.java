public class ContribuyenteProgramador extends Contribuyente {
    private double montoFijo;
    private double desarrolloSoftware;

    public ContribuyenteProgramador(String nombre, double montoFijo, double desarrolloSoftware) {
        super(nombre);
        this.montoFijo = montoFijo;
        this.desarrolloSoftware = desarrolloSoftware;
    }

    @Override
    public double calcularImpuesto() {
        return (montoFijo + 0.02 * desarrolloSoftware);
    }
}