import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear evaluadores
        Evaluador evaluador1 = new Evaluador("Evaluador1", true);
        evaluador1.agregarConocimiento("algoritmos");
        evaluador1.agregarConocimiento("redes de comunicación");

        Evaluador evaluador2 = new Evaluador("Evaluador2", false);
        evaluador2.agregarConocimiento("visualización");
        evaluador2.agregarConocimiento("lenguajes de programación");

        // Crear trabajos
        Trabajo trabajo1 = new Trabajo("Artículo1", "Artículo", List.of("algoritmos", "redes de comunicación"));
        Trabajo trabajo2 = new Trabajo("Resumen1", "Resumen", List.of("visualización", "lenguajes de programación"));
        Trabajo trabajo3 = new Trabajo("Poster1", "Poster", List.of("visualización"));

        // Crear el congreso
        Congreso congreso = new Congreso();
        congreso.agregarEvaluador(evaluador1);
        congreso.agregarEvaluador(evaluador2);
        congreso.agregarTrabajo(trabajo1);
        congreso.agregarTrabajo(trabajo2);
        congreso.agregarTrabajo(trabajo3);

        // Ejemplos de consultas
        List<Evaluador> evaluadoresAptos = congreso.obtenerEvaluadoresAptos(trabajo1);
        System.out.println("Evaluadores aptos para " + trabajo1.getTitulo() + ":");
        for (Evaluador evaluador : evaluadoresAptos) {
            System.out.println(evaluador.getNombre());
        }

        List<Trabajo> trabajosAsignables = congreso.obtenerTrabajosAsignables(evaluador2);
        System.out.println("\nTrabajos asignables a " + evaluador2.getNombre() + ":");
        for (Trabajo trabajo : trabajosAsignables) {
            System.out.println(trabajo.getTitulo());
        }

        int cantidadTrabajosEvaluador1 = congreso.obtenerCantidadTrabajos(evaluador1);
        System.out.println("\nCantidad de trabajos asignados a " + evaluador1.getNombre() + ": " + cantidadTrabajosEvaluador1);

        boolean esExpertoEvaluador1 = congreso.esEvaluadorExperto(evaluador1);
        System.out.println("\n" + evaluador1.getNombre() + " es evaluador experto: " + esExpertoEvaluador1);
    }
}
