package main;

import main.presents.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Dwarf {

    private String name;
    private Factory factory;
    private double height;
    private ArrayList<Present> presentsCreated = new ArrayList<>();

    public Dwarf(String name, double height){
        this.name = name;
        this.height = height;
    }

    public void setWorkplace(Factory workplace) {
        this.factory = workplace;
    }

    public void createPresent(Present.PresentType presentType, Kid kid){
        Present present =
        switch(presentType){
            case CAR -> new Car(Util.randomPriceForCar, kid, Util.randomBatteryNumber);
            case BOOK -> new Book(Util.randomPriceForBook, kid, "Sweet dreams", Util.randomNumberOfStories);
            case DOLL -> new Doll(Util.randomPriceForDoll, kid, Util.getRandomSizeForDoll(), Util.getRandomHairColorForDoll());
            case DRIP -> new Drip(Util.randomPriceForDrip, kid, Util.getRandomSizeForDrip(), "Silk");
            default -> new Train(Util.randomPriceForTrain, kid, new Random().nextBoolean());

        };
        if (!kid.isNaughty()){
            present.setPrice(present.getPrice()*1.2);
        }

        presentsCreated.add(present);
        factory.addExpenses(present.getPrice());
        String color = Util.getRandomHairColorForDoll();
        present.setColor(color);
        factory.addColor(color);
        kid.addApprovedPreset();
    }

    public int getPresentsCreated() {
        return this.presentsCreated.size();
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }
}
