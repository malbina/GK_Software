package com.company.lebensmittel;

public abstract class AbstractLebensmittel {
    private String name;
    private double price;
    private double weight;

    public AbstractLebensmittel(String name, double price, double weight) {
        this.name = name;
        setPrice(this.price);
        setWeight(this.weight);
    }
    public AbstractLebensmittel (){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
          this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
         this.weight = weight;
    }



}

