import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main{
    
public static void main(String[] args) {
        // Crear productos químicos
        ProductoQuimico producto1 = new ProductoQuimico("Producto1", new HashSet<>(Arrays.asList("girasol", "lino")), new HashSet<>(Arrays.asList("deshidratación", "hojas amarillas")));
        ProductoQuimico producto2 = new ProductoQuimico("Producto2", new HashSet<>(Arrays.asList("maíz")), new HashSet<>(Arrays.asList("hojas amarillas", "caída prematura de frutos")));

        // Crear enfermedades
        Enfermedad enfermedad1 = new Enfermedad("Cochinilla", new HashSet<>(Arrays.asList("deshidratación", "hojas amarillas")));

        // Crear cultivos
        Cultivo cultivo1 = new Cultivo("Girasol", new HashSet<>(Arrays.asList(enfermedad1)));
        Cultivo cultivo2 = new Cultivo("Maíz", new HashSet<>(Arrays.asList(enfermedad1)));

        // Crear sistema agrícola
        SistemaAgricola sistema = new SistemaAgricola();
        sistema.getProductosQuimicos().add(producto1);
        sistema.getProductosQuimicos().add(producto2);
        sistema.getCultivos().add(cultivo1);
        sistema.getCultivos().add(cultivo2);

        // Probar servicios
        List<ProductoQuimico> agroquimicosParaEnfermedad = sistema.obtenerAgroquimicosParaEnfermedad(enfermedad1);
        System.out.println("Agroquímicos para la enfermedad Cochinilla:");
        for (ProductoQuimico producto : agroquimicosParaEnfermedad) {
            System.out.println(producto.getNombre());
        }

        List<ProductoQuimico> agroquimicosParaCultivoEnfermedad = sistema.obtenerAgroquimicosParaCultivoEnfermedad(cultivo1, enfermedad1);
        System.out.println("\nAgroquímicos para el cultivo Girasol y la enfermedad Cochinilla:");
        for (ProductoQuimico producto : agroquimicosParaCultivoEnfermedad) {
            System.out.println(producto.getNombre());
        }
    }
}