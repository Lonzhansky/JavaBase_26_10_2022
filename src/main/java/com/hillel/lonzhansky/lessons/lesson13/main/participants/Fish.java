package com.hillel.lonzhansky.lessons.lesson13.main.participants;

public class Fish extends Participant {
    public Fish(String name, int age) {
        super(name, age);
    }

    public void run() {
        System.out.println("Fish: " + getName() + " cant run");
    }

    public void swim() {
        System.out.println("Fish: " + getName() + " swimming...");
    }
}
