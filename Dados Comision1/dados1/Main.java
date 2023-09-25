package dados1;

public class Main {
	
	public static void main(String[] args) {
		
		// Instanciacion
		Juego juego1 = new Juego(7);
		
		juego1.jugar();
		
		Juego juego2 = new Juego(25, 7);
		
		juego2.jugar();
	}

}
