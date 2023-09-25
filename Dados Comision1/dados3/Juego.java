package dados3;

public class Juego {
	
	public static final int MAXRONDAS_PORDEFECTO = 10;
	// Atributos
	//private int puntos1;
	//private int puntos2;
	private Jugador jugador1;
	private Jugador jugador2;
	private int rondas;
	private int minimoPuntaje;
	
	private Cubilete cubilete;
	
	public Juego(int minimoPuntaje, Jugador j1, Jugador j2, int cantDados) {
		//puntos1 = 0;
		//puntos2 = 0;
		//this.rondas = MAXRONDAS_PORDEFECTO;
		//this.setRondas(MAXRONDAS_PORDEFECTO);
		this(MAXRONDAS_PORDEFECTO, minimoPuntaje, j1, j2, cantDados);
	}
	
	public Juego(int rondas, int minimoPuntaje, Jugador j1, Jugador j2, int cantDados) {
		this.jugador1 = j1;
		this.jugador2 = j2;
		
		this.cubilete = new Cubilete(cantDados);
		
		this.setRondas(rondas);
		this.setMinimoPuntaje(minimoPuntaje);
	}
	
	public void setMinimoPuntaje(int minimo) {
		this.minimoPuntaje = minimo;
	}
	
	public void setRondas(int rondas) {
		if (rondas > 0)
			this.rondas = rondas;
		else
			this.rondas = MAXRONDAS_PORDEFECTO; // SOLO SI HAY ERROR
	}
	
	
	public void jugar() {
		jugador1.resetearPuntos();
		jugador2.resetearPuntos();
		// Mecanica del juego
		for (int i = 0; i < this.rondas; i++) { // Cuenta las rondas
			// Tirar los dados
			int resultado1 = jugador1.tomarTurno(this.cubilete);
			int resultado2 = jugador2.tomarTurno(this.cubilete);
			
			if (resultado1 > resultado2 && resultado1 > minimoPuntaje)
				this.jugador1.incrementarPuntos();
			else
				if (resultado2 > resultado1 && resultado2 > minimoPuntaje)
					this.jugador2.incrementarPuntos();
		}
		
		// Determinar quien ganó
		int puntos1 = jugador1.getPuntos();
		int puntos2 = jugador2.getPuntos();
		if (puntos1 > puntos2)
			System.out.println("Gano "+ jugador1.getNombre() + " " + puntos1 + " a " + puntos2);
		else
			if (puntos2 > puntos1)
				System.out.println("Gano " + jugador2.getNombre() + " " + puntos2 + " a " + puntos1);
			else
				System.out.println("Empate");
		
	}
	

}
