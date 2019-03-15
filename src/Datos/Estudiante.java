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

  //Nombre
    public String nombre;
    //Apellido
    private String perfil;
    
    //Edad
    private int edad;
    
    
    public Estudiante(String nombre, String perfil){
        this.nombre = nombre;
        this.perfil = perfil;
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
   
   
} 