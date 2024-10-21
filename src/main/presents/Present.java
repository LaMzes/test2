package main.presents;

import main.Kid;

public class Present {

    public enum PresentType { DOLL, DRIP, CAR, BOOK, TRAIN }

    protected String color;
    protected Kid kid;
    protected double price;

    public Present(double price, Kid kid){
        this.price = price;
        this.kid = kid;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color){
        this.color = color;
    }
}
