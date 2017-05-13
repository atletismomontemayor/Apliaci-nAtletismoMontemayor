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
    private static Principal miPrincipal;
    private Sesion_Iniciada miSesion;
    private Carreras ventanaCarreras;
    private Corredores ventanaCorredores;
    private Registrar ventanaRegistrar;
    private MiPerfil ventanaPerfil;

    /**
     *
     * @param p
     * @throws ClassNotFoundException
     */

    public C_SQL(Principal p) throws ClassNotFoundException {
        try {
            this.con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/atletismo", "root", "");
            miPrincipal = p;
        } catch (SQLException ex) {
            Logger.getLogger(C_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param c
     * @throws ClassNotFoundException
     */
    public C_SQL(Carreras c) throws ClassNotFoundException {
        try {
            this.con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/atletismo", "root", "");
            ventanaCarreras = c;
        } catch (SQLException ex) {
            Logger.getLogger(C_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param mp
     * @throws ClassNotFoundException
     */
    public C_SQL(MiPerfil mp) throws ClassNotFoundException {
        try {
            this.con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/atletismo", "root", "");
            ventanaPerfil = mp;
        } catch (SQLException ex) {
            Logger.getLogger(C_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param co
     * @throws ClassNotFoundException
     */
    public C_SQL(Corredores co) throws ClassNotFoundException {
        try {
            this.con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/atletismo", "root", "");
            ventanaCorredores = co;
        } catch (SQLException ex) {
            Logger.getLogger(C_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param re
     * @throws ClassNotFoundException
     */
    public C_SQL(Registrar re) throws ClassNotFoundException {
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
     *
     * @param usuario
     * @param pwd
     * @return
     */
    public boolean comprobarUsuario(String usuario, String pwd) {
        boolean success = false;
        respositorio mirepo= new respositorio();
        String cap = "";
        String sql = "SELECT * FROM persona WHERE nombreusuario='" + usuario + "' && contrasenya='" + pwd + "'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                cap = rs.getString("administrador");
            }
            if (cap.equals("1")) {

                miPrincipal.setVisible(false);
                JOptionPane.showMessageDialog(null, "Bienvenido administrador");
                 VentanaAdmin ingreso = new VentanaAdmin();
                
                 ingreso.setVisible(true);
                 ingreso.pack();
                ingreso.getjLabelUsu().setText(usuario); 
                miPrincipal.dispose();
                

            }
            if (cap.equals("0")) {
                miPrincipal.setVisible(false);
                JOptionPane.showMessageDialog(miPrincipal, "Bienvenido");
                Sesion_Iniciada perfil = new Sesion_Iniciada();
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
     *
     * @return
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
     *
     * @return
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
     *
     */
    public void guardarRegistro() {

        if (!ventanaRegistrar.getjTextFieldNombre().getText().equals("") && !ventanaRegistrar.getjTextFieldApellido().getText().equals("") && !ventanaRegistrar.getjTextFieldNomUser().getText().equals("")
                && !ventanaRegistrar.getjPasswordFieldPass().getText().equals("")) {
            Principal obj = new Principal();
            obj.setVisible(true);
            ventanaRegistrar.dispose();
            Modelo.respositorio miRepo = new respositorio();
            miRepo.RegistrarCorredor(ventanaRegistrar.getjTextFieldNombre().getText(), ventanaRegistrar.getjTextFieldApellido().getText(), ventanaRegistrar.getjTextFieldNomUser().getText(), ventanaRegistrar.getjPasswordFieldPass().getText(), ventanaRegistrar.getjTextFieldDNI().getText(), ventanaRegistrar.getjTextFieldTlfn().getText(), ventanaRegistrar.getjTextFieldNacimiento().getText(), ventanaRegistrar.getjTextFieldCuenta().getText());
        } else {
            JOptionPane.showMessageDialog(ventanaRegistrar, "Rellena todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     *
     * @param dni
     */
    public void obtenerPerfil(String dni) {
        Modelo.respositorio miRepo = new respositorio();
        miRepo.mostrarInfoUsuario(dni);

    }
}
