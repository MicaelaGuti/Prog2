import java.util.ArrayList;
import java.util.List;

public class AgendaPersonal {
      List<Reunion> reuniones;

    public AgendaPersonal() {
        reuniones = new ArrayList<>();
    }

    public void agregarReunion(Reunion reunion) {
        reuniones.add(reunion);
    }

    public List<Reunion> obtenerReuniones() {
        return reuniones;
    }
}
