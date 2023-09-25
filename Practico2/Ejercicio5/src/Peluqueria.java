import java.util.ArrayList;
import java.util.List;

public class Peluqueria {
    private List<Peluquero> peluqueros;
    private List<Turno> turnos;

    public Peluqueria() {
        this.peluqueros = new ArrayList<>();
        this.turnos = new ArrayList<>();
    }

    public void agregarPeluquero(Peluquero peluquero) {
        peluqueros.add(peluquero);
    }

    public void programarTurno(Turno turno) {
        turnos.add(turno);
    }

    

    // Método para verificar si un cliente es frecuente
    public boolean esClienteFrecuente(Cliente cliente) {
        // Lógica para determinar si un cliente es frecuente (por ejemplo, basado en el historial de turnos)
        // Retorna true si es cliente frecuente, false en caso contrario
        return false;
    }
}
