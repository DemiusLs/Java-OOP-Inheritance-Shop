package org.lesson.java.shop;

import java.math.BigDecimal;

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


}
