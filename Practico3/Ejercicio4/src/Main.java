public class Main {
    
        public static void main(String[] args) {
            // Crear instancias de Contacto
            Contacto contacto1 = new Contacto("pepe", "argento", "1990-05-15", "1234567890", "123 Main St", "pepe@example.com");
            Contacto contacto2 = new Contacto("ana", "perez", "1985-08-20", "9876543210", "456 Elm St", "ana@example.com");
            Contacto contacto3 = new Contacto("tito", "silva", "1992-03-10", "1234567890", "789 Oak St", "tito@example.com");
    
            // Crear una instancia de Celular
            Celular celular = new Celular();
    
            // Agregar contactos al celular
            celular.agregarContacto(contacto1);
            celular.agregarContacto(contacto2);
            celular.agregarContacto(contacto3);
    
            // Mostrar información de los contactos
            celular.mostrarResumenContactos();
        }
    }
    

