/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosCrud;

import Conexion.ClsConexion;
import PantallasGraficas.PantallaPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author anner
 */
public class InterfaceUsuariosImplement implements InterfaceUsuarios{

     @Override
     public boolean Verificar(String usuario, String pass) {
          Connection conn = null;
          PreparedStatement stmt= null;
          ResultSet rs = null;
          boolean correcto = false;
          String sql = "select *from tb_usuarios where username = '"+usuario+"'and password = '"+pass+"' ";
          
           try {
               conn = ClsConexion.OpenConection();
               stmt = conn.prepareStatement(sql);
               rs = stmt.executeQuery();
               
               if(rs.next()){
                    correcto = true;
                   if(correcto = true){
                        PantallaPrincipal form = new PantallaPrincipal();
                        form.setVisible(true);
                   }
               }else{
                        JOptionPane.showMessageDialog(null,"Error, el usuario no existe o escribiste mal");
                      
                   }
               
          } catch (SQLException ex) {
               ex.printStackTrace(System.out);
          }finally{
               ClsConexion.CloseConection(stmt);
               ClsConexion.CloseConection(rs);
               ClsConexion.CloseConection(conn);
          }
          return correcto;
          
          
     }
     
}
