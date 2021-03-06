package com.company.lebensmittel.getränke;

import com.company.lebensmittel.AbstractLebensmittel;

public class Cola  extends AbstractLebensmittel {

    private int amountOfpack;
    private static int amountOfCola;

    static {
        setAmountOfCola(89);
    }

    {
        setName("Cola");
        setWeight(1.0);
        setPrice(1.80);

    }

    public Cola() {
    }

    public Cola(int amountOfpack) {
        setAmountOfpack(this.amountOfpack);
    }

    public int getAmountOfpack() {
        return amountOfpack;
    }

    public void setAmountOfpack(int amountOfpack) {
        this.amountOfpack = amountOfpack;
    }

    public static int getAmountOfCola() {
        return amountOfCola;
    }

    public static void setAmountOfCola(int amountOfCola) {
        Cola.amountOfCola = amountOfCola;
    }

    @Override
    public String toString() {
        return "Name of product:" + getName() +
                "\nPrice of product:" + getPrice() + " Euro" +
                "\nWeight of product:" + getWeight() + " l";
    }
}