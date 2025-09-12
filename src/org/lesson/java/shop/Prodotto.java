package org.lesson.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    //attributi
    private int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva;

    //costruttore
    public Prodotto(){
        Random rand = new Random();
        this.codice = rand.nextInt(99999);
        this.nome = "nessun nome" ;
        this.marca = "nessuna marca";
        this.prezzo = BigDecimal.ZERO;
        this.iva = BigDecimal.ZERO;
    }
    public Prodotto( String nome , String marca , BigDecimal prezzo ){

        Random rand = new Random();
        this.codice = rand.nextInt(99999);
        this.nome = nome ;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = new BigDecimal(0.22);
    }

    public Prodotto( String nome , String marca , BigDecimal prezzo , BigDecimal iva){

        Random rand = new Random();
        this.codice = rand.nextInt(99999);
        this.nome = nome ;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva.divide(new BigDecimal(100),2 ,RoundingMode.HALF_UP );
    }
    //metodi

    public int getCodice(){
        return this.codice;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public BigDecimal getPrezzo(){
        return this.prezzo;
    }
    public void setPrezzo(BigDecimal prezzo){

        this.prezzo = prezzo;
    }

    public BigDecimal getIva(){
        return this.iva;
    }
    public void setIva(BigDecimal iva){

        this.iva = iva.divide(new BigDecimal(100),2 ,RoundingMode.HALF_UP );
    }

    public BigDecimal getPrezzoIvato(){
        if(prezzo != null && iva != null){
            return this.prezzo.add(this.prezzo.multiply(iva)).setScale(2, RoundingMode.HALF_UP);
        }
        return null;
         
     }



    @Override
    public String toString(){
        if(nome != null){

            return codice + " - " + nome;
        }
        return null;
    }


}
