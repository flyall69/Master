package com.company;

/**
 * Created by Todd on 8/11/2017.
 */
public class Animal {

    String name;
    int age;
    String gender;
    int weight;

    //build constructor
    public Animal(String name, int age, String gender, int  weight){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public void speak(){
        System.out.println("Hello, I am a "+ name);
        System.out.println("I am "+ age + " years old");
        System.out.println("I am a "+ gender);
        System.out.println("My weight is "+ weight + " lbs.");
    }

    public void eat(){
        System.out.println("eating, Yum, Yum, Yum.....");
    }

    public void sleep(){
        System.out.println("Snoring....");
    }

    public void swim(){
        System.out.println("Bubble, bubble, swim...");
    }

    public void move() {
    }
}
