public class Main {
    public static void main(String[] args) {
        Electrodomestico Electrodomestico1= new Electrodomestico("Heladera" , 483.96 , "Acero", 36 , 548.45);
        
        //Bajo consumo?
        System.out.println(Electrodomestico1.bajoConsumo() ? "El electrodomestico es bajo consumo" : "El electrodomestico no es bajo consumo");
        //Balance
        System.out.println("El balance del electrodomestico es: " + Electrodomestico1.balance());
        
        //Alta gama? 
        System.out.println(Electrodomestico1.altaGama() ? "El electrodomestico es alta gama" : "El electrodomestico no es alta gama");
        //Datos electrodomestico
        System.out.println("Los datos del producto son: ");
        Electrodomestico1.getElectrodomestico();
    }
}
