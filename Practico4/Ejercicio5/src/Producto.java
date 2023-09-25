import java.time.LocalDate;
public class Producto {
    
    private LocalDate fechaVencimiento;
    private int nroLote;
    private LocalDate fechaEnvasado;
    private String granjaOrigen;


    public Producto(LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado, String granjaOrigen) {
        this.fechaVencimiento = fechaVencimiento;
        this.nroLote = nroLote;
        this.fechaEnvasado = fechaEnvasado;
        this.granjaOrigen = granjaOrigen;
    }


    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }


    public int getNroLote() {
        return nroLote;
    }


    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }


    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    
    public String mostrarTodosLosDatos(){
        String TodoDatos = "Lista con datos: ";
        return TodoDatos +  "Fecha de vencimiento " + getFechaVencimiento() + " Numero de Lote: " + "\n" + getNroLote() + " Fecha envasado: " + getFechaEnvasado() + " Granja Origen: " + getGranjaOrigen();
    }
    

    

}
