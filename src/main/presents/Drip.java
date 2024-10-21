package main.presents;

import main.Kid;

public class Drip extends Present{

    private String size;
    private String material;

    public Drip(double price, Kid kid, String size, String material){
        super(price, kid);
        this.size = size;
        this.material = material;
    }
}
