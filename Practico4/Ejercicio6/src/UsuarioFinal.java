class UsuarioFinal extends Persona {
    private String nombreUsuario;
    private String password;

    public UsuarioFinal(String nombre, String apellido, int edad, String nombreUsuario, String password) {
        super(nombre, apellido, edad);
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Cargo: Usuario Final\n" + super.toString() + "\nNombre de Usuario: " + nombreUsuario + "\nPassword: " + password;
    }
}

