public class EstadisticasDecorator extends NotificadorDecorator {
    private int mensajesEnviados;
    private int mensajesRecibidos;

    public EstadisticasDecorator(Notificador notificador) {
        super(notificador);
        mensajesEnviados = 0;
        mensajesRecibidos = 0;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        super.enviarNotificacion(mensaje);
        mensajesEnviados++;
    }

    @Override
    public String getNotificacion() {
        String notificacion = super.getNotificacion();
        mensajesRecibidos++;
        return notificacion;
    }

    public int getMensajesEnviados() {
        return mensajesEnviados;
    }

    public int getMensajesRecibidos() {
        return mensajesRecibidos;
    }
}

