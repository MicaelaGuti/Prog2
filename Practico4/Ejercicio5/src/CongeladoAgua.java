import java.time.LocalDate;

public class CongeladoAgua extends ProductoRyC{

    private double gramosSalLitroAgua;

    public CongeladoAgua(LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado, String granjaOrigen,
            int codigoAlimenticio, double temRecomendada,
            double gramosSalLitroAgua) {
        super(fechaVencimiento, nroLote, fechaEnvasado, granjaOrigen, codigoAlimenticio,temRecomendada);
        this.gramosSalLitroAgua = gramosSalLitroAgua;
    }

    public double getGramosSalLitroAgua() {
        return gramosSalLitroAgua;
    }

    public String mostrarTodosLosDatos(){
        return super.mostrarTodosLosDatos() + "\n" + "Gramos de salinidad por litro de agua: " + getGramosSalLitroAgua();
    }

    
}
