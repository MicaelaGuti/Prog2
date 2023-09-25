class Vehiculo extends Alquilable {
    private String marca;
    private double kms;
    private String patente;

    public Vehiculo(String nombre, String marca, double kms, String patente) {
        super(nombre);
        this.marca = marca;
        this.kms = kms;
        this.patente = patente;
    }

    @Override
    public boolean estaDisponible() {
        return !isAlquilado();
    }
}
