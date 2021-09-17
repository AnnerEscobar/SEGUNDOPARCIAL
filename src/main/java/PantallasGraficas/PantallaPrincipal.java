/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PantallasGraficas;

import MetodosCrud.InterfacePrincipalImplement;
import Modelos.ModeloPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author anner
 */
public class PantallaPrincipal extends javax.swing.JFrame {

     ModeloPrincipal ag = new ModeloPrincipal();

     public PantallaPrincipal() {
          initComponents();

     }

     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jLabel7 = new javax.swing.JLabel();
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
          jLabel6 = new javax.swing.JLabel();
          jLabel8 = new javax.swing.JLabel();

          jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
          jLabel7.setForeground(new java.awt.Color(255, 255, 255));
          jLabel7.setText("NOMBRE");

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
          setSize(new java.awt.Dimension(0, 0));

          jPanel1.setBackground(new java.awt.Color(51, 204, 255));

          jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
          jLabel1.setForeground(new java.awt.Color(255, 255, 255));
          jLabel1.setText("NOMBRE");

          jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
          jLabel2.setForeground(new java.awt.Color(255, 255, 255));
          jLabel2.setText("ENERO");

          jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
          jLabel3.setForeground(new java.awt.Color(255, 255, 255));
          jLabel3.setText("FEBRERO");

          jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
          jLabel4.setForeground(new java.awt.Color(255, 255, 255));
          jLabel4.setText("MARZO");

          contenedor.setBackground(new java.awt.Color(0, 153, 153));
          contenedor.setBorder(new javax.swing.border.MatteBorder(null));
          contenedor.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {

               },
               new String [] {
                    "Codigo", "Nombre", "Enero", "Febrero", "Marzo", "Total", "Promedio"
               }
          ) {
               Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
               };
               boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false
               };

               public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
               }

               public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
               }
          });
          contenedor.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
          contenedor.setColumnSelectionAllowed(true);
          contenedor.setGridColor(new java.awt.Color(255, 255, 255));
          contenedor.setShowGrid(false);
          contenedor.setShowHorizontalLines(true);
          contenedor.setShowVerticalLines(true);
          jScrollPane1.setViewportView(contenedor);
          if (contenedor.getColumnModel().getColumnCount() > 0) {
               contenedor.getColumnModel().getColumn(0).setResizable(false);
               contenedor.getColumnModel().getColumn(1).setResizable(false);
               contenedor.getColumnModel().getColumn(2).setResizable(false);
               contenedor.getColumnModel().getColumn(3).setResizable(false);
               contenedor.getColumnModel().getColumn(4).setResizable(false);
               contenedor.getColumnModel().getColumn(5).setResizable(false);
               contenedor.getColumnModel().getColumn(6).setResizable(false);
          }

          btnRegistrar.setBackground(new java.awt.Color(0, 0, 0));
          btnRegistrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
          btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
          btnRegistrar.setText("REGISTRAR");
          btnRegistrar.setBorderPainted(false);
          btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
          btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnRegistrarActionPerformed(evt);
               }
          });

          btnConsultar.setBackground(new java.awt.Color(0, 0, 0));
          btnConsultar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
          btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
          btnConsultar.setText("CONSULTAR");
          btnConsultar.setBorderPainted(false);
          btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
          btnConsultar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnConsultarActionPerformed(evt);
               }
          });

          btnEditar.setBackground(new java.awt.Color(0, 0, 0));
          btnEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
          btnEditar.setForeground(new java.awt.Color(255, 255, 255));
          btnEditar.setText("EDITAR");
          btnEditar.setBorderPainted(false);
          btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
          btnEditar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnEditarActionPerformed(evt);
               }
          });

          btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
          btnEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
          btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
          btnEliminar.setText("ELIMINAR");
          btnEliminar.setBorderPainted(false);
          btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
          btnEliminar.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnEliminarActionPerformed(evt);
               }
          });

          jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
          jLabel5.setForeground(new java.awt.Color(255, 255, 255));
          jLabel5.setText("CODIGO");

          jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
          jLabel6.setForeground(new java.awt.Color(255, 255, 255));
          jLabel6.setText("Ingrese el Codigo a Eliminar/Modificar");

          jLabel8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
          jLabel8.setForeground(new java.awt.Color(255, 255, 255));
          jLabel8.setText("Registro de Empleados y Ventas");

          javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
          jPanel1.setLayout(jPanel1Layout);
          jPanel1Layout.setHorizontalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addGap(35, 35, 35)
                              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addGroup(jPanel1Layout.createSequentialGroup()
                              .addGap(91, 91, 91)
                              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addComponent(jLabel3)
                                                  .addComponent(jLabel4)
                                                  .addComponent(jLabel2))
                                             .addGap(15, 15, 15)
                                             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addGroup(jPanel1Layout.createSequentialGroup()
                                                       .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(txtFebrero, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtEnero, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtMarzo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                       .addGap(57, 57, 57)
                                                       .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel6)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                 .addComponent(btnEditar)
                                                                 .addGroup(jPanel1Layout.createSequentialGroup()
                                                                      .addComponent(jLabel5)
                                                                      .addGap(18, 18, 18)
                                                                      .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                             .addGap(18, 18, 18)
                                             .addComponent(btnRegistrar)
                                             .addGap(31, 31, 31)
                                             .addComponent(btnConsultar)
                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                             .addComponent(btnEliminar)))
                                   .addComponent(jLabel8))))
                    .addContainerGap(48, Short.MAX_VALUE))
          );
          jPanel1Layout.setVerticalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel1)
                         .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel2)
                         .addComponent(txtEnero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel6))
                    .addGap(23, 23, 23)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel3)
                         .addComponent(txtFebrero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jLabel5)
                         .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel4)
                         .addComponent(txtMarzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(39, 39, 39)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(btnRegistrar)
                         .addComponent(btnConsultar)
                         .addComponent(btnEditar)
                         .addComponent(btnEliminar))
                    .addGap(44, 44, 44)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(130, 130, 130))
          );

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     
     ///Codigo creado por mi
     
     private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
          InterfacePrincipalImplement metodos = new InterfacePrincipalImplement();
          ModeloPrincipal modelo = new ModeloPrincipal();

          modelo.setNombre(txtNombre.getText());
          modelo.setNombre(txtNombre.getText());
          modelo.setEnero(Integer.valueOf(txtEnero.getText()));
          modelo.setFebrero(Integer.valueOf(txtFebrero.getText()));
          modelo.setMarzo(Integer.valueOf(txtMarzo.getText()));

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
          modelo.setEnero(Integer.valueOf(txtEnero.getText()));
          modelo.setFebrero(Integer.valueOf(txtFebrero.getText()));
          modelo.setMarzo(Integer.valueOf(txtMarzo.getText()));
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

     //final codigo creado por mi
     
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
     private javax.swing.JLabel jLabel6;
     private javax.swing.JLabel jLabel7;
     private javax.swing.JLabel jLabel8;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JTextField txtCodigo;
     private javax.swing.JTextField txtEnero;
     private javax.swing.JTextField txtFebrero;
     private javax.swing.JTextField txtMarzo;
     private javax.swing.JTextField txtNombre;
     // End of variables declaration//GEN-END:variables
}
