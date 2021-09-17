/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author anner
 */
public class ModeloUsuarios {
     
     private int Codigo;
     private String nombres;
     private String apellidos;
     private String correo;
     private String username;
     private String password;
     private String confirmpass;
     private String telefono;

     @Override
     public String toString() {
          return "ModeloUsuarios{" + "Codigo=" + Codigo + ", nombres=" + nombres + ", apellidos=" + apellidos + ", correo=" + correo             + ", username=" + username + ", password=" + password + ", confirmpass=" + confirmpass + ", telefono=" + telefono + '}';
     }

     public int getCodigo() {
          return Codigo;
     }

     public void setCodigo(int Codigo) {
          this.Codigo = Codigo;
     }

     public String getNombres() {
          return nombres;
     }

     public void setNombres(String nombres) {
          this.nombres = nombres;
     }

     public String getApellidos() {
          return apellidos;
     }

     public void setApellidos(String apellidos) {
          this.apellidos = apellidos;
     }

     public String getCorreo() {
          return correo;
     }

     public void setCorreo(String correo) {
          this.correo = correo;
     }

     public String getUsername() {
          return username;
     }

     public void setUsername(String username) {
          this.username = username;
     }

     public String getPassword() {
          return password;
     }

     public void setPassword(String password) {
          this.password = password;
     }

     public String getConfirmpass() {
          return confirmpass;
     }

     public void setConfirmpass(String confirmpass) {
          this.confirmpass = confirmpass;
     }

     public String getTelefono() {
          return telefono;
     }

     public void setTelefono(String telefono) {
          this.telefono = telefono;
     }

   
     
     
}
