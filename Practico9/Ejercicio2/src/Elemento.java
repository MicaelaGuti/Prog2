import java.util.Date;

abstract class Elemento {
    protected String nombre;
    protected Date fechaCreacion;

    public Elemento(String nombre) {
        this.nombre = nombre;
        this.fechaCreacion = new Date(); // Fecha actual por defecto
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    // Método para calcular el tamaño del elemento
    public abstract int getTamanio();
}