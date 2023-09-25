public abstract class Contribuyente {
    private String nombre;

    public Contribuyente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularImpuesto();
}
