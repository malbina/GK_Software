package com.company.selling;

import com.company.lebensmittel.AbstractLebensmittel;
import com.company.lebensmittel.fleisch.Rindfleisch;
import com.company.lebensmittel.fleisch.Schweinfleisch;

import java.util.Scanner;

public class Kasse {

    private  static boolean IsAPaymentByCash;
    public static final String sayAboutAShop = "Netto Marken-Discount" +
            "\n" + "92245 Kümmersbruck,Vilssatstr.108";
    public static double gesamtPrice;
    private static boolean isAPaymentByCash;

    {
        setAPaymentByCash(false);
    }

    public static boolean isAPaymentByCash() {
        return IsAPaymentByCash;
    }

    public  static void setAPaymentByCash(boolean APaymentByCash) {

        Kasse.isAPaymentByCash= APaymentByCash;
    }

    public static void sayAboutPayment(boolean isAPaymentByCash) {
        System.out.println("Zahlung erfolgt");
        System.out.println("Vielen Dank für Ihren Einkauf");
        if (isAPaymentByCash) {
            System.out.println("Kartenzahlung \n" + "\nKontaktlos" + "\ngirocard");
        } else {
            System.out.println("Bargeld");
        }
    }
    public static boolean askAboutaPayment (){
        System.out.println("Ist die Zahlung mit einer Karte?");
        System.out.println("Nein: False, JA: True");
        Scanner sc = new Scanner(System.in);
        Kasse.isAPaymentByCash = sc.nextBoolean();
        return isAPaymentByCash;
    }

    public static double getGesamtPrice() {
        return gesamtPrice;
    }

    public static void getProduct(int product, int amount) {
        switch (product) {
            case 1:
                Rindfleisch rind = new Rindfleisch(amount);
                System.out.println(rind.getName() + "     " + "Preis: " + rind.getPrice() + "   Anzahl der Menge " + amount);
                Kasse.gesamtPrice += rind.getPrice() * amount;
                break;
            case 2:
                Schweinfleisch schweinfleisch = new Schweinfleisch(amount);
                System.out.println(schweinfleisch.getName() + "     " + "Preis: " + schweinfleisch.getPrice() + "   Anzahl der Menge " + amount);
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
