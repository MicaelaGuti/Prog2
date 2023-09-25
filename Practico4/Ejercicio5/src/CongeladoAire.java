import java.time.LocalDate;

public class CongeladoAire extends ProductoRyC {
    
    private int nitrogeno;
    private int oxigeno;
    private int dioxidoCarbono;
    private int vaporAgua;

    public CongeladoAire(LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado, String granjaOrigen,
            int codigoAlimenticio, double temRecomendada, int nitrogeno,
            int oxigeno, int dioxidoCarbono, int vaporAgua) {
        super(fechaVencimiento, nroLote, fechaEnvasado, granjaOrigen, codigoAlimenticio, temRecomendada);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxidoCarbono = dioxidoCarbono;
        this.vaporAgua = vaporAgua;
    }

    public int getNitrogeno() {
        return nitrogeno;
    }

    public int getOxigeno() {
        return oxigeno;
    }

    public int getDioxidoCarbono() {
        return dioxidoCarbono;
    }

    public int getVaporAgua() {
        return vaporAgua;
    }

    public String mostrarTodosLosDatos(){
        return super.mostrarTodosLosDatos() + "\n" + "Nitrogeno: " + getNitrogeno() + "%" + " Oxigeno: " + getOxigeno() + "\n" + "%" + " Dioxido de carbono: " + getDioxidoCarbono() + "%" + " Vapor Agua: " + getVaporAgua() + "%";
    }
    
}
