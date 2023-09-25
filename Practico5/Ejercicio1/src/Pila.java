import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pila<T> {
     private List<T> elementos;

    public Pila() {
        elementos = new ArrayList<>();
    }

    // Agregar un elemento a la pila
    public void push(T elemento) {
        elementos.add(elemento);
    }

    // Retirar y retornar el último elemento agregado a la pila
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int lastIndex = elementos.size() - 1;
        T elemento = elementos.get(lastIndex);
        elementos.remove(lastIndex);
        return elemento;
    }

    // Consultar el tope de la pila sin eliminarlo
    public T top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementos.get(elementos.size() - 1);
    }

    // Obtener la cantidad de elementos almacenados
    public int size() {
        return elementos.size();
    }

    // Crear y retornar una copia de la pila en el mismo orden
    public Pila<T> copy() {
        Pila<T> copia = new Pila<>();
        for (T elemento : elementos) {
            copia.push(elemento);
        }
        return copia;
    }

    // Crear y retornar una copia de la pila en orden inverso
    public Pila<T> reverse() {
        Pila<T> pilaInversa = new Pila<>();
        for (int i = elementos.size() - 1; i >= 0; i--) {
            pilaInversa.push(elementos.get(i));
        }
        return pilaInversa;
    }

    // Verificar si la pila está vacía
    public boolean isEmpty() {
        return elementos.isEmpty();
    }
}
