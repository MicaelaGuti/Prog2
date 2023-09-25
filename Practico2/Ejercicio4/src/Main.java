public class Main {
    public static void main(String[] args) {
        // Crear usuarios
        Usuario usuario1 = new Usuario("Usuario1", true);  // Usuario socio
        Usuario usuario2 = new Usuario("Usuario2", false); // Usuario no socio

        // Crear canchas
        Cancha canchaPaddle = new Cancha(100);   // Cancha de paddle
        Cancha canchaFutbol = new Cancha(400);   // Cancha de fútbol

        // Crear establecimiento deportivo
        EstablecimientoDeportivo establecimiento = new EstablecimientoDeportivo();

        // Agregar usuarios y canchas al establecimiento
        establecimiento.agregarUsuario(usuario1);
        establecimiento.agregarUsuario(usuario2);
        establecimiento.agregarCancha(canchaPaddle);
        establecimiento.agregarCancha(canchaFutbol);

        // Realizar reservas de turnos
        Turno turno1 = new Turno(canchaPaddle, usuario1, 2); // Usuario1 reserva 2 horas de paddle
        Turno turno2 = new Turno(canchaFutbol, usuario2, 1); // Usuario2 reserva 1 hora de fútbol

        // Calcular y mostrar el costo de los turnos
        double costoTurno1 = turno1.calcularCosto();
        double costoTurno2 = turno2.calcularCosto();

        System.out.println("Costo del turno 1: " + costoTurno1 + " pesos");
        System.out.println("Costo del turno 2: " + costoTurno2 + " pesos");
    }
}
