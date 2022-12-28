package com.hillel.lonzhansky.lessons.lesson13.main.participants;

public abstract class Participant {

    private String name;
    private int age;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void run();

    public abstract void swim();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
