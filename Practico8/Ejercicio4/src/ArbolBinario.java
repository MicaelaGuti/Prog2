public class ArbolBinario {
    private Nodo raiz;

    public void agregarValor(int valor) {
        raiz = agregarValorRecursivo(raiz, valor);
    }

    private Nodo agregarValorRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }

        if (valor < nodo.valor) {
            nodo.izquierda = agregarValorRecursivo(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = agregarValorRecursivo(nodo.derecha, valor);
        }

        return nodo;
    }

    public void recorrerEnOrden(AccionEjecutable accion) {
        recorrerEnOrdenRecursivo(raiz, accion);
    }

    private void recorrerEnOrdenRecursivo(Nodo nodo, AccionEjecutable accion) {
        if (nodo != null) {
            recorrerEnOrdenRecursivo(nodo.izquierda, accion);
            accion.ejecutarNodo(nodo);
            recorrerEnOrdenRecursivo(nodo.derecha, accion);
        }
    }
}
