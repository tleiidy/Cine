/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

/**
 *
 * @author Leidy Torres
 */
public class Pelicula {
    
    private String nombre;
    
    private int duracion;
    
    private String generoPeli;

    
    /**
     * Constructor que inicaliza las variables
     * @param nombre
     * @param duracion
     * @param generoPeli 
     */
    public Pelicula(String nombre, int duracion, String generoPeli) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.generoPeli = generoPeli;
    }
    
     /**
     * Metodo que imprime datos de la pelicula 
     */
    public void Pelicula(){
        System.out.println("Nombre Pelicula:");
        System.out.println("Logan");
        System.out.println("Descripcion");
        System.out.println("");
        System.out.println("Genero");
        System.out.println("Acción, Ciencia ficción, Aventura");
        System.out.println("Duracion:");
        System.out.println("2h, 17min");
        
    }
    
    /**
     * Retorna el valor de nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Modifica el valor de nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna el valor de duracion
     * @return duracion
     */
    public int getDuracion() {
        return duracion;
    }
    
    /**
     * Modifica el valor de duracion
     * @param duracion 
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    /**
     * Retona el valor de genero de pelicula
     * @return generoPeli
     */
    public String getGeneroPeli() {
        return generoPeli;
    }
    
    /**
     * Modifica el valor de genero de pelicula
     * @param generoPeli 
     */
    public void setGeneroPeli(String generoPeli) {
        this.generoPeli = generoPeli;
    }
    
    
    
}
