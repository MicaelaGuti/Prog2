import java.util.Date;
public class Main {
    public static void main(String[] args) {
        // Ejemplo de creación de personas
        Futbolista futbolista = new Futbolista("Lionel", "Messi", "AR12345", new Date(), "Delantero", true, 700);
        Entrenador entrenador = new Entrenador("Jose", "Perez", "PT54321", new Date(), "FIFA");
        Masajista masajista = new Masajista("Ana", "Lopez", "ES98765", new Date(), "Quiromasajista", 5);

        // Cambiar el estado de una persona
        futbolista.cambiarEstado("En concentración");

        // Verificar disponibilidad
        System.out.println(futbolista.getNombre() + " está disponible: " + futbolista.estaDisponible());
        System.out.println(entrenador.getNombre() + " está disponible: " + entrenador.estaDisponible());
        System.out.println(masajista.getNombre() + " está disponible: " + masajista.estaDisponible());
    }
}
