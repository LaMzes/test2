package main.presents;

import main.Kid;

public class Book extends Present{

    private String name;
    private int numberOfStories;

    public Book(double price, Kid kid, String name, int numberOfStories){
        super(price, kid);
        this.name = name;
        this.numberOfStories = numberOfStories;
    }
}
