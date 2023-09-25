import java.util.ArrayList;
import java.util.List;

public class Reunion {
    private String ubicacion;
    private List<Persona> participantes;
    private String tema;
    private int duracionMinutos;

    public Reunion(String ubicacion, String tema, int duracionMinutos) {
        this.ubicacion = ubicacion;
        this.participantes = new ArrayList<>();
        this.tema = tema;
        this.duracionMinutos = duracionMinutos;
    }
    

    public String getUbicacion() {
        return ubicacion;
    }


    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }


    public List<Persona> getParticipantes() {
        return participantes;
    }


    public void setParticipantes(List<Persona> participantes) {
        this.participantes = participantes;
    }


    public String getTema() {
        return tema;
    }


    public void setTema(String tema) {
        this.tema = tema;
    }


    public int getDuracionMinutos() {
        return duracionMinutos;
    }


    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }


    public void agregarParticipante(Persona persona) {
        participantes.add(persona);
    }

}
