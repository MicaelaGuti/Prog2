public class ComprimirDecorator extends NotificadorDecorator {
    public ComprimirDecorator(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        String mensajeComprimido = comprimir(mensaje);
        super.enviarNotificacion(mensajeComprimido);
    }

    private String comprimir(String mensaje) {
        // Lógica para comprimir el mensaje (utilizando Gzip)
        // Implementa la lógica de compresión y descompresión según sea necesario
        return mensaje; // Simplemente devuelve el mensaje sin comprimir en este ejemplo
    }
}
