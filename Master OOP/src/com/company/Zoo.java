package com.company;

import static com.company.Bird.*;

/**
 * Created by Todd on 8/11/2017.
 */
public class Zoo {

    public static void main(String[] args) {

        //Columns 1: animal1 of type Animal Class 2: variable 3: new "instance" 4: Constructor from Class
        Animal ape = new Animal("Ape", 12, "Male", 453);
        Animal zebra = new Animal("Zebra", 7, "Female", 389);
        Animal lizard = new Animal("Lizard", 2, "Male", 6);
        Animal fish = new Fish("Fish", 1, "Female", 18);
        Bird bird = new Bird("Bird", 23, "Female", 13);

        Chicken chik1 = new Chicken("Hot Chick", 2, "M", 3);
        Animal spar1 = new Sparrow("Spar", 3, "F", 1);
        Sparrow spar2 = new Sparrow("Spar", 3, "F", 1);

    ape.speak();
    ape.eat();
    zebra.speak();
    zebra.sleep();
    lizard.speak();
    fish.speak();
    fish.swim();
    bird.speak();
    chik1.fly();
    spar1.move();
    spar2.fly();
    fish.move();
    }
}
