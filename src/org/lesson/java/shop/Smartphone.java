package org.lesson.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Smartphone extends Prodotto{

    //attributi
    private String IMEI;
    private int memoria;

    //costruttore

    Smartphone(){
        super();
        this.IMEI = "nessun IMEI";
        this.memoria = 0 ;

    }

    Smartphone( String nome , String marca , BigDecimal prezzo , String IMEI , int memoria){
        super(  nome , marca ,  prezzo );
        this.IMEI = IMEI;
        this.memoria = memoria;
    }
    
    Smartphone( String nome , String marca , BigDecimal prezzo , BigDecimal iva , String IMEI , int memoria){
        super(  nome , marca ,  prezzo , iva);
        this.IMEI = IMEI;
        this.memoria = memoria;
    }


    //metodi 

    public String getIMEI(){
        return this.IMEI;
    }

    public void setIMEI(String IMEI){
        this.IMEI = IMEI;
    }

    public int getMemoria(){
        return this.memoria;
    }
    public void setMemoria(int memoria){
        this.memoria = memoria;
    }


    @Override
    public BigDecimal getDiscountPrice(){
        
       // Definisco la percentuale di sconto
        BigDecimal percentualeSconto = new BigDecimal("0.02"); // Sconto di default
        if (this.memoria < 32) {
            percentualeSconto = new BigDecimal("0.05"); // Sconto specifico del 5%
        }

        // Calcolo il prezzo scontato prima di aggiungere l'IVA
        BigDecimal prezzoScontatoSenzaIva = getPrezzo().subtract(getPrezzo().multiply(percentualeSconto));

        // Aggiungo l'IVA al prezzo già scontato
        BigDecimal prezzoIvatoScontato = prezzoScontatoSenzaIva.add(prezzoScontatoSenzaIva.multiply(getIva()));
        
        return prezzoIvatoScontato.setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString(){
        return super.toString() + "\nCodice IMEI: " + getIMEI() + "\nGiga: " + getMemoria() + "\nPrezzo: " + getPrezzoIvato();
    }
    

    
}
