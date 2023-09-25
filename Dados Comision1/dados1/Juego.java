package dados1;

public class Juego {
	
	public static final int MAXRONDAS_PORDEFECTO = 10;
	// Atributos
	private int puntos1;
	private int puntos2;
	private int rondas;
	private int minimoPuntaje;
	
	// Dados??
	
	public Juego(int minimoPuntaje) {
		//puntos1 = 0;
		//puntos2 = 0;
		//this.rondas = MAXRONDAS_PORDEFECTO;
		//this.setRondas(MAXRONDAS_PORDEFECTO);
		this(MAXRONDAS_PORDEFECTO, minimoPuntaje);
	}
	
	public Juego(int rondas, int minimoPuntaje) {
		puntos1 = 0;
		puntos2 = 0;
		//this.rondas = rondas;
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
	
	public int getPuntos1() {
		return puntos1;
	}
	
	public int getPuntos2() {
		return puntos2;
	}
	
	public void jugar() {
		// Mecanica del juego
		for (int i = 0; i < this.rondas; i++) { // Cuenta las rondas
			// Tirar los dados
			int resultado1 = tirarDado() + tirarDado();
			int resultado2 = tirarDado() + tirarDado();
			
			if (resultado1 > resultado2 && resultado1 > 7)
				puntos1++;
			else
				if (resultado2 > resultado1 && resultado2 > 7)
					puntos2++;
		}
		
		// Determinar quien ganó
		if (puntos1 > puntos2)
			System.out.println("Gano el jugador 1 " + puntos1 + " a " + puntos2);
		else
			if (puntos2 > puntos1)
				System.out.println("Gano el jugador 2 " + puntos2 + " a " + puntos1);
			else
				System.out.println("Empate");
		
	}

	private int tirarDado() {
		return (int)(Math.random() * 6) + 1;
	}
	

}
