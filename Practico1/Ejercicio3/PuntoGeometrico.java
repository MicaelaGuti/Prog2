public class PuntoGeometrico{
     //--------------Atributos---------------
     private int X;
     private int Y;
    
     //--------------Contructores--------------
     public PuntoGeometrico(){
         //VALORES POR DEFECTO
         X = 0;
         Y = 0;
     }

     //----------------Métodos-------------
     //GET 
     public int getX(){
        return this.X;
    }   
    public int getY(){
        return this.Y;
    }
    //SET - desplazamiento de los puntos 
    public int setX (int nuevaX){
        return this.X=nuevaX;
    }
    public int setY(int nuevaY){
        return this.Y=nuevaY;
    }

     //Calcular la distancia euclídea.

     public double euclidea(){
        //double cuadrado = Math.pow(numero, 2);
         double dist1 = Math.pow ((X - setX(X)) , 2);
         double dist2 = Math.pow((Y - setY(Y)) , 2);
         double distancia= dist1+dist2;
         return Math.sqrt(distancia);

     }
}

