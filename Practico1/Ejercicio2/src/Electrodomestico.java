public class Electrodomestico {
       
        //--------------Atributos---------------
        private String nombre;
        private double precioBase;
        private String color;
        private int consumoEnergetico;
        private double peso;
        public static final int CONSUMO=45;
        public static final int ALTAGAMA= 3;
         
        //--------------Contructores--------------
        public Electrodomestico(){
            //VALORES POR DEFECTO
            color= "Gris plata";
            consumoEnergetico= 10;
            precioBase= 100;
            peso=2;
                
        }
        public Electrodomestico(String nombre){
            this.nombre= nombre;
        }

        public Electrodomestico(String nombre , double precioBase){
            this.nombre= nombre; 
            this.precioBase= precioBase;
        }

        public Electrodomestico(String nombre , double precioBase, String color){
            this.nombre= nombre; 
            this.precioBase= precioBase;
            this.color=color;
        }

        public Electrodomestico(String nombre , double precioBase, String color , int consumoEnergetico){
            this.nombre= nombre; 
            this.precioBase= precioBase;
            this.color=color;
            this.consumoEnergetico=consumoEnergetico;
        }

        public Electrodomestico(String nombre , double precioBase, String color , int consumoEnergetico , double peso){
            this.nombre= nombre; 
            this.precioBase= precioBase;
            this.color=color;
            this.consumoEnergetico=consumoEnergetico;
            this.peso=peso;
        }


     //------------------Métodos------------------------------
     //GET 
     public String getNombre(){
         return this.nombre;
     }   
     public double getPrecioBase(){
         return this.precioBase;
     }
     public String getColor(){
         return this.color;
     }
     public int getConsumoEnergetico(){
         return this.consumoEnergetico;
     }
     public double getPeso(){
         return this.peso;
     }
     //SET
    public String setNombre(String nuevoNombre){
        return this.nombre=nuevoNombre;
    }
    public double setPrecioBase(double nuevoPrecio){
        return this.precioBase=nuevoPrecio;
    }
    public String setColor (String nuevoColor){
        return this.color= nuevoColor;
    }
    public int setConsumo (int nuevoConsumo){
        return this.consumoEnergetico= nuevoConsumo;
    }
    public double setPeso (double nuevoPeso){
        return this.peso= nuevoPeso;
        }


    //Corrobora si es bajo consumo 
    public boolean bajoConsumo(){
        boolean bajoConsumo = false;
        if(consumoEnergetico< CONSUMO){
            return bajoConsumo=true;
        }
        else {
            return bajoConsumo;
        }
    }

    //Calcula el balance Costo/Peso
    public double balance(){
        double balance= precioBase/peso;
        return balance;
    }

    //El producto es alta gama? 
    public boolean altaGama(){
        boolean altaGama= false;
        if( balance() > ALTAGAMA ){
            return altaGama=true;
        }
        else{
            return altaGama;
        }
    }
    public void getElectrodomestico(){
        System.out.println("Nombre "+this.nombre+
                        "\nPrecio Base: $"+this.precioBase+
                        "\nColor: "+this.color+
                        "\nConsumo energetico: "+this.consumoEnergetico+"Kw"+
                        "\nPeso: "+this.peso                        
                );
    }

}
