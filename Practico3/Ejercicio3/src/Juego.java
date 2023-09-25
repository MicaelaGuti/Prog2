import java.util.Random;

public class Juego {
    public Personaje enfrentar(Personaje heroe, Personaje villano, String caracteristica) {
        int resultado = heroe.compararCaracteristica(villano, caracteristica);

        if (resultado > 0) {
            return heroe;
        } else if (resultado < 0) {
            return villano;
        } else {
            // En caso de empate, se decide por otra característica aleatoria
            Random random = new Random();
            String[] caracteristicas = {"visionNocturna", "velocidad", "fuerza", "peso", "altura", "edad"};
            String nuevaCaracteristica = caracteristicas[random.nextInt(caracteristicas.length)];
            System.out.println("Empate en " + caracteristica + ". Se decide por " + nuevaCaracteristica);
            return enfrentar(heroe, villano, nuevaCaracteristica);
        }
    }
}
