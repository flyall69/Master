package com.company;

/**
 * Created by Todd on 8/11/2017.
 */
public class Earth {
    public static void main(String[] args) {

        Human human1 = new Human("Tom", 25, 76, "Blue");
        Human human2 = new Human("Joe", 28, 68, "Green");
        Human human3 = new Human( "Bob", 42, 45, "Hazel");
        Human human4 = new Human("Dave", 24, 54, "Blue");

        human1.speak();
        human2.speak();
        human3.speak();
        human4.speak();

    }
}
