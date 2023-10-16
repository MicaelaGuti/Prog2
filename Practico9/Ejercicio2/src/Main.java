public class Main {
    public static void main(String[] args) {
        
        SistemaArchivos sistema = new SistemaArchivos();

        Archivo archivo1 = new Archivo("parcial1.txt", 100); // 100 KB
        Archivo archivo2 = new Archivo("tarea.docx", 200); // 200 KB
        Directorio directorio1 = new Directorio("docs");
        directorio1.agregarElemento(archivo1);
        directorio1.agregarElemento(archivo2);

        Link link1 = new Link("enlace1");
        Archivo archivo3 = new Archivo("parcial2.txt", 150); // 150 KB
        Link link2 = new Link("enlace2");

        ArchivoComprimido comprimido = new ArchivoComprimido("documentos.zip", 0.5); // Factor de compresión 0.5
        comprimido.agregarElemento(directorio1);
        comprimido.agregarElemento(link1);
        comprimido.agregarElemento(archivo3);
        comprimido.agregarElemento(link2);

        sistema.agregarElemento(comprimido);
}
}