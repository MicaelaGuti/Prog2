class EmpleadoContratado extends Empleado {
    private double salarioSemanal;

    public EmpleadoContratado(String nombre, String apellido, double salarioSemanal) {
        super(nombre, apellido);
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double calcularSalario() {
        return salarioSemanal;
    }
}