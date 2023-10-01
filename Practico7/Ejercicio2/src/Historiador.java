import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Historiador {
     private List<Documento> documentos;

    public Historiador() {
        this.documentos = new ArrayList<>();
    }

    public void agregarDocumento(Documento documento) {
        documentos.add(documento);
    }

    public List<Documento> buscarPorTituloExacto(String titulo) {
        return documentos.stream().filter(doc -> doc.getTitulo().equals(titulo)).collect(Collectors.toList());
    }

    public List<Documento> buscarPorPalabraEnTitulo(String palabra) {
        return documentos.stream().filter(doc -> doc.getTitulo().contains(palabra)).collect(Collectors.toList());
    }

    public List<Documento> buscarPorPalabraClave(String palabraClave) {
        return documentos.stream().filter(doc -> doc.getPalabrasClave().contains(palabraClave)).collect(Collectors.toList());
    }

    public List<Documento> buscarDocumentosSinPalabrasClave() {
        return documentos.stream().filter(doc -> doc.getPalabrasClave().isEmpty()).collect(Collectors.toList());
    }

    public List<Documento> buscarPorAutor(String autor) {
        return documentos.stream().filter(doc -> doc.getAutores().contains(autor)).collect(Collectors.toList());
    }

    public List<Documento> buscarPorContenido(String palabra) {
        return documentos.stream().filter(doc -> doc.getContenido().contains(palabra)).collect(Collectors.toList());
    }

    public List<Documento> buscarDocumentosConMinimoPalabras(int cantidadPalabras) {
        return documentos.stream().filter(doc -> doc.getContenido().split("\\s+").length >= cantidadPalabras).collect(Collectors.toList());
    }
}
