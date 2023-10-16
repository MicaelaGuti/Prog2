import java.util.ArrayList;
import java.util.List;

class SistemaArchivos {
    private List<Elemento> elementos;

    public SistemaArchivos() {
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(Elemento elemento) {
        elementos.add(elemento);
    }

   
}
