class Candidato {
    private String nombre;
    private String partidoPolitico;
    private String agrupacion;

    public Candidato(String nombre, String partidoPolitico, String agrupacion) {
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
        this.agrupacion = agrupacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getAgrupacion() {
        return agrupacion;
    }

    public void setAgrupacion(String agrupacion) {
        this.agrupacion = agrupacion;
    }

    
}