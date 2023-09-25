import java.util.Set;

public class Alumno {
    private String nombre;
    private Set<String> cualidades;
    private Set<Casa> familiares;

    public Alumno(String nombre, Set<String> cualidades, Set<Casa> familiares) {
        this.nombre = nombre;
        this.cualidades = cualidades;
        this.familiares = familiares;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<String> getCualidades() {
        return cualidades;
    }

    public Set<Casa> getFamiliares() {
        return familiares;
    }
}

