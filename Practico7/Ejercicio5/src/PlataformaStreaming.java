import java.util.List;
import java.util.stream.Collectors;

public class PlataformaStreaming{
     private List<Pelicula> peliculas;
    private boolean permitirComedias;
    private int añoLimite;
    private List<String> generosExcluidos;

    

    public PlataformaStreaming() {
    }


    public PlataformaStreaming(List<Pelicula> peliculas, boolean permitirComedias, int añoLimite,
            List<String> generosExcluidos) {
        this.peliculas = peliculas;
        this.permitirComedias = permitirComedias;
        this.añoLimite = añoLimite;
        this.generosExcluidos = generosExcluidos;
    }
    

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }


    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }


    public boolean isPermitirComedias() {
        return permitirComedias;
    }


    public void setPermitirComedias(boolean permitirComedias) {
        this.permitirComedias = permitirComedias;
    }


    public int getAñoLimite() {
        return añoLimite;
    }


    public void setAñoLimite(int añoLimite) {
        this.añoLimite = añoLimite;
    }


    public List<String> getGenerosExcluidos() {
        return generosExcluidos;
    }


    public void setGenerosExcluidos(List<String> generosExcluidos) {
        this.generosExcluidos = generosExcluidos;
    }


    public List<Pelicula> buscarPorTitulo(String palabraClave) {
        return peliculas.stream().filter(pelicula -> pelicula.getTitulo().toLowerCase().contains(palabraClave.toLowerCase())).collect(Collectors.toList());
    }

    public List<Pelicula> buscarPorGenero(String genero) {
        return peliculas.stream().filter(pelicula -> pelicula.getGeneros().contains(genero)).collect(Collectors.toList());
    }

    public List<Pelicula> buscarPorActorYDirector(String actor, String directorExcluido) {
        return peliculas.stream().filter(pelicula -> pelicula.getActores().contains(actor) && !pelicula.getDirector().equals(directorExcluido)).collect(Collectors.toList());
    }

    public List<Pelicula> buscarPorAñoYDuracion(int añoLimite, int duracionMaxima) {
        return peliculas.stream().filter(pelicula -> pelicula.getAñoEstreno() < añoLimite && pelicula.getDuracionMinutos() < duracionMaxima).collect(Collectors.toList());
    }

    public boolean esRentable(Pelicula pelicula) {
        if (pelicula.getDuracionMinutos() < 120 && !permitirComedias) {
            return false;
        }

        if (pelicula.getAñoEstreno() >= añoLimite) {
            if (!generosExcluidos.contains("infantil") && !generosExcluidos.contains("documental")) {
                return true;
            }
        }

        return false;
    }
}