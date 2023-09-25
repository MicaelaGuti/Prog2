package dados3;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		
		Jugador pepe = new Jugador("Pepe");
		Jugador cacho = new Jugador("Cacho");
		
		// Instanciacion
		Juego juego1 = new Juego(7, pepe, cacho, 4);
		
		juego1.jugar();
		
		Juego juego2 = new Juego(25, 7, pepe, cacho, 2);
		
		juego2.jugar();
		
		LocalDate hoy = LocalDate.now();
		System.out.println(hoy.getDayOfMonth());
		
		LocalDate dia1 = LocalDate.of(1990, 3, 10);
		System.out.println(dia1.isBefore(hoy));
	}

}
