import java.util.Date;
public class Persona {
    private String nombre;
    private String apellido;
    private String numeroPasaporte;
    private Date fechaNacimiento;
    private String estado;

    public Persona(String nombre, String apellido, String numeroPasaporte, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroPasaporte = numeroPasaporte;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = "En país de origen"; // Por defecto, todos están en su país de origen
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public boolean estaDisponible() {
        return estado.equals("En país de origen");
    }
}
