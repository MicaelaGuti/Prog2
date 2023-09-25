import java.time.LocalTime;

public class Turno {
    private Cliente cliente;
    private Peluquero peluquero;
    private LocalTime hora;

    public Turno(Cliente cliente, Peluquero peluquero, LocalTime hora) {
        this.cliente = cliente;
        this.peluquero = peluquero;
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Peluquero getPeluquero() {
        return peluquero;
    }

    public void setPeluquero(Peluquero peluquero) {
        this.peluquero = peluquero;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public double calcularCosto() {
        double costo = 0;

        // Verificar si el cliente es frecuente y aplicar descuento del 10%
        if (cliente != null && cliente.esClienteFrecuente()) {
            costo = peluquero.getCostoPorHora() * 0.9; // Aplicar descuento del 10%
        } else {
            costo = peluquero.getCostoPorHora();
        }

        return costo;
    }
}
