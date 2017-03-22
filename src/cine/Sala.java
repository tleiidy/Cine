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
public class Sala {
    
    private Silla [][] silla;
    
    private int filas;
    
    private int columnas;
    
    private int general;
    
    private int ejecutiva;
    
    private int vip;
    
    private int masculino;
    
    private int femenino;
   private int numero;
    private int totalVentas;
    private int contadorHombres;
    private int contadorMujeres;
    private int contadorNinos;
    private int contadorAdultos;
    private byte aux;
    
    Persona persona;
    
    
    
    /**
     * Constructor que llama los metodos
     * 
     */    
    public Sala (){
        
        
        ingresoDatos();
        tipoSillas();
        
        silla = new Silla [filas][columnas];
        llenarSala();
        
        do{
        
        sillasDisponibles();
 
        llenarSillas();
        
        tarifa();
            System.out.println("1. INGRESAR OTRO CLIENTE.");
            System.out.println("2. ESTADISTICAS DE VENTAS.");
            aux=teclado.nextByte();
            if(aux==1){ 
                aux=1;
            }else{
                aux=0;
            }
            
        }while(aux==1);
        imprimirEstadisticas();
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
                 silla = new Silla (cont++, Tipo.GENERAL , null, 0);             
                } else if ((i+1) <= (general + ejecutiva)) {
                    silla = new Silla(cont++, Tipo.EJECUTIVA, null, 0);
                } else {
                   silla = new Silla(cont++, Tipo.VIP, null, 0);
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
    
     byte deseo; 
private void sillasDisponibles(){
    
      
       OUTER:
       while (true) {
           System.out.println("Ingrese el tipo de silla que desea");
           if(general!=0){
               System.out.println("1.GENERAL.");
           }
           if(ejecutiva != 0){
               System.out.println("2. EJECUTIVA");
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
                           if ((this.silla[i][j].getTiposilla()== Tipo.GENERAL)&&(this.silla[i][j].getDisponible()== 0)) {
                               System.out.print("("+this.silla[i][j].getNumero() + "-G )");
                       }
                   }     System.out.println("");               
                   break OUTER;
                   }
                   }
               case 2:
                   if (ejecutiva !=0){
                   for(int i=0 ; i< filas ; i++) {
                       for(int j=0 ; j< columnas ; j++){
                           if((this.silla[i][j].getTiposilla()== Tipo.EJECUTIVA)&&(this.silla[i][j].getDisponible()==0)) {
                               System.out.print("("+this.silla[i][j].getNumero() + "-E )");
                           }
                       }
                       System.out.println(" ");
                   }  
                   break OUTER;
                   }

                   
               case 3:
                   if (vip!=0){
                   for(int i=0 ; i< filas ; i++) {
                       for(int j=0 ; j< columnas ; j++){
                           if((this.silla[i][j].getTiposilla()== Tipo.VIP)&&(this.silla[i][j].getDisponible()==0)) {
                               System.out.print("("+this.silla[i][j].getNumero() + "+V )");
                           }
                       }
                       System.out.println(" ");
                   }  
                    break OUTER;
                    }
               default:
                   System.out.println("TIPO SILLA INCORRECTO");
                   break;
           }
       }
  }
    
    int  edad, i, j;
    String identificacion;
    String nombre;
    String apellido;
    byte genero;
    private void llenarSillas(){
        
        
        switch(deseo){
            case 1:
                while (true){
                    System.out.print("NUMERO DE SILLA : ");
                    numero = teclado.nextInt();
                    if(numero<=general*columnas){
                        break;
                    }
                }break;
            case 2:
                while(true){
                    System.out.print("NUMERO DE SILLA : ");
                    numero = teclado.nextInt();
                     if((general*columnas<numero)&&(numero<= ejecutiva*columnas+general*columnas)){
                        break;
                    }
                }
            break;
            case 3:
                while(true){
                    System.out.print("NUMERO DE SILLA : ");
                    numero = teclado.nextInt();
                     if((ejecutiva*columnas+general*columnas<numero)&&(numero<=vip*columnas+ejecutiva*columnas+general*columnas)){
                        break;
                    }
                }    
            
            break;
        }
        
        System.out.print("IDENTIFICACION : ");
        identificacion = teclado.next();
        System.out.print("NOMBRE : ");
        nombre = teclado.next();
        System.out.print("APELLIDO : ");
        apellido = teclado.next();
        System.out.println("EDAD : ");
        edad= teclado.nextInt();
        while(true){
            System.out.print("**GENERO**");
            System.out.print("1.MASCULINO");
            System.out.print("2.FEMENINO");
            genero = teclado.nextByte();
            
            Persona persona;
            if(genero==1){
                persona = new Persona(identificacion,nombre,apellido,edad,Genero.MASCULINO);
                contadorHombres++;
                break;
            }else if(genero==2){
                persona = new Persona(identificacion,nombre,apellido,edad,Genero.FEMENINO);
                contadorMujeres++;
                break;
            }else{
                System.out.println("GENERO NO ADMITIDO");
            }
        }
        for(int i=0 ; i< filas ; i++) {
            for(int j=0 ; j< columnas ; j++){
                if(this.silla[i][j].getNumero() == numero){
                   this.silla[i][j].setDisponible(1);
                }
            }
        }
    }
    
    private void tarifa(){
        
        for(int i=0 ; i< filas ; i++) {
            for(int j=0 ; j< columnas ; j++){
                if(this.silla[i][j].getNumero()== numero) {
                    int taquilla;
                    int precioEdad=0;
                    int precioTipoSilla=0;
                    if((edad>= 5) && (edad <= 17)){
                        precioEdad=1000;
                        contadorNinos++;
                    }else if ((edad >=18) && (edad <= 80)){
                        precioEdad=2000;
                        contadorAdultos++;
                    }
                    switch (deseo) {
                        case 1:
                            precioTipoSilla = 1000;
                            break;
                        case 2:
                            precioTipoSilla = 2000;
                            break;
                        case 3:
                            precioTipoSilla = 3000;
                            break;
                        default:
                            break;
                    }
                    taquilla = precioEdad + precioTipoSilla;
                    totalVentas+=taquilla;
                    System.out.println("TIQUETE");
                    System.out.println("NOMBRE: "+nombre+"");
                    System.out.println("APELLIDO: "+apellido+"");
                    System.out.println("IDENTIFICACION: "+identificacion+"");
                    
                    
                    System.out.println("PRECIO TAQUILLA : "+taquilla);
                }
            }
        }
    }
    
    private void imprimirEstadisticas(){
        System.out.println("TOTAL VENTAS: "+totalVentas);
        System.out.println("TOTAL HOMBRES: "+ contadorHombres);
        System.out.println("TOTAL MUJERES: "+ contadorMujeres);
        System.out.println("TOTAL NIÑOS: "+ contadorNinos);
        System.out.println("TOTAL ADULTOS: "+ contadorAdultos);

    
    
    }
    
    
    
    
    
    
}    

    
    


