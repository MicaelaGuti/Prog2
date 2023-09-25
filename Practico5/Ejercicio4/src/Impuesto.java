public class Impuesto {
    private String tipo;
    private double monto;

    public Impuesto(String tipo, double monto) {
        this.tipo = tipo;
        this.monto = monto;
    }

    public String getTipo() {
        return tipo;
    }

    public double getMonto() {
        return monto;
    }
}
