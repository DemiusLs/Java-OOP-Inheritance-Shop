package org.lesson.java.shop;

import java.math.BigDecimal;

public class Carrello {
    public static void main(String[] args) {
        
        Televisore tvSamsung1 = new Televisore("qv32tv", "samsunsg" , new BigDecimal(399), 32 , true);
        Televisore tvSamsung2 = new Televisore("qt42tv", "samsunsg" , new BigDecimal(599), 42 , false);

        Cuffie cuffie1 = new Cuffie("SupCx", "Sennheiser", new BigDecimal(245), "rosso", false);
        Cuffie cuffie2 = new Cuffie("huaw221", "xiami", new BigDecimal(99), "nero", true);


        Smartphone smartphone1 = new Smartphone("x14pro", "xiami", new BigDecimal(299), "12131344AAida", 64);
        Smartphone smartphone2 = new Smartphone("i16pro", "apple", new BigDecimal(799), "12565473233Arr", 16);
        

        System.out.println("Inserisci un prodotto");
    }
}
