import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear algunas fichas
        Ficha ficha1 = new Ficha("Chocolate", 1, 1, 0);
        Ficha ficha2 = new Ficha("Piedra", 6, 1, 0);
        Ficha ficha3 = new Ficha("Caramelo a Rayas", 1, 1, 10);
        Ficha ficha4 = new Ficha("Torta", 8, 4, 4);

        // Crear un tablero
        Tablero tablero = new Tablero(100, List.of(ficha1, ficha2, ficha3, ficha4));

        // Realizar búsquedas
        List<Ficha> fichasConPoderMayorA2 = tablero.buscarFichasPorPoderDestruccion(2);
        System.out.println("Fichas con poder de destrucción mayor a 2:");
        for (Ficha ficha : fichasConPoderMayorA2) {
            System.out.println(ficha.getNombre());
        }

        List<Ficha> fichasOcupanMasDe4Casilleros = tablero.buscarFichasPorEspacio(4);
        System.out.println("\nFichas que ocupan más de 4 lugares:");
        for (Ficha ficha : fichasOcupanMasDe4Casilleros) {
            System.out.println(ficha.getNombre());
        }

        List<Ficha> fichasConFortalezaMayorA5 = tablero.buscarFichasPorFortaleza(5);
        System.out.println("\nFichas con fortaleza mayor a 5:");
        for (Ficha ficha : fichasConFortalezaMayorA5) {
            System.out.println(ficha.getNombre());
        }
}
}
