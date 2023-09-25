import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear personas
        Persona persona1 = new Persona("Juan", "123-456-7890", "juan@example.com");
        Persona persona2 = new Persona("María", "987-654-3210", "maria@example.com");
        Persona persona3 = new Persona("Pedro", "555-555-5555", "pedro@example.com");

        // Crear reuniones
        Reunion reunion1 = new Reunion("Oficina A", "Reunión de proyecto", 60);
        reunion1.agregarParticipante(persona1);
        reunion1.agregarParticipante(persona2);

        Reunion reunion2 = new Reunion("Sala de conferencias", "Reunión de ventas", 45);
        reunion2.agregarParticipante(persona2);
        reunion2.agregarParticipante(persona3);

        // Crear agenda personal y agregar reuniones
        AgendaPersonal agenda = new AgendaPersonal();
        agenda.agregarReunion(reunion1);
        agenda.agregarReunion(reunion2);

        // Mostrar información de las reuniones en la agenda personal
        List<Reunion> reuniones = agenda.obtenerReuniones();
        for (Reunion reunion : reuniones) {
            System.out.println("Ubicación: " + reunion.getUbicacion());
            System.out.println("Tema: " + reunion.getTema());
            System.out.println("Duración: " + reunion.getDuracionMinutos() + " minutos");
            System.out.println("Participantes:");

            List<Persona> participantes = reunion.getParticipantes();
            for (Persona participante : participantes) {
                System.out.println("- Nombre: " + participante.getNombre());
                System.out.println("  Teléfono: " + participante.getTelefono());
                System.out.println("  Correo: " + participante.getCorreo());
            }

            System.out.println("-----------------------------");
        }
    }
}
