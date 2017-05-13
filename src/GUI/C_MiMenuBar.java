/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 *
 * @author Jesús
 */
public class C_MiMenuBar extends JMenuBar {

    //Componentes
    private JFrame ventanaPadre;
    private JMenu JMenuPerfil;
    private JMenu JMenuCarrera;
    private JMenu JMenuMCarrera;
    private JMenu JMenuCorredores;
    private JMenu JMenuCerrarSesion;

    //Constructor
    
    /**
     * 
     * @param ventana 
     */
    public C_MiMenuBar(JFrame ventana) {
        this.ventanaPadre = ventana;
        inicializar();
    }
/**
 * 
 */
    private void inicializar() {

        JMenuPerfil = new JMenu("Mi Perfil");
        JMenuPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuPerfilMouseClicked(evt);
            }
        });
        JMenuMCarrera = new JMenu("Mis Carreras");
        JMenuMCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuMCarreraMouseClicked(evt);
            }
        });
        JMenuCorredores = new JMenu("Corredores");
        JMenuCorredores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCorredoresMouseClicked(evt);
            }
        });
        JMenuCarrera = new JMenu("Carreras");
        JMenuCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCarrerasMouseClicked(evt);
            }
        });
        JMenuCerrarSesion = new JMenu("Cerrar sesión");
        JMenuCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCerrarSesionMouseClicked(evt);
            }
        });
        this.add(JMenuPerfil);
        this.add(JMenuMCarrera);
        this.add(JMenuCarrera);
        this.add(JMenuCorredores);
        this.add(JMenuCerrarSesion);

    }
/**
 * 
 * @return 
 */
    public JMenuBar getBarraMenu() {
        return this;
    }

    //METODOS PARA LOS EVENTOS DE JMENU
    /**
     * 
     * @param evt 
     */
    private void jMenuPerfilMouseClicked(java.awt.event.MouseEvent evt) {
        jFrameMiPerfil obj = new jFrameMiPerfil();
        //ventanaPadre.setVisible(false);
        obj.setVisible(true);
        ventanaPadre.dispose();

    }
/**
 * 
 * @param evt 
 */
    private void jMenuMCarreraMouseClicked(java.awt.event.MouseEvent evt) {
        jFrameMisCarreras obj = new jFrameMisCarreras();
        //ventanaPadre.setVisible(false);
        obj.setVisible(true);
        ventanaPadre.dispose();
    }
/**
 * 
 * @param evt 
 */
    private void jMenuCarrerasMouseClicked(java.awt.event.MouseEvent evt) {
        jFrameCarreras obj = new jFrameCarreras();
        //ventanaPadre.setVisible(false);
        obj.setVisible(true);
        ventanaPadre.dispose();
    }
/**
 * 
 * @param evt 
 */
    private void jMenuCorredoresMouseClicked(java.awt.event.MouseEvent evt) {
        jFrameCorredores obj = new jFrameCorredores();
        //ventanaPadre.setVisible(false);
        obj.setVisible(true);
        ventanaPadre.dispose();
    }
/**
 * 
 * @param evt 
 */
    private void jMenuCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {
        jFramePrincipal obj = new jFramePrincipal();
        obj.setVisible(true);
        ventanaPadre.dispose();
    }

}
