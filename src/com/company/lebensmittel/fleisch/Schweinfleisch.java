package com.company.lebensmittel.fleisch;

import com.company.lebensmittel.AbstractLebensmittel;

public class Schweinfleisch extends AbstractLebensmittel {
    private int amountOfPack;
    private static double amountOfPork;

    {
        setName(" Scweinfleisch");
        setWeight(500);
        setPrice(2.99);

    }
    static {
        setAmountOfPork(302);
    }
     public Schweinfleisch (){}
    public Schweinfleisch (int amountOfPack){
        this.amountOfPack = amountOfPack;
    }

    public int getAmountOfPack() {
        return amountOfPack;
    }

    public void setAmountOfPack(int amountOfPack) {
        this.amountOfPack += amountOfPack;
    }

    public static double getAmountOfPork() {
        return amountOfPork;
    }

    public static void setAmountOfPork(double amountOfPork) {
        Schweinfleisch.amountOfPork = amountOfPork;
    }

    @Override
    public String toString() {
        return "Name of product:"+getName()+
                "\n Price of product:"+getPrice()+" Euro"+ "\nWeight of product:"+getWeight()+" g";
    }
}
