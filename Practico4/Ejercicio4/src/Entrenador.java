import java.util.Date;
class Entrenador extends Persona {
    private String federacion;

    public Entrenador(String nombre, String apellido, String numeroPasaporte, Date fechaNacimiento, String federacion) {
        super(nombre, apellido, numeroPasaporte, fechaNacimiento);
        this.federacion = federacion;
    }

    public String getFederacion() {
        return federacion;
    }
}