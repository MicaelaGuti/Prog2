public class Main {
    public static void main(String[] args) {
        Alarma alarma = new Alarma();

        // Agregar sensores a la alarma
        alarma.agregarSensor(new SensorMovimiento("Cocina"));
        alarma.agregarSensor(new SensorPuertaVentana("Sala"));
        alarma.agregarSensor(new SensorPuertaVentana("Dormitorio"));

        // Comprobar la alarma
        alarma.comprobar();
    }
}
