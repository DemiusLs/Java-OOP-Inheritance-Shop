package org.lesson.java.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto{

    //attributi
    private double larghezza; 
    private double altezza;
    private boolean isSmart;

    //costruttore
    public Televisore(){
        
        this.larghezza = 0;
        this.altezza = 0;
        this.isSmart = false;
    }

    public Televisore(String nome , String marca , BigDecimal prezzo , BigDecimal iva ,double larghezza , double altezza , boolean isSmart){

        super(  nome , marca ,  prezzo , iva);
        this.larghezza = larghezza ;
        this.altezza = altezza;
        this.isSmart = isSmart;
        
    }

    //metodi

    public double getLarghezza(){
        return this.larghezza;
    }
    public void setLarghezza(double larghezza){
        this.larghezza = larghezza;
    }

    public double getAltezza(){
        return this.altezza;
    }
    public void setAltezza(double altezza){
        this.altezza = altezza;
    }

    public boolean getIsSmart(){
        return this.isSmart;
    }

    public void setIsSmart(boolean isSmart){
        this.isSmart = isSmart;
    }
    


}
