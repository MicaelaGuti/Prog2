class AlquilerCancha {
    private String fecha;
    private int canchaID;
    private double monto;

    public AlquilerCancha(String fecha, int canchaID, double monto) {
        this.fecha = fecha;
        this.canchaID = canchaID;
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public int getCanchaID() {
        return canchaID;
    }
}