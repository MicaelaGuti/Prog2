public class Personaje {
    private String nombreReal;
    private String nombreSuperheroe;
    private int visionNocturna;
    private int velocidad;
    private int fuerza;
    private int peso;
    private int altura;
    private int edad;

    public Personaje(String nombreReal, String nombreSuperheroe, int visionNocturna, int velocidad, int fuerza, int peso, int altura, int edad) {
        this.nombreReal = nombreReal;
        this.nombreSuperheroe = nombreSuperheroe;
        this.visionNocturna = visionNocturna;
        this.velocidad = velocidad;
        this.fuerza = fuerza;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public String getNombreSuperheroe() {
        return nombreSuperheroe;
    }

    public int getVisionNocturna() {
        return visionNocturna;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public void setNombreSuperheroe(String nombreSuperheroe) {
        this.nombreSuperheroe = nombreSuperheroe;
    }

    public void setVisionNocturna(int visionNocturna) {
        this.visionNocturna = visionNocturna;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int compararCaracteristica(Personaje otroPersonaje, String caracteristica) {
        switch (caracteristica) {
            case "visionNocturna":
                return Integer.compare(this.visionNocturna, otroPersonaje.getVisionNocturna());
            case "velocidad":
                return Integer.compare(this.velocidad, otroPersonaje.getVelocidad());
            case "fuerza":
                return Integer.compare(this.fuerza, otroPersonaje.getFuerza());
            case "peso":
                return Integer.compare(this.peso, otroPersonaje.getPeso());
            case "altura":
                return Integer.compare(this.altura, otroPersonaje.getAltura());
            case "edad":
                return Integer.compare(this.edad, otroPersonaje.getEdad());
            default:
                throw new IllegalArgumentException("Característica no válida: " + caracteristica);
        }
    }
}
