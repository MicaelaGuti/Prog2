import java.util.ArrayList;
import java.util.List;

class Directorio extends Elemento {
    private List<Elemento> elementos;

    public Directorio(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(Elemento elemento) {
        elementos.add(elemento);
    }

    @Override
    public int getTamanio() {
        int tamanioTotal = 0;
        for (Elemento elemento : elementos) {
            tamanioTotal += elemento.getTamanio();
        }
        return tamanioTotal;
    }
}