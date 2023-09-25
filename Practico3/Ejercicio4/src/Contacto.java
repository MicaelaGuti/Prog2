import java.time.LocalDate; 
import java.time.Period;
public class Contacto {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String numeroTelefono;
    private String direccion;
    private String direccionMail;

    public Contacto(String nombre, String apellido, String fechaNacimiento, String numeroTelefono, String direccion, String direccionMail) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
        this.direccionMail = direccionMail;
    }

    public String getNombreCompleto() {
        return apellido + ", " + nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public int getEdad() {
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento);
        int edad = Period.between(fechaNac, LocalDate.now()).getYears();
        return edad;
       
    }

    public String getCiudad() {
      
        return "";
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDireccionMail() {
        return direccionMail;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDireccionMail(String direccionMail) {
        this.direccionMail = direccionMail;
    }

    
}

