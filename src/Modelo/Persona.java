package Modelo;

public class Persona {

    private String Nombre;
    private String Apellidos;
    private String DNI;
    private int Telefono;
    private String NombreUsuario;
    private String Contrasenya;
    private String Num_cuenta;
    private boolean administrador;
    private int anyoNacimiento;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getContrasenya() {
        return Contrasenya;
    }

    public void setContrasenya(String Contrasenya) {
        this.Contrasenya = Contrasenya;
    }

    public String getNum_cuenta() {
        return Num_cuenta;
    }

    public void setNum_cuenta(String Num_cuenta) {
        this.Num_cuenta = Num_cuenta;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }

    public void mostrarInfoUsuario() {
        // TODO - implement Persona.mostrarInfoUsuario
        throw new UnsupportedOperationException();
    }

}
