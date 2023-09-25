import java.util.List;

public class Cereal {
    private String nombre;
    private List<String> mineralesRequeridos;
    private String tipo; // Puede ser "Granos de cosecha gruesa", "Granos de cosecha fina", o "Pasturas"

    public Cereal(String nombre, List<String> mineralesRequeridos, String tipo) {
        this.nombre = nombre;
        this.mineralesRequeridos = mineralesRequeridos;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getMineralesRequeridos() {
        return mineralesRequeridos;
    }

    public String getTipo() {
        return tipo;
    }
}
