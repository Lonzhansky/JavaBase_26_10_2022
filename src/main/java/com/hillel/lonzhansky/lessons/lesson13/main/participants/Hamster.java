package com.hillel.lonzhansky.lessons.lesson13.main.participants;

public class Hamster extends Participant {


    public Hamster(String name, int age) {
        super(name, age);
    }

    public void run() {
        System.out.println("Hamster: " + getName() + " running...");
    }

    public void swim() {
        System.out.println("Hamster: " + getName() + " swimming...");
    }
}
