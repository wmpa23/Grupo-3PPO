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
public class Estudiante extends Datos {

    public static void imprirnombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  //Nombre
    public String nombre;
    //Apellido
    private String perfil; //test
    
    //Edad
    private int edad;
    
    
    public Estudiante(String nombre, String perfil){
        this.nombre = nombre;
        this.perfil = perfil;
    }

    public Estudiante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Definir clase public para visualizar el nombre
    public void imprimirnombre(){
        System.out.println(nombre);
    }
    
    public void imprimirperfil(){
        System.out.println(perfil);
    }
    //Establecer valor de una clase public a privado
    public void setedad(int _edad){
        this.edad = _edad;
    }
    //Retornar valor de una clase public a privado
    public int getedad(){
        return edad;
    }
    //Establecer valor de una clase public a privado
    public void seteexperiencia(int _experiencia){
        this.experiencia = _experiencia;
    }
    //Retornar valor de una clase public a privado
    public int getexperiencia(){
        return experiencia;
    }

    @Override
    String getnombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    String getperfil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void imprimirdatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
} 
