package EJERCICO3PREUBA;
public class Regtangulo {
     //   v1    v2
            //      ▭
            //   v3    v4            

    //------------Atributos----------------
    private int V1X;
    private int V1Y;
    private int V2X;
    private int V2Y;
    private int V3X;
    private int V3Y;
    private int V4X;
    private int V4Y;

    //--------------Constructores---------------

    public Regtangulo(){
        V1X=0;
        V1Y=0;
        V2X=0;
        V2Y=0;
        V3X=0;
        V3Y=0;
        V4X=0;
        V4Y=0;
    }
 //------------------Métodos------------------------------
     //GET 
        public int getV1X(){
            return this.V1X;
        }   
        public int getV1Y(){
            return this.V1Y;
        }
        public int getV2X(){
            return this.V2X;
        }   
        public int getV2Y(){
            return this.V2Y;
        }
        public int getV3X(){
            return this.V3X;
        }   
        public int getV3Y(){
            return this.V3Y;
        }
        public int getV4X(){
            return this.V4X;
        }   
        public int getV4Y(){
            return this.V4Y;
        }
    //SET 
    public int setV1X(int nuevoV1X){
        return this.V1X=nuevoV1X;
    }
    public int setV1Y(int nuevoV1Y){
        return this.V1Y=nuevoV1Y;
    }
    public int setV2X(int nuevoV2X){
        return this.V2X=nuevoV2X;
    }
    public int setV2Y(int nuevoV2Y){
        return this.V2Y=nuevoV2Y;
    }
    public int setV3X(int nuevoV3X){
        return this.V3X=nuevoV3X;
    }
    public int setV3Y(int nuevoV3Y){
        return this.V3Y=nuevoV3Y;
    }
    public int setV4X(int nuevoV4X){
        return this.V4X=nuevoV4X;
    }
    public int setV4Y(int nuevoV4Y){
        return this.V4Y=nuevoV4Y;
    }

//Largo del lado superior (V1 y V2)
public double largo(){
    double lado1 = Math.pow ((V2X - V1X) , 2);
    double lado2 =Math.pow((V2Y - V1Y), 2);
    double largo= lado1 + lado2;
    return Math.sqrt(largo);
}
// Largo del ancho del regtangulo (V2 y V4)
public double ancho(){
    double lado3= Math.pow((V4X - V2X), 2);
    double lado4 = Math.pow((V4Y + V2Y), 2);
    double ancho= lado3 + lado4;
    return Math.sqrt(ancho);
}
//Calcular el Área del rectángulo
public double area(){
    double area= largo() * ancho();
    return area; 
}

//Es cuadrado?
public boolean cuadrado(){
    boolean cuadrado= false;
    if(largo() == ancho()){
        return cuadrado= true;
    }
    else {
        return cuadrado;
    }
}
//Largo del lado superior 
public boolean ladoSuperior(){
    boolean masLargo= false;
    if (largo()> ancho()){
        return masLargo=true;
    }
    else{
        return masLargo;
    } 
    
    
}

//Acostado o parado? (Parado=false , Acostado=true) 
public boolean posicion(){
    boolean posicion = false;
    if (largo()> ancho()){
        return posicion= true; 
    }
    else{
        return posicion;
    }
    
}


}
