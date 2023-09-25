package dados3;

public class Jugador {
	
	private int puntos;
	private String nombre;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.puntos = 0;
	}
	
	public int tomarTurno(Cubilete cubilete) {
		return cubilete.tirar();
	}
	
	public void incrementarPuntos() {
		//this.puntos++;
		this.incrementarPuntos(1);
	}
	public void incrementarPuntos(int puntos) {
		this.puntos += puntos;
	}
	
	public void resetearPuntos() {
		this.puntos = 0;
	}
	
	public int getPuntos() {
		return this.puntos;
	}
	
	public String getNombre() {
		return this.nombre;
	}

}
