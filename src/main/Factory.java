package main;

import java.util.ArrayList;
import java.util.Random;

public class Factory {

    private String name;
    private String address;
    private int postCode;
    private SnowWhite snowWhite;
    private ArrayList<String> uniqueColors = new ArrayList<>();
    private ArrayList<Dwarf> dwarves = new ArrayList<>();
    private ArrayList<Letter> postBox = new ArrayList<>();
    private int rejectedKids;
    private double expenses;

    public Factory(String name){
        this.name = name;
        this.address = "Sofia";
        this.postCode = 1000;
    }

    public void hireDwarf(Dwarf dwarf){
        this.dwarves.add(dwarf);
        dwarf.setWorkplace(this);
    }

    public void hireSnowWhite(SnowWhite snowWhite){
        this.snowWhite = snowWhite;
        snowWhite.setWorkplace(this);
    }

    public ArrayList<Letter> getPostBox() {
        return this.postBox;
    }

    public ArrayList<Dwarf> getDwarves() {
        return this.dwarves;
    }

    public Dwarf getRandomWorker(){
        return this.dwarves.get(new Random().nextInt(this.dwarves.size()));
    }

    public void rejectKid() {
        this.rejectedKids++;
    }

    public void receiveLetter(Letter letter){
        this.postBox.add(letter);
    }

    public void addColor(String color){
        if (!this.uniqueColors.contains(color)){
            this.uniqueColors.add(color);
        }
    }

    public void report1(){
        System.out.println("-----------------REPORT 1-----------------");
        System.out.println("Total received letters: " + this.postBox.size());
        double naughtyLetters = 0;
        for (int i = 0; i < this.postBox.size(); i++) {
            if (this.postBox.get(i).getKid().isNaughty()){
                naughtyLetters++;
            }
        }
        double goodLetters = (this.postBox.size() - naughtyLetters);
        double result = naughtyLetters > goodLetters ? (goodLetters / naughtyLetters * 100) : (naughtyLetters / goodLetters * 100);
        System.out.println("Ratio good/naughty is " +  result);
    }

    public void report2(){
        Kid kidWithMostPresents = this.postBox.get(0).getKid();
        for (int i = 0; i < this.postBox.size(); i++) {
            Kid currentKid = this.postBox.get(i).getKid();
            if (kidWithMostPresents.getApprovedPresents() < currentKid.getApprovedPresents()){
                kidWithMostPresents = currentKid;
            }
        }
        System.out.println("-----------------REPORT 2-----------------");
        System.out.println("Kid with most presents: " + kidWithMostPresents.getName());
    }
    //TODO
    public void report3(){}

    public void report4(){
        System.out.println("-----------------REPORT 4-----------------");
        Dwarf dwarfWithMostMadeToys = this.dwarves.get(0);
        for (int i = 0; i < this.dwarves.size(); i++) {
            Dwarf currentDwarf = this.dwarves.get(i);
            if (dwarfWithMostMadeToys.getPresentsCreated() < currentDwarf.getPresentsCreated()){
                dwarfWithMostMadeToys = currentDwarf;
            }
        }
        System.out.println("Dwarf with most made toys: " + dwarfWithMostMadeToys.getName());
    }

    public void report5(){
        System.out.println("-----------------REPORT 5-----------------");
        ArrayList<Dwarf> dwarvesWithAtLeast10ToysCreated = new ArrayList<>();
        for (int i = 0; i < this.dwarves.toArray().length; i++) {
            Dwarf currentDwarf = this.dwarves.get(i);
            if (this.dwarves.get(i).getPresentsCreated() >= 10){
                dwarvesWithAtLeast10ToysCreated.add(currentDwarf);
            }
        }
        if (!dwarvesWithAtLeast10ToysCreated.isEmpty()) {
            Dwarf highestDwarfWithAtLeast10ToysCreated = dwarvesWithAtLeast10ToysCreated.get(0);
            for (int i = 0; i < dwarvesWithAtLeast10ToysCreated.size(); i++) {
                Dwarf currentDwarf = this.dwarves.get(i);
                if (currentDwarf.getPresentsCreated() >= 10 && currentDwarf.getHeight()
                        > highestDwarfWithAtLeast10ToysCreated.getHeight()){
                    highestDwarfWithAtLeast10ToysCreated = currentDwarf;
                }
            }
            System.out.println("Highest dwarf with at least 10 toys created: " + highestDwarfWithAtLeast10ToysCreated.getName());
        } else {
            System.out.println("No dwarf has created at least 10 toys :(!");
        }
    }

    public void report7(){
        System.out.println("-----------------REPORT 7-----------------");
        System.out.println("Number of unique colours: " + (!this.uniqueColors.isEmpty() ? "none" : this.uniqueColors.size()));
    }

    //TODO
    public void report8(){}

    public void report9(){
        System.out.println("-----------------REPORT 9-----------------");
        dwarves.sort((o1, o2) -> o2.getPresentsCreated() - o1.getPresentsCreated());
        for (int i = 0; i < dwarves.size(); i++) {
            System.out.println(this.dwarves.get(i).getName() + " - " + this.dwarves.get(i).getPresentsCreated());
        }
    }
    //TODO
    public void report10(){}

    public void report11(){
        System.out.println("-----------------REPORT 11-----------------");
        System.out.println("Total expenses for the company: " + this.expenses);
    }

    //TODO
    public void report12(){}

    public void report13(){
        System.out.println("-----------------REPORT 13-----------------");
        System.out.println("Total kids that were rejected from receiving presents: " + this.rejectedKids);
    }

    public void addExpenses(double price) {
        this.expenses += price;
    }
}
