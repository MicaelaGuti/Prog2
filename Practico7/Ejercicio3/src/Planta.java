import java.util.List;

public class Planta{
     private String nombreCientifico;
    private List<String> nombresVulgares;
    private String clasificacionSuperior;
    private String familia;
    private String clase;
    private boolean esPlantaInterior;
    private int requerimientoSol;
    private int requerimientoAgua;

    

    public Planta(String nombreCientifico, List<String> nombresVulgares, String clasificacionSuperior, String familia,
            String clase, boolean esPlantaInterior, int requerimientoSol, int requerimientoAgua) {
        this.nombreCientifico = nombreCientifico;
        this.nombresVulgares = nombresVulgares;
        this.clasificacionSuperior = clasificacionSuperior;
        this.familia = familia;
        this.clase = clase;
        this.esPlantaInterior = esPlantaInterior;
        this.requerimientoSol = requerimientoSol;
        this.requerimientoAgua = requerimientoAgua;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public List<String> getNombresVulgares() {
        return nombresVulgares;
    }

    public void setNombresVulgares(List<String> nombresVulgares) {
        this.nombresVulgares = nombresVulgares;
    }

    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }

    public void setClasificacionSuperior(String clasificacionSuperior) {
        this.clasificacionSuperior = clasificacionSuperior;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public boolean isEsPlantaInterior() {
        return esPlantaInterior;
    }

    public void setEsPlantaInterior(boolean esPlantaInterior) {
        this.esPlantaInterior = esPlantaInterior;
    }

    public int getRequerimientoSol() {
        return requerimientoSol;
    }

    public void setRequerimientoSol(int requerimientoSol) {
        this.requerimientoSol = requerimientoSol;
    }

    public int getRequerimientoAgua() {
        return requerimientoAgua;
    }

    public void setRequerimientoAgua(int requerimientoAgua) {
        this.requerimientoAgua = requerimientoAgua;
    }

    public boolean cumpleRequisitos(String palabraClave, int requerimientoSol, int requerimientoAgua) {
        return this.nombreCientifico.toLowerCase().contains(palabraClave.toLowerCase()) &&
               this.requerimientoSol >= requerimientoSol &&
               this.requerimientoAgua >= requerimientoAgua;
    }

    public boolean esPlantaInterior() {
        return esPlantaInterior;
    }
}