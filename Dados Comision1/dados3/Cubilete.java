package dados3;

public class Cubilete {
	
	//private int cantDados;
	private Dado[] dados;
	
	public Cubilete(int cantDados) {
		//this.cantDados = cantDados;
		this.dados = new Dado[cantDados];
		
		for (int i = 0; i < cantDados; i++)
			dados[i] = new Dado();
	}
	
	public int tirar() {
		int total = 0;
		for (int i = 0; i < dados.length; i++) {
			int valor = dados[i].tirar();
			total = total + valor;
		}
		
		return total;
	}
	
	

}
