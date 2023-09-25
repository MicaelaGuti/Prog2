import java.time.LocalTime;

public class Main {
     public static void main(String[] args) {
        // Crear clientes
        Cliente cliente1 = new Cliente("Cliente1", true );    // Cliente frecuente
        Cliente cliente2 = new Cliente("Cliente2", false);   // Cliente no frecuente

        // Crear peluqueros
        Peluquero peluquero1 = new Peluquero("Peluquero1" , 789);
        Peluquero peluquero2 = new Peluquero("Peluquero2" , 524);
        Peluquero peluquero3 = new Peluquero("Peluquero3" , 600);
        Peluquero peluquero4 = new Peluquero("Peluquero4" , 500);

        // Crear peluquería
        Peluqueria peluqueria = new Peluqueria();

        // Agregar clientes y peluqueros a la peluquería
        peluqueria.agregarPeluquero(peluquero1);
        peluqueria.agregarPeluquero(peluquero2);
        peluqueria.agregarPeluquero(peluquero3);
        peluqueria.agregarPeluquero(peluquero4);

        // Programar turnos
        LocalTime hora1 = LocalTime.of(9, 0);  // Hora del turno 1
        LocalTime hora2 = LocalTime.of(10, 0); // Hora del turno 2

        Turno turno1 = new Turno(cliente1, peluquero1, hora1); // Cliente1 con Peluquero1
        Turno turno2 = new Turno(cliente2, peluquero2, hora1); // Cliente2 con Peluquero2
        Turno turno3 = new Turno(cliente1, peluquero3, hora2); // Cliente1 con Peluquero3
        Turno turno4 = new Turno(cliente2, peluquero4, hora2); // Cliente2 con Peluquero4

        peluqueria.programarTurno(turno1);
        peluqueria.programarTurno(turno2);
        peluqueria.programarTurno(turno3);
        peluqueria.programarTurno(turno4);

        // Calcular y mostrar el costo de los turnos con descuento para clientes frecuentes
        double costoTurno1 = turno1.calcularCosto();
        double costoTurno2 = turno2.calcularCosto();
        double costoTurno3 = turno3.calcularCosto();
        double costoTurno4 = turno4.calcularCosto();

        System.out.println("Costo del turno 1: " + costoTurno1 + " pesos");
        System.out.println("Costo del turno 2: " + costoTurno2 + " pesos");
        System.out.println("Costo del turno 3: " + costoTurno3 + " pesos");
        System.out.println("Costo del turno 4: " + costoTurno4 + " pesos");
    }
}
