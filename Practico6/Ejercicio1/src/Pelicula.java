class Pelicula extends Alquilable {
    private int cantidadCopias;

    public Pelicula(String nombre, int cantidadCopias) {
        super(nombre);
        this.cantidadCopias = cantidadCopias;
    }

    @Override
    public boolean estaDisponible() {
        return cantidadCopias > 0 && !isAlquilado();
    }
}