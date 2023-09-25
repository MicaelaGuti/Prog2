package dados2;

public class Dado {
	
	public static final int CARASPORDEFECTO = 6;
	int caras;
	
	public Dado() {
		this.caras = CARASPORDEFECTO;
	}
	
	public int tirar() {
		return (int)(Math.random() * this.caras) + 1;
	}
	
	

}
