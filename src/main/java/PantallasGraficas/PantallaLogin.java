/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PantallasGraficas;

import MetodosCrud.InterfaceUsuariosImplement;
import Modelos.ModeloUsuarios;

/**
 *
 * @author anner
 */
public class PantallaLogin extends javax.swing.JFrame {

     public PantallaLogin() {
          initComponents();
     }

     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jPanel1 = new javax.swing.JPanel();
          jPanel2 = new javax.swing.JPanel();
          jLabel1 = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();
          txtUsuario = new javax.swing.JTextField();
          txtPass = new javax.swing.JPasswordField();
          btnIngresar = new javax.swing.JButton();
          jLabel3 = new javax.swing.JLabel();
          LabelRegistrarse = new javax.swing.JLabel();
          jLabel4 = new javax.swing.JLabel();
          jCheckBox1 = new javax.swing.JCheckBox();

          javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
          jPanel1.setLayout(jPanel1Layout);
          jPanel1Layout.setHorizontalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGap(0, 100, Short.MAX_VALUE)
          );
          jPanel1Layout.setVerticalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGap(0, 100, Short.MAX_VALUE)
          );

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          setTitle("PAGINA DE LOGGIN");
          setBackground(new java.awt.Color(51, 51, 255));
          setForeground(new java.awt.Color(51, 51, 255));
          setLocation(new java.awt.Point(0, 0));

          jPanel2.setBackground(new java.awt.Color(102, 204, 255));

          jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
          jLabel1.setForeground(new java.awt.Color(255, 255, 255));
          jLabel1.setText("USUARIO");

          jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
          jLabel2.setForeground(new java.awt.Color(255, 255, 255));
          jLabel2.setText("CONTRASEÑA");

          btnIngresar.setBackground(new java.awt.Color(0, 0, 0));
          btnIngresar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
          btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
          btnIngresar.setText("Entrar");
          btnIngresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));
          btnIngresar.setBorderPainted(false);
          btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
          btnIngresar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnIngresarActionPerformed(evt);
               }
          });
          btnIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
               public void keyPressed(java.awt.event.KeyEvent evt) {
                    btnIngresarKeyPressed(evt);
               }
          });

          LabelRegistrarse.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
          LabelRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
          LabelRegistrarse.setText("Registrarse");
          LabelRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
          LabelRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                    LabelRegistrarseMouseClicked(evt);
               }
          });

          jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
          jLabel4.setForeground(new java.awt.Color(255, 255, 255));
          jLabel4.setText("Login");

          jCheckBox1.setBackground(new java.awt.Color(102, 204, 255));
          jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
          jCheckBox1.setText("Mostrar Contraseña");
          jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBox1ActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
          jPanel2.setLayout(jPanel2Layout);
          jPanel2Layout.setHorizontalGroup(
               jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addComponent(jLabel4)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap(81, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addComponent(jCheckBox1)
                         .addGroup(jPanel2Layout.createSequentialGroup()
                              .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(LabelRegistrarse)
                                   .addComponent(jLabel1)
                                   .addComponent(jLabel2)
                                   .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnIngresar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtUsuario)
                                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(jLabel3)))
                    .addContainerGap(55, Short.MAX_VALUE))
          );
          jPanel2Layout.setVerticalGroup(
               jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(183, 183, 183))
               .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jLabel4)
                    .addGap(19, 19, 19)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(4, 4, 4)
                    .addComponent(jCheckBox1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(LabelRegistrarse)
                    .addContainerGap(47, Short.MAX_VALUE))
          );

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(1, 1, 1))
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     //Funciones creadas por mi
     
     private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
          InterfaceUsuariosImplement metodos = new InterfaceUsuariosImplement();
          ModeloUsuarios usuario = new ModeloUsuarios();
          
          usuario.setUsername(txtUsuario.getText());
          usuario.setPassword(metodos.Encriptador(txtPass.getText(),5));
          metodos.Verificar(usuario.getUsername(), usuario.getPassword());
          
     }//GEN-LAST:event_btnIngresarActionPerformed

     private void btnIngresarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresarKeyPressed
          // TODO add your handling code her
     }//GEN-LAST:event_btnIngresarKeyPressed

     private void LabelRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelRegistrarseMouseClicked

          PantallaRegistro form = new PantallaRegistro();
          form.setVisible(true);
                  
     }//GEN-LAST:event_LabelRegistrarseMouseClicked

     private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
          
          if(jCheckBox1.isSelected()){
               txtPass.setEchoChar((char)0);
          }else{
               txtPass.setEchoChar('*');
          }
     }//GEN-LAST:event_jCheckBox1ActionPerformed

     ///Final de metodos creados por mi
     
     
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
               java.util.logging.Logger.getLogger(PantallaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(PantallaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(PantallaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(PantallaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new PantallaLogin().setVisible(true);
               }
          });
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JLabel LabelRegistrarse;
     private javax.swing.JButton btnIngresar;
     private javax.swing.JCheckBox jCheckBox1;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JPanel jPanel2;
     private javax.swing.JPasswordField txtPass;
     private javax.swing.JTextField txtUsuario;
     // End of variables declaration//GEN-END:variables
}
