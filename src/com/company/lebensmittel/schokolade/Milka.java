package com.company.lebensmittel.schokolade;

import com.company.lebensmittel.AbstractLebensmittel;

public class Milka extends AbstractLebensmittel {

    private int amountOfpack;
    private static int amountOfMilka;

    static{
        setAmountOfMilka(56577);
    }
    {   setName("Milka");
        setWeight(0.65);
        setPrice(1.75);
    }

    public Milka () {}

    public Milka (int amountOfpack) {
        setAmountOfpack(this.amountOfpack);
    }

    public static int getAmountOfMilka() {
        return amountOfMilka;
    }

    public static void setAmountOfMilka(int amountOfMilka) {
        Milka.amountOfMilka = amountOfMilka;
    }


    public int getAmountOfpack() {
        return amountOfpack;
    }

    public void setAmountOfpack(int amountOfpack) {
        this.amountOfpack = amountOfpack;
    }
    @Override
    public String toString() {
        return "Name of product:" + getName() +
                "\nPrice of product:" + getPrice() + " Euro" +
                "\nWeight of product:" + getWeight() + " g";
    }


}
