import java.util.ArrayList;
import java.util.List;

public class Tablero {
    private int puntajeMinimo;
    private List<Ficha> fichas;

    

    public Tablero(int puntajeMinimo, List<Ficha> fichas) {
        this.puntajeMinimo = puntajeMinimo;
        this.fichas = fichas;
    }
    

    public int getPuntajeMinimo() {
        return puntajeMinimo;
    }


    public void setPuntajeMinimo(int puntajeMinimo) {
        this.puntajeMinimo = puntajeMinimo;
    }


    public List<Ficha> getFichas() {
        return fichas;
    }


    public void setFichas(List<Ficha> fichas) {
        this.fichas = fichas;
    }


    public List<Ficha> buscarFichasPorPoderDestruccion(int poderMinimo) {
        List<Ficha> resultado = new ArrayList<>();
        for (Ficha ficha : fichas) {
            if (ficha.getPoderDestruccion() > poderMinimo) {
                resultado.add(ficha);
            }
        }
        return resultado;
    }

    public List<Ficha> buscarFichasPorEspacio(int espacioMinimo) {
        List<Ficha> resultado = new ArrayList<>();
        for (Ficha ficha : fichas) {
            if (ficha.getEspacio() > espacioMinimo) {
                resultado.add(ficha);
            }
        }
        return resultado;
    }

    public List<Ficha> buscarFichasPorFortaleza(int fortalezaMinima) {
        List<Ficha> resultado = new ArrayList<>();
        for (Ficha ficha : fichas) {
            if (ficha.getFortaleza() > fortalezaMinima) {
                resultado.add(ficha);
            }
        }
        return resultado;
    }

    public List<Ficha> buscarCombinacionesLogicas() {
       
        return new ArrayList<>();
    }
}
