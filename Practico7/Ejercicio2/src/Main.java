import java.util.List;

public class Main {
       public static void main(String[] args) {
       
        Historiador historiador = new Historiador();

        // Agregar documentos al historiador
        historiador.agregarDocumento(new Documento("Título 1", List.of("Autor1", "Autor2"), "Contenido del documento 1", List.of("Historia", "Guerra")));
        historiador.agregarDocumento(new Documento("Título 2", List.of("Autor3"), "Contenido del documento 2", List.of("Historia", "Cultura")));

        // Realizar búsquedas
        List<Documento> resultados = historiador.buscarPorPalabraEnTitulo("Título");
        System.out.println("Documentos con 'Título' en el título:");
        resultados.forEach(doc -> System.out.println(doc.getTitulo()));
    }
}
