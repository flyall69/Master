package com.company;

public class Sparrow extends Bird implements Flyable {

    public Sparrow(String name, int age, String gender, int weight) {
        super(name, age, gender, weight);
    }

    public void fly() {
        System.out.println("Sparrow flying high...");
    }
}
