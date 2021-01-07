package com.company.caller;

import com.company.lebensmittel.fleisch.Rindfleisch;
import com.company.lebensmittel.schokolade.Schogetten;
import com.company.selling.Kasse;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n"+Kasse.sayAboutAShop);
        System.out.println();

        Kasse.getProduct(1,4);
        Kasse.getProduct(2,3);
        Kasse.sayTheTotalPreis();

        Kasse.sayAboutPayment(Kasse.askAboutaPayment());





    }
}
