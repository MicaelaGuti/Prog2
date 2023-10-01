public class Main {
    public static void main(String[] args) {
        SimpleList linkedList = new LinkedList();

        // Agregar elementos a la lista
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        // Imprimir la lista
        System.out.println("Lista vinculada: " + linkedList);

        // Obtener el tamaño de la lista
        System.out.println("Tamaño de la lista: " + linkedList.size());

        // Verificar si la lista contiene un elemento
        System.out.println("¿Contiene 'B'? " + linkedList.contains("B"));

        // Obtener el elemento en la posición 1
        System.out.println("Elemento en la posición 1: " + linkedList.get(1));

        // Eliminar un elemento
        linkedList.remove("B");
        System.out.println("Lista después de eliminar 'B': " + linkedList);

        // Obtener el índice de un elemento
        System.out.println("Índice de 'C': " + linkedList.indexOf("C"));

        // Agregar todos los elementos de otra lista
        SimpleList anotherList = new LinkedList();
        anotherList.add("X");
        anotherList.add("Y");
        anotherList.add("Z");
        linkedList.addAll(anotherList);
        System.out.println("Lista después de agregar todos los elementos de otra lista: " + linkedList);

        // Limpiar la lista
        linkedList.clear();
        System.out.println("Lista después de limpiar: " + linkedList);
    }
}
