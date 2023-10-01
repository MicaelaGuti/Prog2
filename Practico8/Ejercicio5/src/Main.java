public class Main {
     public static void main(String[] args) {
        // Crear notificador base (por ejemplo, NotificadorEmail)
        Notificador notificadorBase = new NotificadorEmail("envio@example.com", "recepcion@example.com");

        // Aplicar decoradores según las funcionalidades deseadas
        Notificador notificadorConCompresion = new ComprimirDecorator(notificadorBase);
        Notificador notificadorConEncriptacion = new EncriptarDecorator(notificadorBase, new Encriptador("clave"));
        Notificador notificadorConEstadisticas = new EstadisticasDecorator(notificadorBase);

        // Usar los notificadores decorados
        notificadorConCompresion.enviarNotificacion("Mensaje comprimido");
        notificadorConEncriptacion.enviarNotificacion("Mensaje encriptado");
        notificadorConEstadisticas.enviarNotificacion("Mensaje con estadísticas");

        // Obtener estadísticas del notificador con estadísticas
        EstadisticasDecorator estadisticasDecorator = (EstadisticasDecorator) notificadorConEstadisticas;
        int mensajesEnviados = estadisticasDecorator.getMensajesEnviados();
        int mensajesRecibidos = estadisticasDecorator.getMensajesRecibidos();

        System.out.println("Mensajes enviados: " + mensajesEnviados);
        System.out.println("Mensajes recibidos: " + mensajesRecibidos);
    }
}