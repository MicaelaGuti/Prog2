public abstract class NotificadorDecorator implements Notificador {
    private Notificador notificador;

    public NotificadorDecorator(Notificador notificador) {
        this.notificador = notificador;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        // Delegar al notificador original
        notificador.enviarNotificacion(mensaje);
    }

    @Override
    public String getNotificacion() {
        // Delegar al notificador original
        return notificador.getNotificacion();
    }
}

