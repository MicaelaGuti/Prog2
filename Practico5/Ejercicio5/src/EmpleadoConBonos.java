public class EmpleadoConBonos extends Empleado {
    private int ventasRealizadas;
    private double bono;

    public EmpleadoConBonos(String nombre, String apellido, String dni, double sueldoMensual, int ventasRealizadas, double bono) {
        super(nombre, apellido, dni, sueldoMensual);
        this.ventasRealizadas = ventasRealizadas;
        this.bono = bono;
    }

    

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }



    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }



    public double getBono() {
        return bono;
    }



    public void setBono(double bono) {
        this.bono = bono;
    }



    @Override
    public double calcularSueldoTotal() {
        // Calcula el sueldo total teniendo en cuenta el sueldo base y el bono por ventas
        double sueldoBase = super.calcularSueldoTotal();
        if (ventasRealizadas >= 50) {
            return sueldoBase + bono;
        } else {
            return sueldoBase;
        }
    }
}
