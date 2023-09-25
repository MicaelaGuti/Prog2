class SensorPuertaVentana extends Sensor {
    public SensorPuertaVentana(String zona) {
        super(zona);
    }

    @Override
    public boolean verificar() {
        // Simulacion de apertura de puerta o ventana
        return Math.random() < 0.5; // Apertura aleatoria para pruebas
    }
}
