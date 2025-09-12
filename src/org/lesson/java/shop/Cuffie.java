package org.lesson.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{


    //attributi
    private String colore;
    private boolean isWireless;

    //costruttore
    public Cuffie(){
        
        this.colore = "nessun colore";
        this.isWireless = false;
    }

    public Cuffie(String nome , String marca , BigDecimal prezzo , BigDecimal iva ,String colore, boolean isWireless){

        super(  nome , marca ,  prezzo , iva);
        this.colore = colore ;
        this.isWireless = isWireless;
        
    }

    //metodi

    public String getColore(){
        return this.colore;
    }
    public void setColore(String colore){
        this.colore = colore;
    }

 
    public boolean getIsWireless(){
        return this.isWireless;
    }

    public void setIsWireless(boolean isWireless){
        this.isWireless = isWireless;
    }


    @Override
    public String toString(){
        return super.toString() + "\nColore: " + getColore() + "\nWireless: " + getIsWireless();
    }
}
