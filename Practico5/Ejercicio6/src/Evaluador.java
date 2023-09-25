import java.util.ArrayList;
import java.util.List;

public class Evaluador {
    private String nombre;
    private boolean esExperto;
    private List<String> conocimientos;

    public Evaluador(String nombre, boolean esExperto) {
        this.nombre = nombre;
        this.esExperto = esExperto;
        this.conocimientos = new ArrayList<>();
    }

    public void agregarConocimiento(String conocimiento) {
        conocimientos.add(conocimiento);
    }

    public boolean esAptoParaTrabajo(Trabajo trabajo) {
        List<String> palabrasClaveTrabajo = trabajo.getPalabrasClave();
        
        if (trabajo.getTipo().equals("Poster")) {
            // Para los posters, basta con tener conocimiento en una palabra clave
            for (String palabraClave : palabrasClaveTrabajo) {
                if (conocimientos.contains(palabraClave)) {
                    return true;
                }
            }
            return false;
        } else {
            // Para artículos y resúmenes, debe tener conocimiento en todas las palabras clave
            return conocimientos.containsAll(palabrasClaveTrabajo);
        }
    }

    public boolean esExperto() {
        return esExperto;
    }

    public String getNombre() {
        return nombre;
    }
}
