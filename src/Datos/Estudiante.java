/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Administrator
 */

public class Estudiante extends Datos{
//abstractos

 @Override
 public String getnombre() {
return "Mario";
  }
 @Override
 public  String getedad() {
 return "22";
 }
  
 @Override
  String getperfil() {
    throw new UnsupportedOperationException("Not supported yet.");
    
 }
}

   
   

