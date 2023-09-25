public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion; // Valores de 1 a 5 para episodios vistos, negativo si no se vio.

    
    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isVisto() {
        return visto;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Episodio(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = false; // Por defecto, no visto.
        this.calificacion = -1; // Por defecto, calificación negativa (no vista).
    }

    public void ingresarCalificacion(int calificacion) {
        if (visto) {
            if (calificacion >= 1 && calificacion <= 5) {
                this.calificacion = calificacion;
            } else {
                System.out.println("Calificación no válida. Debe estar entre 1 y 5.");
            }
        }
    }

    public void marcarComoVisto() {
        this.visto = true;
    }

    public boolean estaVisto() {
        return visto;
    }

    public int getCalificacion() {
        return calificacion;
    }
}
