public class Encriptador {
    private String clave;
    

    public Encriptador(String clave) {
        this.clave = clave;
    }


    public String encriptar(String mensaje) {
        // Lógica de encriptación usando la clave
        // Implementa la encriptación según sea necesario
        return mensaje; // Simplemente devuelve el mensaje sin encriptar en este ejemplo
    }

    public String desencriptar(String mensajeEncriptado) {
        // Lógica de desencriptación usando la clave
        // Implementa la desencriptación según sea necesario
        return mensajeEncriptado; // Simplemente devuelve el mensaje encriptado sin desencriptar en este ejemplo
    }


    public String getClave() {
        return clave;
    }


    public void setClave(String clave) {
        this.clave = clave;
    }
}
