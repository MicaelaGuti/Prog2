import java.util.List;
import java.util.ArrayList;

public class Main {
     public static void main(String[] args) {
        CooperativaAgricultores cooperativa = new CooperativaAgricultores();

        // Definir cereales
        Cereal cereal1 = new Cereal("Trigo", ("MineralA", "MineralB"), "Granos de cosecha fina");
        Cereal cereal2 = new Cereal("Maíz", ("MineralC", "MineralD"), "Granos de cosecha gruesa");
        Cereal cereal3 = new Cereal("Alfalfa", List<String> "MineralA", "MineralB", "Pasturas");

        // Definir lotes
        Lote lote1 = new Lote(1, List.of("MineralA", "MineralB", "MineralC"), 60);
        Lote lote2 = new Lote(2, List.of("MineralA", "MineralC"), 45);
        Lote lote3 = new Lote(3, List<String> minerales = List.of("MineralB", "MineralD"), 70);

        // Agregar cereales y lotes a la cooperativa
        cooperativa.agregarCereal(cereal1);
        cooperativa.agregarCereal(cereal2);
        cooperativa.agregarCereal(cereal3);
        cooperativa.agregarLote(lote1);
        cooperativa.agregarLote(lote2);
        cooperativa.agregarLote(lote3);

        // Consultar qué cereales pueden sembrarse en un lote dado
        Lote loteConsultado = lote1;
        List<Cereal> cerealesCompatibles = cooperativa.cerealesParaLote(loteConsultado);
        System.out.println("Cereales compatibles para el lote " + loteConsultado.getNumero() + ":");
        for (Cereal cereal : cerealesCompatibles) {
            System.out.println(cereal.getNombre());
        }

        // Consultar en qué lotes se puede sembrar un cereal dado
        Cereal cerealConsultado = cereal2;
        List<Lote> lotesCompatibles = cooperativa.lotesParaCereal(cerealConsultado);
        System.out.println("Lotes compatibles para sembrar " + cerealConsultado.getNombre() + ":");
        for (Lote lote : lotesCompatibles) {
            System.out.println("Lote " + lote.getNumero());
        }

        // Consultar si un lote es "especial" o "común"
        Lote loteEspecial = lote1;
        Lote loteComun = lote2;
        System.out.println("Lote " + loteEspecial.getNumero() + " es " + cooperativa.tipoDeLote(loteEspecial));
        System.out.println("Lote " + loteComun.getNumero() + " es " + cooperativa.tipoDeLote(loteComun));
    }

    
}
