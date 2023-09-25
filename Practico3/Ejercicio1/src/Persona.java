public class Persona {
    private String nombre;
    private String numeroDocumento;

    public Persona(String nombre, String numeroDocumento) {
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    
}
