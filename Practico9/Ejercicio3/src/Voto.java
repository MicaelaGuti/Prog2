import java.time.LocalTime;

class Voto {
    private Votante votante;
    private Candidato candidato; 
    private LocalTime horaEmision; 

    public Voto(Votante votante, Candidato candidato, LocalTime horaEmision) {
        this.votante = votante;
        this.candidato = candidato;
        this.horaEmision = horaEmision;
    }

    
    public Votante getVotante() {
        return votante;
    }


    public Candidato getCandidato() {
        return candidato;
    }


    public LocalTime getHoraEmision() {
        return horaEmision;
    }


    public boolean esVotoEnBlanco() {
        return candidato == null;
    }
}