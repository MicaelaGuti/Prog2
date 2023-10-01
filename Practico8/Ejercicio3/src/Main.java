public class Main {
    public static void main(String[] args) {
        ProcesadorTexto procesadorTexto = new ProcesadorTexto();

        String textoActual = "Este es un ejemplo de texto.";

        // Ejemplo de uso de plugins
        ContadorPalabrasPlugin contadorPalabrasPlugin = new ContadorPalabrasPlugin();
        procesadorTexto.ejecutarPlugin(contadorPalabrasPlugin, textoActual);
        System.out.println("Número de palabras en el texto: " + contadorPalabrasPlugin.obtenerContador());

        GuardarArchivoPlugin guardarArchivoPlugin = new GuardarArchivoPlugin("ruta_del_archivo.txt");
        procesadorTexto.ejecutarPlugin(guardarArchivoPlugin, textoActual);
        System.out.println("Texto guardado en archivo.");
    }
}
