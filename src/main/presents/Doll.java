package main.presents;

import main.Kid;

public class Doll extends Present {

    private String size;
    private String hairColor;

    public Doll(double price, Kid kid, String size, String hairColor){
        super(price, kid);
        this.size = size;
        this.hairColor = hairColor;
    }
}
