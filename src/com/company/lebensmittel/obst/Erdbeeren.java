package com.company.lebensmittel.obst;

import com.company.lebensmittel.AbstractLebensmittel;

public class Erdbeeren extends AbstractLebensmittel {
    private int amountOfpack;
    private static double amountOfStrawberries;
    static {
        setAmountOfStrawberries(7444);
    }
    {  setName("Erdbeeren");
        setWeight(245);
        setPrice(2.27);
    }
    public Erdbeeren () {}

    public Erdbeeren(int amountOfpack) {
        setAmountOfpack(this.amountOfpack);
    }


    public int getAmountOfpack() {
        return amountOfpack;
    }

    public void setAmountOfpack(int amountOfpack) {
        this.amountOfpack = amountOfpack;
    }

    public static double getAmountOfStrawberries() {
        return amountOfStrawberries;
    }

    public static void setAmountOfStrawberries(double amountOfStrawberries) {
        Erdbeeren.amountOfStrawberries += amountOfStrawberries;
    }
    @Override
    public String toString() {
        return "Name of product:" + getName() +
                "\nPrice of product:" + getPrice() + " Euro" +
                "\nWeight of product:" + getWeight() + " g";
    }

}
