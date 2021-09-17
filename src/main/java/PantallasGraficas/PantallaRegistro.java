/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PantallasGraficas;

import MetodosCrud.InterfaceRegistrarseImplement;
import Modelos.ModeloUsuarios;
import javax.swing.JOptionPane;

/**
 *
 * @author anner
 */
public class PantallaRegistro extends javax.swing.JFrame {

     public PantallaRegistro() {
          initComponents();
     }

     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jPanel1 = new javax.swing.JPanel();
          jLabel1 = new javax.swing.JLabel();
          txtNombres = new javax.swing.JTextField();
          txtCorreo = new javax.swing.JTextField();
          txtApellidos = new javax.swing.JTextField();
          txtUsuario = new javax.swing.JTextField();
          txtTelefono = new javax.swing.JTextField();
          LabelRegistrarse = new javax.swing.JLabel();
          LabelRegistrarse1 = new javax.swing.JLabel();
          LabelRegistrarse2 = new javax.swing.JLabel();
          LabelRegistrarse3 = new javax.swing.JLabel();
          LabelRegistrarse4 = new javax.swing.JLabel();
          LabelRegistrarse5 = new javax.swing.JLabel();
          LabelRegistrarse6 = new javax.swing.JLabel();
          btnEnviarDatos = new javax.swing.JButton();
          LabelRegistrarse7 = new javax.swing.JLabel();
          jCheckBox2 = new javax.swing.JCheckBox();
          txtPass = new javax.swing.JPasswordField();
          txtRePass = new javax.swing.JPasswordField();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jPanel1.setBackground(new java.awt.Color(102, 204, 255));

          jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
          jLabel1.setForeground(new java.awt.Color(255, 255, 255));
          jLabel1.setText("Registro");

