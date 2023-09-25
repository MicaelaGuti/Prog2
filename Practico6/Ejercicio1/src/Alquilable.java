abstract class Alquilable {
    private String nombre;
    private boolean alquilado;

    public Alquilable(String nombre) {
        this.nombre = nombre;
        this.alquilado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void alquilar() {
        if (!alquilado) {
            alquilado = true;
        }
    }

    public void devolver() {
        if (alquilado) {
            alquilado = false;
        }
    }

    public abstract boolean estaDisponible();
}