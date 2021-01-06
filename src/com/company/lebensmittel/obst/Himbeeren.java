package com.company.lebensmittel.obst;

import com.company.lebensmittel.AbstractLebensmittel;

public class Himbeeren extends AbstractLebensmittel {
    private int amountOfpack;
    private static double amountOfRaspberries;

    static {
        setAmountOfRaspberries(57974);
    }

    {
        setName("Erdbeeren");
        setWeight(245);
        setPrice(2.27);

    }

    public Himbeeren() {
    }

    public Himbeeren(int amountOfpack) {
        setAmountOfpack(this.amountOfpack);
    }

    public int getAmountOfpack() {
        return amountOfpack;
    }

    public void setAmountOfpack(int amountOfpack) {
        this.amountOfpack = amountOfpack;
    }

    public static double getAmountOfRaspberries() {
        return amountOfRaspberries;
    }

    public static void setAmountOfRaspberries(double amountOfRaspberries) {
        Himbeeren.amountOfRaspberries = amountOfRaspberries;
    }

    @Override
    public String toString() {
        return "Name of product:" + getName() +
                "\nPrice of product:" + getPrice() + " Euro" +
                "\nWeight of product:" + getWeight() + " g";

    }
}