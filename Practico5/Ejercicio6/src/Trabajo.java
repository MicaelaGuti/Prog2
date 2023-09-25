import java.util.List;

public class Trabajo {
    private String titulo;
    private String tipo; // "Artículo", "Resumen" o "Poster"
    private List<String> palabrasClave;

    public Trabajo(String titulo, String tipo, List<String> palabrasClave) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.palabrasClave = palabrasClave;
    }

    public String getTipo() {
        return tipo;
    }

    public List<String> getPalabrasClave() {
        return palabrasClave;
    }

    public String getTitulo() {
        return titulo;
    }
}
