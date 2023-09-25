package EJERCICO3PREUBA;
public class Main {
    public static void main(String[] args) {
       Regtangulo Regtangulo1= new Regtangulo(2 , 1 , 9 , 1 , 2 , 3 , 9 , 3);
        //Area 
        System.out.println("El area del regtangulo es : " + Regtangulo1.area());
        //Es cuadrado? 
        System.out.println(Regtangulo1.cuadrado() ? "El regtangulo es un cuadrado, sus lados son todos iguales" : "El regtangulo no es un cuadrado");
        //Largo superior del regtangulo 
        System.out.println(Regtangulo1.ladoSuperior() ? "El lado superior es el largo "  : "El lado superior es el ancho");
        //Acostado o parado?
        System.out.println(Regtangulo1.posicion() ? "El regtangulo esta acostado" : "El regtangulo esta parado");
        
    }
}