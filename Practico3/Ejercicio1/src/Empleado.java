public class Empleado {
    private String nombre;
    private int numeroEmpleado;
    private int encuestasRealizadas;

    public Empleado(String nombre, int numeroEmpleado) {
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.encuestasRealizadas = 0;
    }

    public void realizarEncuesta() {
        encuestasRealizadas++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public int getEncuestasRealizadas() {
        return encuestasRealizadas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public void setEncuestasRealizadas(int encuestasRealizadas) {
        this.encuestasRealizadas = encuestasRealizadas;
    }

    
}
