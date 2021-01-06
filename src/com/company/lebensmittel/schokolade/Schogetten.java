package com.company.lebensmittel.schokolade;

import com.company.lebensmittel.AbstractLebensmittel;

public class Schogetten extends AbstractLebensmittel {
    private int amountOfpack;
    private static int amountOfSchogetten;

    static {
        setAmountOfSchogetten(15244);
    }

    { setName("Schogetten");
        setWeight(100);
        setPrice(0.75);

    }

    public Schogetten() {
    }

    public Schogetten(int amountOfpack) {
        setAmountOfpack(this.amountOfpack);
    }

    public int getAmountOfpack() {
        return amountOfpack;
    }

    public void setAmountOfpack(int amountOfpack) {
        this.amountOfpack = amountOfpack;
    }

    public static int getAmountOfSchogetten() {
        return amountOfSchogetten;
    }

    public static void setAmountOfSchogetten(int amountOfSchogetten) {
        Schogetten.amountOfSchogetten += amountOfSchogetten;
    }

    @Override
    public String toString() {
        return "Name of product:" + getName() +
                "\nPrice of product:" + getPrice() + " Euro" +
                "\nWeight of product:" + getWeight() + " g";
    }
}