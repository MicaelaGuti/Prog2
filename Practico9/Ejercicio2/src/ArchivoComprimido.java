import java.util.ArrayList;
import java.util.List;

class ArchivoComprimido extends Elemento {
    private double factorCompresion;
    private List<Elemento> elementosComprimidos;

    public ArchivoComprimido(String nombre, double factorCompresion) {
        super(nombre);
        this.factorCompresion = factorCompresion;
        this.elementosComprimidos = new ArrayList<>();
    }

    public void agregarElemento(Elemento elemento) {
        elementosComprimidos.add(elemento);
    }

    @Override
    public int getTamanio() {
        int tamanioTotal = 0;
        for (Elemento elemento : elementosComprimidos) {
            tamanioTotal += elemento.getTamanio();
        }
        // Aplicar factor de compresión
        return (int) (tamanioTotal / factorCompresion);
    }
}