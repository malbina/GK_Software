package com.company.lebensmittel.getränke;

import com.company.lebensmittel.AbstractLebensmittel;

public class Fanta extends AbstractLebensmittel {

    private int amountOfpack;
    private static int amountOfFanta;

    static {
        setAmountOfFanta(78);
    }

    {
        setName("Fanta");
        setWeight(1.0);
        setPrice(1.76);

    }

    public Fanta() {
    }

    public Fanta(int amountOfpack) {
        setAmountOfpack(this.amountOfpack);
    }


    public int getAmountOfpack() {
        return amountOfpack;
    }

    public void setAmountOfpack(int amountOfpack) {
        this.amountOfpack = amountOfpack;
    }

    public static int getAmountOfFanta() {
        return amountOfFanta;
    }

    public static void setAmountOfFanta(int amountOfFanta) {
        Fanta.amountOfFanta = amountOfFanta;
    }

    @Override
    public String toString() {
        return "Name of product:" + getName() +
                "\nPrice of product:" + getPrice() + " Euro" +
                "\nWeight of product:" + getWeight() + " l";
    }
}