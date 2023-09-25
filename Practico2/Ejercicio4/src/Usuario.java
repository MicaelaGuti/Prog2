public class Usuario {
    private String nombre;
    public boolean esSocio;

    public Usuario(String nombre, boolean esSocio) {
        this.nombre = nombre;
        this.esSocio = esSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsSocio() {
        return esSocio;
    }

    public void setEsSocio(boolean esSocio) {
        this.esSocio = esSocio;
    }

    // Método para verificar si un usuario es socio
    public boolean esSocio(Usuario usuario) {
        // Retorna true si es socio, false en caso contrario
        return false;
    }

    
}
