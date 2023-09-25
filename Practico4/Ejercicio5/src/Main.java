import java.time.LocalDate;
public class Main {
    
    public static void main(String[] args) {

        Producto producto = new Producto(LocalDate.of(2007,10,24), 25, LocalDate.of(2000, 1, 1), "Granja N°1");
        System.out.println(producto.mostrarTodosLosDatos());
    }


}
