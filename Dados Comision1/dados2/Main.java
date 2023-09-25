package dados2;

public class Main {
	
	public static void main(String[] args) {
		
		Jugador pepe = new Jugador("Pepe");
		Jugador cacho = new Jugador("Cacho");
		
		// Instanciacion
		Juego juego1 = new Juego(7, pepe, cacho);
		
		juego1.jugar();
		
		Juego juego2 = new Juego(25, 7, pepe, cacho);
		
		juego2.jugar();
	}

}
