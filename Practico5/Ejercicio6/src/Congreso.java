import java.util.ArrayList;
import java.util.List;

public class Congreso {
    private List<Evaluador> evaluadores;
    private List<Trabajo> trabajos;

    public Congreso() {
        this.evaluadores = new ArrayList<>();
        this.trabajos = new ArrayList<>();
    }

    public void agregarEvaluador(Evaluador evaluador) {
        evaluadores.add(evaluador);
    }

    public void agregarTrabajo(Trabajo trabajo) {
        trabajos.add(trabajo);
    }

    public List<Evaluador> obtenerEvaluadoresAptos(Trabajo trabajo) {
        List<Evaluador> evaluadoresAptos = new ArrayList<>();
        for (Evaluador evaluador : evaluadores) {
            if (evaluador.esAptoParaTrabajo(trabajo)) {
                evaluadoresAptos.add(evaluador);
            }
        }
        return evaluadoresAptos;
    }

    public List<Trabajo> obtenerTrabajosAsignables(Evaluador evaluador) {
        List<Trabajo> trabajosAsignables = new ArrayList<>();
        for (Trabajo trabajo : trabajos) {
            if (evaluador.esAptoParaTrabajo(trabajo)) {
                trabajosAsignables.add(trabajo);
            }
        }
        return trabajosAsignables;
    }

    public int obtenerCantidadTrabajos(Evaluador evaluador) {
        int contador = 0;
        for (Trabajo trabajo : trabajos) {
            if (evaluador.esAptoParaTrabajo(trabajo)) {
                contador++;
            }
        }
        return contador;
    }

    public boolean esEvaluadorExperto(Evaluador evaluador) {
        return evaluador.esExperto();
    }
}
