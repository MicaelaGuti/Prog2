public class Main {
    public static void main(String[] args) {
        Puerto puerto = new Puerto();

        Barco barco1 = new Barco("Barco A", 500);
        Barco barco2 = new Barco("Barco B", 800);

        Camion camion1 = new Camion("Camión 1", "10/09/2023");
        Camion camion2 = new Camion("Camión 2", "12/09/2023");

        puerto.cargarBarco(barco1);
        puerto.descargarCamion(camion1);
        puerto.cargarBarco(barco2);
        puerto.descargarCamion(camion2);
    }
}
