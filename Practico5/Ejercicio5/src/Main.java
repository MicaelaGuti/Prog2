public class Main {
    public static void main(String[] args) {
        // Crear algunos empleados
        Empleado empleado1 = new Empleado("Juan", "Hernández", "27.832.123", 17000);
        EmpleadoConVentas empleado2 = new EmpleadoConVentas("Martin", "García", "35.124.567", 15000, 5);
        EmpleadoConVentas empleado3 = new EmpleadoConVentas("Pablo", "López", "40.987.654", 13000, 10);
        EmpleadoConBonos empleado4 = new EmpleadoConBonos("Julián", "Ramírez", "12.345.678", 20000, 50, 1000);
        EmpleadoConBonos empleado5 = new EmpleadoConBonos("Mauro", "Martínez", "98.765.432", 18000, 100, 3000);

        // Crear una empresa y agregar empleados
        Empresa empresa = new Empresa();
        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);
        empresa.agregarEmpleado(empleado3);
        empresa.agregarEmpleado(empleado4);
        empresa.agregarEmpleado(empleado5);

        // Calcular los gastos en sueldos de la empresa
        double gastosSueldos = empresa.calcularGastosSueldos();
        System.out.println("Gastos totales en sueldos de la empresa: $" + gastosSueldos);
    }
}
