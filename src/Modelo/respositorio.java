package Modelo;

import GUI.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class respositorio {

    private C_SQL controladorSQL;
    private jFrameRegistrar ventanaRegistrar;
    private jFrameMiPerfil ventanaPerfil;
    private ResultSet resultado;

    /**
     * Método para mostrar el perfil del usuario que esta conectado. Es decir muestra el usuario, el nombre, el apellido, las carreras realizadas y las categorias.
     * @param dni parámetro dni que guarda el usuario conectado.
     */

    public void mostrarInfoUsuario(String dni) {
        Modelo.ConexionSQL con = new ConexionSQL();
        Connection cn = con.conectar();
        try {
            PreparedStatement pps = cn.prepareStatement("select persona.nombreusuario, persona.nombre, persona.apellidos, categoria.nombre from persona, categoria, inscripcion where persona.dni = inscripcion.dnipersona and categoria.nombre = inscripcion.nombrecategoria and persona.dni=?;");
            pps.setString(1, dni);
            resultado = pps.executeQuery();
            while (resultado.next()) {
                ventanaPerfil.getjTextFieldUsuario().setText(resultado.getString(1));
                ventanaPerfil.getjTextFieldNombre().setText(resultado.getString(2));
                ventanaPerfil.getjTextFieldApellidos().setText(resultado.getString(3));
                ventanaPerfil.getjTextFieldCarrerasRealizadas().setText(resultado.getString(4));
                ventanaPerfil.getjTextFieldCategoria().setText(resultado.getString(5));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void mostrarInfoCarrera() {
        // TODO - implement respositorio.mostrarInfoCarrera
        throw new UnsupportedOperationException();
    }

    /**
     * Metodo para registrar un usuario en la base de datos.
     * @param nombre parámetro nombre que guarda el nombre del usuario que se quiere registrar.
     * @param apellidos parámetro apellidos que guarda el apellido del usuario que se quiere registrar.
     * @param nombreusuario parámetro nombreusuario que guarda el nombre de usuario.
     * @param contrasenya parámetro contraseña que guarda la contraseña del usuario que se quiere registrar.
     * @param dni parámetro dni que guarda el DNI del usuario que se quiere registrar.
     * @param telefono parámetro teléfono que guarda el teléfono del usuario que se quiere registrar.
     * @param anyonacimiento parámetro anyonacimiento que guarda el año de naicmiento del usuario que se quiere registrar.
     * @param numerocuenta parámetro numerocuenta  que guarda el numero de cuenta del usuario que se quiere registrar.
     */

    public void RegistrarCorredor(String nombre, String apellidos, String nombreusuario, String contrasenya, String dni, String telefono, String anyonacimiento, String numerocuenta) {
        Modelo.ConexionSQL con = new ConexionSQL();
        Connection cn = con.conectar();
        try {
            PreparedStatement pps = cn.prepareStatement("INSERT INTO persona(Nombre, Apellidos, NombreUsuario, Contrasenya, DNI, Telefono, Anyonacimiento, NumeroCuenta,Administrador)VALUES(?,?,?,?,?,?,?,?,0);");
            pps.setString(1, nombre);
            pps.setString(2, apellidos);
            pps.setString(3, nombreusuario);
            pps.setString(4, contrasenya);
            pps.setString(5, dni);
            pps.setString(6, telefono);
            pps.setString(7, anyonacimiento);
            pps.setString(8, numerocuenta);
            JOptionPane.showMessageDialog(ventanaRegistrar, "Datos guardados");
            pps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

}

