package main;

import java.util.Random;

public class Kid {

    private String name;
    private String city;
    private boolean hasChimney;
    private boolean isNaughty;
    private Factory factory;
    private int approvedPresents;

    public Kid(String name, String city, Factory factory, Boolean isNaughty){
        this.name = name;
        this.city = city;
        this.hasChimney = new Random().nextBoolean();
        this.isNaughty = isNaughty;
        Letter letter = new Letter(this, new Random().nextInt(1, 11));
        this.factory = factory;
        factory.receiveLetter(letter);

    }

    public boolean isNaughty() {
        return isNaughty;
    }

    public void addApprovedPresent(){
        approvedPresents++;
    }

    public int getApprovedPresents(){
        return this.approvedPresents;
    }

    public void addApprovedPreset() {
        this.approvedPresents++;
    }

    public String getName() {
        return name;
    }
}
