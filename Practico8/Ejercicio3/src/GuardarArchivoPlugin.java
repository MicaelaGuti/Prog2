import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GuardarArchivoPlugin implements Plugin {
    private String rutaArchivo;

    public GuardarArchivoPlugin(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    @Override
    public void ejecutar(String texto) {
        try {
            Files.write(Paths.get(rutaArchivo), texto.getBytes());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}



    





