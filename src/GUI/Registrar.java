/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Modelo.ConexionSQL;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Jesús
 */
public class Registrar extends javax.swing.JFrame {
    //private C_Registrar miRegistro;
    Modelo.ConexionSQL con = new ConexionSQL();
    Connection cn = con.conectar();
    private C_SQL controladorSQL;
    /**
     * Creates new form Registrar
     */
    public Registrar() {
        initComponents();
        buttonGroupSexo.add(jRadioButtonH);
        buttonGroupSexo.add(jRadioButtonM);
        jTextFieldCuenta.setEnabled(false);
        try {
            controladorSQL = new C_SQL(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSexo = new javax.swing.ButtonGroup();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellidos = new javax.swing.JLabel();
        jLabelNomUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldNomUser = new javax.swing.JTextField();
        jButtonAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTlfn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jRadioButtonH = new javax.swing.JRadioButton();
        jRadioButtonM = new javax.swing.JRadioButton();
        jButtonBorrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNacimiento = new javax.swing.JTextField();
        jTextFieldCuenta = new javax.swing.JTextField();
        jRadioButtonCuenta = new javax.swing.JRadioButton();
        jPasswordFieldPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar");

        jLabelNombre.setText("Nombre");

        jLabelApellidos.setText("Apellidos");

        jLabelNomUsuario.setText("Nombre Usuario");

        jLabelContraseña.setText("Contraseña");

        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyTyped(evt);
            }
        });

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jLabel1.setText("DNI");

        jTextFieldDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDNIKeyTyped(evt);
            }
        });

        jLabel2.setText("Telefono");

        jTextFieldTlfn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTlfnKeyTyped(evt);
            }
        });

        jLabel3.setText("Sexo");

        jRadioButtonH.setText("Hombre");
        jRadioButtonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHActionPerformed(evt);
            }
        });

        jRadioButtonM.setText("Mujer");

        jButtonBorrar.setText("Borrar todo");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jLabel5.setText("Año de nacimiento");

        jTextFieldNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNacimientoKeyTyped(evt);
            }
        });

        jTextFieldCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCuentaActionPerformed(evt);
            }
        });
        jTextFieldCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCuentaKeyTyped(evt);
            }
        });

        jRadioButtonCuenta.setText("Numero de cuenta");
        jRadioButtonCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCuentaActionPerformed(evt);
            }
        });

        jPasswordFieldPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(jLabelNombre))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelNomUsuario)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jRadioButtonCuenta)
                                .addGap(7, 7, 7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldDNI, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldNomUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(jTextFieldNacimiento, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabelApellidos)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                            .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelContraseña)
                                                .addComponent(jLabel2))
                                            .addGap(30, 30, 30)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextFieldTlfn, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                                .addComponent(jPasswordFieldPass))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(41, 41, 41)
                                        .addComponent(jRadioButtonH, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButtonM))))
                            .addComponent(jTextFieldCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jButtonAceptar)
                        .addGap(100, 100, 100)
                        .addComponent(jButtonBorrar)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombre)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNomUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNomUsuario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jRadioButtonH)
                                        .addComponent(jRadioButtonM)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)))
                                .addGap(6, 6, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButtonCuenta))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonAceptar)
                                    .addComponent(jButtonBorrar))
                                .addGap(64, 64, 64))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelApellidos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelContraseña)
                            .addComponent(jPasswordFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldTlfn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        controladorSQL.guardarRegistro();
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jRadioButtonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonHActionPerformed

    private void jTextFieldCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCuentaActionPerformed

    private void jRadioButtonCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCuentaActionPerformed
        if (jRadioButtonCuenta.isSelected()) {
            jTextFieldCuenta.setEnabled(true);
        } else {
            jTextFieldCuenta.setText("");
            jTextFieldCuenta.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioButtonCuentaActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
       jTextFieldApellido.setText(null);
       jTextFieldCuenta.setText(null);
       jTextFieldDNI.setText(null);
       jTextFieldNacimiento.setText(null);
       jTextFieldNombre.setText(null);
       jTextFieldNomUser.setText(null);
       jTextFieldTlfn.setText(null);
       jPasswordFieldPass.setText(null);
       buttonGroupSexo.clearSelection();
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldApellidoKeyTyped

    private void jTextFieldTlfnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTlfnKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldTlfnKeyTyped

    private void jTextFieldNacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNacimientoKeyTyped
        int caractermax = 4;
        if (jTextFieldNacimiento.getText().length() >= caractermax) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo 4 digitos");

        }
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }

    }//GEN-LAST:event_jTextFieldNacimientoKeyTyped

    private void jTextFieldDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDNIKeyTyped
           int caractermax = 9;
        if (jTextFieldNacimiento.getText().length() >= caractermax) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo 9 digitos");

        }
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }

    }//GEN-LAST:event_jTextFieldDNIKeyTyped

    private void jTextFieldCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCuentaKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldCuentaKeyTyped

    private void jPasswordFieldPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPassActionPerformed
        jButtonAceptarActionPerformed(null);
    }//GEN-LAST:event_jPasswordFieldPassActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelNomUsuario;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JRadioButton jRadioButtonCuenta;
    private javax.swing.JRadioButton jRadioButtonH;
    private javax.swing.JRadioButton jRadioButtonM;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldCuenta;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldNacimiento;
    private javax.swing.JTextField jTextFieldNomUser;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTlfn;
    // End of variables declaration//GEN-END:variables

    /**
     * 
     * @return 
     */
    public JPasswordField getjPasswordFieldPass() {
        return jPasswordFieldPass;
    }
/**
 * 
 * @return 
 */
    public JTextField getjTextFieldApellido() {
        return jTextFieldApellido;
    }
/**
 * 
 * @return 
 */
    public JTextField getjTextFieldCuenta() {
        return jTextFieldCuenta;
    }
/**
 * 
 * @return 
 */
    public JTextField getjTextFieldDNI() {
        return jTextFieldDNI;
    }
/**
 * 
 * @return 
 */
    public JTextField getjTextFieldNacimiento() {
        return jTextFieldNacimiento;
    }
/**
 * 
 * @return 
 */
    public JTextField getjTextFieldNomUser() {
        return jTextFieldNomUser;
    }
/**
 * 
 * @return 
 */
    public JTextField getjTextFieldNombre() {
        return jTextFieldNombre;
    }
/**
 * 
 * @return 
 */
    public JTextField getjTextFieldTlfn() {
        return jTextFieldTlfn;
    }
/**
 * 
 * @return 
 */
    public ButtonGroup getButtonGroupSexo() {
        return buttonGroupSexo;
    }


}