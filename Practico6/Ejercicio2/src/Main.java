public class Main {
    public static void main(String[] args) {
        CentroComputos centro = new CentroComputos();

        Proceso proceso1 = new Proceso("Proceso 1", 2048); // Requiere 2GB de memoria
        Proceso proceso2 = new Proceso("Proceso 2", 1024); // Requiere 1GB de memoria
        Proceso proceso3 = new Proceso("Proceso 3", 4096); // Requiere 4GB de memoria

        Computadora computadora1 = new Computadora("PC 1", 3.5); // 3.5 GHz
        Computadora computadora2 = new Computadora("PC 2", 2.8); // 2.8 GHz

        centro.agregarComputadora(computadora1);
        centro.agregarComputadora(computadora2);

        centro.agregarProceso(proceso1);
        centro.agregarProceso(proceso2);
        centro.agregarProceso(proceso3);
    }






}
