public class Camion {
    private String nombre;
    private String fechaCarga; // Fecha de carga en formato dd/mm/yyyy

    public Camion(String nombre, String fechaCarga) {
        this.nombre = nombre;
        this.fechaCarga = fechaCarga;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaCarga() {
        return fechaCarga;
    }
}
