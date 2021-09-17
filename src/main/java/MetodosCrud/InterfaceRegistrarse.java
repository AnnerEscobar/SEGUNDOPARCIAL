/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosCrud;

import Modelos.ModeloUsuarios;

/**
 *
 * @author anner
 */
public interface InterfaceRegistrarse {
     
     public boolean ValidarCorreo(String email);
     public boolean CompararPass(String pass1, String pass2);
     public boolean registrar(ModeloUsuarios modelo);
     public String Encriptador(String palabra, int Llave);
     public boolean existe(String usuario);   
}
