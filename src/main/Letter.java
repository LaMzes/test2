package main;

import main.presents.Present;

import java.util.ArrayList;

public class Letter {

    private Kid kid;
    private ArrayList<Present.PresentType> presents = new ArrayList<>();

    public Letter(Kid kid, int numberOfPresents){
        this.kid = kid;
        for (int i = 0; i < numberOfPresents; i++) {
            presents.add(Util.getRandomPresentType());
        }
    }

    public Kid getKid(){
        return this.kid;
    }

    public ArrayList<Present.PresentType> getPresents() {
        return presents;
    }
}
