import java.util.ArrayList;
import java.util.List;
class Jerarquico extends Empleado {
    private List<Empleado> empleadosACargo;

    public Jerarquico(String nombre, String apellido, int edad, int numeroLegajo, double sueldo) {
        super(nombre, apellido, edad, numeroLegajo, sueldo);
        this.empleadosACargo = new ArrayList<>();
    }

    public void agregarEmpleadoACargo(Empleado empleado) {
        empleadosACargo.add(empleado);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cargo: Jerárquico\n").append(super.toString()).append("\nEmpleados a Cargo:\n");

        for (Empleado empleado : empleadosACargo) {
            stringBuilder.append(empleado.toString()).append("\n\n");
        }

        return stringBuilder.toString();
    }
}