          txtNombres.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtNombresActionPerformed(evt);
               }
          });

          txtCorreo.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtCorreoActionPerformed(evt);
               }
          });

          LabelRegistrarse.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
          LabelRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
          LabelRegistrarse.setText("Apellidos");

          LabelRegistrarse1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
          LabelRegistrarse1.setForeground(new java.awt.Color(255, 255, 255));
          LabelRegistrarse1.setText("Nombres");

          LabelRegistrarse2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
          LabelRegistrarse2.setForeground(new java.awt.Color(255, 255, 255));
          LabelRegistrarse2.setText("Correo");

          LabelRegistrarse3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
          LabelRegistrarse3.setForeground(new java.awt.Color(255, 255, 255));
          LabelRegistrarse3.setText("Usuario");

          LabelRegistrarse4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
          LabelRegistrarse4.setForeground(new java.awt.Color(255, 255, 255));
          LabelRegistrarse4.setText("Contraseña");

          LabelRegistrarse5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
          LabelRegistrarse5.setForeground(new java.awt.Color(255, 255, 255));
          LabelRegistrarse5.setText("Confirmar Contraseña");

          LabelRegistrarse6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
          LabelRegistrarse6.setForeground(new java.awt.Color(255, 255, 255));
          LabelRegistrarse6.setText("Telefono");

          btnEnviarDatos.setBackground(new java.awt.Color(0, 0, 0));
          btnEnviarDatos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
          btnEnviarDatos.setForeground(new java.awt.Color(255, 255, 255));
          btnEnviarDatos.setText("Enviar");
          btnEnviarDatos.setBorderPainted(false);
          btnEnviarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
          btnEnviarDatos.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnEnviarDatosActionPerformed(evt);
               }
          });

          LabelRegistrarse7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
          LabelRegistrarse7.setForeground(new java.awt.Color(255, 255, 255));
          LabelRegistrarse7.setText("Regresar a Inico de Sesion");
          LabelRegistrarse7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
          LabelRegistrarse7.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    LabelRegistrarse7MouseClicked(evt);
               }
          });

          jCheckBox2.setBackground(new java.awt.Color(102, 204, 255));
          jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
          jCheckBox2.setText("Mostrar Conrtraseñas");
          jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBox2ActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
          jPanel1.setLayout(jPanel1Layout);
          jPanel1Layout.setHorizontalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel1)
                         .addComponent(LabelRegistrarse3)
                         .addComponent(LabelRegistrarse2)
                         .addComponent(LabelRegistrarse1)
                         .addComponent(LabelRegistrarse))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                         .addComponent(LabelRegistrarse5)
                         .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                         .addComponent(btnEnviarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addComponent(LabelRegistrarse6)
                         .addComponent(jCheckBox2)
                         .addComponent(LabelRegistrarse4)
                         .addComponent(txtPass)
                         .addComponent(txtRePass))
                    .addContainerGap(94, Short.MAX_VALUE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(229, 229, 229)
                    .addComponent(LabelRegistrarse7)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );
          jPanel1Layout.setVerticalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel1)
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(LabelRegistrarse1)
                         .addComponent(LabelRegistrarse4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(22, 22, 22)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(LabelRegistrarse)
                         .addComponent(LabelRegistrarse5))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(txtRePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jCheckBox2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(LabelRegistrarse6)
                         .addComponent(LabelRegistrarse2))
                    .addGap(6, 6, 6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(22, 22, 22)
                    .addComponent(LabelRegistrarse3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(btnEnviarDatos))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                    .addComponent(LabelRegistrarse7)
                    .addGap(35, 35, 35))
          );

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
          // TODO add your handling code here:
     }//GEN-LAST:event_txtNombresActionPerformed

     private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
          // TODO add your handling code here:
     }//GEN-LAST:event_txtCorreoActionPerformed

     
     
     private void LabelRegistrarse7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelRegistrarse7MouseClicked
          // TODO add your handling code here:
          PantallaLogin form = new PantallaLogin();
          form.setVisible(true);

     }//GEN-LAST:event_LabelRegistrarse7MouseClicked

     private void btnEnviarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarDatosActionPerformed
          InterfaceRegistrarseImplement metodos = new InterfaceRegistrarseImplement();
          ModeloUsuarios modelo = new ModeloUsuarios();

          modelo.setNombres(txtNombres.getText().toUpperCase());
          modelo.setApellidos(txtApellidos.getText());
          if (metodos.ValidarCorreo(txtCorreo.getText())) {
               modelo.setCorreo(txtCorreo.getText());
          }
          if (metodos.existe(txtUsuario.getText()) == false) {
               modelo.setUsername(txtUsuario.getText());
          } else {
               JOptionPane.showMessageDialog(null, "El usuario Ya existe");
          }
          if (metodos.CompararPass(txtPass.getText(), txtRePass.getText())) {
               modelo.setPassword(metodos.Encriptador(txtPass.getText(), 5));
               modelo.setConfirmpass(metodos.Encriptador(txtRePass.getText(), 5));
          }
          modelo.setTelefono(txtTelefono.getText());

          if (metodos.registrar(modelo)) {
               JOptionPane.showMessageDialog(null, "Registro Exitosos");
          } else {
               JOptionPane.showMessageDialog(null, "Algo salio mal con el registro");
          }
          
          BorrarCampos();

     }//GEN-LAST:event_btnEnviarDatosActionPerformed

     private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
          // TODO add your handling code here:
          if (jCheckBox2.isSelected()) {
               txtPass.setEchoChar((char) 0);
               txtRePass.setEchoChar((char) 0);
          } else {
               txtPass.setEchoChar('*');
               txtRePass.setEchoChar('*');
          }
     }//GEN-LAST:event_jCheckBox2ActionPerformed
     
     
     public void BorrarCampos() {
          txtNombres.setText(null);
          txtApellidos.setText(null);
          txtCorreo.setText(null);
          txtUsuario.setText(null);
          txtPass.setText(null);
          txtRePass.setText(null);
          txtTelefono.setText(null);
     }

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
               java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new PantallaRegistro().setVisible(true);
               }
          });
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JLabel LabelRegistrarse;
     private javax.swing.JLabel LabelRegistrarse1;
     private javax.swing.JLabel LabelRegistrarse2;
     private javax.swing.JLabel LabelRegistrarse3;
     private javax.swing.JLabel LabelRegistrarse4;
     private javax.swing.JLabel LabelRegistrarse5;
     private javax.swing.JLabel LabelRegistrarse6;
     private javax.swing.JLabel LabelRegistrarse7;
     private javax.swing.JButton btnEnviarDatos;
     private javax.swing.JCheckBox jCheckBox2;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JTextField txtApellidos;
     private javax.swing.JTextField txtCorreo;
     private javax.swing.JTextField txtNombres;
     private javax.swing.JPasswordField txtPass;
     private javax.swing.JPasswordField txtRePass;
     private javax.swing.JTextField txtTelefono;
     private javax.swing.JTextField txtUsuario;
     // End of variables declaration//GEN-END:variables
}
