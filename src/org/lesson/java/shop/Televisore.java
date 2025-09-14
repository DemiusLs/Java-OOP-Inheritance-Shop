package org.lesson.java.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto{

    //attributi
    private int pollici; 
    private boolean isSmart;

    //costruttore
    public Televisore(){
        
        this.pollici = 0;
        this.isSmart = false;
    }

    public Televisore(String nome , String marca , BigDecimal prezzo ,int pollici, boolean isSmart){

        super(  nome , marca ,  prezzo );
        this.pollici = pollici ;        
        this.isSmart = isSmart;        
    }

    public Televisore(String nome , String marca , BigDecimal prezzo , BigDecimal iva ,int pollici, boolean isSmart){

        super(  nome , marca ,  prezzo , iva);
        this.pollici = pollici ;        
        this.isSmart = isSmart;        
    }

    //metodi

    public double getDimensioni(){
        return this.pollici;
    }
    public void setDimensioni(int pollici){
        this.pollici = pollici;
    }

    public boolean getIsSmart(){
        return this.isSmart;
    }

    public void setIsSmart(boolean isSmart){
        this.isSmart = isSmart;
    }
    


    @Override
    public String toString(){
        return super.toString() + "\nDimensioni: " + getDimensioni() + " pollici" + "\nSmartTV: " + getIsSmart() + "\nPrezzo: " + getPrezzoIvato();
    }
}
