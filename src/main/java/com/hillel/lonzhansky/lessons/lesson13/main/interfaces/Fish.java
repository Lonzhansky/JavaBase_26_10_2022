package com.hillel.lonzhansky.lessons.lesson13.main.interfaces;

import com.hillel.lonzhansky.lessons.lesson13.main.participants.Participant;

public class Fish extends Animal implements Swimmable {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("Fish" + name + " swim");
    }
}
