import java.util.ArrayList;
import java.util.List;

public class Socio {
    
    private String nombre;
    private String apellido;
    private int edad;
    private boolean cuotaPagada;
    public List<AlquilerCancha> alquileres;

    public Socio(String nombre, String apellido, int edad, boolean cuotaPagada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cuotaPagada = cuotaPagada;
        this.alquileres = new ArrayList<>();
    }

    public void agregarAlquiler(AlquilerCancha alquiler) {
        alquileres.add(alquiler);
    }

    public boolean tieneAlquilerCancha(int canchaID) {
        for (AlquilerCancha alquiler : alquileres) {
            if (alquiler.getCanchaID() == canchaID) {
                return true;
            }
        }
        return false;
    }

    public double calcularTotalAlquileres(int canchaID) {
        double total = 0;
        for (AlquilerCancha alquiler : alquileres) {
            if (alquiler.getCanchaID() == canchaID) {
                total += alquiler.getMonto();
            }
        }
        return total;
    }

    public boolean isCuotaPagada() {
        return cuotaPagada;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

}
