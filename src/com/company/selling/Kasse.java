package com.company.selling;

import com.company.lebensmittel.AbstractLebensmittel;
import com.company.lebensmittel.fleisch.Rindfleisch;
import com.company.lebensmittel.fleisch.Schweinfleisch;

public class Kasse {

    private boolean IsAPaymentByCash;
    public static final String sayAboutAShop = "Netto Marken-Discount" +
            "\n" + "92245 Kümmersbruck,Vilssatstr.108";
    public static double gesamtPrice;

    {
        setAPaymentByCash(false);
    }

    public boolean isAPaymentByCash() {
        return IsAPaymentByCash;
    }

    public void setAPaymentByCash(boolean APaymentByCash) {
        IsAPaymentByCash = APaymentByCash;
    }

    public void askAboutPayment(boolean isAPaymentByCash) {
        if (isAPaymentByCash) {
            System.out.println(" Kartenzahlung" + "Kontaktlos" + "girocard");
        } else {
            System.out.println("Bargeld");
        }
    }

    public static double getGesamtPrice() {
        return gesamtPrice;
    }

    public static void getProduct(int product, int amount) {
        switch (product) {
            case 1:
                Rindfleisch rind = new Rindfleisch(amount);
                System.out.println(rind.getName() + "       " + "Preis: " + rind.getPrice() + "   Anzahl der Menge " + amount);
                Kasse.gesamtPrice += rind.getPrice() * amount;
                break;
            case 2:
                Schweinfleisch schweinfleisch = new Schweinfleisch(amount);
                System.out.println(schweinfleisch.getName() + "       " + "Preis: " + schweinfleisch.getPrice() + "   Anzahl der Menge " + amount);
                Kasse.gesamtPrice += schweinfleisch.getPrice() * amount;
                break;


            default:
                System.out.println("");
                break;
        }

    }
   public static void refreshGesamtpreis(){
        Kasse.gesamtPrice=0;
   }
   public static void sayTheTotalPreis(){
       System.out.println(Kasse.gesamtPrice);
       refreshGesamtpreis();
   }
}
