package main.presents;

import main.Kid;

public class Train extends Present{

    private boolean isSmoking;

    public Train(double price, Kid kid,boolean isSmoking){
        super(price, kid);
        this.isSmoking = isSmoking;
    }
}
