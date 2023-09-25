public class Proceso {
    private String nombre;
    private int requerimientoMemoria; // Requerimiento de memoria en megabytes

    public Proceso(String nombre, int requerimientoMemoria) {
        this.nombre = nombre;
        this.requerimientoMemoria = requerimientoMemoria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRequerimientoMemoria() {
        return requerimientoMemoria;
    }
}
