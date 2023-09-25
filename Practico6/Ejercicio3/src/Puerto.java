import java.util.LinkedList;
import java.util.Queue;

public class Puerto {
    private Queue<Barco> colaEsperaBarcos;
    private Queue<Camion> colaEsperaCamiones;

    public Puerto() {
        colaEsperaBarcos = new LinkedList<>();
        colaEsperaCamiones = new LinkedList<>();
    }

    public void cargarBarco(Barco barco) {
        colaEsperaBarcos.add(barco);
        asignarBarco();
    }

    private void asignarBarco() {
        if (!colaEsperaBarcos.isEmpty()) {
            Barco barco = colaEsperaBarcos.poll();
            System.out.println("Cargando barco '" + barco.getNombre() + "' con capacidad de " + barco.getCapacidad() + " toneladas.");
        } else {
            System.out.println("No hay barcos esperando para cargar.");
        }
    }

    public void descargarCamion(Camion camion) {
        colaEsperaCamiones.add(camion);
        asignarCamion();
    }

    private void asignarCamion() {
        if (!colaEsperaCamiones.isEmpty()) {
            Camion camion = colaEsperaCamiones.poll();
            System.out.println("Descargando camión '" + camion.getNombre() + "' cargado el " + camion.getFechaCarga() + ".");
        } else {
            System.out.println("No hay camiones esperando para descargar.");
        }
    }
}
