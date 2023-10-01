import java.util.Set;

public class ProductoQuimico{
     private String nombre;
    private Set<String> cultivosNoRecomendados;
    private Set<String> estadosPatologicos;
    
    public ProductoQuimico(String nombre, Set<String> cultivosNoRecomendados, Set<String> estadosPatologicos) {
        this.nombre = nombre;
        this.cultivosNoRecomendados = cultivosNoRecomendados;
        this.estadosPatologicos = estadosPatologicos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<String> getCultivosNoRecomendados() {
        return cultivosNoRecomendados;
    }
    public void setCultivosNoRecomendados(Set<String> cultivosNoRecomendados) {
        this.cultivosNoRecomendados = cultivosNoRecomendados;
    }
    public Set<String> getEstadosPatologicos() {
        return estadosPatologicos;
    }
    public void setEstadosPatologicos(Set<String> estadosPatologicos) {
        this.estadosPatologicos = estadosPatologicos;
    }

    
}