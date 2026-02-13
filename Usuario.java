public class Usuario {

    // Atributos
    private int id;
    private String nombre;
    private String correoElectronico;
    private String contrasena;

    // Constructor
    public Usuario(int id, String nombre, String correoElectronico, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
    }

    // Métodos getter
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    // Métodos setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    // Destructor (opcional en Java)
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Objeto Usuario eliminado.");
        } finally {
            super.finalize();
        }
    }
}
