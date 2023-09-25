import java.util.ArrayList;
import java.util.List;

public class Cliente {
     private String nombre;
    private List<Alquilable> alquileres;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.alquileres = new ArrayList<>();
    }

    public void alquilar(Alquilable item) {
        if (item.estaDisponible()) {
            item.alquilar();
            alquileres.add(item);
            System.out.println(nombre + " ha alquilado " + item.getNombre());
        } else {
            System.out.println(item.getNombre() + " no está disponible para alquiler.");
        }
    }

    public void devolver(Alquilable item) {
        if (alquileres.contains(item)) {
            item.devolver();
            alquileres.remove(item);
            System.out.println(nombre + " ha devuelto " + item.getNombre());
        } else {
            System.out.println(nombre + " no tiene " + item.getNombre() + " alquilado.");
        }
    }
}
