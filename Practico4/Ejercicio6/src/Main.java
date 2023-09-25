import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", "Perez", 30, 101, 50000);
        UsuarioFinal usuarioFinal1 = new UsuarioFinal("Maria", "Gomez", 25, "maria123", "contraseña123");
        Jerarquico jefe = new Jerarquico("Carlos", "Lopez", 40, 201, 70000);

        Empleado empleado2 = new Empleado("Pedro", "Rodriguez", 28, 102, 48000);
        Empleado empleado3 = new Empleado("Ana", "Martinez", 32, 103, 52000);

        jefe.agregarEmpleadoACargo(empleado2);
        jefe.agregarEmpleadoACargo(empleado3);

        List<Persona> personasEmpresa = new ArrayList<>();
        personasEmpresa.add(empleado1);
        personasEmpresa.add(usuarioFinal1);
        personasEmpresa.add(jefe);

        for (Persona persona : personasEmpresa) {
            System.out.println(persona.toString() + "\n");
        }
    }
}
