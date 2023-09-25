import java.util.List;

public class Encuesta {
    private List<String> preguntas;
    private Persona personaEncuestada;
    private Empleado empleadoQueLaRealizo;

    public Encuesta(List<String> preguntas, Persona personaEncuestada, Empleado empleadoQueLaRealizo) {
        this.preguntas = preguntas;
        this.personaEncuestada = personaEncuestada;
        this.empleadoQueLaRealizo = empleadoQueLaRealizo;
        empleadoQueLaRealizo.realizarEncuesta();
    }

    public List<String> getPreguntas() {
        return preguntas;
    }

    public Persona getPersonaEncuestada() {
        return personaEncuestada;
    }

    public Empleado getEmpleadoQueLaRealizo() {
        return empleadoQueLaRealizo;
    }

    public void setPreguntas(List<String> preguntas) {
        this.preguntas = preguntas;
    }

    public void setPersonaEncuestada(Persona personaEncuestada) {
        this.personaEncuestada = personaEncuestada;
    }

    public void setEmpleadoQueLaRealizo(Empleado empleadoQueLaRealizo) {
        this.empleadoQueLaRealizo = empleadoQueLaRealizo;
    }

    
}
