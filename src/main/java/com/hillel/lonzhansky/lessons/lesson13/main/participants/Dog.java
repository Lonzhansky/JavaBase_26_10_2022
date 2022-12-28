package com.hillel.lonzhansky.lessons.lesson13.main.participants;

public class Dog extends Participant {

    public Dog(String name, int age) {
        super(name, age);
    }

    public void demo() {
        System.out.println("demo");
    }

    public void run() {
        System.out.println("Dog: " + getName() + " running...");
    }

    public void swim() {
        System.out.println("Dog: " + getName() + " swimming...");
    }
}
