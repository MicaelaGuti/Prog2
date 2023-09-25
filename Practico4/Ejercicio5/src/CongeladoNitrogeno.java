import java.time.LocalDate;

public class CongeladoNitrogeno extends ProductoRyC {
    private String metodoCongelacionEmpleado;
    private int segundos;
    
    public CongeladoNitrogeno(LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado, String granjaOrigen,
            int codigoAlimenticio, double temRecomendada,
            String metodoCongelacionEmpleado, int segundos) {
        super(fechaVencimiento, nroLote, fechaEnvasado, granjaOrigen, codigoAlimenticio, temRecomendada);
        this.metodoCongelacionEmpleado = metodoCongelacionEmpleado;
        this.segundos = segundos;
    }

    public String getMetodoCongelacionEmpleado() {
        return metodoCongelacionEmpleado;
    }

    public int getSegundos() {
        return segundos;
    }

    public String mostrarTodosLosDatos(){
        return super.mostrarTodosLosDatos() + "\n" + " Metodo de congelamiento Empleado: " + getMetodoCongelacionEmpleado() + " Segundos: " + getSegundos();
    }
    
}
