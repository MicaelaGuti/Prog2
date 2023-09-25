import java.util.Date;
class Futbolista extends Persona {
    private String posicion;
    private boolean esZurdo;
    private int golesConvertidos;

    public Futbolista(String nombre, String apellido, String numeroPasaporte, Date fechaNacimiento, String posicion, boolean esZurdo, int golesConvertidos) {
        super(nombre, apellido, numeroPasaporte, fechaNacimiento);
        this.posicion = posicion;
        this.esZurdo = esZurdo;
        this.golesConvertidos = golesConvertidos;
    }

    public String getPosicion() {
        return posicion;
    }

    public boolean esZurdo() {
        return esZurdo;
    }

    public int getGolesConvertidos() {
        return golesConvertidos;
    }
}
