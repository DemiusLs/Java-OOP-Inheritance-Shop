package org.lesson.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        
        Televisore tvSamsung = new Televisore("h200", "samsung", new BigDecimal(5400), new BigDecimal(23), 600, 450, true);

        
        System.out.println(tvSamsung.getNome());
        
        System.out.println(tvSamsung.toString());
    }
}
