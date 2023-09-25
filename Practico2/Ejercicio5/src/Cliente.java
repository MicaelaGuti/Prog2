public class Cliente {
    private String nombre;
    private boolean esClienteFrecuente;

    public Cliente(String nombre, boolean esClienteFrecuente) {
        this.nombre = nombre;
        this.esClienteFrecuente = esClienteFrecuente;
    }

    

    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public boolean isEsClienteFrecuente() {
        return esClienteFrecuente;
    }



    public void setEsClienteFrecuente(boolean esClienteFrecuente) {
        this.esClienteFrecuente = esClienteFrecuente;
    }



    public boolean esClienteFrecuente() {
        return esClienteFrecuente;
    }
}
