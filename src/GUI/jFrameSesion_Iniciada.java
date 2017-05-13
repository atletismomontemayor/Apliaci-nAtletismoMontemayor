/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JLabel;

/**
 *
 * @author Jesús
 */
public class jFrameSesion_Iniciada extends javax.swing.JFrame {

    /**
     * Creates new form Sesion_Iniciada
     */
    public jFrameSesion_Iniciada() {
        initComponents();
        /**
         * Configurar tamaño de la ventana.
         */
        this.setSize(402, 298);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUsu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonMiPerfil = new javax.swing.JButton();
        jButtonMCarreras = new javax.swing.JButton();
        jButtonCarreras = new javax.swing.JButton();
        jButtonCorredores = new javax.swing.JButton();
        jButtonCerrarSesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sesion Iniciada");
        setMaximumSize(new java.awt.Dimension(402, 298));
        setMinimumSize(new java.awt.Dimension(402, 298));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUsu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelUsu.setForeground(new java.awt.Color(102, 204, 0));
        jLabelUsu.setText("Usuario:");
        getContentPane().add(jLabelUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel1.setText("Usuario conectado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jButtonMiPerfil.setText("Mi perfil");
        jButtonMiPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMiPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMiPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 120, -1));

        jButtonMCarreras.setText("Mis carreras");
        jButtonMCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMCarrerasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMCarreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 120, -1));

        jButtonCarreras.setText("Carreras");
        jButtonCarreras.setMaximumSize(new java.awt.Dimension(91, 23));
        jButtonCarreras.setMinimumSize(new java.awt.Dimension(91, 23));
        jButtonCarreras.setPreferredSize(new java.awt.Dimension(91, 23));
        jButtonCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarrerasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCarreras, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 120, -1));

        jButtonCorredores.setText("Corredores");
        jButtonCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCorredoresActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCorredores, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 120, -1));

        jButtonCerrarSesion.setText("Cerrar sesión");
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 120, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo-atletismo3.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarrerasActionPerformed
        jFrameCarreras obj = new jFrameCarreras();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCarrerasActionPerformed

    private void jButtonMCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMCarrerasActionPerformed
        jFrameMisCarreras obj = new jFrameMisCarreras();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonMCarrerasActionPerformed

    private void jButtonMiPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMiPerfilActionPerformed
        jFrameMiPerfil obj = new jFrameMiPerfil();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonMiPerfilActionPerformed

    private void jButtonCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCorredoresActionPerformed
        jFrameCorredores obj = new jFrameCorredores();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCorredoresActionPerformed

    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        jFramePrincipal obj = new jFramePrincipal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jFrameSesion_Iniciada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrameSesion_Iniciada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrameSesion_Iniciada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrameSesion_Iniciada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrameSesion_Iniciada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCarreras;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonCorredores;
    private javax.swing.JButton jButtonMCarreras;
    private javax.swing.JButton jButtonMiPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelUsu;
    // End of variables declaration//GEN-END:variables
       /**
     * Getter del label Usuario
     * @return jLabelUsu devuelve el usuario conectado.
     */
    public JLabel getjLabelUsu() {
        return jLabelUsu;
    }

}
