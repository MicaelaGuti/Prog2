import java.util.ArrayList;
import java.util.List;

    class BusquedaAND {
    private List<Socio> resultado;
    private List<Socio> filtro1;
    private List<Socio> filtro2;

    public BusquedaAND(List<Socio> filtro1, List<Socio> filtro2) {
        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
        resultado = new ArrayList<>();
    }

    public List<Socio> ejecutar() {
        for (Socio socio : filtro1) {
            if (filtro2.contains(socio)) {
                resultado.add(socio);
            }
        }
        return resultado;
    }
}

