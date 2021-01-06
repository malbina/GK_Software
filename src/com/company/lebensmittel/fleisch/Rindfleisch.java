package com.company.lebensmittel.fleisch;

import com.company.lebensmittel.AbstractLebensmittel;

public class Rindfleisch  extends AbstractLebensmittel {
    private int amountOfpack;
    private static double amountOfbeef;

    static  {
        setAmountOfbeef(20000);
    }

    {
        setName("Rindfleisch");
        setWeight(500);
        setPrice(3.87);
    }
    public Rindfleisch (){}
     public Rindfleisch(int amountOfpack){
        this.amountOfpack =amountOfpack;
     }

    public static double getAmountOfbeef() {
        return amountOfbeef;
    }
    public static void setAmountOfbeef(double amountOfbeef) {

        Rindfleisch.amountOfbeef += amountOfbeef;
    }

    public int getAmountOfpack() {
        return amountOfpack;
    }

    public void setAmountOfpack(int amountOfpack) {
        this.amountOfpack = amountOfpack;
    }

    @Override
    public String toString() {
        return "Name of product:"+getName()+
        "\n Price of product:"+getPrice()+" Euro"+ "\nWeight of product:"+getWeight()+" g";
    }
}
