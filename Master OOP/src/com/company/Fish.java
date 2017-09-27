package com.company;

/**
 * Created by Todd on 8/11/2017.
 */
public class Fish extends Animal{

    public Fish(String name, int age, String gender, int weight) {
        super(name, age, gender, weight);
    }

    @Override
    public void move() {
        System.out.println("Fish is swimming...");
    }
}
