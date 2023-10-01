public class EliminarPalabraPlugin implements Plugin {
    private String palabraEliminar;

    

    public EliminarPalabraPlugin(String palabraEliminar) {
        this.palabraEliminar = palabraEliminar;
    }

    @Override
    public void ejecutar(String texto) {
        // Implementación para eliminar una palabra específica
    }

    public String getPalabraEliminar() {
        return palabraEliminar;
    }

    public void setPalabraEliminar(String palabraEliminar) {
        this.palabraEliminar = palabraEliminar;
    }
}