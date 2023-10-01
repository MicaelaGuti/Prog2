public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        // Agregar elementos a la lista
        arrayList.add("Elemento 1");
        arrayList.add("Elemento 2");
        arrayList.add("Elemento 3");

        // Imprimir tamaño de la lista
        System.out.println("Tamaño de la lista: " + arrayList.size());

        // Obtener e imprimir elemento en la posición 1
        System.out.println("Elemento en la posición 1: " + arrayList.get(1));

        // Verificar si la lista contiene "Elemento 2"
        System.out.println("¿Contiene 'Elemento 2'? " + arrayList.contains("Elemento 2"));

        // Eliminar "Elemento 3" de la lista y verificar si fue removido
        System.out.println("¿Elemento 'Elemento 3' eliminado? " + arrayList.remove("Elemento 3"));

        // Imprimir tamaño de la lista después de eliminar un elemento
        System.out.println("Tamaño de la lista después de eliminar: " + arrayList.size());

        // Imprimir todos los elementos de la lista
        System.out.println("Elementos de la lista:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // Limpiar la lista y verificar si está vacía
        arrayList.clear();
        System.out.println("¿La lista está vacía? " + arrayList.isEmpty());
    }
}
