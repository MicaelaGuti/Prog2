public class Main {
    public static void main(String[] args) {
        Personaje heroe = new Personaje("Clark Kent", "Superman", 800, 1000, 1500, 220, 188, 35);
        Personaje villano = new Personaje("Bruce Wayne", "Batman", 750, 900, 1400, 210, 185, 40);

        Juego juego = new Juego();
        //vision nocturna, velocidad, fuerza peso, altura y edad
        String caracteristica = "altura";
        Personaje ganador = juego.enfrentar(heroe, villano, caracteristica);

        System.out.println("Enfrentamiento en " + caracteristica + ":");
        System.out.println(heroe.getNombreSuperheroe() + " vs. " + villano.getNombreSuperheroe());
        System.out.println("Ganador: " + ganador.getNombreSuperheroe());
    }
}
