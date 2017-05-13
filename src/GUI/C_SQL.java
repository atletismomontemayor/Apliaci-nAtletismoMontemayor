/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.respositorio;

/**
 *
 * @author Jesús
 */
public class C_SQL {

    private PreparedStatement pst;
    private Connection con;
    private static jFramePrincipal miPrincipal;
    private jFrameSesion_Iniciada miSesion;
    private jFrameCarreras ventanaCarreras;
    private jFrameCorredores ventanaCorredores;
    private jFrameRegistrar ventanaRegistrar;
    private jFrameMiPerfil ventanaPerfil;

    /**
     * Método para conectar la ventana principal con la base de datos.
     * @param p parámetro de la ventana principal.
     * @throws ClassNotFoundException muestra un error si no se conecta a la base de datos.
     */
    public C_SQL(jFramePrincipal p) throws ClassNotFoundException {
        try {
            this.con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/atletismo", "root", "");
            miPrincipal = p;
        } catch (SQLException ex) {
            Logger.getLogger(C_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método para conectar la ventana de carreras con la base de datos.
     * @param c parámetro de la ventana carreras.
     * @throws ClassNotFoundException muestra un error si no se conecta a la base de datos.
     */
    public C_SQL(jFrameCarreras c) throws ClassNotFoundException {
        try {
            this.con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/atletismo", "root", "");
            ventanaCarreras = c;
        } catch (SQLException ex) {
            Logger.getLogger(C_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método para conectar la ventana MiPerfil con la base de datos.
     * @param mp parámetro de la ventana miPerfil
     * @throws ClassNotFoundException muestra un error si no se conecta con la base de datos.
     */
    public C_SQL(jFrameMiPerfil mp) throws ClassNotFoundException {
        try {
            this.con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/atletismo", "root", "");
            ventanaPerfil = mp;
        } catch (SQLException ex) {
            Logger.getLogger(C_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método para conectar la ventan Corredores con la base de datos.
     * @param co parámetro de la ventana Corredores.
     * @throws ClassNotFoundException muestra un error si no se conecta con la base de datos.
     */
    public C_SQL(jFrameCorredores co) throws ClassNotFoundException {
        try {
            this.con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/atletismo", "root", "");
            ventanaCorredores = co;
        } catch (SQLException ex) {
            Logger.getLogger(C_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Método para conectar la ventana Registrar con la base de datos.
     * @param re parámetro de la ventana Registrar.
     * @throws ClassNotFoundException muestra un error si no se conecta con la base de datos.
     */
    public C_SQL(jFrameRegistrar re) throws ClassNotFoundException {
        try {
            this.con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/atletismo", "root", "");
            ventanaRegistrar = re;
        } catch (SQLException ex) {
            Logger.getLogger(C_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * METODOS DE LA CLASE CONTROLADOR
     */
    /**
     * Método para comprobar si hay un usuario en la base de datos a la hora de hacer login en el programa.
     * @param usuario parámetro usuario donde se guarda el usuario desde la base de datos.
     * @param pwd parámetro contraseña donde se guarda la contraseña desde la base de datos.
     * @return success devuelve si se ha encontrado lo solicitado con la base de datos.
     */
    public boolean comprobarUsuario(String usuario, String pwd) {
        boolean success = false;
        respositorio mirepo = new respositorio();
        String cap = "";
        String sql = "SELECT * FROM persona WHERE nombreusuario='" + usuario + "' && contrasenya='" + pwd + "'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            //Condicion para ver si el usuario que se introduce es administrador o no.
            while (rs.next()) {
                cap = rs.getString("administrador");
            }
            if (cap.equals("1")) {

                miPrincipal.setVisible(false);
                JOptionPane.showMessageDialog(null, "Bienvenido administrador");
                jFrameVentanaAdmin ingreso = new jFrameVentanaAdmin();

                ingreso.setVisible(true);
                ingreso.pack();
                ingreso.getjLabelUsu().setText(usuario);
                miPrincipal.dispose();

            }
            if (cap.equals("0")) {
                miPrincipal.setVisible(false);
                JOptionPane.showMessageDialog(miPrincipal, "Bienvenido");
                jFrameSesion_Iniciada perfil = new jFrameSesion_Iniciada();
                perfil.setVisible(true);
                perfil.pack();
                miPrincipal.dispose();
                perfil.getjLabelUsu().setText(usuario);
            }
            if ((!cap.equals("1")) && (!cap.equals("0"))) {
                JOptionPane.showMessageDialog(miPrincipal, "No existe el nombre de usuario");
            }
        } catch (SQLException ex) {
            Logger.getLogger(C_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return success;
    }

    /**
     *  Método para mostrar las carreras de la base de datos en la tabla.
     * @return success devuelve si se ha encontrado lo solicitado con la base de datos.
     */
    public boolean mostrarCarreras() {
        boolean success = false;
        Connection cn;
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsm;
        DefaultTableModel dtm;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/atletismo", "root", "");
            ps = cn.prepareStatement("select * from carrera");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1);
                }
                data.add(rows);
            }
            dtm = new DefaultTableModel();
            dtm.addColumn("Código");
            dtm.addColumn("Nombre");
            dtm.addColumn("Localidad");
            dtm.addColumn("Provincia");
            dtm.addColumn("Fecha");
            dtm.addColumn("Hora");
            dtm.addColumn("Distancia");
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }
            ventanaCarreras.getjTableInscripcion().setModel(dtm);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(ventanaCarreras, "No existe una tabla");
        }
        return success;
    }

    /**
     * Método para mostrar los corredores de la base de datos en la tabla.
     * @return success devuelve si se ha encontrado lo solicitado con la base de datos.
     */
    public boolean mostrarCorredores() {
        boolean success = false;
        Connection cn;
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsm;
        DefaultTableModel dtm;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/atletismo", "root", "");
            ps = cn.prepareStatement("select nombre, apellidos, nombreusuario from persona");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            ArrayList<Object[]> data = new ArrayList<>();
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1);
                }
                data.add(rows);
            }
            dtm = new DefaultTableModel();
            dtm.addColumn("Nombre");
            dtm.addColumn("Apellidos");
            dtm.addColumn("Nick");
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));

            }
            ventanaCorredores.getjTableCorredores().setModel(dtm);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(ventanaCorredores, "No existen corredores");
        }
        return success;
    }

    /**
     * Método guardar registro donde se guarda en la base de datos los datos a la hora de registrarse en la aplicación.
     */
    public void guardarRegistro() {

        if (!ventanaRegistrar.getjTextFieldNombre().getText().equals("") && !ventanaRegistrar.getjTextFieldApellido().getText().equals("") && !ventanaRegistrar.getjTextFieldNomUser().getText().equals("")
                && !ventanaRegistrar.getjPasswordFieldPass().getText().equals("")) {
            jFramePrincipal obj = new jFramePrincipal();
            obj.setVisible(true);
            ventanaRegistrar.dispose();
            Modelo.respositorio miRepo = new respositorio();
            miRepo.RegistrarCorredor(ventanaRegistrar.getjTextFieldNombre().getText(), ventanaRegistrar.getjTextFieldApellido().getText(), ventanaRegistrar.getjTextFieldNomUser().getText(), ventanaRegistrar.getjPasswordFieldPass().getText(), ventanaRegistrar.getjTextFieldDNI().getText(), ventanaRegistrar.getjTextFieldTlfn().getText(), ventanaRegistrar.getjTextFieldNacimiento().getText(), ventanaRegistrar.getjTextFieldCuenta().getText());
        } else {
            JOptionPane.showMessageDialog(ventanaRegistrar, "Rellena todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     * Método para obtener los datos de la base de datos del usuario conectado.
     * @param dni
     */
    public void obtenerPerfil(String dni) {
        Modelo.respositorio miRepo = new respositorio();
        miRepo.mostrarInfoUsuario(dni);

    }
}
