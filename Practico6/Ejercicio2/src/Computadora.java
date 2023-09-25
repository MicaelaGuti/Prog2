public class Computadora {
    private String nombre;
    private double velocidad; // Velocidad en GHz

    public Computadora(String nombre, double velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }
}
