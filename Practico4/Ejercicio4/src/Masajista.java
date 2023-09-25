import java.util.Date;
class Masajista extends Persona {
    private String titulo;
    private int anosExperiencia;

    public Masajista(String nombre, String apellido, String numeroPasaporte, Date fechaNacimiento, String titulo, int anosExperiencia) {
        super(nombre, apellido, numeroPasaporte, fechaNacimiento);
        this.titulo = titulo;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }
}