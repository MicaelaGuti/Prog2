import java.util.ArrayList;
import java.util.List;

public class Serie {
     private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private List<Temporada> temporadas;

    public Serie(String titulo, String descripcion, String creador, String genero) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = new ArrayList<>();
    }
    

    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getCreador() {
        return creador;
    }


    public void setCreador(String creador) {
        this.creador = creador;
    }


    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }


    public List<Temporada> getTemporadas() {
        return temporadas;
    }


    public void setTemporadas(List<Temporada> temporadas) {
        this.temporadas = temporadas;
    }


    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    public int obtenerTotalEpisodiosVistos() {
        int totalVistos = 0;
        for (Temporada temporada : temporadas) {
            totalVistos += temporada.obtenerTotalEpisodiosVistos();
        }
        return totalVistos;
    }

    public double obtenerPromedioCalificaciones() {
        int sumaCalificaciones = 0;
        int totalCalificaciones = 0;

        for (Temporada temporada : temporadas) {
            sumaCalificaciones += temporada.obtenerPromedioCalificaciones();
            totalCalificaciones++;
        }

        if (totalCalificaciones > 0) {
            return (double) sumaCalificaciones / totalCalificaciones;
        } else {
            return 0;
        }
    }

    public boolean todosEpisodiosVistos() {
        for (Temporada temporada : temporadas) {
            if (!temporada.todosEpisodiosVistos()) {
                return false;
            }
        }
        return true;
    }
}
