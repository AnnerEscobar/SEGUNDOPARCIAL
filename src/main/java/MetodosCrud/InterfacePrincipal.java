/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosCrud;

import Modelos.ModeloPrincipal;
import java.util.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anner
 */
public interface InterfacePrincipal {
     
     public boolean registrar(ModeloPrincipal modelo);
     public void obtener(JTable contenedor);
     public boolean actualizar(ModeloPrincipal modelo);
     public boolean eliminar(ModeloPrincipal modelo);
}
