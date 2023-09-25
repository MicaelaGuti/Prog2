public class Peluquero {
    private String nombre;
    private double costoPorHora;

    public Peluquero(String nombre , double costoPorHora) {
        this.nombre = nombre;
        this.costoPorHora = costoPorHora;
    }

    public String getNombre() {
        return nombre;
    }
    public double getCostoPorHora(){
        return costoPorHora;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCostoPorHora(double costoPorHora) {
        this.costoPorHora = costoPorHora;
    }
    

    
}
