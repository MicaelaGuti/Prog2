import java.util.ArrayList;
import java.util.List;

public class Alarma {
     private Timbre timbre;
    private List<Sensor> sensores;

    public Alarma() {
        this.timbre = new Timbre();
        this.sensores = new ArrayList<>();
    }

    public void agregarSensor(Sensor sensor) {
        sensores.add(sensor);
    }

    public void comprobar() {
        List<String> zonasEnConflicto = new ArrayList<>();

        for (Sensor sensor : sensores) {
            if (sensor.verificar()) {
                zonasEnConflicto.add(sensor.getZona());
            }
        }

        if (!zonasEnConflicto.isEmpty()) {
            timbre.hacerSonar();
            System.out.println("Zonas en conflicto: " + String.join(", ", zonasEnConflicto));
        }
    }
}
