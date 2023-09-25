package dados2;

public class Jugador {
	
	private int puntos;
	private String nombre;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.puntos = 0;
	}
	
	public int tomarTurno(Dado dado1, Dado dado2) {
		return dado1.tirar() + dado2.tirar();
	}
	
	public void incrementarPuntos() {
		//this.puntos++;
		this.incrementarPuntos(1);
	}
	public void incrementarPuntos(int puntos) {
		this.puntos += puntos;
	}
	
	public int getPuntos() {
		return this.puntos;
	}
	
	public String getNombre() {
		return this.nombre;
	}

}
