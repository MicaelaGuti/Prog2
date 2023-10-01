import java.util.Set;

public class Enfermedad {
    private String nombre;
    private Set<String> estadosPatologicos;

    
    public Enfermedad(String nombre, Set<String> estadosPatologicos) {
        this.nombre = nombre;
        this.estadosPatologicos = estadosPatologicos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<String> getEstadosPatologicos() {
        return estadosPatologicos;
    }
    public void setEstadosPatologicos(Set<String> estadosPatologicos) {
        this.estadosPatologicos = estadosPatologicos;
    }

    
}