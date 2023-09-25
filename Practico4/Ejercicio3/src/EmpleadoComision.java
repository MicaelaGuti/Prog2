class EmpleadoComision extends Empleado {
    private double salarioBase;
    private double porcentajeComision;
    private double ventasRealizadas;

    public EmpleadoComision(String nombre, String apellido, double salarioBase, double porcentajeComision, double ventasRealizadas) {
        super(nombre, apellido);
        this.salarioBase = salarioBase;
        this.porcentajeComision = porcentajeComision;
        this.ventasRealizadas = ventasRealizadas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (porcentajeComision * ventasRealizadas);
    }
}
