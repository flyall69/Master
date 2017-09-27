package com.company;

public class Chicken extends Bird implements Flyable{

    public Chicken(String name, int age, String gender, int weight) {
        super(name, age, gender, weight);
    }

    //overriding teh method defined in Bird
    public void fly() {
        System.out.println("I'm a chicken and not able to fly...");
    }

    @Override
    public void move() {
        System.out.println("I'm flying...");
    }
}
