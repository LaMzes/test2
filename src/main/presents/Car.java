package main.presents;

import main.Kid;

public class Car extends Present{

    private int batteries;

    public Car(double price, Kid kid, int batteries){
        super(price, kid);
        this.batteries = batteries;
    }
}
