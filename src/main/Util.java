package main;

import main.presents.Present;

import java.util.Random;

public class Util {

    public static int randomPriceForDoll = new Random().nextInt(5,11);
    public static int randomPriceForDrip = new Random().nextInt(2,13);
    public static int randomPriceForTrain = new Random().nextInt(15,31);
    public static int randomPriceForCar = new Random().nextInt(20, 41);
    public static int randomPriceForBook = new Random().nextInt(10,20);
    private static String[] randomSizeForDoll = {"60x10","60x20","60x30","60x40"};
    private static String[] randomHairColorForDoll = {"White","Black","Purple","Pink","Blue","Green","Brown","Blonde"};
    private static String[] randomSizeForDrip = {"S","M","L","XL"};
    public static int randomBatteryNumber = new Random().nextInt(2,7);
    public static int randomNumberOfStories = new Random().nextInt(1,6);

    public static String getRandomSizeForDoll() { return randomSizeForDoll[new Random().nextInt(randomSizeForDoll.length)];};
    public static String getRandomHairColorForDoll() { return randomHairColorForDoll[new Random().nextInt(randomHairColorForDoll.length)];}
    public static String getRandomSizeForDrip() {return randomSizeForDrip[new Random().nextInt(randomSizeForDrip.length)];
    }

    public static Present.PresentType getRandomPresentType(){
        return Present.PresentType.values()[new Random().nextInt(Present.PresentType.values().length)];
    }

    private static String[] randomNameGeneratorForDwarves = {"Pesho", "Grisho", "Dimitrinka","Strahil","Stoqn","Abrashev","Iliya"};
    public static String getRandomNameForDwarf() {return randomNameGeneratorForDwarves[new Random().nextInt(randomNameGeneratorForDwarves.length)];}
 }
