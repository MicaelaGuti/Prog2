import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Vivero {
     private List<Planta> plantas;

    public Vivero() {
        this.plantas = new ArrayList<>();
    }

    public void agregarPlanta(Planta planta) {
        plantas.add(planta);
    }

    public List<Planta> buscarPorNombreCientifico(String palabraClave) {
        return plantas.stream().filter(planta -> planta.cumpleRequisitos(palabraClave, 0, 0)).collect(Collectors.toList());
    }

    public List<Planta> buscarPorNombreVulgar(String nombreVulgar) {
        return plantas.stream().filter(planta -> planta.getNombresVulgares().contains(nombreVulgar)).collect(Collectors.toList());
    }

    public List<Planta> buscarPorClasificacion(String clasificacion) {
        return plantas.stream().filter(planta -> planta.getClasificacionSuperior().equals(clasificacion)).collect(Collectors.toList());
    }

    public List<Planta> buscarPorRequerimientos(int requerimientoSol, int requerimientoAgua) {
        return plantas.stream().filter(planta -> planta.cumpleRequisitos("", requerimientoSol, requerimientoAgua)).collect(Collectors.toList());
    }

    public List<Planta> buscarPlantasDeInteriorConPocoRiego() {
        return plantas.stream().filter(Planta::esPlantaInterior).filter(planta -> planta.getRequerimientoAgua() < 3).collect(Collectors.toList());
    }

}
