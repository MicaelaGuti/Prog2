import java.util.List;

public class IncorporarOrdenDescendente implements AccionEjecutable {
    private List<Integer> lista;

    public IncorporarOrdenDescendente(List<Integer> lista) {
        this.lista = lista;
    }

    @Override
    public void ejecutarNodo(Nodo nodo) {
        if (nodo != null) {
            ejecutarNodo(nodo.derecha);
            lista.add(nodo.valor);
            ejecutarNodo(nodo.izquierda);
        }
    }
}