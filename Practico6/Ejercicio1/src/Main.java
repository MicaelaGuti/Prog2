import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Pelicula 1", 3);
        Vehiculo vehiculo1 = new Vehiculo("Auto 1", "Toyota", 5000, "ABC123");

        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");

        cliente1.alquilar(pelicula1);
        cliente1.alquilar(vehiculo1);

        Date fechaActual = new Date();

        // Verificar alquileres vencidos
        System.out.println("\nClientes con alquileres vencidos:");
        if (!pelicula1.estaDisponible()) {
            System.out.println("Pelicula 1 está alquilada.");
        }
        if (!vehiculo1.estaDisponible()) {
            System.out.println("Auto 1 está alquilado.");
        }
    }
}
