import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Celular {
    private List<Contacto> contactos;

    public Celular() {
        contactos = new ArrayList<>();
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public List<Contacto> obtenerContactosRepetidos() {
        List<Contacto> contactosRepetidos = new ArrayList<>();
        Map<String, Contacto> mapaContactos = new HashMap<>();

        for (Contacto contacto : contactos) {
            String clave = contacto.getApellido() + contacto.getNombre() + contacto.getNumeroTelefono();
            if (mapaContactos.containsKey(clave)) {
                contactosRepetidos.add(contacto);
            } else {
                mapaContactos.put(clave, contacto);
            }
        }

        return contactosRepetidos;
    }

    public double calcularPromedioEdadContactos() {
        int sumaEdades = 0;
        int cantidadContactos = contactos.size();

        for (Contacto contacto : contactos) {
            sumaEdades += contacto.getEdad();
        }

        if (cantidadContactos > 0) {
            return (double) sumaEdades / cantidadContactos;
        } else {
            return 0;
        }
    }

    public void mostrarResumenContactos() {
        System.out.println("Lista de Contactos:");
        for (Contacto contacto : contactos) {
            System.out.println("Nombre: " + contacto.getNombreCompleto());
            System.out.println("Edad: " + contacto.getEdad());
            System.out.println("Número de Teléfono: " + contacto.getNumeroTelefono());
            System.out.println("Ciudad: " + contacto.getCiudad());
            System.out.println("------------------------");
        }

        List<Contacto> contactosRepetidos = obtenerContactosRepetidos();
        System.out.println("Contactos Repetidos:");
        for (Contacto contacto : contactosRepetidos) {
            System.out.println("Nombre: " + contacto.getNombreCompleto());
            System.out.println("Número de Teléfono: " + contacto.getNumeroTelefono());
            System.out.println("------------------------");
        }

        double promedioEdad = calcularPromedioEdadContactos();
        System.out.println("Promedio de Edad de Contactos: " + promedioEdad);
    }
}

