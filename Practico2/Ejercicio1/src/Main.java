public class Main {
    public static void main(String[] args) {
        // Crear instancias de episodios
        Episodio episodio1 = new Episodio("Episodio 1", "Descripción del episodio 1");
        Episodio episodio2 = new Episodio("Episodio 2", "Descripción del episodio 2");
        Episodio episodio3 = new Episodio("Episodio 3", "Descripción del episodio 3");

        // Marcar episodios como vistos y darles calificaciones
        episodio1.marcarComoVisto();
        episodio1.ingresarCalificacion(4);
        episodio2.marcarComoVisto();
        episodio2.ingresarCalificacion(5);
        episodio3.marcarComoVisto();
        episodio3.ingresarCalificacion(3);

        // Crear una temporada y agregar episodios
        Temporada temporada1 = new Temporada();
        temporada1.agregarEpisodio(episodio1);
        temporada1.agregarEpisodio(episodio2);
        temporada1.agregarEpisodio(episodio3);

        // Crear una serie y agregar temporadas
        Serie serie1 = new Serie("Serie 1", "Descripción de la serie 1", "Creador 1", "Género 1");
        serie1.agregarTemporada(temporada1);

        // Obtener información sobre la serie y temporadas
        System.out.println("Información de la Serie:");
        System.out.println("Título: " + serie1.getTitulo());
        System.out.println("Descripción: " + serie1.getDescripcion());
        System.out.println("Creador: " + serie1.getCreador());
        System.out.println("Género: " + serie1.getGenero());

        System.out.println("Total de episodios vistos en la serie: " + serie1.obtenerTotalEpisodiosVistos());
        System.out.println("Promedio de calificaciones en la serie: " + serie1.obtenerPromedioCalificaciones());

        if (serie1.todosEpisodiosVistos()) {
            System.out.println("Todos los episodios de la serie han sido vistos.");
        } else {
            System.out.println("No todos los episodios de la serie han sido vistos.");
        }
    }
}
