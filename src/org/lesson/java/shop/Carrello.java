package org.lesson.java.shop;


import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        
        Prodotto[] cart = new Prodotto[2] ;
        
        Scanner scan = new Scanner(System.in);


        for( int i = 0 ; i < cart.length ; i++){

            System.out.println("Nome del prodotto");
            String productName = scan.nextLine();

            System.out.println("Marca del prodotto");
            String productBrand = scan.nextLine();

            System.out.println("Prezzo del prodotto (senza iva)");
            Integer productPrize = Integer.parseInt(scan.nextLine());

            System.out.println("A quale categoria fa parte? tv - smartphone - cuffie");
            String productCategory = scan.nextLine().toLowerCase();

            System.out.println("Inserisci i dati di " + productCategory);
            switch (productCategory) {
                case "tv":

                    System.out.println("Inserisci le dimensioni in pollici");
                    Integer tvSize = Integer.parseInt(scan.nextLine());
                    
                    System.out.println("La tv è smart?");
                    Boolean isSmartTv = scan.nextBoolean();

                    Televisore tv = new Televisore(productName , productBrand , new BigDecimal(productPrize), tvSize , isSmartTv);
                    cart[i]= tv;

                    break;


                case "smartphone":

                    System.out.println("Inserisci IMEI dello smartphone");
                    String smartPhoneIMEI = scan.nextLine();
                    
                    System.out.println("Inserisci le dimensioni dello smartphone?");
                    Integer smartphoneMemory = Integer.parseInt(scan.nextLine());

                    Smartphone smartphone = new Smartphone(productName , productBrand , new BigDecimal(productPrize), smartPhoneIMEI , smartphoneMemory);
                    cart[i]= smartphone;

                    break;

                case "cuffie":

                    System.out.println("Inserisci il colore delle cuffie");
                    String cuffieColor = scan.nextLine();
                    
                    System.out.println("Le cuffie sono wireless?");
                    Boolean isCuffieWireless = scan.nextBoolean();

                    Cuffie cuffie = new Cuffie(productName , productBrand , new BigDecimal(productPrize), cuffieColor , isCuffieWireless);
                    cart[i]= cuffie;

                    break;
            
            
                
            }
            System.out.println("-----------------");
        }

        scan.close();

        System.out.println("Ecco il tuo carrello");

        for(int i = 0 ; i < cart.length ; i++){
            System.out.println(cart[i].toString());
            System.out.println("-----------------");;
        }






    }
}
