import java.util.ArrayList;
import java.util.List;

public class CooperativaAgricultores {
    private List<Cereal> cereales;
    private List<Lote> lotes;

    public CooperativaAgricultores() {
        cereales = new ArrayList<>();
        lotes = new ArrayList<>();
    }

    public void agregarCereal(Cereal cereal) {
        cereales.add(cereal);
    }

    public void agregarLote(Lote lote) {
        lotes.add(lote);
    }

    public List<Cereal> cerealesParaLote(Lote lote) {
        List<Cereal> cerealesCompatibles = new ArrayList<>();

        for (Cereal cereal : cereales) {
            if (cereal.getTipo().equals("Pasturas") && lote.getSuperficie() < 50) {
                // Pasturas solo pueden sembrarse en lotes de al menos 50 hectáreas
                continue;
            }

            if (lote.getMinerales().containsAll(cereal.getMineralesRequeridos())) {
                cerealesCompatibles.add(cereal);
            }
        }

        return cerealesCompatibles;
    }

    public List<Lote> lotesParaCereal(Cereal cereal) {
        List<Lote> lotesCompatibles = new ArrayList<>();

        for (Lote lote : lotes) {
            if (cereal.getTipo().equals("Pasturas") && lote.getSuperficie() < 50) {
                // Pasturas solo pueden sembrarse en lotes de al menos 50 hectáreas
                continue;
            }

            if (lote.getMinerales().containsAll(cereal.getMineralesRequeridos())) {
                lotesCompatibles.add(lote);
            }
        }

        return lotesCompatibles;
    }

    public String tipoDeLote(Lote lote) {
        if (lote.esEspecial()) {
            return "Especial";
        } else {
            return "Común";
        }
    }
}
