import java.util.List;

public class Documento{
    private String titulo;
    private List<String> autores;
    private String contenido;
    private List<String> palabrasClave;

    public Documento(String titulo, List<String> autores, String contenido, List<String> palabrasClave) {
        this.titulo = titulo;
        this.autores = autores;
        this.contenido = contenido;
        this.palabrasClave = palabrasClave;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public List<String> getPalabrasClave() {
        return palabrasClave;
    }

    public void setPalabrasClave(List<String> palabrasClave) {
        this.palabrasClave = palabrasClave;
    }

    
    

}