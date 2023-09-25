import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan Perez", "12345");
        Empleado empleado1 = new Empleado("Eduardo", 1);

        List<String> preguntasEncuesta1 = Arrays.asList("Pregunta 1", "Pregunta 2", "Pregunta 3");
        Encuesta encuesta1 = new Encuesta(preguntasEncuesta1, persona1, empleado1);

        System.out.println("Encuestas realizadas por " + empleado1.getNombre() + ": " + empleado1.getEncuestasRealizadas());
    }
}
