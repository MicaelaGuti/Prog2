import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public double calcularGastosSueldos() {
        double totalGastos = 0.0;
        for (Empleado empleado : empleados) {
            totalGastos += empleado.calcularSueldoTotal();
        }
        return totalGastos;
    }
}
