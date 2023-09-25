import java.time.LocalDate;

public class ProductoRyC extends Producto{
    private int codigoAlimenticio;
    private double temRecomendada;

    public ProductoRyC(LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado, String granjaOrigen,
            int codigoAlimenticio, double temRecomendada) {
        super(fechaVencimiento, nroLote, fechaEnvasado, granjaOrigen);
        this.codigoAlimenticio = codigoAlimenticio;
        this.temRecomendada = temRecomendada;
    }

    public int getCodigoAlimenticio() {
        return codigoAlimenticio;
    }
    public double getTemRecomendada() {
        return temRecomendada;
    }

    public String mostrarTodosLosDatos(){
        return super.mostrarTodosLosDatos() +"\n"+ " Codigo Alimenticio: " + getCodigoAlimenticio() + " Temperatura Recomendada: " + getTemRecomendada();
    }
    

}
