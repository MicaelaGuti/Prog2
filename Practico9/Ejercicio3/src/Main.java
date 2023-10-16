import java.time.LocalTime;
import java.util.List;

public class Main {
     public static void main(String[] args) {
        // Crear candidatos
        Candidato candidato1 = new Candidato("Candidato A", "Partido 1", "Agrupacion 1");
        Candidato candidato2 = new Candidato("Candidato B", "Partido 2", "Agrupacion 1");

        // Crear votantes
        Votante votante1 = new Votante("12345678");
        Votante votante2 = new Votante("87654321");

        // Crear mesas
        Mesa mesa1 = new Mesa();
        mesa1.agregarVoto(new Voto(votante1, candidato1, LocalTime.of(10, 30)));
        mesa1.agregarVoto(new Voto(votante2, candidato2, LocalTime.of(11, 15)));
        mesa1.agregarVoto(new Voto(new Votante("11111111"), null, LocalTime.of(10, 45))); // Voto en blanco

        // Crear establecimiento educativo
        EstablecimientoEducativo establecimiento = new EstablecimientoEducativo();
        establecimiento.agregarMesa(mesa1);

        // Crear barrio
        Barrio barrio = new Barrio();
        barrio.agregarMesa(mesa1);

        // Crear localidad
        Localidad localidad = new Localidad();
        localidad.agregarMesa(mesa1);

        // Crear sistema de votación
        SistemaVotacion sistema = new SistemaVotacion();
        sistema.agregarCandidato(candidato1);
        sistema.agregarCandidato(candidato2);
        sistema.agregarEstablecimiento(establecimiento);
        sistema.agregarBarrio(barrio);
        sistema.agregarLocalidad(localidad);

        // Obtener porcentajes y cantidad total de votos
        double porcentajeCandidato1 = sistema.porcentajeVotosPorCandidato(mesa1, candidato1);
        double porcentajeEnBlanco = sistema.porcentajeVotosEnBlanco(mesa1);
        double porcentajeVotosHorario = sistema.porcentajeVotosEntreHoras(mesa1, LocalTime.of(10, 0), LocalTime.of(11, 0));
        int cantidadTotalVotos = sistema.cantidadTotalVotos(mesa1);

        System.out.println("Porcentaje de votos para Candidato 1: " + porcentajeCandidato1 + "%");
        System.out.println("Porcentaje de votos en blanco: " + porcentajeEnBlanco + "%");
        System.out.println("Porcentaje de votos emitidos entre 10:00 y 11:00: " + porcentajeVotosHorario + "%");
        System.out.println("Cantidad total de votos emitidos: " + cantidadTotalVotos);

        // Obtener lista de candidatos ordenada
        List<Candidato> candidatosOrdenados = sistema.obtenerListaCandidatosOrdenada();
        System.out.println("Lista de candidatos ordenada:");
        for (Candidato candidato : candidatosOrdenados) {
            System.out.println("Nombre: " + candidato.getNombre() +
                    ", Partido: " + candidato.getPartidoPolitico() +
                    ", Agrupación: " + candidato.getAgrupacion());
        }
    }
}
