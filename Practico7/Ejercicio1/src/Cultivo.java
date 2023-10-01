import java.util.Set;

public class Cultivo {
    private String nombre;
    private Set<Enfermedad> enfermedadesFrecuentes;
    
    public Cultivo(String nombre, Set<Enfermedad> enfermedadesFrecuentes) {
        this.nombre = nombre;
        this.enfermedadesFrecuentes = enfermedadesFrecuentes;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Enfermedad> getEnfermedadesFrecuentes() {
        return enfermedadesFrecuentes;
    }
    public void setEnfermedadesFrecuentes(Set<Enfermedad> enfermedadesFrecuentes) {
        this.enfermedadesFrecuentes = enfermedadesFrecuentes;
    }


    
}
