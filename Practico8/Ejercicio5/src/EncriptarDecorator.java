public class EncriptarDecorator extends NotificadorDecorator {
    private Encriptador encriptador;

    public EncriptarDecorator(Notificador notificador, Encriptador encriptador) {
        super(notificador);
        this.encriptador = encriptador;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        String mensajeEncriptado = encriptar(mensaje);
        super.enviarNotificacion(mensajeEncriptado);
    }

    @Override
    public String getNotificacion() {
        String mensajeEncriptado = super.getNotificacion();
        return desencriptar(mensajeEncriptado);
    }

    private String encriptar(String mensaje) {
        return encriptador.encriptar(mensaje);
    }

    private String desencriptar(String mensajeEncriptado) {
        return encriptador.desencriptar(mensajeEncriptado);
    }
}

