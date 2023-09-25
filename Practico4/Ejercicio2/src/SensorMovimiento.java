class SensorMovimiento extends Sensor {
    public SensorMovimiento(String zona) {
        super(zona);
    }

    @Override
    public boolean verificar() {
        // Simulacion la detección de movimiento
        return Math.random() < 0.5; // Detección aleatoria para pruebas
    }
}
