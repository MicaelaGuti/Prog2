import java.util.List;

public class Lote {
    private int numero;
    private List<String> minerales;
    private double superficie; // En hectáreas

    public Lote(int numero, List<String> minerales, double superficie) {
        this.numero = numero;
        this.minerales = minerales;
        this.superficie = superficie;
    }

    public int getNumero() {
        return numero;
    }

    public List<String> getMinerales() {
        return minerales;
    }

    public double getSuperficie() {
        return superficie;
    }

    public boolean esEspecial() {
        // Verifica si el lote contiene minerales de interés primario para la cooperativa
        return minerales.contains("MineralA") && minerales.contains("MineralB");
    }
}
