import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.agregarValor(5);
        arbol.agregarValor(3);
        arbol.agregarValor(7);
        arbol.agregarValor(2);
        arbol.agregarValor(4);
        arbol.agregarValor(6);
        arbol.agregarValor(8);

        List<Integer> listaAscendente = new ArrayList<>();
        AccionEjecutable accionAscendente = new IncorporarOrdenAscendente(listaAscendente);
        arbol.recorrerEnOrden(accionAscendente);
        System.out.println("Elementos en orden ascendente: " + listaAscendente);

        List<Integer> listaDescendente = new ArrayList<>();
        AccionEjecutable accionDescendente = new IncorporarOrdenDescendente(listaDescendente);
        arbol.recorrerEnOrden(accionDescendente);
        System.out.println("Elementos en orden descendente: " + listaDescendente);

        ContadorElementos contador = new ContadorElementos();
        arbol.recorrerEnOrden(contador);
        System.out.println("Cantidad de elementos en el árbol: " + contador.obtenerContador());
    }
}
