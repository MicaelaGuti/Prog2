import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class CentroComputos {
    private Queue<Proceso> colaEspera;
    private Queue<Computadora> computadorasDisponibles;

    public CentroComputos() {
        colaEspera = new PriorityQueue<>(Comparator.comparingInt(Proceso::getRequerimientoMemoria).reversed());
        computadorasDisponibles = new PriorityQueue<>(Comparator.comparingDouble(Computadora::getVelocidad).reversed());
    }

    public void agregarProceso(Proceso proceso) {
        colaEspera.add(proceso);
        asignarComputadoras();
    }

    private void asignarComputadoras() {
        while (!colaEspera.isEmpty() && !computadorasDisponibles.isEmpty()) {
            Proceso proceso = colaEspera.poll();
            Computadora computadora = computadorasDisponibles.poll();
            System.out.println("Ejecutando proceso '" + proceso.getNombre() + "' en " + computadora.getNombre());
        }
    }

    public void agregarComputadora(Computadora computadora) {
        computadorasDisponibles.add(computadora);
    }
}
