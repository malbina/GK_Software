package com.company.caller;

import com.company.lebensmittel.fleisch.Rindfleisch;
import com.company.lebensmittel.schokolade.Schogetten;
import com.company.selling.Kasse;

public class Main {

    public static void main(String[] args) {
       Kasse.refreshGesamtpreis();
       Kasse.getProduct(1,5);
       Kasse.getProduct(2,4);
        System.out.println(Kasse.getGesamtPrice());


    }
}
