public class Sensor {
    private String zona;

    public Sensor(String zona) {
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public boolean verificar() {
        
        return false; // Por defecto, no hay problemas
    }
}
