public class ContadorPalabrasPlugin implements Plugin {
    private int contador;

    @Override
    public void ejecutar(String texto) {
        String[] palabras = texto.split("\\s+");
        contador = palabras.length;
    }

    public int obtenerContador() {
        return contador;
    }
}
