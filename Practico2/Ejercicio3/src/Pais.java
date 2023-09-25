import java.util.ArrayList;
import java.util.List;

public class Pais {
    private List<Provincia> provincias;

    public Pais() {
        this.provincias = new ArrayList<>();
    }

    public void agregarProvincia(Provincia provincia) {
        provincias.add(provincia);
    }

    // Método para obtener las ciudades que gastan más de lo que recaudan
    public List<Ciudad> obtenerCiudadesConDeficit() {
        List<Ciudad> ciudadesConDeficit = new ArrayList<>();
        for (Provincia provincia : provincias) {
            for (Ciudad ciudad : provincia.getCiudades()) {
                if (ciudad.calcularExcedente() < 0) {
                    ciudadesConDeficit.add(ciudad);
                }
            }
        }
        return ciudadesConDeficit;
    }

    // Método para obtener las provincias que tienen más de la mitad de las ciudades en déficit
    public List<Provincia> obtenerProvinciasConMayorDeficit() {
        List<Provincia> provinciasConMayorDeficit = new ArrayList<>();
        for (Provincia provincia : provincias) {
            int ciudadesEnDeficit = 0;
            for (Ciudad ciudad : provincia.getCiudades()) {
                if (ciudad.calcularExcedente() < 0) {
                    ciudadesEnDeficit++;
                }
            }
            if (ciudadesEnDeficit > provincia.getCiudades().size() / 2) {
                provinciasConMayorDeficit.add(provincia);
            }
        }
        return provinciasConMayorDeficit;
    }
}
