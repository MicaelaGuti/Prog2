public class Ficha{
    private String nombre;
    private int fortaleza;
    private int espacio;
    private int poderDestruccion;

    

    public Ficha(String nombre, int fortaleza, int espacio, int poderDestruccion) {
        this.nombre = nombre;
        this.fortaleza = fortaleza;
        this.espacio = espacio;
        this.poderDestruccion = poderDestruccion;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }
    public int getEspacio() {
        return espacio;
    }
    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }
    public int getPoderDestruccion() {
        return poderDestruccion;
    }

    public void setPoderDestruccion(int poderDestruccion) {
        this.poderDestruccion = poderDestruccion;
    }

    public double calcularPoderEspecial() {
        if (espacio != 0) {
            return (double) fortaleza / espacio;
        } else {
            return 0;
        }
    }
}