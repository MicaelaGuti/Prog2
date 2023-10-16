import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        // Crear socios y agregar al club
        Socio socio1 = new Socio("Juan", "Perez", 20, true);
        Socio socio2 = new Socio("Maria", "Gomez", 17, false);
        Socio socio3 = new Socio("Carlos", "Lopez", 25, true);

        // Crear alquileres
        AlquilerCancha alquiler1 = new AlquilerCancha("2023-10-16", 13, 600);
        AlquilerCancha alquiler2 = new AlquilerCancha("2023-10-15", 13, 450);
        AlquilerCancha alquiler3 = new AlquilerCancha("2023-10-14", 15, 700);

        // Asignar alquileres a socios
        socio1.agregarAlquiler(alquiler1);
        socio1.agregarAlquiler(alquiler2);
        socio2.agregarAlquiler(alquiler3);

        ClubFutbol club = new ClubFutbol();
        club.agregarSocio(socio1);
        club.agregarSocio(socio2);
        club.agregarSocio(socio3);

        // Realizar búsquedas
        List<Socio> sociosCuotaImpaga = club.obtenerSociosCuotaImpaga();
        List<Socio> sociosMenoresEdad = club.obtenerSociosMenoresEdad();
        List<Socio> sociosAlquilerCancha13 = club.obtenerSociosQueAlquilaronCancha(13);
        List<Socio> sociosPagoMas500 = club.obtenerSociosQuePagaronMasDe500();

        // Realizar búsqueda AND: Socios menores de edad con cuota impaga
        BusquedaAND busquedaAND = new BusquedaAND(sociosMenoresEdad, sociosCuotaImpaga);
        List<Socio> resultadoAND = busquedaAND.ejecutar();

        // Realizar búsqueda OR: Socios que pagaron más de $500 o alquilaron la cancha N°13
        BusquedaOR busquedaOR = new BusquedaOR(sociosPagoMas500, sociosAlquilerCancha13);
        List<Socio> resultadoOR = busquedaOR.ejecutar();
    }
}

