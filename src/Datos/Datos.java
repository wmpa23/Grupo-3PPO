/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author wpena
 */
public class Datos {
     //Atributos
    private String nombre;
    private String edad;
    private String perfil;
    
 //Establecer y obtener Datos
    public void establernombre(String nombre){
            this.nombre = nombre;
            
        }
     public String obtenernombre()  {
         return this.nombre;
     } 
        public void estableredad(String edad){
            this.edad = edad;
            
        }
     public String obteneredad()  {
         return this.edad;
     }
     //Establecer y obtener datos de forma
        public void establecerperfil(String perfil){
            this.perfil = perfil;
            
        }
     public String obtenerforma()  {
         return this.perfil;
      }
 public void imprimirdatos(){
     System.out.println(nombre);
     System.out.println("Su Edad es:  " + edad);
     System.out.println("Su Perfil es " + perfil);
     }        
}
