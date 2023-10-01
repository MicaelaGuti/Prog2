import java.util.ArrayList;
import java.util.List;

public class SistemaAgricola {
    private List<ProductoQuimico> productosQuimicos;
    private List<Cultivo> cultivos;

    

    public SistemaAgricola(List<ProductoQuimico> productosQuimicos, List<Cultivo> cultivos) {
        this.productosQuimicos = productosQuimicos;
        this.cultivos = cultivos;
    }

    

    public List<ProductoQuimico> getProductosQuimicos() {
        return productosQuimicos;
    }



    public void setProductosQuimicos(List<ProductoQuimico> productosQuimicos) {
        this.productosQuimicos = productosQuimicos;
    }



    public List<Cultivo> getCultivos() {
        return cultivos;
    }



    public void setCultivos(List<Cultivo> cultivos) {
        this.cultivos = cultivos;
    }



    public List<ProductoQuimico> obtenerAgroquimicosParaEnfermedad(Enfermedad enfermedad) {
        List<ProductoQuimico> agroquimicosParaEnfermedad = new ArrayList<>();
        for (ProductoQuimico producto : productosQuimicos) {
            if (producto.getEstadosPatologicos().containsAll(enfermedad.getEstadosPatologicos())) {
                agroquimicosParaEnfermedad.add(producto);
            }
        }
        return agroquimicosParaEnfermedad;
    }

    public List<ProductoQuimico> obtenerAgroquimicosParaCultivoEnfermedad(Cultivo cultivo, Enfermedad enfermedad) {
        List<ProductoQuimico> agroquimicosParaCultivo = new ArrayList<>();
        for (ProductoQuimico producto : productosQuimicos) {
            if (producto.getEstadosPatologicos().containsAll(enfermedad.getEstadosPatologicos()) &&
                    !Cultivo.getCultivosNoRecomendados().contains(producto.getNombre())) {
                agroquimicosParaCultivo.add(producto);
            }
        }
        return agroquimicosParaCultivo;
    }
}
