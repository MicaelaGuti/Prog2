public class Turno {
    private Cancha cancha;
    private Usuario usuario;
    private double duracionHoras;

    public Turno(Cancha cancha, Usuario usuario, double duracionHoras) {
        this.cancha = cancha;
        this.usuario = usuario;
        this.duracionHoras = duracionHoras;
    }

    public double calcularCosto() {
        double costo = cancha.getCostoPorHora() * duracionHoras;
        if (usuario != null && usuario.esSocio(usuario)) {
            costo *= 0.9; // Aplicar descuento del 10% para socios
        }
        return costo;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    
}
