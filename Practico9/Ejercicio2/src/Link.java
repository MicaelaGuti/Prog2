class Link extends Elemento {
    public Link(String nombre) {
        super(nombre);
    }

    @Override
    public int getTamanio() {
        // El tamaño de un link siempre es 1 KB
        return 1;
    }
}