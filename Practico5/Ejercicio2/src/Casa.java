import java.util.HashSet;
import java.util.Set;

public class Casa {
    private String nombre;
    private Set<String> cualidadesRequeridas;
    private Set<Casa> casasEnemigas;
    private int capacidad;
    private Set<Alumno> alumnos;

    public Casa(String nombre, Set<String> cualidadesRequeridas, Set<Casa> casasEnemigas, int capacidad) {
        this.nombre = nombre;
        this.cualidadesRequeridas = cualidadesRequeridas;
        this.casasEnemigas = casasEnemigas;
        this.capacidad = capacidad;
        this.alumnos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public boolean puedeAceptarAlumno(Alumno alumno) {
        // Verificar si la casa está llena
        if (alumnos.size() >= capacidad) {
            return false;
        }

        // Verificar si el alumno tiene todas las cualidades requeridas
        if (!cualidadesRequeridas.isEmpty() && !alumno.getCualidades().containsAll(cualidadesRequeridas)) {
            return false;
        }

        // Verificar si la casa requiere familiares y el alumno los tiene
        if (!alumno.getFamiliares().isEmpty() && !alumno.getFamiliares().contains(this)) {
            return false;
        }

        // Verificar si el alumno no es aceptado por casas enemigas
        for (Casa enemiga : casasEnemigas) {
            if (alumno.getFamiliares().contains(enemiga)) {
                return false;
            }
        }

        return true;
    }

    public boolean agregarAlumno(Alumno alumno) {
        if (puedeAceptarAlumno(alumno)) {
            alumnos.add(alumno);
            return true;
        }
        return false;
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }
}
