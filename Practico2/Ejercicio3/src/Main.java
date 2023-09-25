import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear ciudades
        Ciudad ciudad1 = new Ciudad("Ciudad A", 150000, 100000, 20000, 30000, 25000, 18000, 90000);
        Ciudad ciudad2 = new Ciudad("Ciudad B", 120000, 80000, 15000, 25000, 22000, 16000, 75000);
        Ciudad ciudad3 = new Ciudad("Ciudad C", 90000, 60000, 12000, 18000, 15000, 12000, 60000);

        // Crear provincias y agregar ciudades
        Provincia provincia1 = new Provincia("Provincia X");
        provincia1.agregarCiudad(ciudad1);
        provincia1.agregarCiudad(ciudad2);

        Provincia provincia2 = new Provincia("Provincia Y");
        provincia2.agregarCiudad(ciudad3);

        // Crear país y agregar provincias
        Pais pais = new Pais();
        pais.agregarProvincia(provincia1);
        pais.agregarProvincia(provincia2);

        // Obtener ciudades con déficit
        List<Ciudad> ciudadesConDeficit = pais.obtenerCiudadesConDeficit();
        System.out.println("Ciudades con déficit:");
        for (Ciudad ciudad : ciudadesConDeficit) {
            System.out.println("Nombre: " + ciudad.getNombre());
            System.out.println("Excedente: " + ciudad.calcularExcedente());
            System.out.println("------------------------");
        }

        // Obtener provincias con más de la mitad de ciudades en déficit
        List<Provincia> provinciasConMayorDeficit = pais.obtenerProvinciasConMayorDeficit();
        System.out.println("Provincias con más de la mitad de ciudades en déficit:");
        for (Provincia provincia : provinciasConMayorDeficit) {
            System.out.println("Nombre: " + provincia.getNombre());
            System.out.println("------------------------");
        }
    }
}
