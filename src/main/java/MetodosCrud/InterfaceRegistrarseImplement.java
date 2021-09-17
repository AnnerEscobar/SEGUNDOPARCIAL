/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosCrud;

import Conexion.ClsConexion;
import Modelos.ModeloUsuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author anner
 */
public class InterfaceRegistrarseImplement implements InterfaceRegistrarse {

     @Override
     public boolean ValidarCorreo(String email) {
          boolean verific = false;

          Pattern pattern = Pattern
                  .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                          + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

          Matcher mather = pattern.matcher(email);

          if (mather.find() == true) {
               verific = true;

          } else {
               JOptionPane.showMessageDialog(null, "El correo no es valido");
          }
          return verific;
     }

     @Override
     public boolean CompararPass(String pass1, String pass2) {
          boolean verific = false;

          if (pass1.equals(pass2) == true) {
               verific = true;
          } else {
               JOptionPane.showMessageDialog(null, "Las contraenias no son iguales");
          }

          return verific;
     }

     public String Encriptador(String palabra, int Llave) {

          String Ascci = "";
          int codificador = 0;

          for (int x = 0; x < palabra.length(); x++) {

               codificador = (int) palabra.charAt(x);
               codificador = codificador + Llave;

               char caracter = (char) codificador;
               Ascci = Ascci + caracter;
          }
          return Ascci;
     }

     public boolean registrar(ModeloUsuarios modelo) {
          Connection conn = null;
          PreparedStatement stmt = null;
          boolean correcto = false;

          String Insert = "Insert into tb_usuarios (nombres, apellidos, correo, username, password, confirmpass, telefono) values (?,?,?,?,?,?,?)";

          try {
               conn = ClsConexion.OpenConection();
               stmt = conn.prepareStatement(Insert);

               stmt.setString(1, modelo.getNombres());
               stmt.setString(2, modelo.getApellidos());
               stmt.setString(3, modelo.getCorreo());
               stmt.setString(4, modelo.getUsername());
               stmt.setString(5, modelo.getPassword());
               stmt.setString(6, modelo.getConfirmpass());
               stmt.setString(7, modelo.getTelefono());
               stmt.execute();

               correcto = true;
          } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, " No puedes dejar campos vacios ");
          } finally {
               ClsConexion.CloseConection(stmt);
               ClsConexion.CloseConection(conn);

          }
          return correcto;
     }

     @Override
     public boolean existe(String usuario) {

          Connection conn = null;
          PreparedStatement stmt = null;
          boolean correcto = false;
          ResultSet rs = null;

          String Insert = "Select  Codigo from tb_usuarios where username ='" + usuario + "' ";

          try {
               conn = ClsConexion.OpenConection();
               stmt = conn.prepareStatement(Insert);
               rs = stmt.executeQuery();
               if (rs.next()) {
                    correcto = true;
               }
          } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex + " Error ");
          } finally {
               ClsConexion.CloseConection(stmt);
               ClsConexion.CloseConection(conn);

          }
          return correcto;
     }

}
