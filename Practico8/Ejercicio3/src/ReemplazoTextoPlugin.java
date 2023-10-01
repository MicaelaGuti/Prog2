public class ReemplazoTextoPlugin implements Plugin {
    private String palabraOriginal;
    private String palabraNueva;
      

    public String getPalabraOriginal() {
        return palabraOriginal;
    }

    public void setPalabraOriginal(String palabraOriginal) {
        this.palabraOriginal = palabraOriginal;
    }

    public String getPalabraNueva() {
        return palabraNueva;
    }

    public void setPalabraNueva(String palabraNueva) {
        this.palabraNueva = palabraNueva;
    }

    public ReemplazoTextoPlugin(String palabraOriginal, String palabraNueva) {
        this.palabraOriginal = palabraOriginal;
        this.palabraNueva = palabraNueva;
    }

    @Override
    public void ejecutar(String texto) {
        // Implementación para reemplazar una palabra específica
    }
}