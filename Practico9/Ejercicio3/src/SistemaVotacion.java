import java.time.LocalTime;
import java.util.List;

class SistemaVotacion {
    private List<Candidato> candidatos;
    private List<EstablecimientoEducativo> establecimientos;
    private List<Barrio> barrios;
    private List<Localidad> localidades;

  

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public List<EstablecimientoEducativo> getEstablecimientos() {
        return establecimientos;
    }

    public void setEstablecimientos(List<EstablecimientoEducativo> establecimientos) {
        this.establecimientos = establecimientos;
    }

    public List<Barrio> getBarrios() {
        return barrios;
    }

    public void setBarrios(List<Barrio> barrios) {
        this.barrios = barrios;
    }

    public List<Localidad> getLocalidades() {
        return localidades;
    }

    public void setLocalidades(List<Localidad> localidades) {
        this.localidades = localidades;
    }

    public double porcentajeVotosPorCandidato(Mesa mesa, Candidato candidato) {
        int votosCandidato = 0;
        int totalVotos = mesa.getVotos().size();

        for (Voto voto : mesa.getVotos()) {
            if (!voto.esVotoEnBlanco() && voto.getCandidato().equals(candidato)) {
                votosCandidato++;
            }
        }

        return (votosCandidato * 100.0) / totalVotos;
    }

    public double porcentajeVotosEnBlanco(Mesa mesa) {
        int votosEnBlanco = 0;
        int totalVotos = mesa.getVotos().size();

        for (Voto voto : mesa.getVotos()) {
            if (voto.esVotoEnBlanco()) {
                votosEnBlanco++;
            }
        }

        return (votosEnBlanco * 100.0) / totalVotos;
    }

    public double porcentajeVotosEntreHoras(Mesa mesa, LocalTime inicio, LocalTime fin) {
        int votosEnHorario = 0;
        int totalVotos = mesa.getVotos().size();

        for (Voto voto : mesa.getVotos()) {
            if (!voto.esVotoEnBlanco() && voto.getHoraEmision().isAfter(inicio) && voto.getHoraEmision().isBefore(fin)) {
                votosEnHorario++;
            }
        }

        return (votosEnHorario * 100.0) / totalVotos;
    }

    public int cantidadTotalVotos(Mesa mesa) {
        return mesa.getVotos().size();
    }

    public List<Candidato> obtenerListaCandidatosOrdenada() {
        
        
    }
}