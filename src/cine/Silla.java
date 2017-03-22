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
public class Silla {
    
    private int numero;
    
    private Genero genero;
    
    private Tipo tiposilla;
    
    private Persona  persona;
    private int disponible;

    
    /**
     * Constructor de la clase que inicializa las variables
     * @param numero
     * @param persona
     */
    public Silla(int numero, Tipo tiposilla, Persona persona, int disponible) {
        this.numero = numero;
        this.tiposilla = tiposilla;
        this.persona = persona;
        this.disponible= disponible;
    }

    /**
     * Retorna el valor del numero
     * @return numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Modifica el valor del numero
     * @param numero 
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    /**
     * Retorna el valor de genero
     * @return genero
     */
    public Genero getGenero() {
        return genero;
    }
    
    /**
     * Modifica el valor de genero
     * @param genero 
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    /**
     * Retorna el tipo de silla
     * @return Tipo silla
     */
    public Tipo getTiposilla() {
        return tiposilla;
    }
    
    /**
     * Modifica el tipo de silla
     * @param tiposilla 
     */
    public void setTiposilla(Tipo tiposilla) {
        this.tiposilla = tiposilla;
    }
    
    
    /**
     * Retorna el valor de persona
     * @return persona
     */
    public Persona getPersona() {
        return persona;
    }
    
    /**
     * Modifica el valor de persona
     * @param persona
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }
   
    
}

