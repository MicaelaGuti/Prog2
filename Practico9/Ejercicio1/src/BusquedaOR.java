import java.util.ArrayList;
import java.util.List;

class BusquedaOR {
    private List<Socio> resultado;
    private List<Socio> filtro1;
    private List<Socio> filtro2;

    public BusquedaOR(List<Socio> filtro1, List<Socio> filtro2) {
        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
        resultado = new ArrayList<>(filtro1);
    }

    public List<Socio> ejecutar() {
        for (Socio socio : filtro2) {
            if (!resultado.contains(socio)) {
                resultado.add(socio);
            }
        }
        return resultado;
    }
}
