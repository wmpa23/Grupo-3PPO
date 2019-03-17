/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import Datos.Estudiante;

/**
 *
 * @author wpena
 */
public class Persona {
  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Estudiante estudiante = new Estudiante();
   Deportista deportista = new Deportista("Heydi", "Voleibol", 23);
 
    
  // Imprimi informacion desde Datos2
 System.out.println("El Nombre del Estudiante es: " + estudiante.getnombre());
 System.out.println("La Edad del Estudiantes es:" + estudiante.getedad()); 
 System.out.println("El Nombre del Deportista es: " + deportista.getnombre());
 System.out.println("La edad del Deportista es: " + deportista.getedad());
 System.out.println("El deporte que Practica es: " + deportista.getDeporte()); 
    }
}
