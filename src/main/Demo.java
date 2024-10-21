package main;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {

        Factory factory = new Factory("Talent Gifts Laplandia OOD");
        for (int i = 0; i < 15; i++) {
            Dwarf dwarf = new Dwarf(Util.getRandomNameForDwarf(), new Random().nextInt(50, 150));
            factory.hireDwarf(dwarf);
        }
        SnowWhite snowWhite = new SnowWhite();
        factory.hireSnowWhite(snowWhite);


        for (int i = 0; i < 100; i++) {
            int randomNumberForNaughty = new Random().nextInt(1,101);
            if (randomNumberForNaughty <= 60){
                Kid kid = new Kid(Util.getRandomNameForDwarf(), "Sofia", factory, false);
            } else {
                Kid kid = new Kid(Util.getRandomNameForDwarf(), "Sofia", factory, true);
            }
        }

        snowWhite.distributeWork();
    }
}
