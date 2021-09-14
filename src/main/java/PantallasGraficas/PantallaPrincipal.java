/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PantallasGraficas;

import MetodosCrud.InterfacePrincipalImplement;
import Modelos.ModeloPrincipal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anner
 */
public class PantallaPrincipal extends javax.swing.JFrame {

     ModeloPrincipal ag = new ModeloPrincipal();

     /**
      * Creates new form PantallaPrincipal
      */
     public PantallaPrincipal() {
          initComponents();
     }

     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jPanel1 = new javax.swing.JPanel();
          jLabel1 = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          jLabel4 = new javax.swing.JLabel();
          txtEnero = new javax.swing.JTextField();
          txtFebrero = new javax.swing.JTextField();
          txtNombre = new javax.swing.JTextField();
          txtMarzo = new javax.swing.JTextField();
          jScrollPane1 = new javax.swing.JScrollPane();
          contenedor = new javax.swing.JTable();
          btnRegistrar = new javax.swing.JButton();
          btnConsultar = new javax.swing.JButton();
          btnEditar = new javax.swing.JButton();
          btnEliminar = new javax.swing.JButton();
          txtCodigo = new javax.swing.JTextField();
          jLabel5 = new javax.swing.JLabel();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jLabel1.setText("NOMBRE");

          jLabel2.setText("ENERO");

          jLabel3.setText("FEBRERO");

          jLabel4.setText("MARZO");

          contenedor.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {

               },
               new String [] {

               }
          ));
          jScrollPane1.setViewportView(contenedor);

          btnRegistrar.setText("REGISTRAR");
          btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnRegistrarActionPerformed(evt);
               }
          });

          btnConsultar.setText("CONSULTAR");
          btnConsultar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnConsultarActionPerformed(evt);
               }
          });

          btnEditar.setText("EDITAR");
          btnEditar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnEditarActionPerformed(evt);
               }
          });

          btnEliminar.setText("ELIMINAR");
          btnEliminar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnEliminarActionPerformed(evt);
               }
          });

          jLabel5.setText("CODIGO");

          javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
          jPanel1.setLayout(jPanel1Layout);
          jPanel1Layout.setHorizontalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addComponent(jLabel1)
                              .addGap(25, 25, 25)
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                   .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNombre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)
                                        .addGap(28, 28, 28)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                   .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                       .addComponent(jLabel2)
                                                       .addGap(27, 27, 27))
                                                  .addGroup(jPanel1Layout.createSequentialGroup()
                                                       .addComponent(jLabel3)
                                                       .addGap(15, 15, 15)))
                                             .addGroup(jPanel1Layout.createSequentialGroup()
                                                  .addComponent(jLabel4)
                                                  .addGap(25, 25, 25)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addGroup(jPanel1Layout.createSequentialGroup()
                                                  .addComponent(btnConsultar)
                                                  .addGap(40, 40, 40)
                                                  .addComponent(btnEditar))
                                             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                  .addComponent(txtFebrero, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                                  .addComponent(txtEnero)
                                                  .addComponent(txtMarzo, javax.swing.GroupLayout.Alignment.LEADING))))))
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addComponent(btnRegistrar)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(btnEliminar))
                         .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(87, Short.MAX_VALUE))
          );
          jPanel1Layout.setVerticalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel1)
                         .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel5))
                    .addGap(25, 25, 25)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel2)
                         .addComponent(txtEnero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel3)
                         .addComponent(txtFebrero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel4)
                         .addComponent(txtMarzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(41, 41, 41)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(btnRegistrar)
                         .addComponent(btnConsultar)
                         .addComponent(btnEditar)
                         .addComponent(btnEliminar))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50))
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

     private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
          InterfacePrincipalImplement metodos = new InterfacePrincipalImplement();
          ModeloPrincipal modelo = new ModeloPrincipal();

          modelo.setNombre(txtNombre.getText());
          modelo.setEnero(txtEnero.getText());
          modelo.setFebrero(txtFebrero.getText());
          modelo.setMarzo(txtMarzo.getText());

          if (metodos.registrar(modelo) == true) {

               JOptionPane.showMessageDialog(null, "Registro Agregado Exitosamente");
          }

          BorrarCampos();
     }//GEN-LAST:event_btnRegistrarActionPerformed

     private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
          InterfacePrincipalImplement metodos = new InterfacePrincipalImplement();
          ModeloPrincipal modelo = new ModeloPrincipal();

          modelo.setCodigo(Integer.valueOf(txtCodigo.getText()));

          if (metodos.eliminar(modelo) == true) {
               JOptionPane.showMessageDialog(null, "El registro con el codigo " + txtCodigo.getText() + " Se elimino correctamente");
          }

          BorrarCampos();
     }//GEN-LAST:event_btnEliminarActionPerformed

     private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
          InterfacePrincipalImplement metodos = new InterfacePrincipalImplement();
          ModeloPrincipal modelo = new ModeloPrincipal();

          modelo.setNombre(txtNombre.getText());
          modelo.setEnero(txtEnero.getText());
          modelo.setFebrero(txtFebrero.getText());
          modelo.setMarzo(txtMarzo.getText());
          modelo.setCodigo(Integer.valueOf(txtCodigo.getText()));

          if (metodos.actualizar(modelo) == true) {
               JOptionPane.showMessageDialog(null, "El registro fue modificadado exitosamente");
          }
          BorrarCampos();

     }//GEN-LAST:event_btnEditarActionPerformed

     private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
          InterfacePrincipalImplement metodos = new InterfacePrincipalImplement();

          metodos.obtener(contenedor);

     }//GEN-LAST:event_btnConsultarActionPerformed

     public void BorrarCampos() {
          txtNombre.setText(null);
          txtEnero.setText(null);
          txtFebrero.setText(null);
          txtMarzo.setText(null);
          txtCodigo.setText(null);
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
               java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
               java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
               java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
               java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
          //</editor-fold>

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
               public void run() {
                    new PantallaPrincipal().setVisible(true);
               }
          });
     }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton btnConsultar;
     private javax.swing.JButton btnEditar;
     private javax.swing.JButton btnEliminar;
     private javax.swing.JButton btnRegistrar;
     private javax.swing.JTable contenedor;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JTextField txtCodigo;
     private javax.swing.JTextField txtEnero;
     private javax.swing.JTextField txtFebrero;
     private javax.swing.JTextField txtMarzo;
     private javax.swing.JTextField txtNombre;
     // End of variables declaration//GEN-END:variables
}
