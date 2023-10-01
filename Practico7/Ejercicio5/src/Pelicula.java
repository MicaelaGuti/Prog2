import java.util.List;

public class Pelicula{
    private String titulo;
    private String sinopsis;
    private List<String> generos;
    private String director;
    private List<String> actores;
    private int añoEstreno;
    private int duracionMinutos;
    private int edadMinima;
    
    public Pelicula(String titulo, String sinopsis, List<String> generos, String director, List<String> actores,
            int añoEstreno, int duracionMinutos, int edadMinima) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.generos = generos;
        this.director = director;
        this.actores = actores;
        this.añoEstreno = añoEstreno;
        this.duracionMinutos = duracionMinutos;
        this.edadMinima = edadMinima;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getActores() {
        return actores;
    }

    public void setActores(List<String> actores) {
        this.actores = actores;
    }

    public int getAñoEstreno() {
        return añoEstreno;
    }

    public void setAñoEstreno(int añoEstreno) {
        this.añoEstreno = añoEstreno;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    
}