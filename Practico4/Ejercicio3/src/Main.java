public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new EmpleadoContratado("Juan", "Perez", 1000);
        Empleado empleado2 = new EmpleadoHorasExtras("Maria", "Gomez", 800, 10, 5);
        Empleado empleado3 = new EmpleadoComision("Carlos", "Lopez", 1200, 0.05, 5000);

        System.out.println("Salario de " + empleado1.getNombre() + " " + empleado1.getApellido() + ": $" + empleado1.calcularSalario());
        System.out.println("Salario de " + empleado2.getNombre() + " " + empleado2.getApellido() + ": $" + empleado2.calcularSalario());
        System.out.println("Salario de " + empleado3.getNombre() + " " + empleado3.getApellido() + ": $" + empleado3.calcularSalario());
    }
}
