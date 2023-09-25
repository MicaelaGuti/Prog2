public class Main {
    public static void main(String[] args) {
        AlarmaLuminosa alarma = new AlarmaLuminosa();

        // Simula una situación donde se rompe un vidrio y se detecta movimiento
        alarma.setSeRompioVidrio(true);
        alarma.setSeDetectoMovimiento(true);

        // Se comprueba la alarma luminosa
        alarma.comprobar();
    }
}
