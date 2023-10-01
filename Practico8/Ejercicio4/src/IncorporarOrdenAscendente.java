import java.util.List;

public class IncorporarOrdenAscendente implements AccionEjecutable {
    private List<Integer> lista;

    public IncorporarOrdenAscendente(List<Integer> lista) {
        this.lista = lista;
    }

    @Override
    public void ejecutarNodo(Nodo nodo) {
        if (nodo != null) {
            ejecutarNodo(nodo.izquierda);
            lista.add(nodo.valor);
            ejecutarNodo(nodo.derecha);
        }
    }
}
