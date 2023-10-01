import java.util.List;

public class Main {
     public static void main(String[] args) {
        
        Vivero vivero = new Vivero();

        // Agregar plantas al vivero
        Planta planta1 = new Planta("Epipremnum aureum", List.of("potus", "pothos", "potos"), "Epipremnum", "Araceae", "Monocotyledoneae", true, 4, 3);
        Planta planta2 = new Planta("OtraPlanta", List.of("lengua de suegra"), "Crassula", "Crassulaceae", "Dicotyledoneae", false, 6, 2);
        
        vivero.agregarPlanta(planta1);
        vivero.agregarPlanta(planta2);

        // Realizar búsquedas
        List<Planta> resultados = vivero.buscarPorNombreCientifico("auereum");
        System.out.println("Plantas con 'auereum' en el nombre científico:");
        resultados.forEach(planta -> System.out.println(planta.getNombreCientifico()));
    }
}
