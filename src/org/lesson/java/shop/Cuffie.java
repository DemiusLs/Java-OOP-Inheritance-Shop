package org.lesson.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cuffie extends Prodotto{


    //attributi
    private String colore;
    private boolean isWireless;

    //costruttore
    public Cuffie(){
        
        this.colore = "nessun colore";
        this.isWireless = false;
    }

    public Cuffie(String nome , String marca , BigDecimal prezzo ,String colore, boolean isWireless){

        super(  nome , marca ,  prezzo );
        this.colore = colore ;
        this.isWireless = isWireless;        
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
    public BigDecimal getDiscountPrice(){
        
       // Definisco la percentuale di sconto
        BigDecimal percentualeSconto = new BigDecimal("0.02"); // Sconto di default
        if (this.isWireless) {
            percentualeSconto = new BigDecimal("0.07"); // Sconto specifico del 7%
        }

        // Calcolo il prezzo scontato prima di aggiungere l'IVA
        BigDecimal prezzoScontatoSenzaIva = getPrezzo().subtract(getPrezzo().multiply(percentualeSconto));

        // Aggiungo l'IVA al prezzo già scontato
        BigDecimal prezzoIvatoScontato = prezzoScontatoSenzaIva.add(prezzoScontatoSenzaIva.multiply(getIva()));
        
        return prezzoIvatoScontato.setScale(2, RoundingMode.HALF_UP);
    }


    @Override
    public String toString(){
        return super.toString() + "\nColore: " + getColore() + "\nWireless: " + getIsWireless() + "\nPrezzo: " + getPrezzoIvato();
    }
}
