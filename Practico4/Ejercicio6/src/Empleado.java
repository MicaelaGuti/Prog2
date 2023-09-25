class Empleado extends Persona {
    private int numeroLegajo;
    private double sueldo;

    public Empleado(String nombre, String apellido, int edad, int numeroLegajo, double sueldo) {
        super(nombre, apellido, edad);
        this.numeroLegajo = numeroLegajo;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Cargo: Empleado\n" + super.toString() + "\nNúmero de Legajo: " + numeroLegajo + "\nSueldo: $" + sueldo;
    }
}
