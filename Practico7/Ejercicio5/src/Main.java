import java.util.List;

public class Main {
     public static void main(String[] args) {
     
        PlataformaStreaming plataforma = new PlataformaStreaming();
        // Agregar películas a la plataforma

        // Realizar búsquedas y evaluaciones de rentabilidad
        List<Pelicula> peliculasConLuna = plataforma.buscarPorTitulo("luna");
        System.out.println("Películas con 'luna' en el título:");
        for (Pelicula pelicula : peliculasConLuna) {
            System.out.println(pelicula.getTitulo());
            System.out.println("¿Es rentable? " + plataforma.esRentable(pelicula));
        }

        List<Pelicula> peliculasDeTerror = plataforma.buscarPorGenero("terror");
        System.out.println("\nPelículas de terror:");
        for (Pelicula pelicula : peliculasDeTerror) {
            System.out.println(pelicula.getTitulo());
            System.out.println("¿Es rentable? " + plataforma.esRentable(pelicula));
        }

        List<Pelicula> peliculasWillSmith = plataforma.buscarPorActorYDirector("Will Smith", "Martin Scorsese");
        System.out.println("\nPelículas con Will Smith y no dirigidas por Martin Scorsese:");
        for (Pelicula pelicula : peliculasWillSmith) {
            System.out.println(pelicula.getTitulo());
            System.out.println("¿Es rentable? " + plataforma.esRentable(pelicula));
        }
    }
}
