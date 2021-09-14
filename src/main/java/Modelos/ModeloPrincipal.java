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
public class ModeloPrincipal {
     
     private int Codigo;
     private String nombre;
     private String enero = "0";
     private String febrero = "0";
     private String marzo = "0";
     private int promedio = Integer.valueOf(this.enero) + Integer.valueOf(this.febrero)+Integer.valueOf(this.marzo)/3;
     private int total = Integer.valueOf(enero) + Integer.valueOf(febrero)+Integer.valueOf(marzo);
     

     @Override
     public String toString() {
          return "ModeloPrincipal{" + "Codigo=" + Codigo + ", nombre=" + nombre + ", enero=" + enero + ", febrero=" + febrero + ", marzo=" + marzo + ", promedio=" + promedio + ", total=" + total + '}';
     }

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }
    

     public int getCodigo() {
          return Codigo;
     }

     public void setCodigo(int Codigo) {
          this.Codigo = Codigo;
     }

     public String getEnero() {
          return enero;
     }

     public void setEnero(String enero) {
          this.enero = enero;
     }

     public String getFebrero() {
          return febrero;
     }

     public void setFebrero(String febrero) {
          this.febrero = febrero;
     }

     public String getMarzo() {
          return marzo;
     }

     public void setMarzo(String marzo) {
          this.marzo = marzo;
     }

     public int getPromedio() {
          return promedio;
     }

     public void setPromedio(int promedio) {
          
          this.promedio = promedio;
     }

     public int getTotal() {
          return total;
     }

     public void setTotal(int total) {
          this.total = total;
     }
     
     
}
