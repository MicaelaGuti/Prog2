class EmpleadoHorasExtras extends Empleado {
    private double salarioBaseSemanal;
    private double montoHoraExtra;
    private int horasExtrasTrabajadas;

    public EmpleadoHorasExtras(String nombre, String apellido, double salarioBaseSemanal, double montoHoraExtra, int horasExtrasTrabajadas) {
        super(nombre, apellido);
        this.salarioBaseSemanal = salarioBaseSemanal;
        this.montoHoraExtra = montoHoraExtra;
        this.horasExtrasTrabajadas = horasExtrasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return salarioBaseSemanal + (montoHoraExtra * horasExtrasTrabajadas);
    }
}