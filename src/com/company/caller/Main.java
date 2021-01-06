package com.company.caller;

import com.company.lebensmittel.fleisch.Rindfleisch;
import com.company.lebensmittel.schokolade.Schogetten;

public class Main {

    public static void main(String[] args) {
        Schogetten schih =new Schogetten();
        System.out.println(schih);
        System.out.println(schih.getPrice());
        Rindfleisch rind = new Rindfleisch();
        System.out.println(rind.getWeight());

    }
}
