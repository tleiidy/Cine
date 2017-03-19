/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;
import java.util.Scanner;
/**
 *
 * @author Leidy Torres
 */
public class Salas {
    
    private Silla [][] silla;
    
    private int filas;
    
    private int columnas;
    
    private int general;
    
    private int ejecutiva;
    
    private int vip;
    
    private int masculino;
    
    private int femenino;
    
    
    /**
     * Constructor que llama los metodos
     * 
     */    
    public Salas (){
        ingresoDatos();
        tipoSillas();
        silla = new Silla [filas][columnas];
        llenarSala();
        sillasDisponibles();
        llenarSillas();
    }
    
    Scanner teclado = new Scanner(System.in);
    
    public void ingresoDatos(){
    
        System.out.println("Ingrese el numero de filas");
        filas = teclado.nextInt();
        System.out.println("Ingrese el numero de columnas");
        columnas = teclado.nextInt();
    }
    
    public void tipoSillas(){
    
        while(true){
            System.out.println("Digite el numero de filas generales");
            general = teclado.nextInt();
            if (general <= filas)
                break;
        }
    
        
        if (general != filas){
            while (true){
            System.out.println("Digite el numero de filas ejecutivas");
            ejecutiva = teclado.nextInt();
            if ((general + ejecutiva) <= filas)
                break;   
            }
            vip = filas - (general + ejecutiva);
        }
    }
    
    public void llenarSala(){
        int cont=1;
        for (int i=0; i < filas; i++){
            for (int  j=0; j < columnas; j++){
              Silla silla;
             if ((i+1) <= general){
                 silla = new Silla (cont++, Tipo.GENERAL , null);             
                } else if ((i+1) <= (general + ejecutiva)) {
                    silla = new Silla(cont++, Tipo.EJECUTIVA, null);
                } else {
                   silla = new Silla(cont++, Tipo.VIP, null);
                }
                this.silla[i][j] = silla;
        }
    }
        for(int i=0 ; i< filas ; i++) {
            for(int j=0 ; j< columnas ; j++){
                    if(this.silla[i][j].getTiposilla()== Tipo.GENERAL) {
                        System.out.print("("+this.silla[i][j].getNumero() + "-G) ");
                    } else if(this.silla[i][j].getTiposilla()== Tipo.EJECUTIVA) {
                        System.out.print("("+this.silla[i][j].getNumero() + "-P) ");
                    } else {
                        System.out.print("("+this.silla[i][j].getNumero() + "-V) ");
                    }
            }
            System.out.println("");
        }  
    }
    
    
private void sillasDisponibles(){
      byte deseo;
      int numero;
       OUTER:
       while (true) {
           System.out.println("INGRESE TIPO DE SILLA QUE DESEA");
           if(general!=0){
               System.out.println("1.GENERAL.");
           }
           if(ejecutiva != 0){
               System.out.println("2.PREFERENCIAL.");
           }
           if(vip!=0){
               System.out.println("3.VIP.");
           }
           deseo= teclado.nextByte();
           switch (deseo) {
               case 1:
                   if (general !=0){
                   for(int i=0 ; i< filas ; i++) {
                       for(int j=0 ; j< columnas ; j++){
                           if((this.silla[i][j].getTiposilla()== Tipo.GENERAL)&&(this.silla[i][j].getPersona()==null)) {
                               System.out.print(this.silla[i][j].getNumero() + "-X ");
                           }
                       }
                       System.out.println("");
                   }
                    System.out.print("NUMERO DE SILLA : ");
                    numero = teclado.nextInt();
                   if (numero < (filas * columnas) && (numero < general)){
                   llenarSillas();
                   }else{
                       System.out.println("EL NUMERO DE SILLA NO EXISTE");
                       break;
                   }
                   
                   break OUTER;
                   }

               case 2:
                   if (ejecutiva !=0){
                   for(int i=0 ; i< filas ; i++) {
                       for(int j=0 ; j< columnas ; j++){
                           if((this.silla[i][j].getTiposilla()== Tipo.EJECUTIVA)&&(this.silla[i][j].getPersona()==null)) {
                               System.out.print(this.silla[i][j].getNumero() + "-O ");
                           }
                       }
                       System.out.println("");
                   }  
                   System.out.print("NUMERO DE SILLA : ");
                   numero = teclado.nextInt();
                   if (numero < (filas * columnas) && (numero < ejecutiva)){
                   llenarSillas();
                   }else{
                       System.out.println("EL NUMERO DE SILLA NO EXISTE");
                       break;
                   }

                   break OUTER;
                   }

                   
               case 3:
                   if (vip!=0){
                   for(int i=0 ; i< filas ; i++) {
                       for(int j=0 ; j< columnas ; j++){
                           if((this.silla[i][j].getTiposilla()== Tipo.VIP)&&(this.silla[i][j].getPersona()==null)) {
                               System.out.print(this.silla[i][j].getNumero() + "+V ");
                           }
                       }
                       System.out.println("");
                   }  
                   
                    System.out.print("NUMERO DE SILLA : ");
                    numero = teclado.nextInt();
                    if (numero < (filas * columnas) && (numero < vip)){
                    llenarSillas();
                    }else{
                       System.out.println("EL NUMERO DE SILLA NO EXISTE");
                       break;
                    }

                    break OUTER;
                    }
               default:
                   System.out.println("TIPO SILLA INCORRECTO");
                   break;
           }
       }
  }
    
    
    private void llenarSillas(){
       int numero;
       String identificacion;
       String nombre;
       String apellido;
       byte genero;
       int  edad;

       System.out.print("IDENTIFICACION : ");
       identificacion = teclado.next();
       System.out.print("NOMBRE : ");
       nombre = teclado.next();
       System.out.print("APELLIDO : ");
       apellido = teclado.next();
       System.out.println("EDAD : ");
       edad= teclado.nextInt();
       while(true){
           System.out.print("*GENERO*");
           System.out.print("1.MASCULINO");
           System.out.print("2.FEMENINO");
           genero = teclado.nextByte();
           Persona persona;
           if(genero==1){
               persona = new Persona(identificacion,nombre,apellido,edad,Genero.MASCULINO);
               break;
           }else if(genero==2){
               persona = new Persona(identificacion,nombre,apellido,edad,Genero.FEMENINO);
               break;
           }else{
               System.out.println("GENERO NO ADMITIDO");
           }
       }
    }
    
    
    
}    

    
    

