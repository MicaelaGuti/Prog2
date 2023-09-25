public class Alarma {
    public boolean seRompioVidrio;
    public boolean seAbrioPuertaVentana;
    public boolean seDetectoMovimiento;
    public Timbre timbre;

    public Alarma() {
        this.timbre = new Timbre();
    }

    public void setSeRompioVidrio(boolean seRompioVidrio) {
        this.seRompioVidrio = seRompioVidrio;
    }

    public void setSeAbrioPuertaVentana(boolean seAbrioPuertaVentana) {
        this.seAbrioPuertaVentana = seAbrioPuertaVentana;
    }

    public void setSeDetectoMovimiento(boolean seDetectoMovimiento) {
        this.seDetectoMovimiento = seDetectoMovimiento;
    }

    public void comprobar() {
        if (seRompioVidrio || seAbrioPuertaVentana || seDetectoMovimiento) {
            timbre.hacerSonar();
        }
    }
}
