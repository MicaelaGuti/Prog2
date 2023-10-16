import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClubFutbol {
    
    private List<Socio> socios;

    public ClubFutbol() {
        this.socios = new ArrayList<>();
    }

    public void agregarSocio(Socio socio) {
        socios.add(socio);
    }

    public List<Socio> obtenerSociosCuotaImpaga() {
        List<Socio> sociosImpagos = new ArrayList<>();
        for (Socio socio : socios) {
            if (!socio.isCuotaPagada()) {
                sociosImpagos.add(socio);
            }
        }
        sociosImpagos.sort(Comparator.comparing(Socio::getApellido).thenComparing(Socio::getNombre));
        return sociosImpagos;
    }

    public List<Socio> obtenerSociosMenoresEdad() {
        List<Socio> menoresEdad = new ArrayList<>();
        for (Socio socio : socios) {
            if (socio.getEdad() < 18) {
                menoresEdad.add(socio);
            }
        }
        menoresEdad.sort(Comparator.comparingInt(Socio::getEdad));
        return menoresEdad;
    }

    public List<Socio> obtenerSociosQueAlquilaronCancha(int canchaID) {
        List<Socio> sociosConAlquiler = new ArrayList<>();
        for (Socio socio : socios) {
            if (socio.tieneAlquilerCancha(canchaID)) {
                sociosConAlquiler.add(socio);
            }
        }
        sociosConAlquiler.sort(Comparator.comparingDouble(s -> s.calcularTotalAlquileres(canchaID)));
        return sociosConAlquiler;
    }

    public List<Socio> obtenerSociosQuePagaronMasDe500() {
        List<Socio> sociosConPagoMas500 = new ArrayList<>();
        List<Socio> sociosMorosos = new ArrayList<>();

        for (Socio socio : socios) {
            boolean tienePagoMas500 = false;
            for (AlquilerCancha alquiler : socio.alquileres) {
                if (alquiler.getMonto() > 500) {
                    tienePagoMas500 = true;
                    break;
                }
            }

            if (tienePagoMas500) {
                if (socio.isCuotaPagada()) {
                    sociosConPagoMas500.add(socio);
                } else {
                    sociosMorosos.add(socio);
                }
            }
        }

        sociosConPagoMas500.sort(Comparator.comparing(Socio::getApellido).thenComparing(Socio::getNombre));
        sociosMorosos.sort(Comparator.comparing(Socio::getApellido).thenComparing(Socio::getNombre));

        List<Socio> resultado = new ArrayList<>(sociosConPagoMas500);
        resultado.addAll(sociosMorosos);
        return resultado;
    }
}

