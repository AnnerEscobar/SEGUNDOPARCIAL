/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosCrud;

import Conexion.ClsConexion;
import Modelos.ModeloPrincipal;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anner
 */
public class InterfacePrincipalImplement implements InterfacePrincipal {

     ModeloPrincipal ag = new ModeloPrincipal();
     
     
     @Override
     public boolean registrar(ModeloPrincipal modelo) {
          Connection conn = null;
          PreparedStatement stmt = null;
          boolean correcto = false;

          String Insert = "Insert into empleados (nombre, enero, febrero, marzo, promedio, total) values                         (?,?,?,?,?,?)";

          try {
               conn = ClsConexion.OpenConection();
               stmt = conn.prepareStatement(Insert);

               stmt.setString(1, modelo.getNombre());
               stmt.setInt(2, modelo.getEnero());
               stmt.setInt(3, modelo.getFebrero());
               stmt.setInt(4, modelo.getMarzo());
               stmt.setInt(5, modelo.getEnero()+ modelo.getFebrero()+modelo.getMarzo());
               stmt.setInt(6, (modelo.getEnero()+modelo.getFebrero()+modelo.getMarzo()/3));
               stmt.execute();

               correcto = true;
          } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex + "No se Insertaron tus datos");
          } finally {
               ClsConexion.CloseConection(stmt);
               ClsConexion.CloseConection(conn);

          }
          return correcto;
     }

     public void obtener(JTable contenedor) {

 InterfacePrincipalImplement metodos = new InterfacePrincipalImplement();
          DefaultTableModel modelo = new DefaultTableModel();

          modelo.addColumn("Codigo");
          modelo.addColumn("Nombre");
          modelo.addColumn("Enero");
          modelo.addColumn("Febrero");
          modelo.addColumn("Marzo");
          modelo.addColumn("Total");
          modelo.addColumn("Promedio");

          Connection conn = null;
          PreparedStatement stmt = null;
          ResultSet rs = null;

          String sql = "select *from empleados order by Codigo";
          List<ModeloPrincipal> milista = new ArrayList<ModeloPrincipal>();

          try {
               conn = ClsConexion.OpenConection();
               stmt = conn.prepareStatement(sql);
               rs = stmt.executeQuery();

               while (rs.next()) {
                    ag.setCodigo(rs.getInt(1));
                    ag.setNombre(rs.getString(2));
                    ag.setEnero(rs.getInt(3));
                    ag.setFebrero(rs.getInt(4));
                    ag.setMarzo(rs.getInt(5));
                    ag.setTotal(rs.getInt(6));
                    ag.setPromedio(rs.getDouble(7));
                    milista.add(ag);

               
                    String v[] = new String[7];
                    for (int i = 0; i < milista.size(); i++) {
                    v[0] = String.valueOf(ag.getCodigo());
                    v[1] = ag.getNombre();
                    v[2] = String.valueOf(ag.getEnero());
                    v[3] = String.valueOf(ag.getFebrero());
                    v[4] = String.valueOf(ag.getMarzo());
                    v[5] = String.valueOf(ag.getTotal());
                    v[6] = String.valueOf(ag.getPromedio());
                    
               }
                    modelo.addRow(v);
               }
               contenedor.setModel(modelo);

          } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex + "No se pudo desplegar tu informacion");
          } finally {
               ClsConexion.CloseConection(stmt);
               ClsConexion.CloseConection(conn);
               ClsConexion.CloseConection(rs);
          }
     }

     @Override
     public boolean actualizar(ModeloPrincipal modelo) {
          Connection conn = null;
          PreparedStatement stmt = null;
          boolean actualizar = false;

          String sql = "Update empleados set nombre =?, enero=?, febrero=?, marzo=?, total=?, promedio=? where Codigo=?";
          try {
               conn = ClsConexion.OpenConection();
               stmt = conn.prepareStatement(sql);
               stmt.setString(1, modelo.getNombre());
               stmt.setInt(2, modelo.getEnero());
               stmt.setInt(3, modelo.getFebrero());
               stmt.setInt(4, modelo.getMarzo());
               stmt.setInt(5, modelo.getTotal());
               stmt.setDouble(6, modelo.getPromedio());
               stmt.setInt(7, modelo.getCodigo());
               stmt.execute();
               actualizar = true;

          } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, ex + "No se pudo actualizar lo que querias");
          } finally {
               ClsConexion.CloseConection(stmt);
               ClsConexion.CloseConection(conn);
          }
          return actualizar;
     }

     @Override
     public boolean eliminar(ModeloPrincipal modelo) {
          Connection conn = null;
          PreparedStatement stmt = null;
          boolean eliminar = false;

          String sql = "delete from empleados where Codigo=?";

          try {
               conn = ClsConexion.OpenConection();
               stmt = conn.prepareStatement(sql);
               stmt.setInt(1, modelo.getCodigo());
               stmt.execute();
               eliminar = true;
          } catch (SQLException e) {
               JOptionPane.showMessageDialog(null, e + "No se pudo eliminar lo que querias");
          } finally {
               ClsConexion.CloseConection(stmt);
               ClsConexion.CloseConection(conn);
          }

          return eliminar;
     }
     
     public boolean GenerarPdf(){
          boolean correcto = true;
          
           Document doc = new Document();
          Connection conn = null;
          PreparedStatement stmt = null;
          ResultSet rs = null;

          try {
               String rutaArchivo = System.getProperty("user.home");
               PdfWriter.getInstance(doc, new FileOutputStream(rutaArchivo + "/Desktop/Nomina_Empleados.pdf"));
               doc.open();

               PdfPTable tabla = new PdfPTable(7);
               tabla.addCell("Codigo");
               tabla.addCell("Nombre");
               tabla.addCell("Enero");
               tabla.addCell("Febrero");
               tabla.addCell("Marzo");
               tabla.addCell("Total");
               tabla.addCell("Promedio");

               try {
                    conn = ClsConexion.OpenConection();
                    stmt = conn.prepareStatement("Select *from empleados");
                    rs = stmt.executeQuery();

                    while (rs.next()) {

                         tabla.addCell(rs.getString(1));
                         tabla.addCell(rs.getString(2));
                         tabla.addCell(rs.getString(3));
                         tabla.addCell(rs.getString(4));
                         tabla.addCell(rs.getString(5));
                         tabla.addCell(rs.getString(6));
                         tabla.addCell(rs.getString(7));

                    }
                    doc.add(tabla);
                    doc.close();
               } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Conexion Fallida " + e);
               } finally {
                    ClsConexion.CloseConection(stmt);
                    ClsConexion.CloseConection(conn);
                    ClsConexion.CloseConection(rs);
               }

          } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Tu reporte no fue generado " + e);
          }
          return correcto;
     }
    
}
