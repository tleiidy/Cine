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
public class Persona {
    
    private String identificacion;
    
    private String nombre;
    
    private String apellido;
    
    private int edad;
    
    private Genero genero;
    

    /**
     * Constructor de la clase que inicializa las variables
     * @param identificacion
     * @param nombre
     * @param apellido
     * @param numero
     */
    public Persona(String identificacion, String nombre, String apellido, int edad, Genero genero) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
    }

    /**
     * Retorna el valor de identificacion
     * @return identificacion
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Modifica el valor de identificacion
     * @param identificacion 
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Retorna valor de nombre
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
     * Retorna el valor de apellido
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Modifica el valor de apellido
     * @param apellido 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }
   
    
    
}
