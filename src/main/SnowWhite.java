package main;

import java.util.Random;

public class SnowWhite {

    private Factory factory;

    public void setWorkplace(Factory factory) {
        this.factory = factory;
    }

    public void distributeWork(){
        for (int i = 0; i < factory.getPostBox().size(); i++) {
            Letter currentLetter = factory.getPostBox().get(i);
            Dwarf dwarf = factory.getRandomWorker();
            if (currentLetter.getKid().isNaughty()){
                if (new Random().nextBoolean()){
                    dwarf.createPresent(currentLetter.getPresents().get(0), currentLetter.getKid());
                } else {
                    factory.rejectKid();
                }
            } else {
                for (int j = 0; j < currentLetter.getPresents().size(); j++) {
                    dwarf.createPresent(currentLetter.getPresents().get(j), currentLetter.getKid());
                }
            }
        }

        factory.report1();
        factory.report2();
        factory.report4();
        factory.report5();
        factory.report7();
        factory.report9();
        factory.report11();
        factory.report13();
    }
}
