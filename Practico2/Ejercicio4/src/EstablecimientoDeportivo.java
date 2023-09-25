import java.util.ArrayList;
import java.util.List;

public class EstablecimientoDeportivo {
     private List<Cancha> canchas;
    private List<Usuario> usuarios;

    public EstablecimientoDeportivo() {
        this.canchas = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void agregarCancha(Cancha cancha) {
        canchas.add(cancha);
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Cancha> getCanchas() {
        return canchas;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    
}
