import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private List<Episodio> episodios;

    public Temporada() {
        episodios = new ArrayList<>();
    }

    public void agregarEpisodio(Episodio episodio) {
        episodios.add(episodio);
    }

    public int obtenerTotalEpisodiosVistos() {
        int totalVistos = 0;
        for (Episodio episodio : episodios) {
            if (episodio.estaVisto()) {
                totalVistos++;
            }
        }
        return totalVistos;
    }

    public double obtenerPromedioCalificaciones() {
        int sumaCalificaciones = 0;
        int totalCalificaciones = 0;

        for (Episodio episodio : episodios) {
            if (episodio.estaVisto()) {
                sumaCalificaciones += episodio.getCalificacion();
                totalCalificaciones++;
            }
        }

        if (totalCalificaciones > 0) {
            return (double) sumaCalificaciones / totalCalificaciones;
        } else {
            return 0;
        }
    }

    public boolean todosEpisodiosVistos() {
        for (Episodio episodio : episodios) {
            if (!episodio.estaVisto()) {
                return false;
            }
        }
        return true;
    }
}
