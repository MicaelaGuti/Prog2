public class Main {
    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();

        pila.push(1);
        pila.push(2);
        pila.push(3);

        System.out.println("Tamaño de la pila: " + pila.size());
        System.out.println("Tope de la pila: " + pila.top());

        Pila<Integer> copiaPila = pila.copy();
        System.out.println("Copia de la pila: " + copiaPila.top());

        Pila<Integer> pilaInversa = pila.reverse();
        System.out.println("Pila en orden inverso: " + pilaInversa.top());

        pila.pop();
        System.out.println("Tamaño de la pila después de pop: " + pila.size());
    }
}
