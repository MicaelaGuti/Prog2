import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear algunas ciudades
        Ciudad ciudad1 = new Ciudad("Ciudad A");
        Ciudad ciudad2 = new Ciudad("Ciudad B");

        // Crear impuestos y agregarlos a las ciudades
        Impuesto impuesto1 = new Impuesto("imp1", 10000);
        Impuesto impuesto2 = new Impuesto("imp2", 15000);
        Impuesto impuesto3 = new Impuesto("imp3", 8000);

        ciudad1.agregarImpuesto(impuesto1);
        ciudad1.agregarImpuesto(impuesto2);
        ciudad2.agregarImpuesto(impuesto3);

        // Crear contribuyentes y agregarlos a las ciudades
        Contribuyente contribuyente1 = new ContribuyenteSimple("Contribuyente 1", 5000);
        Contribuyente contribuyente2 = new ContribuyenteComerciante("Contribuyente 2", 2000, 50000);
        Contribuyente contribuyente3 = new ContribuyenteProgramador("Contribuyente 3", 1500, 10000);

        ciudad1.agregarContribuyente(contribuyente1);
        ciudad1.agregarContribuyente(contribuyente2);
        ciudad2.agregarContribuyente(contribuyente3);

        // Calcular impuestos recaudados por cada ciudad
        double impuestosCiudad1 = calcularImpuestosCiudad(ciudad1);
        double impuestosCiudad2 = calcularImpuestosCiudad(ciudad2);

        System.out.println("Impuestos recaudados por " + ciudad1.getNombre() + ": $" + impuestosCiudad1);
        System.out.println("Impuestos recaudados por " + ciudad2.getNombre() + ": $" + impuestosCiudad2);

        // Determinar las ciudades en déficit y las provincias en déficit
        List<Ciudad> ciudadesEnDeficit = new ArrayList<>();
        if (ciudad1.gastoMayorQueIngresos()) {
            ciudadesEnDeficit.add(ciudad1);
        }
        if (ciudad2.gastoMayorQueIngresos()) {
            ciudadesEnDeficit.add(ciudad2);
        }

        if (ciudadesEnDeficit.size() > 0) {
            System.out.println("Ciudades en déficit:");
            for (Ciudad ciudad : ciudadesEnDeficit) {
                System.out.println(ciudad.getNombre());
            }
        } else {
            System.out.println("Todas las ciudades tienen superávit.");
        }

        
    }

    private static double calcularImpuestosCiudad(Ciudad ciudad) {
        double impuestosTotales = 0;
        for (Impuesto impuesto : ciudad.getImpuestos()) {
            impuestosTotales += impuesto.getMonto();
        }
        for (Contribuyente contribuyente : ciudad.getContribuyentes()) {
            impuestosTotales += contribuyente.calcularImpuesto();
        }
        return impuestosTotales;
    }
}
