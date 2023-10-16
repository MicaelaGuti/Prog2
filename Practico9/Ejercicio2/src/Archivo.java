class Archivo extends Elemento {
    private int tamanio; // Tamaño en KB

    public Archivo(String nombre, int tamanio) {
        super(nombre);
        this.tamanio = tamanio;
    }

    @Override
    public int getTamanio() {
        return tamanio;
    }
}