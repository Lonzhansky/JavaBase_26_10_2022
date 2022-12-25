package com.hillel.lonzhansky.lessons.lesson12;

import com.hillel.lonzhansky.lessons.lesson11.Person;

public class Dog extends Animal {

    int swimDistance;

    public Dog(String name, int age) {
        super(name, age);

        System.out.println("name: " + super.name);
    }

    public Dog(String name, int age, int swimDistance) {
        super(name, age);
        this.swimDistance = swimDistance;
    }

    public void swim() {
        System.out.println("Dog: " + name + " swim");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Dog: " + name + " run");
    }
}
