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
     private int enero = 0;
     private int febrero = 0;
     private int marzo = 0;
     private double promedio = 0.0;
     private int total = 0;

     @Override
     public String toString() {
          return "ModeloPrincipal{" + "Codigo=" + Codigo + ", nombre=" + nombre + ", enero=" + enero + ", febrero=" + febrero + ",               marzo=" + marzo + ", promedio=" + promedio + ", total=" + total + '}';
     }

     public int getCodigo() {
          return Codigo;
     }

     public void setCodigo(int Codigo) {
          this.Codigo = Codigo;
     }

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public int getEnero() {
          return enero;
     }

     public void setEnero(int enero) {
          this.enero = enero;
     }

     public int getFebrero() {
          return febrero;
     }

     public void setFebrero(int febrero) {
          this.febrero = febrero;
     }

     public int getMarzo() {
          return marzo;
     }

     public void setMarzo(int marzo) {
          this.marzo = marzo;
     }

     public double getPromedio() {
          return promedio;
     }

     public void setPromedio(double promedio) {

          promedio = (this.enero + this.febrero + this.marzo) / 3;

          this.promedio = promedio;
     }

     public int getTotal() {
          return total;
     }

     public void setTotal(int total) {

          total = this.enero + this.febrero + this.marzo;

          this.total = total;
     }

}
