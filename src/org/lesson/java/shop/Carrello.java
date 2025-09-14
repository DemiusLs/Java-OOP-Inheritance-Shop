package org.lesson.java.shop;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Prodotto[] cart = new Prodotto[0] ;
        int productCount = 0;  
        boolean continuaAggiunta = true;      
        

        System.out.println("Benvenuto nel tuo carrello virtuale");


        while (continuaAggiunta ) {
            System.out.println("\n--- Inserimento Prodotto #" + (productCount + 1) + " ---");
            
            System.out.println("Nome del prodotto");
            String productName = scan.nextLine();

            System.out.println("Marca del prodotto");
            String productBrand = scan.nextLine();

            System.out.println("Prezzo del prodotto (senza iva)");
            BigDecimal productPrize = new BigDecimal(scan.nextLine());

            System.out.println("A quale categoria fa parte? tv - smartphone - cuffie");
            String productCategory = scan.nextLine().toLowerCase();

            Prodotto newProduct = null;

            System.out.println("Inserisci i dati di " + productCategory);
            switch (productCategory) {
                case "tv":

                    System.out.println("Inserisci le dimensioni in pollici");
                    Integer tvSize = Integer.parseInt(scan.nextLine());                    
                    System.out.println("La tv è smart?");
                    Boolean isSmartTv = Boolean.getBoolean(scan.nextLine());
                    newProduct = new Televisore(productName , productBrand , productPrize, tvSize , isSmartTv);                    
                    break;

                case "smartphone":

                    System.out.println("Inserisci IMEI dello smartphone");
                    String smartPhoneIMEI = scan.nextLine();                    
                    System.out.println("Inserisci le dimensioni dello smartphone?");
                    Integer smartphoneMemory = Integer.parseInt(scan.nextLine());
                    newProduct = new Smartphone(productName , productBrand , productPrize, smartPhoneIMEI , smartphoneMemory);                    
                    break;

                case "cuffie":

                    System.out.println("Inserisci il colore delle cuffie");
                    String cuffieColor = scan.nextLine();                    
                    System.out.println("Le cuffie sono wireless?");
                    Boolean isCuffieWireless = Boolean.getBoolean(scan.nextLine());
                    newProduct = new Cuffie(productName , productBrand , productPrize, cuffieColor , isCuffieWireless);                    
                    break;      
            }

            // Aggiungi il nuovo prodotto al nuovo array ridimensionato
            Prodotto[] newCart = Arrays.copyOf(cart, productCount + 1 );
            newCart[productCount]= newProduct;
            productCount++;
            cart = newCart;
            System.out.println("Prodotto aggiunto con successo");

            //Chiedo all'utente se vuole continuare ad aggiungere i prodotti
            System.out.println("Vuoi aggiungere un altro prodotto?(si/no)");
            String answer = scan.nextLine();
            if(answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")){
                continuaAggiunta = false;
            }

        }     

        // Chiedi se l'utente ha una tessera fedeltà per calcolare il totale scontato
        System.out.println("\nPossiedi una tessera fedelta'? (true/false):");
        boolean hasFidelityCard = Boolean.parseBoolean(scan.nextLine());

        scan.close();
        
        System.out.println("Ecco il tuo carrello");

        BigDecimal totalPrice = BigDecimal.ZERO;
        
        

        // for(int i = 0 ; i < cart.length ; i++){
        //     System.out.println(cart[i].toString());
        //     totalSum = totalSum.add(cart[i].getPrezzo());
        //     System.out.println("-----------------");;
        // }
        
        for(Prodotto item : cart ){
            System.out.println(item.toString());
            if(hasFidelityCard){
                totalPrice = totalPrice.add(item.getDiscountPrice());
            }else{
                
                totalPrice = totalPrice.add(item.getPrezzoIvato());
            }
            System.out.println("-----------------");
        }

        System.out.println("Totale del carrello: " + totalPrice + "€");   

    }
}
