package Modelo;

import GUI.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class respositorio {

    private C_SQL controladorSQL;
    private jFrameRegistrar ventanaRegistrar;
    private jFrameMiPerfil ventanaPerfil;
    private ResultSet resultado;

    public void SolicitarUsuario() {
        // TODO - implement respositorio.SolicitarUsuario
        throw new UnsupportedOperationException();
    }

    public void SolicitarContrasenya() {
        // TODO - implement respositorio.SolicitarContrasenya
        throw new UnsupportedOperationException();
    }

    public void solicitadOpcion() {
        // TODO - implement respositorio.solicitadOpcion
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param dni
     */

    public void mostrarInfoUsuario(String dni) {
        // TODO - implement respositorio. mostrarInfoUsuario
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
     *
     * @param nombre
     * @param apellidos
     * @param nombreusuario
     * @param contrasenya
     * @param dni
     * @param telefono
     * @param anyonacimiento
     * @param numerocuenta
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

