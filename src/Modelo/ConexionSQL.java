/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jesús
 */
public class ConexionSQL {

    private Connection conexion = null;

    public ConexionSQL() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mariadb://localhost/atletismo", "root", "");

        } catch (ClassNotFoundException | SQLException e) {
        }
    }

    public Connection devolverConexion() {
        return conexion;
    }

    public Connection conectar() {
        return conexion;
    }

    public void desconectar() throws SQLException {
        conexion.close();
        conexion = null;
    }
}
