import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Define las casas de Hogwarts con sus cualidades requeridas y enemistades
        Casa gryffindor = new Casa("Gryffindor", new HashSet<>(), new HashSet<>(), 5);
        Casa slytherin = new Casa("Slytherin", new HashSet<>(), new HashSet<>(), 5);

        // Crear un alumno con nombre, cualidades y familiares
        Alumno harry = new Alumno("Harry Potter", new HashSet<>(), new HashSet<>());
        Alumno draco = new Alumno("Draco Malfoy", new HashSet<>(), new HashSet<>());

        // Agregar cualidades y familiares a los alumnos
        harry.getCualidades().add("Valentía");
        harry.getFamiliares().add(gryffindor);

        draco.getCualidades().add("Astucia");
        draco.getFamiliares().add(slytherin);

        // Asignar alumnos a las casas
        if (gryffindor.agregarAlumno(harry)) {
            System.out.println("Harry fue asignado a Gryffindor");
        } else {
            System.out.println("Harry no fue asignado a Gryffindor");
        }

        if (slytherin.agregarAlumno(draco)) {
            System.out.println("Draco fue asignado a Slytherin");
        } else {
            System.out.println("Draco no fue asignado a Slytherin");
        }
    }
}
