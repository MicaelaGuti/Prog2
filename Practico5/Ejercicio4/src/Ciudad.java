import java.util.ArrayList;
import java.util.List;

public class Ciudad {
    private String nombre;
    private List<Impuesto> impuestos;
    private List<Contribuyente> contribuyentes;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.impuestos = new ArrayList<>();
        this.contribuyentes = new ArrayList<>();
    }

    public void agregarImpuesto(Impuesto impuesto) {
        impuestos.add(impuesto);
    }

    public void agregarContribuyente(Contribuyente contribuyente) {
        contribuyentes.add(contribuyente);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Impuesto> getImpuestos() {
        return impuestos;
    }

    public List<Contribuyente> getContribuyentes() {
        return contribuyentes;
    }

    public boolean gastoMayorQueIngresos() {
        double ingresos = calcularImpuestosCiudad();
        double gastos = calcularGastosCiudad();
    
        return gastos > ingresos;
    }
    
    private double calcularImpuestosCiudad() {
        double impuestosTotales = 0;
        for (Impuesto impuesto : impuestos) {
            impuestosTotales += impuesto.getMonto();
        }
        return impuestosTotales;
    }
    
    private double calcularGastosCiudad() {
       
    
        double gastosTotales = 0;
        // for (Gasto gasto : gastos) {
        //     gastosTotales += gasto.getMonto();
        // }
        return gastosTotales;
    }
}
